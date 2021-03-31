/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import model.database.I_Bapers;

import javax.swing.*;
import java.awt.event.MouseEvent;

/**
 *
 * @author g_jah
 */
public class FlexibleDiscount extends javax.swing.JPanel {
    private GUI f;
    private JPanel lastPanel;
    private I_Bapers bapers;
    int acc_no;
    /**
     * Creates new form FlexibleDiscount
     */
    public FlexibleDiscount(int width, int height, I_Bapers bapers,GUI f, int acc_no) {
        this.acc_no=acc_no;
        this.f=f;
        this.lastPanel= f.getCurrentPanel();
        this.bapers=bapers;
        f.setCurrentPanel(this);
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        UpdateBoundButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        FlexibleDiscountTable = new javax.swing.JTable();
        BackButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        RefreshButton = new javax.swing.JButton();
        DeleteBoundButton = new javax.swing.JButton();
        AddNewButton2 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(157, 195, 230));
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1, 23, 71));
        jLabel1.setText("Flexible Discount");

        UpdateBoundButton.setBackground(new java.awt.Color(1, 23, 71));
        UpdateBoundButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UpdateBoundButton.setForeground(new java.awt.Color(157, 195, 230));
        UpdateBoundButton.setText("Edit");
        UpdateBoundButton.setActionCommand("");
        UpdateBoundButton.setBorderPainted(false);
        UpdateBoundButton.setFocusPainted(false);
        UpdateBoundButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBoundButtonActionPerformed(evt);
            }
        });

        FlexibleDiscountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "ID","Lower Bound","Upper Bound", "Discount Rate"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false,false,false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        FlexibleDiscountTable.setGridColor(new java.awt.Color(1, 23, 71));
        FlexibleDiscountTable.setSelectionBackground(new java.awt.Color(230, 238, 255));
        FlexibleDiscountTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(FlexibleDiscountTable);
        //CHECK!
        bapers.populateFlexibleTable(FlexibleDiscountTable,acc_no);


        BackButton.setBackground(new java.awt.Color(1, 23, 71));
        BackButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BackButton.setForeground(new java.awt.Color(157, 195, 230));
        BackButton.setText("Back");
        BackButton.setBorderPainted(false);
        BackButton.setFocusPainted(false);
        BackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                back_buttonMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(1, 23, 71));
        jLabel2.setText("Bapers");

        RefreshButton.setBackground(new java.awt.Color(1, 23, 71));
        RefreshButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RefreshButton.setForeground(new java.awt.Color(157, 195, 230));
        RefreshButton.setText("Refresh");
        RefreshButton.setBorderPainted(false);
        RefreshButton.setFocusPainted(false);
        RefreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshButtonActionPerformed(evt);
            }
        });


        DeleteBoundButton.setBackground(new java.awt.Color(1, 23, 71));
        DeleteBoundButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DeleteBoundButton.setForeground(new java.awt.Color(157, 195, 230));
        DeleteBoundButton.setText("Delete");
        DeleteBoundButton.setActionCommand("");
        DeleteBoundButton.setBorderPainted(false);
        DeleteBoundButton.setFocusPainted(false);
        DeleteBoundButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBoundButtonActionPerformed(evt);
            }
        });

        AddNewButton2.setBackground(new java.awt.Color(1, 23, 71));
        AddNewButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AddNewButton2.setForeground(new java.awt.Color(157, 195, 230));
        AddNewButton2.setText("Add New");
        AddNewButton2.setActionCommand("");
        AddNewButton2.setBorderPainted(false);
        AddNewButton2.setFocusPainted(false);
        AddNewButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addComponent(jLabel1)
                                                .addGap(72, 72, 72)
                                                .addComponent(UpdateBoundButton)
                                                .addGap(10, 10, 10)
                                                .addComponent(AddNewButton2)
                                                .addGap(5, 5, 5)
                                                .addComponent(DeleteBoundButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10)
                                                .addComponent(RefreshButton))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel2)
                                                .addGap(283, 283, 283)
                                                .addComponent(BackButton)))
                                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(9, 9, 9)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(UpdateBoundButton)
                                                        .addComponent(AddNewButton2)
                                                        .addComponent(DeleteBoundButton)
                                                        .addComponent(RefreshButton))))
                                .addGap(15, 15, 15)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(BackButton)
                                        .addComponent(jLabel2))
                                .addGap(68, 68, 68))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateBoundButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBoundButtonActionPerformed
        if (FlexibleDiscountTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(
                    this,
                    "Please select an entry to edit!",
                    "BAPERS", JOptionPane.ERROR_MESSAGE
            );
        }else{
            AddFlexibleDiscount addFlexibleDiscount = new AddFlexibleDiscount(400,300,bapers,f,acc_no);
            openDialog(addFlexibleDiscount, "Update Bounds");
        }
    }//GEN-LAST:event_UpdateBoundButtonActionPerformed

    private void RefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBoundButtonActionPerformed
        bapers.populateFlexibleTable(FlexibleDiscountTable,acc_no);
    }

    private void DeleteBoundButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBoundButtonActionPerformed
        if (FlexibleDiscountTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(
                    this,
                    "Please select an entry to delete!",
                    "BAPERS", JOptionPane.ERROR_MESSAGE
            );
        }else{
            //fix id with manpreet
            bapers.removeFlexibleDiscount(1,acc_no);
        }
    }//GEN-LAST:event_DeleteBoundButtonActionPerformed

    private void AddNewButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewButton2ActionPerformed
            AddFlexibleDiscount addFlexibleDiscount = new AddFlexibleDiscount(400,300,bapers,f,acc_no);
            openDialog(addFlexibleDiscount, "Add New Bound");
    }//GEN-LAST:event_AddNewButton2ActionPerformed

    private void openDialog(JPanel panel, String title) {
        final JDialog frame = new JDialog(f, title, true);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    private void back_buttonMouseClicked(java.awt.event.MouseEvent evt) {
        f.setLastPanel(lastPanel);
        f.getLastPanel().setVisible(true);
        f.remove(f.getCurrentPanel());
        f.setCurrentPanel(lastPanel);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddNewButton2;
    private javax.swing.JButton BackButton;
    private javax.swing.JButton DeleteBoundButton;
    private javax.swing.JTable FlexibleDiscountTable;
    private javax.swing.JButton RefreshButton;
    private javax.swing.JButton UpdateBoundButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
