/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Hospiatl_System;


import static Hospiatl_System.Doctor.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marw
 */
public class Doctor_profile extends javax.swing.JFrame {
    final int doctor_id;
    boolean flag = false;
    ResultSet rs = null;
    /**
     * Creates new form Doctor_profile
     * @param id
     */
    public Doctor_profile(int id) {
        initComponents();
        Options.setSelectedIndex(0);
        this.setSize(790,500 );
        doctor_id = id;
        put_data();
        Prescript.setLineWrap(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Choices = new javax.swing.JPanel();
        Profile = new javax.swing.JLabel();
        My_Appointments = new javax.swing.JLabel();
        Logout = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        Add_Prescription = new javax.swing.JLabel();
        Edit_Password = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        Options = new javax.swing.JTabbedPane();
        main = new javax.swing.JPanel();
        Age = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        Gender = new javax.swing.JLabel();
        Specialization = new javax.swing.JLabel();
        Experience = new javax.swing.JLabel();
        Languages = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        Phone = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        D_ID = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Sche = new javax.swing.JLabel();
        Edit_pass = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        Pass = new javax.swing.JPasswordField();
        ConfirmPass = new javax.swing.JPasswordField();
        Confirm = new javax.swing.JButton();
        Appointments = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Appointment = new javax.swing.JTable();
        Prescription = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Patient_ID = new javax.swing.JTextField();
        Prescript = new javax.swing.JTextArea();
        Send = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        My_Appointments.setFont(new java.awt.Font("Liberation Mono", 0, 18)); // NOI18N
        My_Appointments.setForeground(new java.awt.Color(255, 255, 255));
        My_Appointments.setText("My Appointments");
        My_Appointments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                My_AppointmentsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                My_AppointmentsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                My_AppointmentsMouseExited(evt);
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

        Add_Prescription.setFont(new java.awt.Font("Liberation Mono", 0, 18)); // NOI18N
        Add_Prescription.setForeground(new java.awt.Color(255, 255, 255));
        Add_Prescription.setText("Add Prescription");
        Add_Prescription.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Add_PrescriptionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Add_PrescriptionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Add_PrescriptionMouseExited(evt);
            }
        });

        Edit_Password.setFont(new java.awt.Font("Liberation Mono", 0, 18)); // NOI18N
        Edit_Password.setForeground(new java.awt.Color(255, 255, 255));
        Edit_Password.setText("Edit Password");
        Edit_Password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Edit_PasswordMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Edit_PasswordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Edit_PasswordMouseExited(evt);
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
                                    .addComponent(Add_Prescription)
                                    .addComponent(My_Appointments))
                                .addGap(0, 56, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addComponent(jSeparator6)
                    .addGroup(ChoicesLayout.createSequentialGroup()
                        .addGroup(ChoicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Edit_Password)
                            .addComponent(Profile))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(ChoicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ChoicesLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(ChoicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ChoicesLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        ChoicesLayout.setVerticalGroup(
            ChoicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChoicesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Profile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Edit_Password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(My_Appointments)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Add_Prescription)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Logout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(ChoicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ChoicesLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(ChoicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ChoicesLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        Options.setTabPlacement(javax.swing.JTabbedPane.RIGHT);

        Age.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        Age.setText("Age :");

        Name.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        Name.setText("Name :");

        Gender.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        Gender.setText("Gender :");

        Specialization.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        Specialization.setText("Specialization :");

        Experience.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        Experience.setText("Years of Exp. :");

        Languages.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        Languages.setText("Spoken languages :");

        jLabel12.setFont(new java.awt.Font("Liberation Sans", 3, 20)); // NOI18N
        jLabel12.setText("Schedual :");

        Email.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        Email.setText("E-mail :");

        Phone.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        Phone.setText("Phone no. :");

        jLabel15.setFont(new java.awt.Font("Liberation Sans", 3, 20)); // NOI18N
        jLabel15.setText("Contact details :");

        jLabel16.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel16.setText("Phone no. ");

        jLabel17.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel17.setText("E-mail ");

        jLabel18.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel18.setText("Spoken languages ");

        jLabel19.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel19.setText("Years of Exp. ");

        jLabel20.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel20.setText("Specialization ");

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

        Sche.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        Sche.setText("Sche");

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(Sche)
                    .addComponent(jLabel12)
                    .addGroup(mainLayout.createSequentialGroup()
                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel5)))
                            .addComponent(jLabel17)
                            .addComponent(jLabel16))
                        .addGap(31, 31, 31)
                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Email)
                            .addComponent(Phone)
                            .addComponent(D_ID)
                            .addComponent(Languages)
                            .addComponent(Experience)
                            .addComponent(Specialization)
                            .addComponent(Gender)
                            .addComponent(Name)
                            .addComponent(Age))))
                .addGap(161, 161, 161))
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
                        .addComponent(Specialization)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Experience)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Languages)
                            .addComponent(jLabel18))))
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
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
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(Sche)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Options.addTab("", main);

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel6.setText("New Password");

        jLabel24.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel24.setText("Confirm Password");

        Confirm.setText("Confirm");
        Confirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConfirmMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Edit_passLayout = new javax.swing.GroupLayout(Edit_pass);
        Edit_pass.setLayout(Edit_passLayout);
        Edit_passLayout.setHorizontalGroup(
            Edit_passLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Edit_passLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Edit_passLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(jLabel6))
                .addGap(27, 27, 27)
                .addGroup(Edit_passLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ConfirmPass)
                    .addComponent(Pass))
                .addContainerGap())
            .addGroup(Edit_passLayout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addComponent(Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(284, Short.MAX_VALUE))
        );
        Edit_passLayout.setVerticalGroup(
            Edit_passLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Edit_passLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(Edit_passLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ConfirmPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Edit_passLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(332, Short.MAX_VALUE))
        );

        Options.addTab("", Edit_pass);

        Appointment.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        Appointment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "P_ID", "Date", "Time", "Status"
            }
        ));
        jScrollPane1.setViewportView(Appointment);

        javax.swing.GroupLayout AppointmentsLayout = new javax.swing.GroupLayout(Appointments);
        Appointments.setLayout(AppointmentsLayout);
        AppointmentsLayout.setHorizontalGroup(
            AppointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
        );
        AppointmentsLayout.setVerticalGroup(
            AppointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );

        Options.addTab("", Appointments);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel1.setText("Patient ID");

        Prescript.setColumns(20);
        Prescript.setRows(5);

        Send.setText("Send");
        Send.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SendMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PrescriptionLayout = new javax.swing.GroupLayout(Prescription);
        Prescription.setLayout(PrescriptionLayout);
        PrescriptionLayout.setHorizontalGroup(
            PrescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrescriptionLayout.createSequentialGroup()
                .addGroup(PrescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrescriptionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(Patient_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PrescriptionLayout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(Send))
                    .addGroup(PrescriptionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Prescript, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PrescriptionLayout.setVerticalGroup(
            PrescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrescriptionLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(PrescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Patient_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Prescript, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(Send, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        Options.addTab("", Prescription);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Choices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Options))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Choices, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Options, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfileMouseClicked
        // TODO add your handling code here:
        Options.setSelectedIndex(0);
        put_data();  
    }//GEN-LAST:event_ProfileMouseClicked

    private void ProfileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfileMouseEntered
        // TODO add your handling code here:
        Profile.setText("<html><u>Profile</u></html>");
    }//GEN-LAST:event_ProfileMouseEntered

    private void ProfileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfileMouseExited
        // TODO add your handling code here:
        Profile.setText("Profile");
    }//GEN-LAST:event_ProfileMouseExited

    private void Edit_PasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Edit_PasswordMouseEntered
        // TODO add your handling code here:
        Edit_Password.setText("<html><u>Edit Password</u></html>");
    }//GEN-LAST:event_Edit_PasswordMouseEntered

    private void Edit_PasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Edit_PasswordMouseExited
        // TODO add your handling code here:
        Edit_Password.setText("Edit Password");
    }//GEN-LAST:event_Edit_PasswordMouseExited

    private void My_AppointmentsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_My_AppointmentsMouseEntered
        // TODO add your handling code here:
        My_Appointments.setText("<html><u>My Appointments</u></html>");
    }//GEN-LAST:event_My_AppointmentsMouseEntered

    private void My_AppointmentsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_My_AppointmentsMouseExited
        // TODO add your handling code here:
        My_Appointments.setText("My Appointments");
    }//GEN-LAST:event_My_AppointmentsMouseExited

    private void Add_PrescriptionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_PrescriptionMouseEntered
        // TODO add your handling code here:
        Add_Prescription.setText("<html><u>Add Prescription</u></html>");
    }//GEN-LAST:event_Add_PrescriptionMouseEntered

    private void Add_PrescriptionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_PrescriptionMouseExited
        // TODO add your handling code here:
        Add_Prescription.setText("Add Prescription");

    }//GEN-LAST:event_Add_PrescriptionMouseExited

    private void LogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseEntered
        // TODO add your handling code here:
        Logout.setText("<html><u>Logout</u></html>");
    }//GEN-LAST:event_LogoutMouseEntered

    private void LogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseExited
        // TODO add your handling code here:
        Logout.setText("Logout");
    }//GEN-LAST:event_LogoutMouseExited

    private void Edit_PasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Edit_PasswordMouseClicked
        // TODO add your handling code here:
        Options.setSelectedIndex(1);
    }//GEN-LAST:event_Edit_PasswordMouseClicked

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        // TODO add your handling code here:
                setDefaultCloseOperation(Doctor_profile.HIDE_ON_CLOSE);
                dispose();
                new Main_screen().setVisible(true);        
    }//GEN-LAST:event_LogoutMouseClicked

    private void My_AppointmentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_My_AppointmentsMouseClicked
        // TODO add your handling code here:
        Options.setSelectedIndex(2);
        Doctor.con = DB.connect();
        DefaultTableModel appointment = (DefaultTableModel) Appointment.getModel();
        Doctor.ShowAppointments(appointment, doctor_id);
        DB.Disconnect(Doctor.con);
    }//GEN-LAST:event_My_AppointmentsMouseClicked

    private void Add_PrescriptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_PrescriptionMouseClicked
        // TODO add your handling code here:
        Options.setSelectedIndex(3);
    }//GEN-LAST:event_Add_PrescriptionMouseClicked

    private void SendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SendMouseClicked
        // TODO add your handling code here:
        int P_id = Integer.parseInt(Patient_ID.getText());
        String prescription = Prescript.getText();
        Doctor.con = DB.connect();
        Doctor.SendPre(P_id, prescription);
        Prescript.setText("");
        Patient_ID.setText("");  
        DB.Disconnect(Doctor.con);
    }//GEN-LAST:event_SendMouseClicked

    private void ConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmMouseClicked
        // TODO add your handling code here:
        String pass = String.valueOf(Pass.getPassword());
        String c_pass = String.valueOf(ConfirmPass.getPassword());
        Doctor.con = DB.connect();
        flag = Doctor.UpdatePassword(doctor_id, pass, c_pass);
        if (flag)
        {setDefaultCloseOperation(Doctor_profile.HIDE_ON_CLOSE);
        dispose();
        new Doctors_login().setVisible(true);}
        DB.Disconnect(Doctor.con);
    }//GEN-LAST:event_ConfirmMouseClicked

    private void put_data()
    {
        Doctor.con = DB.connect();    
        try{  
            String sql = "SELECT * FROM Doctors WHERE ID = (?)";
            PreparedStatement Login = Doctor.con.prepareStatement(sql);
            Login.setInt(1, doctor_id);
            rs = Login.executeQuery();
            rs.next();
            Name.setText(rs.getString(1));
            Experience.setText(String.valueOf(rs.getInt(9)));
            Languages.setText(rs.getString(2));
            Email.setText(rs.getString(3));
            Phone.setText(rs.getString(4));
            Sche.setText(rs.getString(5));
            Age.setText(String.valueOf(rs.getInt(8)));
            Gender.setText(rs.getString(6));
            Specialization.setText(rs.getString(7));
            D_ID.setText(rs.getString(10));
            Sche.setText(rs.getString(5));
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,"An error happened");  
        }
        finally
        {
            DB.Disconnect(Doctor.con);
        }
    }
    

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
            java.util.logging.Logger.getLogger(Doctor_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctor_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctor_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctor_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        int id = 0;
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctor_profile(id).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Add_Prescription;
    private javax.swing.JLabel Age;
    private javax.swing.JTable Appointment;
    private javax.swing.JPanel Appointments;
    private javax.swing.JPanel Choices;
    private javax.swing.JButton Confirm;
    private javax.swing.JPasswordField ConfirmPass;
    private javax.swing.JLabel D_ID;
    private javax.swing.JLabel Edit_Password;
    private javax.swing.JPanel Edit_pass;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Experience;
    private javax.swing.JLabel Gender;
    private javax.swing.JLabel Languages;
    private javax.swing.JLabel Logout;
    private javax.swing.JLabel My_Appointments;
    private javax.swing.JLabel Name;
    private javax.swing.JTabbedPane Options;
    private javax.swing.JPasswordField Pass;
    private javax.swing.JTextField Patient_ID;
    private javax.swing.JLabel Phone;
    private javax.swing.JTextArea Prescript;
    private javax.swing.JPanel Prescription;
    private javax.swing.JLabel Profile;
    private javax.swing.JLabel Sche;
    private javax.swing.JButton Send;
    private javax.swing.JLabel Specialization;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JPanel main;
    // End of variables declaration//GEN-END:variables
}
