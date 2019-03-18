package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.*;
import models.users.*;


// Product entity managed by Ebean
@Entity
public class Address extends Model {
    
    
    private String street;
    private String town;
    private String county;
    
    
    @OneToOne
    @JoinColumn(name="employee_email")
    private Employee employee;
    
      public Address(){

    }
    
        //Generic query helper for entity Computer with id Long
public static Finder<Long,Address> find = new Finder<Long,Address>(Address.class);

    //Find all Departments in the database
public static List<Address> findAll() {
 return Address.find.query().where().orderBy("name asc").findList();
}
	
    
    
    public Address(String street, String town, String county)
	{
        this.street = street;
         this.town = town;
         this.county = county;


   }
    
        public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }


    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String County) {
        this.county = County;
    }
   
       public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
    
    
    
    
    
}