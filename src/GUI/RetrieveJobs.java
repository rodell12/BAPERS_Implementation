package GUI;

import model.database.I_Bapers;
import model.jobs.job.Job;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

/**
 *
 * @author Manpreet
 */

public class RetrieveJobs extends javax.swing.JPanel {

    private I_Bapers bapers;
    private GUI f;
    private JPanel lastPanel;

    /**
     * Creates new form RetrieveJobs
     */
    public RetrieveJobs(int width, int height, int customer_id, I_Bapers bapers, GUI f) {
        initComponents(width, height, customer_id, bapers, f);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents(int width, int height, int customer_id, I_Bapers bapers, GUI f) {

        this.f = f;
        this.lastPanel = f.getCurrentPanel();
        this.bapers = bapers;
        f.setCurrentPanel(this);
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();

        setBackground(new java.awt.Color(157, 195, 230));
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1, 23, 71));
        jLabel1.setText("Jobs");

        jButton1.setBackground(new java.awt.Color(1, 23, 71));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(157, 195, 230));
        jButton1.setText("View Tasks");
        jButton1.setBorderPainted(false);
        jButton1.setFocusPainted(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent  evt) {
                view_task_buttonMouseClicked(evt, jTable1);
            }
        });


        jButton2.setBackground(new java.awt.Color(1, 23, 71));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(157, 195, 230));
        jButton2.setText("Update Status");
        jButton2.setBorderPainted(false);
        jButton2.setFocusPainted(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent  evt) {
                update_status_buttonMouseClicked(evt, jTable1);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new String [] {
                "Job ID", "Description", "Priority", "Status", "Special Instructions", "Price"
            },0
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        addJobs(jTable1, customer_id);
        jTable1.setGridColor(new java.awt.Color(1, 23, 71));
        jTable1.setSelectionBackground(new java.awt.Color(230, 238, 255));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        jTable1.setSelectionForeground(new java.awt.Color(1, 23, 71));
        jTable1.setShowGrid(true);
        jTable1.getTableHeader().setResizingAllowed(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
        dtcr.setHorizontalAlignment(SwingConstants.CENTER);
        jTable1.getColumn("Job ID").setCellRenderer(dtcr);
        jTable1.getColumn("Description").setCellRenderer(dtcr);
        jTable1.getColumn("Priority").setCellRenderer(dtcr);
        jTable1.getColumn("Status").setCellRenderer(dtcr);
        jTable1.getColumn("Special Instructions").setCellRenderer(dtcr);
        jTable1.getColumn("Price").setCellRenderer(dtcr);


        jButton3.setBackground(new java.awt.Color(1, 23, 71));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(157, 195, 230));
        jButton3.setText("Back");
        jButton3.setBorderPainted(false);
        jButton3.setFocusPainted(false);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent  evt) {
                back_buttonMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(1, 23, 71));
        jLabel2.setText("Bapers");

        jButton4.setBackground(new java.awt.Color(1, 23, 71));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(157, 195, 230));
        jButton4.setText("Make Payment");
        jButton4.setBorderPainted(false);
        jButton4.setFocusPainted(false);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent  evt) {
                make_payment_buttonMouseClicked(evt, jTable1);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(1, 23, 71));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(157, 195, 230));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Completed" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filter_buttonActionPerformed(evt, jTable1, customer_id);
            }
        });

        jButton5.setBackground(new java.awt.Color(1, 23, 71));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(157, 195, 230));
        jButton5.setText("Refresh");
        jButton5.setBorderPainted(false);
        jButton5.setFocusPainted(false);
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent  evt) {
                refresh_buttonMouseClicked(evt, jTable1, customer_id);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(277, 277, 277)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 269, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refresh_buttonMouseClicked(java.awt.event.MouseEvent evt, JTable table, int customer_ID) {
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        model.setRowCount(0);
        addJobs(table, customer_ID);
    }

    private void filter_buttonActionPerformed(ActionEvent evt, JTable table, int customer_id){
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        model.setRowCount(0);
        if (jComboBox1.getSelectedItem()=="All"){
            ArrayList<Job> jobs = bapers.getJobs(customer_id, "all");
            for(Job job : jobs){
                model.addRow(new Object[]{job.getJob_ID(), job.getJob_desc(), job.getPriority(), job.getJob_status(), job.getSpecial_instructions(), job.getPrice()});
            }
        }
        else{
            ArrayList<Job> jobs = bapers.getJobs(customer_id, "completed");
            for(Job job : jobs){
                model.addRow(new Object[]{job.getJob_ID(), job.getJob_desc(), job.getPriority(), job.getJob_status(), job.getSpecial_instructions(), job.getPrice()});
            }
        }
        table.setModel(model);
    }

    private void addJobs(JTable table, int customer_id) {
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        ArrayList<Job> jobs = bapers.getJobs(customer_id, "all");
        for(Job job : jobs){
            model.addRow(new Object[]{job.getJob_ID(), job.getJob_desc(), job.getPriority(), job.getJob_status(), job.getSpecial_instructions(), job.getPrice()});
        }
        table.setModel(model);
    }

    private void view_task_buttonMouseClicked(MouseEvent evt, JTable table){
        try
        {
            int column = 0;
            int row = table.getSelectedRow();
            int id = Integer.parseInt(table.getModel().getValueAt(row, column).toString());
            f.viewTasks(id);
            setVisible(false);
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(
                this,
                "Please select a job!",
                "BAPERS", JOptionPane.ERROR_MESSAGE
            );
        }
    }

    private void update_status_buttonMouseClicked(MouseEvent evt, JTable table){
        try
        {
            int column = 0;
            int row = table.getSelectedRow();
            int id = Integer.parseInt(table.getModel().getValueAt(row, column).toString());
            final JDialog frame = new JDialog(f, "Update Status", true);
            frame.getContentPane().add(new UpdateJobStatus(id, bapers));
            frame.pack();
            frame.setVisible(true);
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(
                    this,
                    "Please select a job!",
                    "BAPERS", JOptionPane.ERROR_MESSAGE
            );
        }
    }

    private void make_payment_buttonMouseClicked(MouseEvent evt, JTable table){
        try
        {
            int row = table.getSelectedRow();
            if ( String.valueOf(table.getModel().getValueAt(row, 3).toString()).equals("Completed")){
                int id = Integer.parseInt(table.getModel().getValueAt(row, 0).toString());
                double amount = Double.parseDouble(table.getModel().getValueAt(row, 5).toString());
                f.makePayment(id, amount);
                setVisible(false);
            }
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(
                    this,
                    "Please select a job!",
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
