    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TodoApp;

import controler.ProjectController;
import java.sql.Connection;
import java.util.List;
import model.Project;
import util.ConnectionFactory;


/**
 *
 * @author Geovani-PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        ProjectController projectControler = new ProjectController();
        
        Project project = new Project();
        project.setName("Projeto teste");
        project.setDescription("descrição do novo projeto");
        projectControler.save(project);
        
//        project.setName("Novo nome do projeto");
//        projectController.save(project);
//        
//        List<Project> projects = projectController.getAll();
//        System.out.println("Total de projetos = " + projects.size());
    }
    
}
