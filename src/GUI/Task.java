/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import model.database.I_Bapers;
import model.jobs.task.Task_List;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kehkshan and Manpreet
 */
public class Task extends javax.swing.JPanel {

    private I_Bapers bapers;
    private GUI f;
    private JPanel lastPanel;

    /**
     * Creates new form Task
     */
    public Task(int width, int height, int job_ID, I_Bapers bapers, GUI f) {
        initComponents(width, height, job_ID, bapers, f);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents(int width, int height, int job_ID, I_Bapers bapers, GUI f) {

        this.f = f;
        this.lastPanel = f.getCurrentPanel();
        this.bapers = bapers;
        f.setCurrentPanel(this);
        jLabel1 = new javax.swing.JLabel();
        refresh_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        task_table_input = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        filter_button = new javax.swing.JComboBox<>();
        back_button = new javax.swing.JButton();
        update_status_button = new javax.swing.JButton();

        setBackground(new java.awt.Color(157, 195, 230));
        setForeground(new java.awt.Color(1, 23, 71));
        setPreferredSize(new java.awt.Dimension(width, height));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1, 23, 71));
        jLabel1.setText("Task Details");

        refresh_button.setBackground(new java.awt.Color(1, 23, 71));
        refresh_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        refresh_button.setForeground(new java.awt.Color(157, 195, 230));
        refresh_button.setText("Refresh");
        refresh_button.setBorderPainted(false);
        refresh_button.setFocusPainted(false);
        refresh_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent  evt) {
                refresh_buttonMouseClicked(evt, task_table_input, job_ID);
            }
        });

        task_table_input.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        task_table_input.setForeground(new java.awt.Color(1, 23, 71));
        task_table_input.setModel(new javax.swing.table.DefaultTableModel(
                new String [] {
                        "Task ID", "Task Description", "Location", "Status", "Price(�)"
                },0
        ){
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
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
        addTasks( task_table_input, job_ID);
        task_table_input.setGridColor(new java.awt.Color(1, 23, 71));
        task_table_input.setSelectionBackground(new java.awt.Color(230, 238, 255));
        task_table_input.setSelectionForeground(new java.awt.Color(1, 23, 71));
        jScrollPane1.setViewportView(task_table_input);
        task_table_input.setShowGrid(true);
        DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
        dtcr.setHorizontalAlignment(SwingConstants.CENTER);
        task_table_input.getColumn("Task ID").setCellRenderer(dtcr);
        task_table_input.getColumn("Task Description").setCellRenderer(dtcr);
        task_table_input.getColumn("Location").setCellRenderer(dtcr);
        task_table_input.getColumn("Status").setCellRenderer(dtcr);
        task_table_input.getColumn("Price(�)").setCellRenderer(dtcr);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(1, 23, 71));
        jLabel2.setText("Bapers");

        filter_button.setBackground(new java.awt.Color(1, 23, 71));
        filter_button.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        filter_button.setForeground(new java.awt.Color(157, 195, 230));
        filter_button.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ascending", "Descending" }));
        filter_button.setMaximumSize(new java.awt.Dimension(130, 27));
        filter_button.setMinimumSize(new java.awt.Dimension(130, 27));
        filter_button.setName(""); // NOI18N
        filter_button.setPreferredSize(new java.awt.Dimension(130, 27));
        filter_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filter_buttonActionPerformed(evt, task_table_input);
            }
        });

        back_button.setBackground(new java.awt.Color(1, 23, 71));
        back_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back_button.setForeground(new java.awt.Color(157, 195, 230));
        back_button.setText("Back");
        back_button.setBorderPainted(false);
        back_button.setFocusPainted(false);
        back_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                back_buttonMouseClicked(evt);
            }
        });

        update_status_button.setBackground(new java.awt.Color(1, 23, 71));
        update_status_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        update_status_button.setForeground(new java.awt.Color(157, 195, 230));
        update_status_button.setText("Update Status");
        update_status_button.setBorderPainted(false);
        update_status_button.setFocusable(false);
        update_status_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                update_status_buttonMouseClicked(evt, task_table_input);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(filter_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(update_status_button)
                        .addGap(18, 18, 18)
                        .addComponent(refresh_button)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(back_button)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(43, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(378, 378, 378))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(filter_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update_status_button)
                    .addComponent(refresh_button))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(back_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(50, 50, 50))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refresh_buttonMouseClicked(java.awt.event.MouseEvent evt, JTable table, int job_ID) {
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        model.setRowCount(0);
        ArrayList<Task_List> tasks = bapers.getAllTasks(job_ID);
        for(Task_List task : tasks){
            model.addRow(new Object[]{task.getTask_id(), task.getTask_description(), task.getLocation(), task.getStatus(), task.getPrice()});
        }
        table.setModel(model);
    }

    private void filter_buttonActionPerformed(ActionEvent evt, JTable table) {

        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(table.getModel());
        table.setRowSorter(sorter);
        List<RowSorter.SortKey> sortKeys = new ArrayList<>();
        int columnIndexToSort = 0;
        if (filter_button.getSelectedItem() == "Ascending"){
            sortKeys.add(new RowSorter.SortKey(columnIndexToSort, SortOrder.ASCENDING));
        }
        else {
            sortKeys.add(new RowSorter.SortKey(columnIndexToSort, SortOrder.DESCENDING));
        }

        sorter.setSortKeys(sortKeys);
        sorter.sort();
    }

    private void addTasks(JTable table, int job_ID) {

        DefaultTableModel model = (DefaultTableModel)table.getModel();
        ArrayList<Task_List> tasks = bapers.getAllTasks(job_ID);
        for(Task_List task : tasks){
            model.addRow(new Object[]{task.getTask_id(), task.getTask_description(), task.getLocation(), task.getStatus(), task.getPrice()});
        }
        table.setModel(model);
    }

    private void update_status_buttonMouseClicked(MouseEvent evt, JTable table){
        try
        {
            int column = 0;
            int row = table.getSelectedRow();
            int id = Integer.parseInt(table.getModel().getValueAt(row, column).toString());
            final JDialog frame = new JDialog(f, "Update Task", true);
            frame.getContentPane().add(new UpdateTask(id, bapers));
            frame.pack();
            frame.setVisible(true);
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(
                this,
                "Please select a task!",
                "BAPERS", JOptionPane.ERROR_MESSAGE
        );
        }
    }

    private void back_buttonMouseClicked(java.awt.event.MouseEvent evt) {
        f.setLastPanel(lastPanel);
        f.getLastPanel().setVisible(true);
        f.remove(f.getCurrentPanel());
        f.setCurrentPanel(lastPanel);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_button;
    private javax.swing.JComboBox<String> filter_button;
    private javax.swing.JButton update_status_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refresh_button;
    private javax.swing.JTable task_table_input;
    // End of variables declaration//GEN-END:variables
}
