    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TodoApp;

import controller.ProjectController;
import java.util.List;
import model.Project;


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
        
        
//        ProjectController projectController = new ProjectController();
//        
//        Project project = new Project();
//        project.setName("Projeto teste2");
//        project.setDescription("descrição do novo projeto");
//        projectController.save(project);
        
        ProjectController projectController = new ProjectController();


        Project project = new Project();
        project.setId(1);
        project.setName("Novo nome do projeto");
        project.setDescription("Nova descrição");
        
        projectController.update(project);
        
        List<Project> projects = projectController.getAll();
        System.out.println("Total de projetos = " + projects.size());
        
        projectController.removeById(1);
    }
    
}
