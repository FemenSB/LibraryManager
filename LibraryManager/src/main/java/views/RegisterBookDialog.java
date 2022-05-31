/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package views;

import static java.lang.Integer.parseInt;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

import controllers.BookController;
import models.Book;

/**
 *
 * @author Femen
 */
public class RegisterBookDialog extends javax.swing.JDialog {
    
    BookController controller;

    /**
     * Creates new form RegisterBookDialog
     */
    public RegisterBookDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        hideRequirements();
        controller = new BookController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        TitlePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TitleField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        AuthorField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        EditionField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        RegisterButton = new javax.swing.JButton();
        ReleaseDateField = new javax.swing.JFormattedTextField();
        CopiesOwnedField = new javax.swing.JFormattedTextField();
        titleRequired = new javax.swing.JLabel();
        authorRequired = new javax.swing.JLabel();
        editionRequired = new javax.swing.JLabel();
        releaseRequired = new javax.swing.JLabel();
        copiesRequired = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(399, 500));

        MainPanel.setBackground(new java.awt.Color(204, 184, 165));
        MainPanel.setPreferredSize(new java.awt.Dimension(399, 500));

        TitlePanel.setBackground(new java.awt.Color(120, 100, 82));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Book");

        javax.swing.GroupLayout TitlePanelLayout = new javax.swing.GroupLayout(TitlePanel);
        TitlePanel.setLayout(TitlePanelLayout);
        TitlePanelLayout.setHorizontalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TitlePanelLayout.setVerticalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Title");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        TitleField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TitleField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TitleFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Author name");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        AuthorField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Edition");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        EditionField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Release date");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Number of copies owned");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        RegisterButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RegisterButton.setText("Register");
        RegisterButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterButtonMouseClicked(evt);
            }
        });

        ReleaseDateField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        ReleaseDateField.setToolTipText("");

        CopiesOwnedField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        titleRequired.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        titleRequired.setForeground(new java.awt.Color(255, 0, 0));
        titleRequired.setText("Required field");

        authorRequired.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        authorRequired.setForeground(new java.awt.Color(255, 0, 0));
        authorRequired.setText("Required field");

        editionRequired.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        editionRequired.setForeground(new java.awt.Color(255, 0, 0));
        editionRequired.setText("Required field");

        releaseRequired.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        releaseRequired.setForeground(new java.awt.Color(255, 0, 0));
        releaseRequired.setText("Required field");

        copiesRequired.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        copiesRequired.setForeground(new java.awt.Color(255, 0, 0));
        copiesRequired.setText("Required field");

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TitleField)
                    .addComponent(AuthorField)
                    .addComponent(EditionField)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(titleRequired))
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(editionRequired))
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(releaseRequired))
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(authorRequired))
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(copiesRequired)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(RegisterButton, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                .addGap(58, 58, 58))
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ReleaseDateField)
                .addContainerGap())
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CopiesOwnedField)
                .addContainerGap())
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(TitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(titleRequired))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TitleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(authorRequired))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AuthorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(editionRequired))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EditionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(releaseRequired))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ReleaseDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(copiesRequired))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CopiesOwnedField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(RegisterButton)
                .addGap(69, 69, 69))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TitleFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TitleFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TitleFieldActionPerformed

    private void RegisterButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterButtonMouseClicked
        hideRequirements();
        if(!fieldsFilled()) {
            return;
        }
        
        try {
            Book book = new Book();
            // String values:
            book.setTitle(TitleField.getText());
            book.setAuthorName(AuthorField.getText());
            // Integer values:
            book.setEdition(parseInt(EditionField.getText()));
            book.setCopiesOwned(parseInt(CopiesOwnedField.getText()));
            
            // Date formating from ReleaseDateField (JFormattedTextField):
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date releaseDate = null;
            releaseDate = dateFormat.parse(ReleaseDateField.getText());
            book.setReleaseDate(releaseDate);
            
            controller.save(book); // Inserting the book into the database
            
            JOptionPane.showMessageDialog(rootPane, "Book registered!");
            this.dispose();
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_RegisterButtonMouseClicked

    private void hideRequirements() {
        titleRequired.setVisible(false);
        authorRequired.setVisible(false);
        editionRequired.setVisible(false);
        releaseRequired.setVisible(false);
        copiesRequired.setVisible(false);
    }
    
    private boolean fieldsFilled() { // Return true if all fields are correctly filled; Set the messages if they are not
        boolean filled = true;
        
        // String values:
        
        if(TitleField.getText().equals("")) {
            titleRequired.setVisible(true);
            filled = false;
        }
        
        if(AuthorField.getText().equals("")) {
            authorRequired.setVisible(true);
            filled = false;
        }
        
        // Integer values:
        
        try {
            parseInt(EditionField.getText());
        } catch (NumberFormatException e) {
            editionRequired.setVisible(true);
            filled = false;
        }
        
        try {
            parseInt(CopiesOwnedField.getText());
        } catch (NumberFormatException e) {
            copiesRequired.setVisible(true);
            filled = false;
        }
        
        // Date value formatted by JFormattedTextField, so we just have to check if its blank
        
        if(ReleaseDateField.getText().equals("")) {
            releaseRequired.setVisible(true);
            filled = false;
        }
        
        return filled;
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
            java.util.logging.Logger.getLogger(RegisterBookDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterBookDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterBookDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterBookDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegisterBookDialog dialog = new RegisterBookDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField AuthorField;
    private javax.swing.JFormattedTextField CopiesOwnedField;
    private javax.swing.JTextField EditionField;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JFormattedTextField ReleaseDateField;
    private javax.swing.JTextField TitleField;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JLabel authorRequired;
    private javax.swing.JLabel copiesRequired;
    private javax.swing.JLabel editionRequired;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel releaseRequired;
    private javax.swing.JLabel titleRequired;
    // End of variables declaration//GEN-END:variables
}
