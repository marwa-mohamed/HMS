/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospiatl_System;

import static Hospiatl_System.Patient_profile.appointment_id;
import java.awt.Component;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Patient implements DB{

    private static Component Patient_Registration;
    private static Component Patient_profile;
    private String address,mobile,blood,name,pass,email,gender;
    private int age;
    static Connection con;
    private static ResultSet rs;
    public static int count = 0;

    public Patient(String name, String address, String email, String mobile, String blood, int age, String gender, String pass)
    {
        this.name = name;
        this.pass = pass;
        this.email = email;
        this.address = address;
        this.mobile = mobile;
        this.blood = blood;
        this.age = age;
        this.gender = gender;
    }
    
    
    
    private static void count()
    {
        try {
            String sql = "SELECT COUNT(*) FROM Appointments";
            con = DB.connect();
            PreparedStatement number = con.prepareStatement(sql);
            rs = number.executeQuery();
            rs.next();
            count = rs.getInt(1);
        } catch (SQLException ex) {
            Logger.getLogger(Patient.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public static boolean RegisterPatient(Patient a)
    {
        if (CheckRegistartionEmail(a.email))
        {
            try {
            String sqlpatient = "insert into Patients(Name,age,gender,blood,email,phone,address,pass) values(?,?,?,?,?,?,?,?)";
            PreparedStatement insert = con.prepareStatement(sqlpatient);
            insert.setString(1, a.name);
            insert.setInt(2, a.age);
            insert.setString(3, a.gender);
            insert.setString(4, a.blood);
            insert.setString(5, a.email);
            insert.setString(6, a.mobile);
            insert.setString(7, a.address);
            insert.setString(8, a.pass);
            insert.executeUpdate();
            JOptionPane.showMessageDialog(Patient_Registration, "Patient added successfuly");
            return true;
        }
        catch (Exception e)
        {
          JOptionPane.showMessageDialog(Patient_Registration, "Can't be added, please check your Data");
          return false;
        }
        }
        else
        {
            JOptionPane.showMessageDialog(Patient_Registration, "This Email is already used");
            return false;
        }   
    }
    
    private static boolean CheckRegistartionEmail(String email) 
    {
        try {
            String sql = "SELECT Email FROM Patients Where email = ?";
            PreparedStatement Login = con.prepareStatement(sql);
            Login.setString(1, email);
            ResultSet rs = Login.executeQuery(); 
            return (!(rs.isBeforeFirst()));
        } catch (SQLException ex) {
            return false;
        }
    }
    
    public static void ShowDocotrs(DefaultTableModel Doctor)
    {
        Doctor.setRowCount(0);
         try {
            String doc = "Select * From Doctors ";
            PreparedStatement insert = con.prepareStatement(doc);
            rs = insert.executeQuery();
            while(rs.next())
            {
                Doctor.addRow(new Object[] {rs.getString("Name"),rs.getInt("ID"),rs.getString("specialization"),rs.getInt("experience"),rs.getString("sche")});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(Patient_profile, "Error");
        }  
    }
    
    public static ResultSet CheckLoginData (String email)
    {
         try {
            String sql = "SELECT pass,id FROM Patients WHERE email = (?)";
            PreparedStatement Login = con.prepareStatement(sql);
            Login.setString(1, email);
            rs = Login.executeQuery();      
                return (ResultSet) rs;
        } catch (SQLException | NullPointerException ex ) {
                return null; 
            }
    }
    
    public static void UpdateDetails(int Patient_id, Patient a)
    {
        try {
            rs = PatientData(Patient_id);
            rs.next();
            rs.updateString(1,a.name);
            rs.updateInt(2,a.age);
            rs.updateString(3,a.gender);
            rs.updateString(4,a.blood);
            rs.updateString(5, a.email);
            rs.updateString(6,a.mobile);
            rs.updateString(7,a.address);
            rs.updateString(8,a.pass);        
            rs.updateRow();
            JOptionPane.showMessageDialog(Patient_profile, "Patient Updated successfuly");
      } catch (SQLException ex) {
            JOptionPane.showMessageDialog(Patient_profile, "patient is not found");
        }
    }
    
    public static ResultSet PatientData(int Patient_id)
    { 
        try {
            String sql = "SELECT * FROM Patients WHERE id = (?)";
            PreparedStatement set = Patient.con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            set.setInt(1, Patient_id);
            rs = set.executeQuery();
            return rs;
        }
        catch (Exception e)
        {
            return null;
        }
        
    }
    
    public static void UpdateAppointment(appointment a)
    {
        try {
            String sqlApp = "SELECT * FROM Appointments WHERE ID = (?)";
            PreparedStatement Update = Patient.con.prepareStatement(sqlApp, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            Update.setInt(1, appointment_id);
            rs = Update.executeQuery();
            rs.next();
            rs.updateInt(2, a.P_id);
            rs.updateString(3, a.D_name);
            rs.updateString(4, a.department);
            rs.updateString(5, a.Date);
            rs.updateString(6, a.Time);
//            rs.updateString(7, a.status);
            rs.updateRow();
            JOptionPane.showMessageDialog(Patient_profile, "Appointment Updated successfuly");  
        } catch (SQLException ex) {
            Logger.getLogger(Patient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private static void BookAppointmetn(appointment a)
    {
        try {
            String sqlApp = "insert into Appointments(P_ID,D_Name,Department,Date,Time) values(?,?,?,?,?)";
            PreparedStatement insert = Patient.con.prepareStatement(sqlApp);
            insert.setInt(1, a.P_id);
            insert.setString(2, a.D_name);
            insert.setString(3, a.department);
            insert.setString(4, a.Date);
            insert.setString(5, a.Time);
//            insert.setString(6, a.status);
            insert.executeUpdate();
            JOptionPane.showMessageDialog(Patient_profile, "Appointment Booked successfuly");
            count();
        } catch (SQLException ex) {
            Logger.getLogger(Patient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void checkappointment(appointment a)
    {
        try {
            String sqlApp = "SELECT COUNT(*) FROM Appointments WHERE Date = (?) AND Time = (?) AND D_Name = (?)";
            PreparedStatement search = Patient.con.prepareStatement(sqlApp, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            search.setString(1, a.Date);
            search.setString(2, a.Time);
            search.setString(3, a.Time);
            ResultSet result = search.executeQuery();
            if (result.next())
            JOptionPane.showMessageDialog(Patient_profile, "This appointment is already booked, choose another date");
            else
                BookAppointmetn(a);
        } catch (SQLException ex) {
            Logger.getLogger(Patient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
        
}
