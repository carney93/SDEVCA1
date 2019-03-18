
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object addProject extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Project],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(addProject: Form[models.Project],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](_display_(/*3.2*/main("Add Project", user)/*3.27*/{_display_(Seq[Any](format.raw/*3.28*/("""
 

        """),format.raw/*6.9*/("""<!-- Main -->   

    
      <div class= container-fluid padding>
          <div class="addEmployee">
              <h1>Add a new Project</h1>
              
         <div class="row">
              <div class="col-md-5">
                  
"""),_display_(/*16.2*/form(action=routes.HomeController.addProjectSubmit(), 'class -> "form-horizontal", 'role -> "form")/*16.101*/ {_display_(Seq[Any](format.raw/*16.103*/("""
          """),format.raw/*17.39*/("""
        """),format.raw/*18.99*/("""
        """),_display_(/*19.10*/CSRF/*19.14*/.formField),format.raw/*19.24*/("""
                
                
            """),_display_(/*22.14*/inputText(addProject("ProjectName"), '_label -> "Project Name", 'class -> "form-control")),format.raw/*22.103*/("""
             
             """),_display_(/*24.15*/inputText(addProject("projectId"), '_label -> "", 'hidden -> "hidden")),format.raw/*24.85*/("""

          

    

"""),format.raw/*30.1*/("""<div class="actions">
                <input type="submit" value="Add/Update Project" class="btn btn-primary">
                <a href=""""),_display_(/*32.27*/routes/*32.33*/.HomeController.viewProjectsSite()),format.raw/*32.67*/("""">
                    <button type="button" class="btn btn-warning">Cancel</button>
                </a>
            </div>
                  """)))}),format.raw/*36.20*/(""" """),format.raw/*36.38*/("""

              """),format.raw/*38.15*/("""</div>
   
              </div>
          </div>  
      </div>
   
     """)))}))
      }
    }
  }

  def render(addProject:Form[models.Project],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(addProject,user)

  def f:((Form[models.Project],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (addProject,user) => apply(addProject,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 00:19:32 GMT 2019
                  SOURCE: /Users/Graham/Desktop/CA1SDEV/app/views/addProject.scala.html
                  HASH: 1b83710acb01bdbf75cecac1eb4532433ec3fa7d
                  MATRIX: 985->1|1116->61|1160->81|1193->106|1231->107|1269->119|1537->361|1646->460|1687->462|1726->501|1763->600|1800->610|1813->614|1844->624|1919->672|2030->761|2086->790|2177->860|2224->880|2388->1017|2403->1023|2458->1057|2633->1201|2662->1219|2706->1235
                  LINES: 28->1|31->2|34->3|34->3|34->3|37->6|47->16|47->16|47->16|48->17|49->18|50->19|50->19|50->19|53->22|53->22|55->24|55->24|61->30|63->32|63->32|63->32|67->36|67->36|69->38
                  -- GENERATED --
              */
          