// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Graham/Desktop/CA1SDEV/conf/routes
// @DATE:Mon Mar 18 14:21:52 GMT 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:46
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:46
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:41
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:41
    def count(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def addProject(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addProject")
    }
  
    // @LINE:17
    def deleteProject(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteProject/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:12
    def viewProjectsSite(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "viewProjectsSite")
    }
  
    // @LINE:19
    def updateProject(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateProject/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:37
    def addEmployeeSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addEmployeeSubmit")
    }
  
    // @LINE:26
    def deleteEmployee(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteEmployee/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:10
    def myProjects(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "myProjects")
    }
  
    // @LINE:30
    def account(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "account")
    }
  
    // @LINE:27
    def updateEmployee(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateEmployee/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:36
    def addEmployee(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addEmployee")
    }
  
    // @LINE:16
    def addProjectSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addProjectSubmit")
    }
  
    // @LINE:21
    def projects(projects:Long = 0L): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "projects" + play.core.routing.queryString(List(if(projects == 0L) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("projects", projects)))))
    }
  
    // @LINE:24
    def employees(department:Long = 0L): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "employees" + play.core.routing.queryString(List(if(department == 0L) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("department", department)))))
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:43
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:43
    def message(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }

  // @LINE:8
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def loginSubmit(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "loginSubmit")
    }
  
    // @LINE:34
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:8
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }


}
