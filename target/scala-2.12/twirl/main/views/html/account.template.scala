
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

object account extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.Employee,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employee: models.users.Employee):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""     


"""),format.raw/*5.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*6.2*/main("My Account", employee)/*6.30*/ {_display_(Seq[Any](format.raw/*6.32*/("""

 
        """),format.raw/*9.9*/("""<!-- Main -->  
      
      <div class= container-fluid padding>
          <div class="account">
              <h1> Welcome to your account</h1>
              
              
         <div class="row">
              <div class="col-md-5">
     
        
        <h2> My Info</h2>
            <h4>Email: """),_display_(/*21.25*/employee/*21.33*/.getEmail),format.raw/*21.42*/("""</h4>
            <h4>Name: """),_display_(/*22.24*/employee/*22.32*/.getName),format.raw/*22.40*/(""" """),format.raw/*22.41*/("""</h4>
            <h4>DOB: """),_display_(/*23.23*/employee/*23.31*/.getDateOfBirth),format.raw/*23.46*/("""</h4>
            <h4>Department: """),_display_(/*24.30*/employee/*24.38*/.getDepartment.getName),format.raw/*24.60*/("""</h4>
            <h4>Job Title: """),_display_(/*25.29*/employee/*25.37*/.getJobTitle),format.raw/*25.49*/("""</h4>
        
     
			
       


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
                  DATE: Mon Mar 18 16:18:03 GMT 2019
                  SOURCE: /Users/Graham/Desktop/CA1SDEV/app/views/account.scala.html
                  HASH: c22af5af6b176980561f3ad0b66d348ba8d4ee10
                  MATRIX: 965->1|1092->35|1126->43|1197->89|1233->117|1272->119|1310->131|1642->436|1659->444|1689->453|1745->482|1762->490|1791->498|1820->499|1875->527|1892->535|1928->550|1990->585|2007->593|2050->615|2111->649|2128->657|2161->669
                  LINES: 28->1|33->2|36->5|37->6|37->6|37->6|40->9|52->21|52->21|52->21|53->22|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25
                  -- GENERATED --
              */
          