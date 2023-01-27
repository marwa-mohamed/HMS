/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospiatl_System;



/**
 *
 * @author marw
 */
public class appointment {
    int P_id;
    String D_name, department, Date, Time,status;
    appointment(int p, String d, String de, String date, String t, String c)
    {
        this.P_id = p;
        this.D_name = d;
        this.department = de;
        this.Date = date;
        this.Time = t;
        this.status = c;
    }
    
}
