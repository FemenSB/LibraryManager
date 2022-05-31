/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util.cellRenderers;

import util.tableModels.PendingLendingsTableModel;
import java.awt.Color;
import java.awt.Component;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

import models.Lending;
import util.Settings;

/**
 *
 * @author Femen
 */
public class TimeColumnCellRenderer extends DefaultTableCellRenderer {
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {
        
        JLabel label = (JLabel) super.getTableCellRendererComponent(table, value,
                isSelected, hasFocus, row, column);
        
        label.setHorizontalAlignment(CENTER);
        
        PendingLendingsTableModel tableModel = (PendingLendingsTableModel) table.getModel(); // Get the lending
        Lending lending = tableModel.getLendingByIndex(row);
        // Calculate the time since the lending date
        Date today = new Date();
        long time = today.getTime() - lending.getLendingDate().getTime();
        int days = (int) (time / 86400000);
        
        if(days > Settings.getLendingTime()) { // If lending is delayed
            label.setBackground(Color.RED);
        } else { // If lending is not delayed
            label.setBackground(Color.YELLOW);
        }
        
        return label;
    }
    
}
