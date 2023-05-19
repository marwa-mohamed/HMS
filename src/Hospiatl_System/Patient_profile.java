/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Hospiatl_System;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marw
 */
public class Patient_profile extends javax.swing.JFrame {
    String name,gender,blood,email,phone,address,pass;
    int age,Patient_id;
    Connection con = null;
    ResultSet rs = null;
    static int appointment_id = -1;
    public Patient_profile(int id) {
        initComponents();
        Options.setSelectedIndex(0);
        this.setSize(787,650 );
        Patient_id = id;
        put_patient_data();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Choices = new javax.swing.JPanel();
        Profile = new javax.swing.JLabel();
        Updat_details = new javax.swing.JLabel();
        Logout = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        Doctors = new javax.swing.JLabel();
        Booking = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        Options = new javax.swing.JTabbedPane();
        main = new javax.swing.JPanel();
        Age = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        Gender = new javax.swing.JLabel();
        Blood = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        Phone = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        D_ID = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        prescript = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        Address = new javax.swing.JLabel();
        Update_details = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Doctor = new javax.swing.JTable();
        View_Docotr = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        UpdateDetails = new javax.swing.JButton();
        E_gender = new javax.swing.JComboBox<>();
        E_name = new javax.swing.JTextField();
        E_age = new javax.swing.JTextField();
        E_email = new javax.swing.JTextField();
        E_blood = new javax.swing.JTextField();
        E_phone = new javax.swing.JTextField();
        E_address = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        E_pass = new javax.swing.JTextField();
        make_appointment = new javax.swing.JPanel();
        Book = new javax.swing.JButton();
        Specializations = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        names = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        Time = new javax.swing.JTextField();
        Datet = new javax.swing.JTextField();
        Edit = new javax.swing.JButton();
        Delete = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setLocationByPlatform(true);

        Choices.setBackground(new java.awt.Color(0, 0, 0));

        Profile.setFont(new java.awt.Font("Liberation Mono", 0, 18)); // NOI18N
        Profile.setForeground(new java.awt.Color(255, 255, 255));
        Profile.setText("Profile");
        Profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProfileMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ProfileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ProfileMouseExited(evt);
            }
        });

        Updat_details.setFont(new java.awt.Font("Liberation Mono", 0, 18)); // NOI18N
        Updat_details.setForeground(new java.awt.Color(255, 255, 255));
        Updat_details.setText("Update Details");
        Updat_details.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Updat_detailsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Updat_detailsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Updat_detailsMouseExited(evt);
            }
        });

        Logout.setFont(new java.awt.Font("Liberation Mono", 0, 18)); // NOI18N
        Logout.setForeground(new java.awt.Color(255, 255, 255));
        Logout.setText("Logout");
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogoutMouseExited(evt);
            }
        });

        Doctors.setFont(new java.awt.Font("Liberation Mono", 0, 18)); // NOI18N
        Doctors.setForeground(new java.awt.Color(255, 255, 255));
        Doctors.setText("View Doctors");
        Doctors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DoctorsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DoctorsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DoctorsMouseExited(evt);
            }
        });

        Booking.setFont(new java.awt.Font("Liberation Mono", 0, 18)); // NOI18N
        Booking.setForeground(new java.awt.Color(255, 255, 255));
        Booking.setText("Book Appointment");
        Booking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BookingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BookingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BookingMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ChoicesLayout = new javax.swing.GroupLayout(Choices);
        Choices.setLayout(ChoicesLayout);
        ChoicesLayout.setHorizontalGroup(
            ChoicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChoicesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ChoicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ChoicesLayout.createSequentialGroup()
                        .addGroup(ChoicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2)
                            .addGroup(ChoicesLayout.createSequentialGroup()
                                .addGroup(ChoicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Logout)
                                    .addComponent(Doctors)
                                    .addComponent(Updat_details))
                                .addGap(0, 56, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addComponent(jSeparator6)
                    .addGroup(ChoicesLayout.createSequentialGroup()
                        .addGroup(ChoicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Booking)
                            .addComponent(Profile))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        ChoicesLayout.setVerticalGroup(
            ChoicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChoicesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Profile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Booking)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Updat_details)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Doctors)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Logout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Options.setBackground(new java.awt.Color(255, 255, 255));
        Options.setTabPlacement(javax.swing.JTabbedPane.RIGHT);
        Options.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Options.setFocusTraversalPolicyProvider(true);

        main.setPreferredSize(new java.awt.Dimension(574, 550));

        Age.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        Age.setText("Age :");

        Name.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        Name.setText("Name :");

        Gender.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        Gender.setText("Gender :");

        Blood.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        Blood.setText("Blood");

        Email.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        Email.setText("E-mail :");

        Phone.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        Phone.setText("Phone no. :");

        jLabel15.setFont(new java.awt.Font("Liberation Sans", 3, 20)); // NOI18N
        jLabel15.setText(" Recent Prescription");

        jLabel16.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel16.setText("Phone no. ");

        jLabel17.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel17.setText("E-mail ");

        jLabel20.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel20.setText("Blood");

        jLabel21.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel21.setText("Gender ");

        jLabel22.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel22.setText("Age ");

        jLabel23.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel23.setText("Name ");

        D_ID.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        D_ID.setText("ID");

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel5.setText("ID");

        prescript.setColumns(20);
        prescript.setRows(5);
        jScrollPane2.setViewportView(prescript);

        jLabel18.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel18.setText("Address");

        Address.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        Address.setText("Phone no. :");

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainLayout.createSequentialGroup()
                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(mainLayout.createSequentialGroup()
                                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel20)
                                            .addComponent(jLabel21)
                                            .addComponent(jLabel22)
                                            .addComponent(jLabel23)
                                            .addComponent(jLabel5))
                                        .addGap(127, 127, 127)
                                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(D_ID)
                                            .addComponent(Blood)
                                            .addComponent(Gender)
                                            .addComponent(Name)
                                            .addComponent(Age)))
                                    .addGroup(mainLayout.createSequentialGroup()
                                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel18))
                                        .addGap(105, 105, 105)
                                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Address)
                                            .addComponent(Email)
                                            .addComponent(Phone)))))
                            .addGroup(mainLayout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addComponent(jLabel15)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(D_ID)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel20))
                    .addGroup(mainLayout.createSequentialGroup()
                        .addComponent(Name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Age)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Gender)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Blood)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16))
                    .addGroup(mainLayout.createSequentialGroup()
                        .addComponent(Email)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Phone)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(Address))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        Options.addTab("", main);
        main.getAccessibleContext().setAccessibleDescription("");

        Doctor.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        Doctor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Doctor Name", "Doctor ID", "Department", "Experience", "Schedual"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(Doctor);

        javax.swing.GroupLayout Update_detailsLayout = new javax.swing.GroupLayout(Update_details);
        Update_details.setLayout(Update_detailsLayout);
        Update_detailsLayout.setHorizontalGroup(
            Update_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
        );
        Update_detailsLayout.setVerticalGroup(
            Update_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
        );

        Options.addTab("", Update_details);

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel3.setText("Name :");

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel4.setText("Age :");

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel6.setText("Gender :");

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel7.setText("E-mail :");

        jLabel8.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel8.setText("Blood Group :");

        jLabel9.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel9.setText("Mobile no. :");

        jLabel10.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel10.setText("Password");

        UpdateDetails.setFont(new java.awt.Font("Liberation Sans", 3, 18)); // NOI18N
        UpdateDetails.setText("Update");
        UpdateDetails.setPreferredSize(new java.awt.Dimension(102, 10));
        UpdateDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateDetailsMouseClicked(evt);
            }
        });

        E_gender.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        E_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jLabel11.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel11.setText("Address :");

        javax.swing.GroupLayout View_DocotrLayout = new javax.swing.GroupLayout(View_Docotr);
        View_Docotr.setLayout(View_DocotrLayout);
        View_DocotrLayout.setHorizontalGroup(
            View_DocotrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(View_DocotrLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(View_DocotrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(View_DocotrLayout.createSequentialGroup()
                        .addGroup(View_DocotrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(View_DocotrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(E_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(E_name)
                            .addComponent(E_age)
                            .addComponent(E_blood)
                            .addComponent(E_email)
                            .addComponent(E_phone)
                            .addComponent(E_address)
                            .addComponent(E_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, View_DocotrLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(UpdateDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(164, 164, 164)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        View_DocotrLayout.setVerticalGroup(
            View_DocotrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(View_DocotrLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(View_DocotrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(E_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(View_DocotrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(E_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(View_DocotrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(E_gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(View_DocotrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(E_blood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(View_DocotrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(E_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(View_DocotrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(E_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(View_DocotrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(E_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(View_DocotrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(E_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(UpdateDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(211, Short.MAX_VALUE))
        );

        Options.addTab("", View_Docotr);

        Book.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        Book.setText("Book / Update ");
        Book.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BookMouseClicked(evt);
            }
        });

        Specializations.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        Specializations.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Internal Medicine", "Neurology", "Ophthalmology", "Orthopedics", "Pediatrics", "Obstetrics and Gynecology" }));
        Specializations.setSelectedIndex(-1);
        Specializations.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Specializations.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                SpecializationsItemStateChanged(evt);
            }
        });
        Specializations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpecializationsActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel19.setText("Department");

        jLabel24.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel24.setText("Doctor Name");

        names.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        names.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namesActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel25.setText("Time");

        jLabel26.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel26.setText("Date");

        Edit.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        Edit.setText("Edit");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        Delete.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        Delete.setText("Delete");
        Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout make_appointmentLayout = new javax.swing.GroupLayout(make_appointment);
        make_appointment.setLayout(make_appointmentLayout);
        make_appointmentLayout.setHorizontalGroup(
            make_appointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(make_appointmentLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(Book)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, make_appointmentLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(make_appointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel24)
                    .addComponent(jLabel26)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addGroup(make_appointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Delete)
                    .addGroup(make_appointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Specializations, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(names, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Time)
                        .addComponent(Datet, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(68, 68, 68))
        );
        make_appointmentLayout.setVerticalGroup(
            make_appointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(make_appointmentLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(make_appointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(Specializations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(make_appointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(names, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(make_appointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(Datet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(make_appointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(make_appointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Book, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(335, Short.MAX_VALUE))
        );

        Options.addTab("", make_appointment);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Choices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Options))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Choices, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Options)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfileMouseClicked
        // TODO add your handling code here:
        put_patient_data();
        Options.setSelectedIndex(0);
    }//GEN-LAST:event_ProfileMouseClicked

    private void ProfileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfileMouseEntered
        // TODO add your handling code here:
        Profile.setText("<html><u>Profile</u></html>");
    }//GEN-LAST:event_ProfileMouseEntered

    private void ProfileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfileMouseExited
        // TODO add your handling code here:
        Profile.setText("Profile");
    }//GEN-LAST:event_ProfileMouseExited

    private void Updat_detailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Updat_detailsMouseClicked
        // TODO add your handling code here:
        Options.setSelectedIndex(2);
        Patient.con = DB.connect();
        try {
            rs = Patient.PatientData(Patient_id);
            rs.next();
            E_name.setText(rs.getString("Name"));
            E_age.setText(String.valueOf(rs.getInt("age")));
            E_gender.setSelectedItem(rs.getString("gender"));
            E_blood.setText(rs.getString("blood"));
            E_email.setText(rs.getString("email"));
            E_phone.setText(rs.getString("phone"));
            E_address.setText(rs.getString("address"));
            E_pass.setText(rs.getString("pass"));    
        }
        catch (Exception e)
        {
          JOptionPane.showMessageDialog(this, "can't be editted");
        }
        DB.Disconnect(Patient.con);
    }//GEN-LAST:event_Updat_detailsMouseClicked

    private void Updat_detailsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Updat_detailsMouseEntered
        // TODO add your handling code here:
        Updat_details.setText("<html><u>Update Details</u></html>");
    }//GEN-LAST:event_Updat_detailsMouseEntered

    private void Updat_detailsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Updat_detailsMouseExited
        // TODO add your handling code here:
        Updat_details.setText("Update Details");
    }//GEN-LAST:event_Updat_detailsMouseExited

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        // TODO add your handling code here:
        setDefaultCloseOperation(Doctor_profile.HIDE_ON_CLOSE);
        dispose();
        new Main_screen().setVisible(true);
    }//GEN-LAST:event_LogoutMouseClicked

    private void LogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseEntered
        // TODO add your handling code here:
        Logout.setText("<html><u>Logout</u></html>");
    }//GEN-LAST:event_LogoutMouseEntered

    private void LogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseExited
        // TODO add your handling code here:
        Logout.setText("Logout");
    }//GEN-LAST:event_LogoutMouseExited

    private void DoctorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoctorsMouseClicked
        // TODO add your handling code here:
        Options.setSelectedIndex(1);
        DefaultTableModel Docotr = (DefaultTableModel) Doctor.getModel();
        Patient.con = DB.connect();
        Patient.ShowDocotrs(Docotr);
        DB.Disconnect(Patient.con);     
    }//GEN-LAST:event_DoctorsMouseClicked

    private void DoctorsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoctorsMouseEntered
        // TODO add your handling code here:
        Doctors.setText("<html><u>View Doctors</u></html>");
    }//GEN-LAST:event_DoctorsMouseEntered

    private void DoctorsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoctorsMouseExited
        // TODO add your handling code here:
        Doctors.setText("View Doctors");
    }//GEN-LAST:event_DoctorsMouseExited

    private void BookingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookingMouseClicked
        // TODO add your handling code here:
        Options.setSelectedIndex(3);
    }//GEN-LAST:event_BookingMouseClicked

    private void BookingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookingMouseEntered
        // TODO add your handling code here:
        Booking.setText("<html><u>Book Appointment</u></html>");
    }//GEN-LAST:event_BookingMouseEntered

    private void BookingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookingMouseExited
        // TODO add your handling code here:
        Booking.setText("Book Appointment");
    }//GEN-LAST:event_BookingMouseExited

    private void SpecializationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpecializationsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SpecializationsActionPerformed

    private void namesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namesActionPerformed

    private void SpecializationsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_SpecializationsItemStateChanged
        // TODO add your handling code here:
        names.removeAllItems();
        String Department= Specializations.getSelectedItem().toString();
        Patient.con = DB.connect();
        try{
            String sql = "SELECT Name FROM Doctors WHERE specialization = ? ";
            PreparedStatement search = Patient.con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            search.setString(1, Department);
            rs = search.executeQuery();
            while (rs.next())
            {
                names.addItem(rs.getString("Name"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"An error happened");
        }
        DB.Disconnect(Patient.con);
    }//GEN-LAST:event_SpecializationsItemStateChanged

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        // TODO add your handling code here:
        appointment_id =  Integer.parseInt(JOptionPane.showInputDialog(this, "Enter appointment ID"));
        put_appointment_info(appointment_id);
    }//GEN-LAST:event_EditActionPerformed

    private void UpdateDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateDetailsMouseClicked
        // TODO add your handling code here:      
        try {
            name = E_name.getText();
            age = Integer.parseInt(E_age.getText());
            phone = E_phone.getText();
            address = E_address.getText();
            blood = E_blood.getText();
            email = E_email.getText();
            gender = E_gender.getSelectedItem().toString();
            pass= E_pass.getText();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "All fields need to be filled with suitable data");
        }
        
        Patient.con = DB.connect();
        Patient a = new Patient(name, address, email, phone, blood, age, gender, pass);
        Patient.UpdateDetails(Patient_id, a);
        DB.Disconnect(Patient.con);
    }//GEN-LAST:event_UpdateDetailsMouseClicked

    private void BookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookMouseClicked
        // TODO add your handling code here:
        String department =  Specializations.getSelectedItem().toString();
        String D_name = names.getSelectedItem().toString();
        String Date = this.Datet.getText();
        String Time = this.Time.getText();
//        boolean status = cancel.isSelected();
//        String cancel = "";
//        
//        if (status)
//            cancel = "Cancelled";
//
//        else
//            cancel = "Not Cancelled";
               
        appointment a = new appointment(Patient_id, D_name,department , Date, Time);
        Patient.con = DB.connect();
        try {
            if (appointment_id != -1)
            {
                Patient.UpdateAppointment(a);
                appointment_id = -1;
            }
            else
            {
                Patient.checkappointment(a);
                appointment_id = Patient.count;
            }
        } catch (Exception ex) {
            System.err.println(appointment_id);
            JOptionPane.showMessageDialog(this, "An error happened");
        }
        DB.Disconnect(Patient.con);
    }//GEN-LAST:event_BookMouseClicked

    private void DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseClicked
        // TODO add your handling code here:
        appointment_id =  Integer.parseInt(JOptionPane.showInputDialog(this, "Enter appointment ID"));
        Delete(appointment_id);
    }//GEN-LAST:event_DeleteMouseClicked

    private void put_patient_data()
    {
        Patient.con = DB.connect();
        try{  
            String sql = "SELECT * FROM Patients WHERE id = (?)";
            PreparedStatement Login = Patient.con.prepareStatement(sql);
            Login.setInt(1, Patient_id);
            rs = Login.executeQuery();
            rs.next();
            Name.setText(rs.getString(1));
            Email.setText(rs.getString(5));
            Phone.setText(rs.getString(6));
            Age.setText(String.valueOf(rs.getInt(2)));
            Gender.setText(rs.getString(3));
            Address.setText(rs.getString(7));
            Blood.setText(rs.getString(4));
            D_ID.setText(rs.getString(9));
            prescript.setText(rs.getString(10));
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,"An error happened");  
        } 
        DB.Disconnect(Patient.con);
    }
    
    
    private void put_appointment_info(int id)
    {
        Patient.con = DB.connect();
        try{  
            String sql = "SELECT * FROM Appointments WHERE ID = (?)";
            PreparedStatement put = Patient.con.prepareStatement(sql);
            put.setInt(1, id);
            rs = put.executeQuery();
            rs.next();
            Datet.setText(rs.getString(5));
            Time.setText(rs.getString(6));
            Specializations.setSelectedItem(rs.getString(4));
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,"Appointment ID not found");  
        } 
        DB.Disconnect(Patient.con);
    }
    
        private void Delete(int id)
    {
        con = DB.connect();
        try{  
            String sql = "delete from Appointments where ID = ?";
            PreparedStatement delete = con.prepareStatement(sql);
            delete.setInt(1, id);
            System.out.println(delete);
            delete.execute();
            JOptionPane.showMessageDialog(this,"Appointment Deleted successfully");  
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,"Appointment ID not found");  
        } 
        DB.Disconnect(con);
    }
    
    private void ClearData()
    {
        E_name.setText("");
        E_email.setText("");
        E_gender.setSelectedIndex(-1);
        E_phone.setText("");
        E_blood.setText("");
        E_pass.setText("");
        E_age.setText("");
        E_address.setText("");   
    }
    
      private void clear_appointment_info()
    {
            Datet.setText("");
            Time.setText("");
            Specializations.setSelectedIndex(-1);
            names.setSelectedIndex(-1);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Patient_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patient_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patient_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patient_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        int id = 0;
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patient_profile(id).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address;
    private javax.swing.JLabel Age;
    private javax.swing.JLabel Blood;
    private javax.swing.JButton Book;
    private javax.swing.JLabel Booking;
    private javax.swing.JPanel Choices;
    private javax.swing.JLabel D_ID;
    private javax.swing.JTextField Datet;
    private javax.swing.JButton Delete;
    private javax.swing.JTable Doctor;
    private javax.swing.JLabel Doctors;
    private javax.swing.JTextField E_address;
    private javax.swing.JTextField E_age;
    private javax.swing.JTextField E_blood;
    private javax.swing.JTextField E_email;
    private javax.swing.JComboBox<String> E_gender;
    private javax.swing.JTextField E_name;
    private javax.swing.JTextField E_pass;
    private javax.swing.JTextField E_phone;
    private javax.swing.JButton Edit;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Gender;
    private javax.swing.JLabel Logout;
    private javax.swing.JLabel Name;
    private javax.swing.JTabbedPane Options;
    private javax.swing.JLabel Phone;
    private javax.swing.JLabel Profile;
    private javax.swing.JComboBox<String> Specializations;
    private javax.swing.JTextField Time;
    private javax.swing.JLabel Updat_details;
    private javax.swing.JButton UpdateDetails;
    private javax.swing.JPanel Update_details;
    private javax.swing.JPanel View_Docotr;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel main;
    private javax.swing.JPanel make_appointment;
    private javax.swing.JComboBox<String> names;
    private javax.swing.JTextArea prescript;
    // End of variables declaration//GEN-END:variables
}
