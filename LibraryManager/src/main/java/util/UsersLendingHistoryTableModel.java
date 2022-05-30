/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.List;
import javax.swing.table.AbstractTableModel;

import controllers.LendingController;
import controllers.BookController;
import models.Lending;
import models.User;

/**
 *
 * @author Femen
 */
public class UsersLendingHistoryTableModel extends AbstractTableModel {
    
    String[] columns = {"Book title", "Book id", "Lending date", "Return date"};
    List<Lending> lendings;
    LendingController lendingController = new LendingController();
    BookController bookController = new BookController();
    
    public UsersLendingHistoryTableModel(User user) {
        lendings = lendingController.getAllByUser(user.getId());
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
                return bookController.getById(lendings.get(rowIndex).getBookId()).getTitle();
                
            case 1:
                return lendings.get(rowIndex).getBookId();
                
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
