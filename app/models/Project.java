package models;
import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.*;
import models.users.*;


@Entity
public class Project extends Model {
    
    @Id
    private Long projectId;
    
    @Constraints.Required
    private String projectName;
    
     // Project contains many Employees
   @ManyToMany(cascade = CascadeType.ALL)
   private List<Employee> employees;
    
        //Generic query helper for entity Computer with id Long
   public static Finder<Long,Project> find = new Finder<Long,Project>(Project.class);

   //Find all Project in the database
   public static List<Project> findAll() {
      return Project.find.query().where().orderBy("projectName asc").findList();
   }
    
    
    
    
     public Project() {
 }

 public Project(Long projectId, String projectName,List<Employee> employees) {
 this.projectId = projectId;
 this.projectName = projectName;
this.employees = employees;

 }
    
     public static Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap();

        // Get all the categories from the database and add them to the options hash map
        for (Project p: Project.findAll()) {
            options.put(Long.toString(p.getProjectId()), p.getProjectName());
        }
        return options;
    }
    
    
    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }
    
     public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    
          public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees (List<Employee> employees) {
        this.employees = employees;
   }
    
    
       public static boolean inProject(Long project, Long employee) {
        return find.query().where().eq("employee.id", employee)
                           .eq("id", project)
                           .findList().size() > 0;
    }

    
    
    
    
    
    
}