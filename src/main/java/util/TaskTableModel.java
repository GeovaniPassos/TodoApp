/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Task;

/**
 *
 * @author Geovani-PC
 */
public class TaskTableModel extends AbstractTableModel{
    
    String[] columns = {"Nome", "Descri��o", "Prazo", "Tarefa conclu�da", "Editar", "Excluir"};
    List<Task> tasks = new ArrayList();

    @Override
    public int getRowCount() {
        return tasks.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }
    
    @Override 
    public String getColumnName(int ColumnIndex){
        return columns[ColumnIndex];
        
    }
    
    public boolean isCellEditable(int rowIndex, int columnIndex){
        if (columnIndex == 3)
            return true;
        else 
            return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        switch(columnIndex){
            case 0: 
                
                return tasks.get(rowIndex).getName();
            case 1:
                
                return tasks.get(rowIndex).getDescription();
            case 2:
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                return dateFormat.format(tasks.get(rowIndex).getDeadline());
            case 3:
                
                return tasks.get(rowIndex).isIsCompleted();
            case 4:
                
                return "";
            case 5:
                
                return ""; 
            default:
                return "Dados n�o encontrados!";
        }
    }

    public String[] getColumns() {
        return columns;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
    
    
    
}
