package controllers;

import play.mvc.*;

import views.html.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import models.users.*;
import models.*;



import views.html.*;
/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {
    
       private FormFactory formFactory;
    
    @Inject
    public HomeController(FormFactory f) {
        this.formFactory = f;
    }

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
      public Result index() {
                return ok(index.render(User.getUserById(session().get("email"))));
    }
    
     public Result account() {
                return ok(account.render((Employee)User.getUserById(session().get("email"))));
    }
    
    public Result myProjects() {
                return ok(myProjects.render((Employee)User.getUserById(session().get("email"))));
    }
    
            public Result viewProjectsSite() {
   List<Project> projectList = Project.findAll();
   return ok(viewProjects.render(projectList, User.getUserById(session().get("email"))));
}
    
    
public Result addProject() {
          Form<Project> projectForm = formFactory.form(Project.class);
                return ok(addProject.render(projectForm,User.getUserById(session().get("email"))));
    }
    
        public Result addProjectSubmit() {

        Form<Project> newProjectForm = formFactory.form(Project.class).bindFromRequest();
    
    if (newProjectForm.hasErrors()) {
           
            return badRequest(addProject.render(newProjectForm, User.getUserById(session().get("email"))));
        } else {
            Project newProject = newProjectForm.get();

            if (newProject.getProjectId() == null) {
             
                newProject.save();
            } else {
          
                newProject.update();
            }

     
            flash("success", "Item " + newProject.getProjectName() + " was added/updated.");
           
            return redirect(controllers.routes.HomeController.viewProjectsSite());
        }
    }
    
        public Result updateProject(Long id) {
    Project p;
    Form<Project> updateProject;

     try {
            p = Project.find.byId(id);

            updateProject = formFactory.form(Project.class).fill(p);
        } catch (Exception ex) {
            return badRequest("error");
        }

   
    return ok(addProject.render(updateProject,User.getUserById(session().get("email"))));
}
    
    
            public Result deleteProject(Long id) {

   
        Project.find.ref(id).delete();

       
        flash("success", "Item has been deleted.");
        
        return redirect(controllers.routes.HomeController.viewProjectsSite());
    }
 
    
    
    
    
    
          public Result projects(Long project) {
    List<Employee> employeeList = null;
    List<Project> projectList = Project.findAll();
          
   if(project ==0){
        employeeList=Employee.findAll();
    }else{
        employeeList = Project.find.ref(project).getEmployees();
    }

             return ok(projects.render(employeeList, projectList,User.getUserById(session().get("email"))));
   
 }
    

    
    
    
      public Result employees(Long department) {
    List<Employee> employeeList = null;
    List<Department> departmentList = Department.findAll();
          
    if(department ==0){
        employeeList=Employee.findAll();
    }else{
        employeeList = Department.find.ref(department).getEmployees();
    }

    return ok(employees.render(employeeList,departmentList,User.getUserById(session().get("email"))));
 }
    
      public Result addEmployee() {
          Form<Employee> userForm = formFactory.form(Employee.class);
                return ok(addEmployee.render(userForm,User.getUserById(session().get("email"))));
    }
    
    public Result addEmployeeSubmit()
 {
Form<Employee> newUserForm = formFactory.form(Employee.class).bindFromRequest();
if (newUserForm.hasErrors()) {
return badRequest(addEmployee.render(newUserForm,User.getUserById(session().get("email"))));
} else {
    Employee newUser = newUserForm.get();
    
                List<Project> newProject = new ArrayList<Project>();
            for (Long project : newUser.getProjectSelect()) {
                newProject.add(Project.find.byId(project));
            }
            newUser.setProjects (newProject);

    
    if(User.getUserById(newUser.getEmail())==null){
        newUser.save();
    }else{
        newUser.update();
    }
    flash("success", "User " + newUser.getName() + " was added/updated.");

    
    }
    return redirect(controllers.routes.HomeController.employees(0)); 
}
    
       public Result deleteEmployee(String id) {


        Employee e = (Employee) User.getUserById(id);
           e.delete();

        flash("success", "Employee has been deleted.");

        return redirect(controllers.routes.HomeController.employees(0));
    }
    
    public Result updateEmployee(String id) {
    Employee e;
    Form<Employee> updateEmployee;

    try {
       
        e = (Employee)User.getUserById(id);
        e.update();

      
        updateEmployee = formFactory.form(Employee.class).fill(e);
    } catch (Exception ex) {
        return badRequest("error");
    }

   
    return ok(addEmployee.render(updateEmployee,User.getUserById(session().get("email"))));
}
    
    
     
    

}
