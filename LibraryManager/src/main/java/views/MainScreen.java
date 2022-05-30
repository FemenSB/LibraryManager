/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import views.viewUser.ViewUsersDialog;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

import controllers.LendingController;
import models.Lending;
import util.LendingTableModel;

/**
 *
 * @author Femen
 */
public class MainScreen extends javax.swing.JFrame {

    LendingTableModel lendingsModel;
    LendingController controller;
    
    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
        initComponents();
        decorateLendingsTable();
        lendingsModel = new LendingTableModel();
        LendingsTable.setModel(lendingsModel);
        controller = new LendingController();
        loadLendings();
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
        Title = new javax.swing.JLabel();
        LendingsHeaderPanel = new javax.swing.JPanel();
        LendingsTitle = new javax.swing.JLabel();
        NewLendingButton = new javax.swing.JButton();
        ReturnLendingButton = new javax.swing.JButton();
        LendingsPanel = new javax.swing.JPanel();
        LendingsScroll = new javax.swing.JScrollPane();
        LendingsTable = new javax.swing.JTable();
        ButtonsPanel = new javax.swing.JPanel();
        ViewUsers = new javax.swing.JButton();
        ViewBooks = new javax.swing.JButton();
        RegisterBook = new javax.swing.JButton();
        RegisterUser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(680, 660));
        setPreferredSize(new java.awt.Dimension(680, 660));

        MainPanel.setBackground(new java.awt.Color(204, 184, 165));
        MainPanel.setMinimumSize(new java.awt.Dimension(632, 614));

        TitlePanel.setBackground(new java.awt.Color(120, 100, 82));

        Title.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("Library Manager");

        javax.swing.GroupLayout TitlePanelLayout = new javax.swing.GroupLayout(TitlePanel);
        TitlePanel.setLayout(TitlePanelLayout);
        TitlePanelLayout.setHorizontalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitlePanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(Title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TitlePanelLayout.setVerticalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitlePanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Title)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        LendingsTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LendingsTitle.setForeground(new java.awt.Color(120, 100, 82));
        LendingsTitle.setText("Current lendings");

        NewLendingButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NewLendingButton.setText("Lend a book");
        NewLendingButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NewLendingButtonMouseClicked(evt);
            }
        });
        NewLendingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewLendingButtonActionPerformed(evt);
            }
        });

        ReturnLendingButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ReturnLendingButton.setText("Return a book");
        ReturnLendingButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReturnLendingButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout LendingsHeaderPanelLayout = new javax.swing.GroupLayout(LendingsHeaderPanel);
        LendingsHeaderPanel.setLayout(LendingsHeaderPanelLayout);
        LendingsHeaderPanelLayout.setHorizontalGroup(
            LendingsHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LendingsHeaderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LendingsTitle)
                .addGap(18, 18, 18)
                .addComponent(NewLendingButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ReturnLendingButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        LendingsHeaderPanelLayout.setVerticalGroup(
            LendingsHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LendingsHeaderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LendingsHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ReturnLendingButton, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addGroup(LendingsHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NewLendingButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LendingsTitle)))
                .addContainerGap())
        );

        LendingsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "User name", "Book title", "Lending date", "Time (days)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        LendingsTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        LendingsScroll.setViewportView(LendingsTable);

        javax.swing.GroupLayout LendingsPanelLayout = new javax.swing.GroupLayout(LendingsPanel);
        LendingsPanel.setLayout(LendingsPanelLayout);
        LendingsPanelLayout.setHorizontalGroup(
            LendingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LendingsScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
        );
        LendingsPanelLayout.setVerticalGroup(
            LendingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LendingsScroll)
        );

        ViewUsers.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ViewUsers.setText("View users");
        ViewUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewUsersMouseClicked(evt);
            }
        });

        ViewBooks.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ViewBooks.setText("View books");
        ViewBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewBooksActionPerformed(evt);
            }
        });

        RegisterBook.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RegisterBook.setText("Register book");
        RegisterBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterBookMouseClicked(evt);
            }
        });
        RegisterBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterBookActionPerformed(evt);
            }
        });

        RegisterUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RegisterUser.setText("Register user");
        RegisterUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterUserMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ButtonsPanelLayout = new javax.swing.GroupLayout(ButtonsPanel);
        ButtonsPanel.setLayout(ButtonsPanelLayout);
        ButtonsPanelLayout.setHorizontalGroup(
            ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ViewBooks, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(ViewUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RegisterBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RegisterUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        ButtonsPanelLayout.setVerticalGroup(
            ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ViewBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ViewUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RegisterBook, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RegisterUser, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(319, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LendingsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LendingsHeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(TitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(LendingsHeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LendingsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(ButtonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NewLendingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewLendingButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewLendingButtonActionPerformed

    private void ViewBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewBooksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ViewBooksActionPerformed

    private void RegisterBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegisterBookActionPerformed

    private void RegisterBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterBookMouseClicked
        RegisterBookDialog registerBookDialog = new RegisterBookDialog(this, rootPaneCheckingEnabled);
        registerBookDialog.setVisible(true);
    }//GEN-LAST:event_RegisterBookMouseClicked

    private void RegisterUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterUserMouseClicked
        RegisterUserDialog registerUserDialog = new RegisterUserDialog(this, rootPaneCheckingEnabled);
        registerUserDialog.setVisible(true);
    }//GEN-LAST:event_RegisterUserMouseClicked

    private void ViewUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewUsersMouseClicked
        ViewUsersDialog viewUsersDialog = new ViewUsersDialog(this, rootPaneCheckingEnabled);
        viewUsersDialog.setVisible(true);
    }//GEN-LAST:event_ViewUsersMouseClicked

    private void NewLendingButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewLendingButtonMouseClicked
        NewLendingDialog newLendingDialog = new NewLendingDialog(this, rootPaneCheckingEnabled);
        newLendingDialog.setVisible(true);
        
        newLendingDialog.addWindowListener(new WindowAdapter() {
           public void windowClosed(WindowEvent e) {
               loadLendings();
           } 
        });
    }//GEN-LAST:event_NewLendingButtonMouseClicked

    private void ReturnLendingButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnLendingButtonMouseClicked
        ReturnBookDialog returnBookDialog = new ReturnBookDialog(this, rootPaneCheckingEnabled);
        returnBookDialog.setVisible(true);
        
        returnBookDialog.addWindowListener(new WindowAdapter() {
           public void windowClosed(WindowEvent e) {
               loadLendings();
           } 
        });
    }//GEN-LAST:event_ReturnLendingButtonMouseClicked

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
                if ("Java swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonsPanel;
    private javax.swing.JPanel LendingsHeaderPanel;
    private javax.swing.JPanel LendingsPanel;
    private javax.swing.JScrollPane LendingsScroll;
    private javax.swing.JTable LendingsTable;
    private javax.swing.JLabel LendingsTitle;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton NewLendingButton;
    private javax.swing.JButton RegisterBook;
    private javax.swing.JButton RegisterUser;
    private javax.swing.JButton ReturnLendingButton;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JButton ViewBooks;
    private javax.swing.JButton ViewUsers;
    // End of variables declaration//GEN-END:variables

    public void decorateLendingsTable() {
        LendingsTable.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        LendingsTable.getTableHeader().setBackground(new Color(120,100,82));
        LendingsTable.getTableHeader().setForeground(new Color(255,255,255));
        LendingsTable.setAutoCreateRowSorter(true);
    }
    
    public void loadLendings() {
        List<Lending> lendings = controller.getAll();
        lendingsModel.setLendings(lendings);
    }
    
}