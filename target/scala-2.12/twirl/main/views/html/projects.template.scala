
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

object projects extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.users.Employee],List[models.Project],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employees: List[models.users.Employee],projects: List[models.Project],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Employee Projects", user)/*2.33*/{_display_(Seq[Any](format.raw/*2.34*/("""
     

 
        """),format.raw/*6.9*/("""<!-- Main -->  
      
      <div class= container-fluid padding>
          <div class="employees">
          
              <div class ="pageTitle">
              <div class="col-sm-12">
                     <h1> Projects that are Employees are working on</h1>
              </div>
                  </div>
                       
              <div class="row text-center">
                        
                      	<div class="col-sm-3">
		<h4>Projects</h4>
		<div class="list-group">
			<a href=""""),_display_(/*22.14*/routes/*22.20*/.HomeController.projects(0)),format.raw/*22.47*/("""" class="list-group-item">All Projects</a>
			"""),_display_(/*23.5*/for(p<-projects) yield /*23.21*/ {_display_(Seq[Any](format.raw/*23.23*/("""
                """),format.raw/*24.17*/("""<a href=""""),_display_(/*24.27*/routes/*24.33*/.HomeController.projects(p.getProjectId)),format.raw/*24.73*/("""" class="list-group-item">"""),_display_(/*24.100*/p/*24.101*/.getProjectName),format.raw/*24.116*/("""

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
       
            """),format.raw/*51.62*/("""
            """),_display_(/*52.14*/for(e<-employees) yield /*52.31*/ {_display_(Seq[Any](format.raw/*52.33*/("""
               """),format.raw/*53.16*/("""<tr>
                  <td>"""),_display_(/*54.24*/e/*54.25*/.getEmail),format.raw/*54.34*/("""</td>
                  <td>"""),_display_(/*55.24*/e/*55.25*/.getName),format.raw/*55.33*/("""</td>
                  <td>"""),_display_(/*56.24*/e/*56.25*/.getDateOfBirth),format.raw/*56.40*/("""</td>
                  <td>"""),_display_(/*57.24*/e/*57.25*/.getDepartment.getName),format.raw/*57.47*/("""</td>
                  <td>"""),_display_(/*58.24*/e/*58.25*/.getJobTitle),format.raw/*58.37*/("""</td>
                    
            
               </tr>
            """)))}),format.raw/*62.14*/("""
        
        """),format.raw/*64.9*/("""</tbody>
    </table>
              
 
    
             </div>
        </div>  
              
              
          </div>  
      </div>
      
""")))}))
      }
    }
  }

  def render(employees:List[models.users.Employee],projects:List[models.Project],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(employees,projects,user)

  def f:((List[models.users.Employee],List[models.Project],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (employees,projects,user) => apply(employees,projects,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 17 22:56:46 GMT 2019
                  SOURCE: /Users/Graham/Desktop/CA1SDEV/app/views/projects.scala.html
                  HASH: b08377306488b1a66a91f47fd662c6422c176bc5
                  MATRIX: 1011->1|1200->98|1239->129|1277->130|1321->148|1855->655|1870->661|1918->688|1991->735|2023->751|2063->753|2108->770|2145->780|2160->786|2221->826|2276->853|2287->854|2324->869|2366->883|2405->892|2435->895|3045->1526|3086->1540|3119->1557|3159->1559|3203->1575|3258->1603|3268->1604|3298->1613|3354->1642|3364->1643|3393->1651|3449->1680|3459->1681|3495->1696|3551->1725|3561->1726|3604->1748|3660->1777|3670->1778|3703->1790|3808->1864|3853->1882
                  LINES: 28->1|33->2|33->2|33->2|37->6|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|55->24|55->24|55->24|55->24|57->26|58->27|59->28|82->51|83->52|83->52|83->52|84->53|85->54|85->54|85->54|86->55|86->55|86->55|87->56|87->56|87->56|88->57|88->57|88->57|89->58|89->58|89->58|93->62|95->64
                  -- GENERATED --
              */
          