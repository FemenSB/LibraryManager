/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import java.text.SimpleDateFormat;
import java.util.Date;

import controllers.BookController;
import controllers.UserController;
import models.Lending;

/**
 *
 * @author Femen
 */
public class LendingTableModel extends AbstractTableModel{

    UserController userController = new UserController();
    BookController bookController = new BookController();
    
    String[] columns = {"User name", "Book title", "Lending date", "Time (days)"};
    List<Lending> lendings = new ArrayList();    
    
    @Override
    public int getRowCount() {
        return lendings.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0:
                return userController.getById(lendings.get(rowIndex).getUserId()).getName();
                    
            case 1:
                return bookController.getById(lendings.get(rowIndex).getBookId()).getTitle();
            
            case 2:
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                return dateFormat.format(lendings.get(rowIndex).getLendingDate());
                
            case 3:
                Date today = new Date();
                long time = today.getTime() - lendings.get(rowIndex).getLendingDate().getTime();
                return (int) (time / 86400000);
                
            default:
                return "unexistent column";
        }
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return columns[columnIndex];
    }

    public String[] getColumns() {
        return columns;
    }

    public List<Lending> getLendings() {
        return lendings;
    }

    public void setLendings(List<Lending> lendings) {
        this.lendings = lendings;
    }
    
    
    
}
