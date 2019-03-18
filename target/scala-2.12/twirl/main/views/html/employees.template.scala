
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

object employees extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.users.Employee],List[models.Department],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employees: List[models.users.Employee],department: List[models.Department],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Employees", user)/*2.25*/{_display_(Seq[Any](format.raw/*2.26*/("""
     

 
        """),format.raw/*6.9*/("""<!-- Main -->  
      
      <div class= container-fluid padding>
           <div class="employees">
          
              <div class ="pageTitle">
              <div class="col-sm-12">
                     <h1> Employees on the System</h1>
              </div>
                  </div>
                       
              <div class="row text-center">
                        
                      	<div class="col-sm-3">
		<h4>View Employees by Department</h4>
		<div class="list-group">
			<a href=""""),_display_(/*22.14*/routes/*22.20*/.HomeController.employees(0)),format.raw/*22.48*/("""" class="list-group-item">All Departments</a>
			"""),_display_(/*23.5*/for(d<-department) yield /*23.23*/ {_display_(Seq[Any](format.raw/*23.25*/("""
                """),format.raw/*24.17*/("""<a href=""""),_display_(/*24.27*/routes/*24.33*/.HomeController.employees(d.getId)),format.raw/*24.67*/("""" class="list-group-item">"""),_display_(/*24.94*/d/*24.95*/.getName),format.raw/*24.103*/("""

            """),format.raw/*26.13*/("""</a>
			""")))}),format.raw/*27.5*/("""
		"""),format.raw/*28.3*/("""</div>
	</div>     
              
              
                           
                           
                           
                           
                <div class="col-9">
                    
                    <table class="table table-bordered table-hover table-condensed">
            <thead>
        <!-- The header row-->
        <tr>
            <th>Email</th>
            <th>Name</th>
            <th>DOB</th>
            <th>Department</th>
            <th>Job Title</th>
        </tr>
        </thead>
        <tbody>
     
        <!-- Users row(s) -->
       
            """),format.raw/*53.62*/("""
            """),_display_(/*54.14*/for(e<-employees) yield /*54.31*/ {_display_(Seq[Any](format.raw/*54.33*/("""
               """),format.raw/*55.16*/("""<tr>
                  <td>"""),_display_(/*56.24*/e/*56.25*/.getEmail),format.raw/*56.34*/("""</td>
                  <td>"""),_display_(/*57.24*/e/*57.25*/.getName),format.raw/*57.33*/("""</td>
                  <td>"""),_display_(/*58.24*/e/*58.25*/.getDateOfBirth),format.raw/*58.40*/("""</td>
                  <td>"""),_display_(/*59.24*/e/*59.25*/.getDepartment.getName),format.raw/*59.47*/("""</td>
                  <td>"""),_display_(/*60.24*/e/*60.25*/.getJobTitle),format.raw/*60.37*/("""</td>
            <td>
							<a href=""""),_display_(/*62.18*/routes/*62.24*/.HomeController.deleteEmployee(e.getEmail)),format.raw/*62.66*/("""" i class="far fa-trash-alt" onclick="return confirmDel();">
							</a>
						</td>
             <td>
							<a href=""""),_display_(/*66.18*/routes/*66.24*/.HomeController.updateEmployee(e.getEmail)),format.raw/*66.66*/("""" class="fas fa-pen" onclick="return confirmDel();">
							</a>
						</td>
               </tr>
            """)))}),format.raw/*70.14*/("""
        
        """),format.raw/*72.9*/("""</tbody>
    </table>
              
                  <p>
        <a href=""""),_display_(/*76.19*/routes/*76.25*/.HomeController.addEmployee()),format.raw/*76.54*/("""">
            <button class="btn btn-primary">Add a new Employee</button>
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

  def render(employees:List[models.users.Employee],department:List[models.Department],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(employees,department,user)

  def f:((List[models.users.Employee],List[models.Department],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (employees,department,user) => apply(employees,department,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 17 22:48:40 GMT 2019
                  SOURCE: /Users/Graham/Desktop/CA1SDEV/app/views/employees.scala.html
                  HASH: 644da293d57274f93ded850a5d02589d395fdc53
                  MATRIX: 1015->1|1209->103|1240->126|1278->127|1322->145|1858->654|1873->660|1922->688|1998->738|2032->756|2072->758|2117->775|2154->785|2169->791|2224->825|2278->852|2288->853|2318->861|2360->875|2399->884|2429->887|3069->1548|3110->1562|3143->1579|3183->1581|3227->1597|3282->1625|3292->1626|3322->1635|3378->1664|3388->1665|3417->1673|3473->1702|3483->1703|3519->1718|3575->1747|3585->1748|3628->1770|3684->1799|3694->1800|3727->1812|3794->1852|3809->1858|3872->1900|4019->2020|4034->2026|4097->2068|4239->2179|4284->2197|4388->2274|4403->2280|4453->2309
                  LINES: 28->1|33->2|33->2|33->2|37->6|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|55->24|55->24|55->24|55->24|57->26|58->27|59->28|84->53|85->54|85->54|85->54|86->55|87->56|87->56|87->56|88->57|88->57|88->57|89->58|89->58|89->58|90->59|90->59|90->59|91->60|91->60|91->60|93->62|93->62|93->62|97->66|97->66|97->66|101->70|103->72|107->76|107->76|107->76
                  -- GENERATED --
              */
          