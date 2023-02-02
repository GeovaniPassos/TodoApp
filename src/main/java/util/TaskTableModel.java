/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

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
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        switch(columnIndex){
            case 1: 
                return tasks.get(rowIndex).getName();
                
                
            case 2:
                return tasks.get(rowIndex).getDescription();
                
                
            case 3:
                return tasks.get(rowIndex).getDeadline();
                
            case 4:
                return tasks.get(rowIndex).isIsCompleted();
                
                
            case 5:
                return "";

            case 6:
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
