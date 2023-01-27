package Hospiatl_System;

import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class Admin_profile extends javax.swing.JFrame {
    int age,experience;
    String name, languages,email,phone,schedual,specialization,gender;
    ResultSet rs;
    public Admin_profile() {
        initComponents();
        this.setSize(870,500 );
        Options.setSelectedIndex(2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Choices = new javax.swing.JPanel();
        ADD = new javax.swing.JLabel();
        Appointments = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        Updating = new javax.swing.JLabel();
        LogOut = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        Options = new javax.swing.JTabbedPane();
        update = new javax.swing.JPanel();
        Update = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        Age = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        Experience = new javax.swing.JTextField();
        Languages = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        Phone = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox<>();
        Sche = new javax.swing.JTextField();
        Edit = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        records = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Appointment = new javax.swing.JTable();
        Add = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Dage = new javax.swing.JTextField();
        Dname = new javax.swing.JTextField();
        Gender = new javax.swing.JComboBox<>();
        Dex = new javax.swing.JTextField();
        Dlang = new javax.swing.JTextField();
        Dmail = new javax.swing.JTextField();
        Dphone = new javax.swing.JTextField();
        Register = new javax.swing.JButton();
        Specialization = new javax.swing.JComboBox<>();
        Dsche = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);

        Choices.setBackground(new java.awt.Color(0, 0, 0));
        Choices.setToolTipText("");

        ADD.setFont(new java.awt.Font("Liberation Mono", 0, 18)); // NOI18N
        ADD.setForeground(new java.awt.Color(255, 255, 255));
        ADD.setText("Add Doctor");
        ADD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ADDMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ADDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ADDMouseExited(evt);
            }
        });

        Appointments.setFont(new java.awt.Font("Liberation Mono", 0, 18)); // NOI18N
        Appointments.setForeground(new java.awt.Color(255, 255, 255));
        Appointments.setText("Appointments");
        Appointments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AppointmentsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AppointmentsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AppointmentsMouseExited(evt);
            }
        });

        Updating.setFont(new java.awt.Font("Liberation Mono", 0, 18)); // NOI18N
        Updating.setForeground(new java.awt.Color(255, 255, 255));
        Updating.setText("Update docotr details");
        Updating.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdatingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UpdatingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UpdatingMouseExited(evt);
            }
        });

        LogOut.setFont(new java.awt.Font("Liberation Mono", 0, 18)); // NOI18N
        LogOut.setForeground(new java.awt.Color(255, 255, 255));
        LogOut.setText("Logout");
        LogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogOutMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ChoicesLayout = new javax.swing.GroupLayout(Choices);
        Choices.setLayout(ChoicesLayout);
        ChoicesLayout.setHorizontalGroup(
            ChoicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChoicesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ChoicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ChoicesLayout.createSequentialGroup()
                        .addGroup(ChoicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ADD)
                            .addComponent(Appointments)
                            .addComponent(Updating)
                            .addComponent(LogOut))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(ChoicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ChoicesLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 122, Short.MAX_VALUE)))
            .addGroup(ChoicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ChoicesLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 122, Short.MAX_VALUE)))
        );
        ChoicesLayout.setVerticalGroup(
            ChoicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChoicesLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(ADD)
                .addGap(3, 3, 3)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(Updating)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Appointments)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LogOut)
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

        Options.setBackground(new java.awt.Color(244, 244, 244));
        Options.setTabPlacement(javax.swing.JTabbedPane.RIGHT);
        Options.setToolTipText("tete");
        Options.setName(""); // NOI18N

        jLabel15.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel15.setText("Age :");

        jLabel16.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel16.setText("Name :");

        jLabel17.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel17.setText("Gender :");

        jLabel18.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel18.setText("Specialization :");

        jLabel19.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel19.setText("Years of Exp. :");

        jLabel20.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel20.setText("Spoken languages :");

        jLabel21.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel21.setText("Schedual :");

        jLabel22.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel22.setText("E-mail :");

        jLabel23.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel23.setText("Phone no. :");

        jComboBox3.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jComboBox4.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Internal Medicine", "Neurology", "Ophthalmology", "Orthopedics", "Pediatrics", "Obstetrics and Gynecology" }));

        javax.swing.GroupLayout UpdateLayout = new javax.swing.GroupLayout(Update);
        Update.setLayout(UpdateLayout);
        UpdateLayout.setHorizontalGroup(
            UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jLabel17)
                    .addComponent(jLabel23)
                    .addGroup(UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel18))
                        .addComponent(jLabel15))
                    .addComponent(jLabel21)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Name, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Phone, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Email, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Age, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Languages, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Experience, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, UpdateLayout.createSequentialGroup()
                        .addGroup(UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 182, Short.MAX_VALUE))
                    .addComponent(Sche))
                .addContainerGap())
        );
        UpdateLayout.setVerticalGroup(
            UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Experience, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addGroup(UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Languages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(Sche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );

        Edit.setFont(new java.awt.Font("Liberation Sans", 3, 18)); // NOI18N
        Edit.setText("Edit");
        Edit.setPreferredSize(new java.awt.Dimension(102, 10));
        Edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditMouseClicked(evt);
            }
        });

        Delete.setFont(new java.awt.Font("Liberation Sans", 3, 18)); // NOI18N
        Delete.setText("Delete");
        Delete.setPreferredSize(new java.awt.Dimension(102, 10));
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout updateLayout = new javax.swing.GroupLayout(update);
        update.setLayout(updateLayout);
        updateLayout.setHorizontalGroup(
            updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
            .addGroup(updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(updateLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        updateLayout.setVerticalGroup(
            updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateLayout.createSequentialGroup()
                .addContainerGap(393, Short.MAX_VALUE)
                .addGroup(updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
            .addGroup(updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateLayout.createSequentialGroup()
                    .addContainerGap(18, Short.MAX_VALUE)
                    .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(19, Short.MAX_VALUE)))
        );

        Options.addTab("", update);

        Appointment.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        Appointment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "P_ID", "D_Name", "Department", "Date", "Time", "Cancelled"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Appointment);

        javax.swing.GroupLayout recordsLayout = new javax.swing.GroupLayout(records);
        records.setLayout(recordsLayout);
        recordsLayout.setHorizontalGroup(
            recordsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recordsLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
                .addContainerGap())
        );
        recordsLayout.setVerticalGroup(
            recordsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, recordsLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        Options.addTab("", records);

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel5.setText("Age :");

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel6.setText("Name :");

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel7.setText("Gender :");

        jLabel8.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel8.setText("Specialization :");

        jLabel9.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel9.setText("Years of Exp. :");

        jLabel11.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel11.setText("Spoken languages :");

        jLabel12.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel12.setText("Schedual :");

        jLabel13.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel13.setText("E-mail :");

        jLabel14.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel14.setText("Phone no. :");

        Gender.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        Register.setFont(new java.awt.Font("Liberation Sans", 3, 18)); // NOI18N
        Register.setText("Register");
        Register.setPreferredSize(new java.awt.Dimension(102, 10));
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });

        Specialization.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        Specialization.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Internal Medicine", "Neurology", "Ophthalmology", "Orthopedics", "Pediatrics", "Obstetrics and Gynecology" }));

        javax.swing.GroupLayout AddLayout = new javax.swing.GroupLayout(Add);
        Add.setLayout(AddLayout);
        AddLayout.setHorizontalGroup(
            AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel7)
                    .addComponent(jLabel14)
                    .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel8))
                        .addComponent(jLabel5))
                    .addComponent(jLabel12)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Dname)
                    .addComponent(Dphone)
                    .addComponent(Dmail)
                    .addComponent(Dage)
                    .addComponent(Dlang)
                    .addComponent(Dex)
                    .addGroup(AddLayout.createSequentialGroup()
                        .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Specialization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 194, Short.MAX_VALUE))
                    .addComponent(Dsche, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(5, 5, 5))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Register, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(252, 252, 252))
        );
        AddLayout.setVerticalGroup(
            AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Dname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Specialization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dlang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Dsche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Register, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        Options.addTab("", Add);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Choices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Options, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Choices, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Options, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        Options.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
        // TODO add your handling code here:
        try {
        age = Integer.parseInt(Dage.getText());
        name = Dname.getText();
        gender = (String)Gender.getSelectedItem();
        experience = Integer.parseInt(Dex.getText());
        languages = Dlang.getText();
        email = Dmail.getText();
        phone = Dphone.getText();
        schedual =Dsche.getText();
        specialization = (String)Specialization.getSelectedItem();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "All fields need to be filled with suitable data"); 
        }
        
        Doctor a = new Doctor(name, languages, email, phone, schedual, gender, specialization,age,experience);
        admins.con = DB.connect();
        admins.AddDocotr(a);
        DB.Disconnect(admins.con);
    }//GEN-LAST:event_RegisterActionPerformed

    private void LogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutMouseClicked
        // TODO add your handling code here:
        setDefaultCloseOperation(Admin_profile.HIDE_ON_CLOSE);
        dispose();
        new Main_screen().setVisible(true);
    }//GEN-LAST:event_LogOutMouseClicked

    private void UpdatingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdatingMouseClicked
        admins.con = DB.connect();
        rs = admins.ShowDoctorDetails();
        try {
            if(!(rs == null))
            {
                Options.setSelectedIndex(0);
                Name.setText(rs.getString(1));
                Experience.setText(String.valueOf(rs.getInt(9)));
                Languages.setText(rs.getString(2));
                Email.setText(rs.getString(3));
                Gender.setSelectedItem(rs.getString("gender"));
                Specialization.setSelectedItem(rs.getString("specialization"));
                Phone.setText(rs.getString(4));
                Sche.setText(rs.getString(5));
                Age.setText(String.valueOf(rs.getInt(8)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin_profile.class.getName()).log(Level.SEVERE, null, ex);
        }
        DB.Disconnect(admins.con);
    }//GEN-LAST:event_UpdatingMouseClicked

    private void AppointmentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AppointmentsMouseClicked
        // TODO add your handling code here:
        Options.setSelectedIndex(1);
        admins.con = DB.connect();
        DefaultTableModel appointment = (DefaultTableModel) Appointment.getModel();
        admins.ShowAppointments(appointment);
    }//GEN-LAST:event_AppointmentsMouseClicked

    private void ADDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADDMouseExited
        // TODO add your handling code here:
        ADD.setText("Add Doctor");
    }//GEN-LAST:event_ADDMouseExited

    private void ADDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADDMouseEntered
        // TODO add your handling code here:
        ADD.setText("<html><u>Add Doctor</u></html>");
    }//GEN-LAST:event_ADDMouseEntered

    private void ADDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADDMouseClicked
        // TODO add your handling code here:
        Options.setSelectedIndex(2);
    }//GEN-LAST:event_ADDMouseClicked

    private void UpdatingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdatingMouseEntered
        // TODO add your handling code here:
        Updating.setText("<html><u>Update docotr details</u></html>");
    }//GEN-LAST:event_UpdatingMouseEntered

    private void UpdatingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdatingMouseExited
        // TODO add your handling code here:
        Updating.setText("Update docotr details");
    }//GEN-LAST:event_UpdatingMouseExited

    private void AppointmentsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AppointmentsMouseEntered
        // TODO add your handling code here:
        Appointments.setText("<html><u>Appointments</u></html>");  
    }//GEN-LAST:event_AppointmentsMouseEntered

    private void AppointmentsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AppointmentsMouseExited
        // TODO add your handling code here:
        Appointments.setText("Appointments");
    }//GEN-LAST:event_AppointmentsMouseExited

    private void LogOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutMouseEntered
        // TODO add your handling code here:
        LogOut.setText("<html><u>Logout</u></html>");  
    }//GEN-LAST:event_LogOutMouseEntered

    private void LogOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutMouseExited
        // TODO add your handling code here:
        LogOut.setText("Logout");  
    }//GEN-LAST:event_LogOutMouseExited

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        admins.con = DB.connect();
        admins.DeleteDoctor();
        DeleteDate();
        DB.Disconnect(admins.con);
    }//GEN-LAST:event_DeleteActionPerformed
    
    private void EditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditMouseClicked
        // TODO add your handling code here:
        try {
        age = Integer.parseInt(Age.getText());
        name = Name.getText();
        experience = Integer.parseInt(Experience.getText());
        languages = Languages.getText();
        email = Email.getText();
        phone = Phone.getText();
        schedual = Sche.getText();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "All fields need to be filled with suitable data");    
        }
        
        admins.con = DB.connect();
        Doctor a = new  Doctor(name, languages, email, phone, schedual, gender, specialization, age, age);
        admins.EditDoctor(a);
        DB.Disconnect(admins.con);
        DeleteDate();
    }//GEN-LAST:event_EditMouseClicked

    
    private void DeleteDate()
    {
        Name.setText("");
        Age.setText("");
        Languages.setText("");
        Sche.setText("");
        Email.setText("");
        Gender.setSelectedIndex(0);
        Specialization.setSelectedIndex(0);
        Experience.setText("");
        Phone.setText("");
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
            java.util.logging.Logger.getLogger(Admin_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_profile().setVisible(true);   
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ADD;
    private javax.swing.JPanel Add;
    private javax.swing.JTextField Age;
    private javax.swing.JTable Appointment;
    private javax.swing.JLabel Appointments;
    private javax.swing.JPanel Choices;
    private javax.swing.JTextField Dage;
    private javax.swing.JButton Delete;
    private javax.swing.JTextField Dex;
    private javax.swing.JTextField Dlang;
    private javax.swing.JTextField Dmail;
    private javax.swing.JTextField Dname;
    private javax.swing.JTextField Dphone;
    private javax.swing.JTextField Dsche;
    private javax.swing.JButton Edit;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Experience;
    private javax.swing.JComboBox<String> Gender;
    private javax.swing.JTextField Languages;
    private javax.swing.JLabel LogOut;
    private javax.swing.JTextField Name;
    private javax.swing.JTabbedPane Options;
    private javax.swing.JTextField Phone;
    private javax.swing.JButton Register;
    private javax.swing.JTextField Sche;
    private javax.swing.JComboBox<String> Specialization;
    private javax.swing.JPanel Update;
    private javax.swing.JLabel Updating;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JPanel records;
    private javax.swing.JPanel update;
    // End of variables declaration//GEN-END:variables
}
