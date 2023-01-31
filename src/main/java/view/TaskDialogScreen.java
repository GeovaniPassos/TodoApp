/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.TaskController;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Project;
import model.Task;

/**
 *
 * @author Geovani-PC
 */
public class TaskDialogScreen extends javax.swing.JDialog {

        TaskController controller;
        Project project;
                
    public TaskDialogScreen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        controller = new TaskController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTolbox = new javax.swing.JPanel();
        jLabelTolboxTitle = new javax.swing.JLabel();
        jLabelTolboxCheck = new javax.swing.JLabel();
        jPanelWorkspace = new javax.swing.JPanel();
        jLabelNameTitle = new javax.swing.JLabel();
        jTextFieldNameBox = new javax.swing.JTextField();
        jLabelDescriptionTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescriptionBox = new javax.swing.JTextArea();
        jLabelDeadline = new javax.swing.JLabel();
        jLabelNotes = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaNotesBox = new javax.swing.JTextArea();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setMinimumSize(new java.awt.Dimension(400, 600));

        jPanelTolbox.setBackground(new java.awt.Color(0, 153, 102));

        jLabelTolboxTitle.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabelTolboxTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTolboxTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTolboxTitle.setText("Tarefa");
        jLabelTolboxTitle.setToolTipText("");

        jLabelTolboxCheck.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTolboxCheck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check.png"))); // NOI18N

        javax.swing.GroupLayout jPanelTolboxLayout = new javax.swing.GroupLayout(jPanelTolbox);
        jPanelTolbox.setLayout(jPanelTolboxLayout);
        jPanelTolboxLayout.setHorizontalGroup(
            jPanelTolboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTolboxLayout.createSequentialGroup()
                .addComponent(jLabelTolboxTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTolboxCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelTolboxLayout.setVerticalGroup(
            jPanelTolboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTolboxTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelTolboxCheck, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        jLabelNameTitle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelNameTitle.setText("Nome");

        jTextFieldNameBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabelDescriptionTitle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelDescriptionTitle.setText("Descri��o");

        jTextAreaDescriptionBox.setColumns(20);
        jTextAreaDescriptionBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextAreaDescriptionBox.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescriptionBox);

        jLabelDeadline.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelDeadline.setText("Prazo");

        jLabelNotes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelNotes.setText("Notas");

        jTextAreaNotesBox.setColumns(20);
        jTextAreaNotesBox.setRows(5);
        jScrollPane2.setViewportView(jTextAreaNotesBox);

        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        jFormattedTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jFormattedTextField1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelWorkspaceLayout = new javax.swing.GroupLayout(jPanelWorkspace);
        jPanelWorkspace.setLayout(jPanelWorkspaceLayout);
        jPanelWorkspaceLayout.setHorizontalGroup(
            jPanelWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWorkspaceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelNameTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldNameBox, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addComponent(jLabelDescriptionTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelNotes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelDeadline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jFormattedTextField1))
                .addContainerGap())
        );
        jPanelWorkspaceLayout.setVerticalGroup(
            jPanelWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWorkspaceLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabelNameTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNameBox, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelDescriptionTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDeadline)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelNotes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTolbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelWorkspace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTolbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelWorkspace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFormattedTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFormattedTextField1MouseClicked
        // TODO add your handling code here:
        try {
            Task task = new Task();
            
            task.setIdProject(project.getId());
            
            task.setName(jTextFieldNameBox.getText());
            task.setDescription(jTextAreaDescriptionBox.getText());
            task.setNotes(jTextAreaNotesBox.getText());
            task.setIsCompleted(false);

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date deadline = null;
            
            deadline = dateFormat.parse(jFormattedTextField1.getText());
            
            task.setDeadline(deadline);
            controller.save(task);
            JOptionPane.showMessageDialog(rootPane, "Tarefa salva com sucesso!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
        
        this.dispose();
    }//GEN-LAST:event_jFormattedTextField1MouseClicked

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
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TaskDialogScreen dialog = new TaskDialogScreen(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabelDeadline;
    private javax.swing.JLabel jLabelDescriptionTitle;
    private javax.swing.JLabel jLabelNameTitle;
    private javax.swing.JLabel jLabelNotes;
    private javax.swing.JLabel jLabelTolboxCheck;
    private javax.swing.JLabel jLabelTolboxTitle;
    private javax.swing.JPanel jPanelTolbox;
    private javax.swing.JPanel jPanelWorkspace;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaDescriptionBox;
    private javax.swing.JTextArea jTextAreaNotesBox;
    private javax.swing.JTextField jTextFieldNameBox;
    // End of variables declaration//GEN-END:variables

    public void setProject(Project project) {
        this.project = project;
    }

    
    
    
}