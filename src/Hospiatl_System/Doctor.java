/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospiatl_System;

import com.mysql.cj.protocol.Resultset;
import java.awt.Component;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marw
 */
public class Doctor implements DB{

    private static Component Doctor_profile;
    private String name, email, password;
    private int age,experience,id = 0;
    private String languages,phone,schedual, specialization,gender;
    static Connection con;
    private static ResultSet rs;
    Doctor(String name,String languages, String email, String phone, String schedual, String gender,String specialization, int age ,int ex )
    {
        this.name = name;
        this.email = email;
        this.languages = languages;
        this.phone = phone;
        this.schedual = schedual;
        this.age = age;
        this.phone = phone;
        this.experience = ex;
        this.specialization = specialization;
        this.gender = gender;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSchedual() {
        return schedual;
    }

    public void setSchedual(String schedual) {
        this.schedual = schedual;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    public static Resultset CheckLoginData(String email)
    {
        try {
            String sql = "SELECT pass,ID FROM Doctors WHERE email = (?)";
            PreparedStatement Login = con.prepareStatement(sql);
            Login.setString(1, email);
            rs = Login.executeQuery();      
                return (Resultset) rs;
        } catch (SQLException | NullPointerException ex ) {
                return null; 
            }
    }
    
    
    public static void ShowAppointments(DefaultTableModel appointment, int doctor_id)
    {
        appointment.setRowCount(0);
        try {
            String get_name = "SELECT Name FROM Doctors Where ID = (?)";
            PreparedStatement name = con.prepareStatement(get_name);
            name.setInt(1, doctor_id);
            rs = name.executeQuery();
            rs.next();
            String D_Name = rs.getString("Name");
            String sql = "SELECT * FROM Appointments Where D_Name = (?) ";
            PreparedStatement show;
            show = con.prepareStatement(sql);
            show.setString(1, D_Name);
            rs = show.executeQuery();
            while (rs.next())
            {
                int P_id =  rs.getInt("P_ID");
                String Date = rs.getString("Date");
                String Time = rs.getString("Time");
                String status = rs.getString("status");
                Object app[] = { P_id, Date, Time, status};
                appointment.addRow(app);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(Doctor_profile, "No appointments");
        }
    }
    
    public static void SendPre(int P_id, String prescription)
    {
        String sql = "SELECT * FROM Patients WHERE id = (?)";
        PreparedStatement Login = null;
        try {
            Login = Doctor.con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            Login.setInt(1, P_id);
            rs = Login.executeQuery();
            rs.next();
            rs.updateString(10, prescription);
            rs.updateRow();
            JOptionPane.showMessageDialog(Doctor_profile,"Sent Successfully");  
        }
        catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(Doctor_profile,"Empty Prescription");              
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(Doctor_profile,"Invaild ID");              
        }
    }
    
    public static boolean UpdatePassword(int doctor_id, String pass, String c_pass)
    {
        boolean flag = false;
         try{  
            String sql = "SELECT * FROM Doctors WHERE ID = (?)";
            PreparedStatement change = Doctor.con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            change.setInt(1, doctor_id);
            rs = change.executeQuery();
            rs.next();
            if (pass.equals(c_pass))
            {
                rs.updateString(11, pass);
                rs.updateRow();
                JOptionPane.showMessageDialog(Doctor_profile, "Password changed Successfuly, Please login again");
                flag = true;
            }
            else
            {
                JOptionPane.showMessageDialog(Doctor_profile,"Re-Enter the password twice");
            }
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(Doctor_profile,"An error happened");  
        }
        finally
         {
             return flag;
         }
    }
    
    
}
