package models;
import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.*;
import models.users.*;


@Entity
public class Department extends Model {

 @Id
 private Long id;
    
 @Constraints.Required
 private String name;

 @OneToMany
 private List<Employee> employees;

 public Department() {
 }

 public Department(Long id, String name, List<Employee> employees) {
 this.id = id;
 this.name = name;
 this.employees = employees;
 }
    
    //Generic query helper for entity Computer with id Long
public static Finder<Long,Department> find = new Finder<Long,Department>(Department.class);

    //Find all Departments in the database
public static List<Department> findAll() {
 return Department.find.query().where().orderBy("name asc").findList();
}
    
 public static Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap();

        // Get all the categories from the database and add them to the options hash map
        for (Department d: Department.findAll()) {
            options.put(Long.toString(d.getId()), d.getName());
        }
        return options;
    }
      

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
     public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

       public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees (List<Employee> employees) {
        this.employees = employees;
   }
    
    
    
    
    
    
    
    
    
}