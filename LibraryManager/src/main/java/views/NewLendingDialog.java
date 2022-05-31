/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package views;

import models.Book;
import models.User;
import models.Lending;
import controllers.BookController;
import controllers.UserController;
import controllers.LendingController;
import util.Settings;

import static java.lang.Integer.parseInt;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Femen
 */
public class NewLendingDialog extends javax.swing.JDialog {

    BookController bookController = new BookController();
    UserController userController = new UserController();
    
    /**
     * Creates new form NewLendingDialog
     */
    public NewLendingDialog(java.awt.Frame parent, boolean modal) {
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
        bookIdLabel = new javax.swing.JLabel();
        userIdField = new javax.swing.JTextField();
        bookIdField = new javax.swing.JTextField();
        lendButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(2147483647, 255));
        setMinimumSize(new java.awt.Dimension(157, 255));

        mainPanel.setBackground(new java.awt.Color(204, 184, 165));
        mainPanel.setMaximumSize(new java.awt.Dimension(2147483647, 255));
        mainPanel.setMinimumSize(new java.awt.Dimension(157, 255));
        mainPanel.setPreferredSize(new java.awt.Dimension(400, 400));

        titlePanel.setBackground(new java.awt.Color(120, 100, 82));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("New lending");

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlePanelLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        userIdLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        userIdLabel.setText("User id:");

        bookIdLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bookIdLabel.setText("Book id:");

        lendButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lendButton.setText("Lend");
        lendButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lendButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(userIdLabel)
                        .addGap(21, 21, 21)
                        .addComponent(userIdField))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(bookIdLabel)
                        .addGap(18, 18, 18)
                        .addComponent(bookIdField))
                    .addComponent(lendButton))
                .addGap(20, 20, 20))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userIdLabel)
                    .addComponent(userIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookIdLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(lendButton)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lendButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lendButtonMouseClicked
        int bookId = parseInt(bookIdField.getText());
        int userId = parseInt(userIdField.getText());
        
        Book book = bookController.getById(bookId);
        User user = userController.getById(userId);
        
        if(book == null || user == null) { // check if both the book and the user are registered
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
        
        // Check for pending fines for this user
        if(user.getFine() > 0) {
            JOptionPane.showMessageDialog(rootPane, "User has pending fines");
            return;
        }
        
        // Count user's current pending lendings
        LendingController lendingController = new LendingController();
        List<Lending> lendings = lendingController.getAllPendingByUser(user.getId());
        
        if(lendings.size() >= Settings.getMaxLendings()) {
            JOptionPane.showMessageDialog(rootPane, "User already borrowed the maximum of books");
            return;
        }
        
        // Check for unreturned delayed books
        long today = new Date().getTime();
        for(int i = 0; i < lendings.size(); i++) {
            if(today > lendings.get(i).getLendingDate().getTime() + (Settings.getLendingTime() * 86400000)) {
                JOptionPane.showMessageDialog(rootPane, "User has an unreturned delayed book");
                return;
            }
        }
        
        // Check if the user already borrowed a copy of this book
        if(lendingController.getByUserAndBook(user.getId(), book.getId()) != null) {
            JOptionPane.showMessageDialog(rootPane, "User already borrowed a copy of this book");
            return;
        }
        
        // Check if there are copies remaining of the book
        if(lendingController.countBookPendingLendings(book.getId()) >= book.getCopiesOwned()) {
            JOptionPane.showMessageDialog(rootPane, "No copies available of this book");
            return;
        }
        
        String message = "Lend " + book.getTitle() + " to " + user.getName() + "?";
        int dialogResult = JOptionPane.showConfirmDialog(this, message, "Lend book?", JOptionPane.YES_NO_OPTION);
        
        if(dialogResult == 1) { // If user clicked "no"
            return;
        }
        // If user clicked "yes", create and store the lending
        Lending lending = new Lending(bookId, userId);
        lendingController.save(lending);
        
        JOptionPane.showMessageDialog(rootPane, "Lending registered");
        this.dispose();
    }//GEN-LAST:event_lendButtonMouseClicked

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
            java.util.logging.Logger.getLogger(NewLendingDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewLendingDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewLendingDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewLendingDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NewLendingDialog dialog = new NewLendingDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton lendButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JTextField userIdField;
    private javax.swing.JLabel userIdLabel;
    // End of variables declaration//GEN-END:variables
}
