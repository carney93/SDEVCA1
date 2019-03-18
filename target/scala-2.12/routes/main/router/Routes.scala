// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Graham/Desktop/CA1SDEV/conf/routes
// @DATE:Mon Mar 18 14:21:52 GMT 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_1: controllers.HomeController,
  // @LINE:8
  LoginController_4: controllers.LoginController,
  // @LINE:41
  CountController_0: controllers.CountController,
  // @LINE:43
  AsyncController_2: controllers.AsyncController,
  // @LINE:46
  Assets_3: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:8
    LoginController_4: controllers.LoginController,
    // @LINE:41
    CountController_0: controllers.CountController,
    // @LINE:43
    AsyncController_2: controllers.AsyncController,
    // @LINE:46
    Assets_3: controllers.Assets
  ) = this(errorHandler, HomeController_1, LoginController_4, CountController_0, AsyncController_2, Assets_3, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, LoginController_4, CountController_0, AsyncController_2, Assets_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """myProjects""", """controllers.HomeController.myProjects"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewProjectsSite""", """controllers.HomeController.viewProjectsSite"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addProject""", """controllers.HomeController.addProject"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addProjectSubmit""", """controllers.HomeController.addProjectSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteProject/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteProject(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateProject/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateProject(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """projects""", """controllers.HomeController.projects(projects:Long ?= 0L)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employees""", """controllers.HomeController.employees(department:Long ?= 0L)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteEmployee/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteEmployee(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateEmployee/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateEmployee(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """account""", """controllers.HomeController.account"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginSubmit""", """controllers.LoginController.loginSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.LoginController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addEmployee""", """controllers.HomeController.addEmployee"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addEmployeeSubmit""", """controllers.HomeController.addEmployeeSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_LoginController_login1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login1_invoker = createInvoker(
    LoginController_4.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "GET",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_myProjects2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("myProjects")))
  )
  private[this] lazy val controllers_HomeController_myProjects2_invoker = createInvoker(
    HomeController_1.myProjects,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "myProjects",
      Nil,
      "GET",
      this.prefix + """myProjects""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_viewProjectsSite3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewProjectsSite")))
  )
  private[this] lazy val controllers_HomeController_viewProjectsSite3_invoker = createInvoker(
    HomeController_1.viewProjectsSite,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "viewProjectsSite",
      Nil,
      "GET",
      this.prefix + """viewProjectsSite""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_addProject4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addProject")))
  )
  private[this] lazy val controllers_HomeController_addProject4_invoker = createInvoker(
    HomeController_1.addProject,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addProject",
      Nil,
      "GET",
      this.prefix + """addProject""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_addProjectSubmit5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addProjectSubmit")))
  )
  private[this] lazy val controllers_HomeController_addProjectSubmit5_invoker = createInvoker(
    HomeController_1.addProjectSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addProjectSubmit",
      Nil,
      "POST",
      this.prefix + """addProjectSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_deleteProject6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteProject/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteProject6_invoker = createInvoker(
    HomeController_1.deleteProject(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteProject",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """deleteProject/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_HomeController_updateProject7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateProject/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateProject7_invoker = createInvoker(
    HomeController_1.updateProject(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateProject",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """updateProject/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_HomeController_projects8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("projects")))
  )
  private[this] lazy val controllers_HomeController_projects8_invoker = createInvoker(
    HomeController_1.projects(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "projects",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """projects""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_HomeController_employees9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employees")))
  )
  private[this] lazy val controllers_HomeController_employees9_invoker = createInvoker(
    HomeController_1.employees(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "employees",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """employees""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_HomeController_deleteEmployee10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteEmployee/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteEmployee10_invoker = createInvoker(
    HomeController_1.deleteEmployee(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteEmployee",
      Seq(classOf[String]),
      "GET",
      this.prefix + """deleteEmployee/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_HomeController_updateEmployee11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateEmployee/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateEmployee11_invoker = createInvoker(
    HomeController_1.updateEmployee(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateEmployee",
      Seq(classOf[String]),
      "GET",
      this.prefix + """updateEmployee/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_HomeController_account12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account")))
  )
  private[this] lazy val controllers_HomeController_account12_invoker = createInvoker(
    HomeController_1.account,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "account",
      Nil,
      "GET",
      this.prefix + """account""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_LoginController_loginSubmit13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginSubmit")))
  )
  private[this] lazy val controllers_LoginController_loginSubmit13_invoker = createInvoker(
    LoginController_4.loginSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "loginSubmit",
      Nil,
      "GET",
      this.prefix + """loginSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_LoginController_logout14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_LoginController_logout14_invoker = createInvoker(
    LoginController_4.logout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout""",
      """""",
      Seq()
    )
  )

  // @LINE:36
  private[this] lazy val controllers_HomeController_addEmployee15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addEmployee")))
  )
  private[this] lazy val controllers_HomeController_addEmployee15_invoker = createInvoker(
    HomeController_1.addEmployee,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addEmployee",
      Nil,
      "GET",
      this.prefix + """addEmployee""",
      """""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_HomeController_addEmployeeSubmit16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addEmployeeSubmit")))
  )
  private[this] lazy val controllers_HomeController_addEmployeeSubmit16_invoker = createInvoker(
    HomeController_1.addEmployeeSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addEmployeeSubmit",
      Nil,
      "POST",
      this.prefix + """addEmployeeSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:41
  private[this] lazy val controllers_CountController_count17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count17_invoker = createInvoker(
    CountController_0.count,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      this.prefix + """count""",
      """ An example controller showing how to use dependency injection""",
      Seq()
    )
  )

  // @LINE:43
  private[this] lazy val controllers_AsyncController_message18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message18_invoker = createInvoker(
    AsyncController_2.message,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      this.prefix + """message""",
      """ An example controller showing how to write asynchronous code""",
      Seq()
    )
  )

  // @LINE:46
  private[this] lazy val controllers_Assets_versioned19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned19_invoker = createInvoker(
    Assets_3.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
      }
  
    // @LINE:8
    case controllers_LoginController_login1_route(params@_) =>
      call { 
        controllers_LoginController_login1_invoker.call(LoginController_4.login)
      }
  
    // @LINE:10
    case controllers_HomeController_myProjects2_route(params@_) =>
      call { 
        controllers_HomeController_myProjects2_invoker.call(HomeController_1.myProjects)
      }
  
    // @LINE:12
    case controllers_HomeController_viewProjectsSite3_route(params@_) =>
      call { 
        controllers_HomeController_viewProjectsSite3_invoker.call(HomeController_1.viewProjectsSite)
      }
  
    // @LINE:14
    case controllers_HomeController_addProject4_route(params@_) =>
      call { 
        controllers_HomeController_addProject4_invoker.call(HomeController_1.addProject)
      }
  
    // @LINE:16
    case controllers_HomeController_addProjectSubmit5_route(params@_) =>
      call { 
        controllers_HomeController_addProjectSubmit5_invoker.call(HomeController_1.addProjectSubmit)
      }
  
    // @LINE:17
    case controllers_HomeController_deleteProject6_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_deleteProject6_invoker.call(HomeController_1.deleteProject(id))
      }
  
    // @LINE:19
    case controllers_HomeController_updateProject7_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateProject7_invoker.call(HomeController_1.updateProject(id))
      }
  
    // @LINE:21
    case controllers_HomeController_projects8_route(params@_) =>
      call(params.fromQuery[Long]("projects", Some(0L))) { (projects) =>
        controllers_HomeController_projects8_invoker.call(HomeController_1.projects(projects))
      }
  
    // @LINE:24
    case controllers_HomeController_employees9_route(params@_) =>
      call(params.fromQuery[Long]("department", Some(0L))) { (department) =>
        controllers_HomeController_employees9_invoker.call(HomeController_1.employees(department))
      }
  
    // @LINE:26
    case controllers_HomeController_deleteEmployee10_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_HomeController_deleteEmployee10_invoker.call(HomeController_1.deleteEmployee(id))
      }
  
    // @LINE:27
    case controllers_HomeController_updateEmployee11_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_HomeController_updateEmployee11_invoker.call(HomeController_1.updateEmployee(id))
      }
  
    // @LINE:30
    case controllers_HomeController_account12_route(params@_) =>
      call { 
        controllers_HomeController_account12_invoker.call(HomeController_1.account)
      }
  
    // @LINE:32
    case controllers_LoginController_loginSubmit13_route(params@_) =>
      call { 
        controllers_LoginController_loginSubmit13_invoker.call(LoginController_4.loginSubmit)
      }
  
    // @LINE:34
    case controllers_LoginController_logout14_route(params@_) =>
      call { 
        controllers_LoginController_logout14_invoker.call(LoginController_4.logout)
      }
  
    // @LINE:36
    case controllers_HomeController_addEmployee15_route(params@_) =>
      call { 
        controllers_HomeController_addEmployee15_invoker.call(HomeController_1.addEmployee)
      }
  
    // @LINE:37
    case controllers_HomeController_addEmployeeSubmit16_route(params@_) =>
      call { 
        controllers_HomeController_addEmployeeSubmit16_invoker.call(HomeController_1.addEmployeeSubmit)
      }
  
    // @LINE:41
    case controllers_CountController_count17_route(params@_) =>
      call { 
        controllers_CountController_count17_invoker.call(CountController_0.count)
      }
  
    // @LINE:43
    case controllers_AsyncController_message18_route(params@_) =>
      call { 
        controllers_AsyncController_message18_invoker.call(AsyncController_2.message)
      }
  
    // @LINE:46
    case controllers_Assets_versioned19_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned19_invoker.call(Assets_3.versioned(path, file))
      }
  }
}
