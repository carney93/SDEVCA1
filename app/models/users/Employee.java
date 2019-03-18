package models.users;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.*;
import models.users.*;



@Table(name = "user")
@DiscriminatorValue("e")

// Employee inherits from the User class
@Entity
public class Employee extends User{
    
    
    private String jobTitle;
    
    @OneToOne(mappedBy="employee", cascade = CascadeType.ALL)
    private Address address;
    
    @ManyToOne
    private Department department;
    
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "employees")
    private List<Project> projects;
    
    
     public Employee(){

    }
	
   public Employee(String email, String role, String name, 
    String password, Date dateOfBirth,String jobTitle)
	{
		super(email, role, name, password,dateOfBirth);
        this.jobTitle = jobTitle;

   }
    
    private List<Long> projectSelect = new ArrayList<Long>();
    
    public static final Finder<Long, Employee> find = new Finder<>(Employee.class);
			    
    public static final List<Employee> findAll() {
       return Employee.find.all();
    }
    
      public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    
        public Address getAddress() {
        return address;
    }

    public void setAdress(Address adddress) {
        this.address = address;
    }
    
       public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }
    
    public List<Project> getProjects() {
        return projects;
    }
    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
    
         public List<Long> getProjectSelect() {
        return projectSelect;
    }
    
    public void setProjectSelect (List<Long> projectSelect) {
        this.projectSelect = projectSelect;
   }
    
    
    
    
    
    
}