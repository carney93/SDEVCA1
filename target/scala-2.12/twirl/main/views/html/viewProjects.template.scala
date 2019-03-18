
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

object viewProjects extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.Project],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(projects: List[models.Project],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Projects", user)/*2.24*/{_display_(Seq[Any](format.raw/*2.25*/("""
     

 
        """),format.raw/*6.9*/("""<!-- Main -->  
      
      <div class= container-fluid padding>
           <div class="employees">
                 
               <div class ="pageTitle">
               <h1>Projects on the System</h1>
               </div>
               
                <div class="col-12">
                    
                    <table class="table table-bordered table-hover table-condensed">
            <thead>
        <!-- The header row-->
        <tr>
            <th>Project Name</th>

        </tr>
        </thead>
        <tbody>
     
        <!-- Project row(s) -->
       
            """),format.raw/*29.62*/("""
            """),_display_(/*30.14*/for(p<-projects) yield /*30.30*/ {_display_(Seq[Any](format.raw/*30.32*/("""
               """),format.raw/*31.16*/("""<tr>
                  <td>"""),_display_(/*32.24*/p/*32.25*/.getProjectName),format.raw/*32.40*/("""
                  """),format.raw/*33.19*/("""</td>
                   <td>
							<a href=""""),_display_(/*35.18*/routes/*35.24*/.HomeController.deleteProject(p.getProjectId)),format.raw/*35.69*/("""" i class="far fa-trash-alt" onclick="return confirmDel();">
							</a>
						</td>
            <td>
            	<a href=""""),_display_(/*39.24*/routes/*39.30*/.HomeController.updateProject(p.getProjectId)),format.raw/*39.75*/("""" class="fas fa-pen" onclick="return confirmDel();">
							</a>
						</td>
   
            """)))}),format.raw/*43.14*/("""
        
        """),format.raw/*45.9*/("""</tbody>
    </table>
              
                  <p>
        <a href=""""),_display_(/*49.19*/routes/*49.25*/.HomeController.addProject()),format.raw/*49.53*/("""">
            <button class="btn btn-primary">Add a new Project</button>
        </a>
    </p>
    
             </div>
        </div>  
              
              
          </div>  
      </div>
      
""")))}))
      }
    }
  }

  def render(projects:List[models.Project],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(projects,user)

  def f:((List[models.Project],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (projects,user) => apply(projects,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 17 23:37:20 GMT 2019
                  SOURCE: /Users/Graham/Desktop/CA1SDEV/app/views/viewProjects.scala.html
                  HASH: a6d7f64c0bce41224b442fe2a1c8f7da76c5e22c
                  MATRIX: 987->1|1137->59|1167->81|1205->82|1249->100|1868->740|1909->754|1941->770|1981->772|2025->788|2080->816|2090->817|2126->832|2173->851|2247->898|2262->904|2328->949|2480->1074|2495->1080|2561->1125|2686->1219|2731->1237|2835->1314|2850->1320|2899->1348
                  LINES: 28->1|33->2|33->2|33->2|37->6|60->29|61->30|61->30|61->30|62->31|63->32|63->32|63->32|64->33|66->35|66->35|66->35|70->39|70->39|70->39|74->43|76->45|80->49|80->49|80->49
                  -- GENERATED --
              */
          