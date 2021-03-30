/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.*;

/**
 *
 * @author g_jah
 */
public class Home extends javax.swing.JPanel {

    int width;
    int height;
    private GUI f;
    private JPanel lastPanel;

    /**
     * Creates new form Home
     */
    public Home(int width, int height, GUI f) {
        this.f = f;
        this.lastPanel = f.getCurrentPanel();
        f.setCurrentPanel(this);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        RoleText = new javax.swing.JLabel();
        GenerateReportButton = new javax.swing.JButton();
        JobsButton = new javax.swing.JButton();
        StaffButton = new javax.swing.JButton();
        TaskManagmentButton = new javax.swing.JButton();
        RefreshAlertsButton = new javax.swing.JButton();
        CustomerButton = new javax.swing.JButton();
        BackupButton = new javax.swing.JButton();
        SignOutButton = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(157, 195, 230));
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1, 23, 71));
        jLabel1.setText("BAPERS");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Logged in as:");

        RoleText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RoleText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RoleText.setText("Role: ");

        GenerateReportButton.setBackground(new java.awt.Color(1, 23, 71));
        GenerateReportButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        GenerateReportButton.setForeground(new java.awt.Color(157, 195, 230));
        GenerateReportButton.setText("Generate Report");
        GenerateReportButton.setActionCommand("");
        GenerateReportButton.setBorderPainted(false);
        GenerateReportButton.setFocusPainted(false);
        GenerateReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateReportButtonActionPerformed(evt);
            }
        });

        JobsButton.setBackground(new java.awt.Color(1, 23, 71));
        JobsButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        JobsButton.setForeground(new java.awt.Color(157, 195, 230));
        JobsButton.setText("View Active Jobs ");
        JobsButton.setActionCommand("");
        JobsButton.setBorderPainted(false);
        JobsButton.setFocusPainted(false);
        JobsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JobsButtonActionPerformed(evt);
            }
        });

        StaffButton.setBackground(new java.awt.Color(1, 23, 71));
        StaffButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        StaffButton.setForeground(new java.awt.Color(157, 195, 230));
        StaffButton.setText("Staff Managment");
        StaffButton.setActionCommand("");
        StaffButton.setBorderPainted(false);
        StaffButton.setFocusPainted(false);
        StaffButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StaffButtonActionPerformed(evt);
            }
        });

        TaskManagmentButton.setBackground(new java.awt.Color(1, 23, 71));
        TaskManagmentButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TaskManagmentButton.setForeground(new java.awt.Color(157, 195, 230));
        TaskManagmentButton.setText("Task Managment");
        TaskManagmentButton.setActionCommand("");
        TaskManagmentButton.setBorderPainted(false);
        TaskManagmentButton.setFocusPainted(false);
        TaskManagmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TaskManagmentButtonActionPerformed(evt);
            }
        });

        RefreshAlertsButton.setBackground(new java.awt.Color(1, 23, 71));
        RefreshAlertsButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        RefreshAlertsButton.setForeground(new java.awt.Color(157, 195, 230));
        RefreshAlertsButton.setText("Refresh Alerts");
        RefreshAlertsButton.setActionCommand("");
        RefreshAlertsButton.setBorderPainted(false);
        RefreshAlertsButton.setFocusPainted(false);
        RefreshAlertsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshAlertsButtonActionPerformed(evt);
            }
        });

        CustomerButton.setBackground(new java.awt.Color(1, 23, 71));
        CustomerButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        CustomerButton.setForeground(new java.awt.Color(157, 195, 230));
        CustomerButton.setText("Customer Managment");
        CustomerButton.setActionCommand("");
        CustomerButton.setBorderPainted(false);
        CustomerButton.setFocusPainted(false);
        CustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerButtonActionPerformed(evt);
            }
        });

        BackupButton.setBackground(new java.awt.Color(1, 23, 71));
        BackupButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BackupButton.setForeground(new java.awt.Color(157, 195, 230));
        BackupButton.setText("Backup Management");
        BackupButton.setActionCommand("");
        BackupButton.setBorderPainted(false);
        BackupButton.setFocusPainted(false);
        BackupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackupButtonActionPerformed(evt);
            }
        });

        SignOutButton.setBackground(new java.awt.Color(1, 23, 71));
        SignOutButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SignOutButton.setForeground(new java.awt.Color(157, 195, 230));
        SignOutButton.setText("Sign Out");
        SignOutButton.setActionCommand("");
        SignOutButton.setBorderPainted(false);
        SignOutButton.setFocusPainted(false);
        SignOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignOutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel1)
                                                .addGap(218, 218, 218)
                                                .addComponent(SignOutButton))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(RoleText, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 20, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(149, 149, 149)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(CustomerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(GenerateReportButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(TaskManagmentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(80, 80, 80)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(StaffButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(RefreshAlertsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(JobsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(277, 277, 277)
                                                .addComponent(BackupButton)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(31, 31, 31)
                                                .addComponent(jLabel1))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(SignOutButton)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(RoleText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(JobsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(GenerateReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(RefreshAlertsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(StaffButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TaskManagmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addComponent(BackupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
    }

    private void GenerateReportButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void JobsButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void StaffButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void TaskManagmentButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void RefreshAlertsButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void CustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void BackupButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void SignOutButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private javax.swing.JButton BackupButton;
    private javax.swing.JButton CustomerButton;
    private javax.swing.JButton GenerateReportButton;
    private javax.swing.JButton JobsButton;
    private javax.swing.JButton RefreshAlertsButton;
    private javax.swing.JLabel RoleText;
    private javax.swing.JButton SignOutButton;
    private javax.swing.JButton StaffButton;
    private javax.swing.JButton TaskManagmentButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
}
