/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospiatl_System;

import com.mysql.cj.protocol.Resultset;
import java.awt.Component;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marw
 */
public class admins implements  DB{

    private static Component Admin_profile;
    private String name, email, password;
    private Component Admin_registration;
    static Connection con;
    private static ResultSet rs;
    private static int doctor_id;
    admins(String name, String email, String pass)
    {
        this.name = name;
        this.email = email;
        this.password = pass;
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
    
    
    
    public void register()
    {
        if (CheckRegistartionEmail(this.email))
        {
            try {
                String adminsql = "insert into Admins(Name,Email,PASS) values(?,?,?)";
                PreparedStatement insert = con.prepareStatement(adminsql);
                insert.setString(1, this.name);
                insert.setString(2, this.email);
                insert.setString(3, this.password);
                int row = insert.executeUpdate();
                JOptionPane.showMessageDialog(Admin_registration, "Admin Register Successfuly");
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(Admin_registration, "Please Enter Valid Data and Try again");
            }
        }
        else
            JOptionPane.showMessageDialog(Admin_registration, "This Email is already used");   
    }
    
    private static boolean CheckRegistartionEmail(String email) 
    {
        try {
            String sql = "SELECT Email FROM Admins Where Email = ?";
            PreparedStatement Login = con.prepareStatement(sql);
            Login.setString(1, email);
            ResultSet rs = Login.executeQuery(); 
            return (!(rs.isBeforeFirst()));
        } catch (SQLException ex) {
            return false;
        }
    }
    
    public static ResultSet CheckLoginData(String email)
    {
        con = DB.connect();
        try {
            String sql = "SELECT pass FROM Admins WHERE Email = (?)";
            PreparedStatement Login = con.prepareStatement(sql);
            Login.setString(1, email);
            ResultSet rs = Login.executeQuery();      
                return (ResultSet) rs;
            } catch (SQLException | NullPointerException ex ) {
                return null; 
            }               
    }
    
    public static void AddDocotr(Doctor a)
    {
        try {
            String sqldoctor = "insert into Doctors(Name,languages,email,phone,sche,gender,specialization,age,experience) values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement insert = con.prepareStatement(sqldoctor);
            insert.setString(1, a.getName());
            insert.setString(2, a.getLanguages());
            insert.setString(3, a.getEmail());
            insert.setString(4, a.getPhone());
            insert.setString(5, a.getSchedual());
            insert.setString(6, a.getGender());
            insert.setString(7, a.getSpecialization());
            insert.setInt(8, a.getAge());
            insert.setInt(9, a.getExperience());
            insert.executeUpdate();
            JOptionPane.showMessageDialog(Admin_profile, "Doctor added successfuly");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(Admin_profile, "An Error happened, please try again");
        }
    }
    
    public static void ShowAppointments(DefaultTableModel appointment)
    {
        appointment.setRowCount(0);
        String sql = "SELECT * FROM Appointments";
        PreparedStatement show;
        try {
            show = con.prepareStatement(sql);
            rs = show.executeQuery();
            appointment a = null;
            while (rs.next())
            {
                int id =rs.getInt("ID");
                int P_id =  rs.getInt("P_ID");
                String D_Name = rs.getString("D_Name");
                String department = rs.getString("Department");
                String Date = rs.getString("Date");
                String Time = rs.getString("Time");
                String status = rs.getString("status");
                Object app[] = {id, P_id, D_Name, department, Date, Time, status};
                appointment.addRow(app);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin_profile.class.getName()).log(Level.SEVERE, null, ex); 
        }
    }
    
    public static ResultSet ShowDoctorDetails()
    {
        String input = JOptionPane.showInputDialog(Admin_profile, "Enter Doctors id :");
        if(input == null || ("".equals(input)))   
        {
            return null;
        }
        else
        {
            doctor_id =Integer.parseInt(input);
            try{  
            String sql = "SELECT * FROM Doctors WHERE ID = (?)";
            PreparedStatement get = con.prepareStatement(sql);
            get.setInt(1, doctor_id);
            rs = get.executeQuery();
            if (rs.isBeforeFirst()){
                rs.next();
                return rs;   
            }
            else
            {
                JOptionPane.showMessageDialog(Admin_profile, "Invalid ID");
                return null;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(Admin_profile,"ID is not registered");
        }
        return null;
        }
    }
    
    public static void DeleteDoctor()
    {
        try{  
            String sql = "DELETE FROM Doctors WHERE ID = (?)";
            PreparedStatement delete = con.prepareStatement(sql);
            delete.setInt(1, doctor_id);
            delete.executeUpdate();
            JOptionPane.showMessageDialog(Admin_profile,"Doctor deleted successfully");
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(Admin_profile,"ID is not registered");
        }
    }
    
    public static void EditDoctor(Doctor a)
    {
        try {
            String sql = "SELECT * FROM Doctors WHERE ID = (?)";
            PreparedStatement set = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            set.setInt(1, doctor_id);
            rs = set.executeQuery();
            rs.next();
        }
        catch (Exception e)
        {
          JOptionPane.showMessageDialog(Admin_profile, "can't be editted");
        }
        
        try {
            rs.updateString(1,a.getName());
            rs.updateInt(9,a.getExperience());
            rs.updateString(2,a.getLanguages());
            rs.updateString(3,a.getEmail());
            rs.updateString(4,a.getPhone());
            rs.updateString(5,a.getSchedual());
            rs.updateInt(8,a.getAge());        
            rs.updateRow();
            JOptionPane.showMessageDialog(Admin_profile, "Doctor Updated successfuly");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(Admin_profile, "Doctor is not found");
        }
    }

}
