/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.List;
import javax.swing.table.AbstractTableModel;

import controllers.LendingController;
import controllers.UserController;
import models.Lending;
import models.Book;

/**
 *
 * @author Femen
 */
public class BooksLendingHistoryTableModel extends AbstractTableModel {
    
    String[] columns = {"User name", "User id", "Lending date", "Return date"};
    List<Lending> lendings;
    LendingController lendingController = new LendingController();
    UserController userController = new UserController();
    
    public BooksLendingHistoryTableModel(Book book) {
        lendings = lendingController.getAllByBook(book.getId());
    }

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
                return lendings.get(rowIndex).getUserId();
                
            case 2:
                return lendings.get(rowIndex).getLendingDate();
                
            case 3:
                return lendings.get(rowIndex).getReturnDate();
                
            default:
                return "Unexisting property";
                
        }
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return columns[columnIndex];
    }
    
}
