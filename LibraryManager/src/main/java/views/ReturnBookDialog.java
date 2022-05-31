/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package views;

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;
import java.util.Date;

import models.Book;
import models.User;
import models.Lending;
import controllers.BookController;
import controllers.UserController;
import controllers.LendingController;
import util.Settings;

/**
 *
 * @author Femen
 */
public class ReturnBookDialog extends javax.swing.JDialog {

    BookController bookController = new BookController();
    UserController userController = new UserController();
    LendingController lendingController = new LendingController();
    /**
     * Creates new form ReturnBookDialog
     */
    public ReturnBookDialog(java.awt.Frame parent, boolean modal) {        
        super(parent, modal);
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

        mainPanel = new javax.swing.JPanel();
        titlePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        userIdLabel = new javax.swing.JLabel();
        userIdField = new javax.swing.JTextField();
        bookIdLabel = new javax.swing.JLabel();
        bookIdField = new javax.swing.JTextField();
        returnButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(204, 184, 165));
        mainPanel.setPreferredSize(new java.awt.Dimension(400, 400));

        titlePanel.setBackground(new java.awt.Color(120, 100, 82));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Return book");

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlePanelLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        userIdLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        userIdLabel.setText("User id");

        bookIdLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bookIdLabel.setText("Book id");

        returnButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        returnButton.setText("Return");
        returnButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(returnButton)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                        .addComponent(userIdLabel)
                        .addGap(38, 38, 38)
                        .addComponent(userIdField))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                        .addComponent(bookIdLabel)
                        .addGap(35, 35, 35)
                        .addComponent(bookIdField)))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userIdLabel)
                    .addComponent(userIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bookIdLabel)
                    .addComponent(bookIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(returnButton)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnButtonMouseClicked
        // Parse the ids:
        int bookId = parseInt(bookIdField.getText());
        int userId = parseInt(userIdField.getText());
        // Check if they exist:
        Book book = bookController.getById(bookId);
        User user = userController.getById(userId);
        
        if(book == null || user == null) {
            if(book == null && user == null) {
                JOptionPane.showMessageDialog(rootPane, "BOOK and USER don't exist");
                return;
            }
            if(book == null) {
                JOptionPane.showMessageDialog(rootPane, "BOOK don't exist");
                return;
            }
            JOptionPane.showMessageDialog(rootPane, "USER don't exist");
            return;
        }
        
        // Then check if the lending exists:
        Lending lending = lendingController.getByUserAndBook(userId, bookId);
        if(lending == null) {
            JOptionPane.showMessageDialog(rootPane, "No lending found");
            return;
        }
        
        // Calculate the fine:
        Date today = new Date();
        long time = today.getTime() - lending.getLendingDate().getTime();
        int days = (int) (time / 86400000);
        float fine = 0.0f;
        if(days > Settings.getLendingTime()) {
            fine = (days - Settings.getLendingTime()) * Settings.getFine();
        }
        
        // Display the return data:
        String message = "Return " + book.getTitle() + " from " + user.getName() + " with a fine of " + Float.toString(fine) + "?";
        int dialogResult = JOptionPane.showConfirmDialog(this, message, "Return book?", JOptionPane.YES_NO_OPTION);
        if(dialogResult == 1) { // If user clicked "no"
            return;
        }
        if(fine > 0) { // If a fine is applied, update the user
            user.setFine(user.getFine() + fine);
            userController.update(user);
        }
        
        // Update the lending in the database:
        lendingController.returnLending(lending.getId());
        
        this.dispose(); // Close window
    }//GEN-LAST:event_returnButtonMouseClicked

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
            java.util.logging.Logger.getLogger(ReturnBookDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnBookDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnBookDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnBookDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ReturnBookDialog dialog = new ReturnBookDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField bookIdField;
    private javax.swing.JLabel bookIdLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton returnButton;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JTextField userIdField;
    private javax.swing.JLabel userIdLabel;
    // End of variables declaration//GEN-END:variables
}
