
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

object myProjects extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.Employee,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employee: models.users.Employee):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""     


"""),format.raw/*5.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*6.2*/main("My Projects", employee)/*6.31*/ {_display_(Seq[Any](format.raw/*6.33*/("""

 
        """),format.raw/*9.9*/("""<!-- Main -->  
      
      <div class= container-fluid padding>
          <div class="account">
              <h1> Your Current Projects</h1>
              
              
         <div class="row">
              <div class="col-md-12">
     
                            <table class="table table-bordered table-hover table-condensed">
            <thead>
        <!-- The header row-->
        <tr>
            <th>Project Name</th>

        </tr>
        </thead>
        <tbody>
     
        <!-- Project row(s) -->
       
                    """),_display_(/*31.22*/for(i <- employee.getProjects()) yield /*31.54*/ {_display_(Seq[Any](format.raw/*31.56*/("""
                    """),format.raw/*32.21*/("""<tr>
                        <td>"""),_display_(/*33.30*/i/*33.31*/.getProjectName),format.raw/*33.46*/("""</td>

                    </tr>
                    """)))}),format.raw/*36.22*/("""<!-- End of For loop -->
        
        </tbody>
    </table>
      
         
      
     
			
       


              </div>
         
              </div>
          </div>  
      </div>
      
""")))}))
      }
    }
  }

  def render(employee:models.users.Employee): play.twirl.api.HtmlFormat.Appendable = apply(employee)

  def f:((models.users.Employee) => play.twirl.api.HtmlFormat.Appendable) = (employee) => apply(employee)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 15:17:22 GMT 2019
                  SOURCE: /Users/Graham/Desktop/CA1SDEV/app/views/myProjects.scala.html
                  HASH: fb636002cccd9ca2dc18ea75252f8a906baa1b2a
                  MATRIX: 968->1|1095->35|1129->43|1200->89|1237->118|1276->120|1314->132|1892->683|1940->715|1980->717|2029->738|2090->772|2100->773|2136->788|2221->842
                  LINES: 28->1|33->2|36->5|37->6|37->6|37->6|40->9|62->31|62->31|62->31|63->32|64->33|64->33|64->33|67->36
                  -- GENERATED --
              */
          