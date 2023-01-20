/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import model.Project;
import util.ConnectionFactory;

/**
 *
 * @author Geovani-PC
 */
public class ProjectControler {
    
    public void save(Project project){
        
        String sql = "INSERT INTO projects(name,"
                + " description, "
                + "createAt, "
                + "updateAt) VALUE(?,?,?,?)";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            
            statement.setString(1, project.getName());
            
            
            
        } catch (Exception e) {
        }
    }
    
    public void update(Project project){
        
    }
    
    public void removeById(int Id){
        
    }
    
    public List<Project> getAll(int id){
       
        return null;
    }
}
