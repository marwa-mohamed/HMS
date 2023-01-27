/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospiatl_System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public interface DB {
    static final String url = "jdbc:mysql://localhost:3306/Hospital";
    static final String username = "root";
    static final String userpass = "Marwa.2001";    
    
    public static Connection connect()
    {
        try {
           Connection con =  DriverManager.getConnection( url,username,userpass);
           return con;
        }
        catch (Exception e) {
           return null;
        }
    }
    
    public static void Disconnect(Connection con)
    {
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
