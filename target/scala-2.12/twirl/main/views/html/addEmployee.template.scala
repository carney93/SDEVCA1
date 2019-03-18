
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

object addEmployee extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.Employee],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(addEmployee: Form[models.users.Employee],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](_display_(/*3.2*/main("Add Employee", user)/*3.28*/{_display_(Seq[Any](format.raw/*3.29*/("""
 

        """),format.raw/*6.9*/("""<!-- Main -->   

    
      <div class= container-fluid padding>
          <div class="addEmployee">
              <h1>Add a new Employee</h1>
              
         <div class="row">
              <div class="col-md-5">
                  
"""),_display_(/*16.2*/form(action=routes.HomeController.addEmployeeSubmit(), 'class -> "form-horizontal", 'role -> "form")/*16.102*/ {_display_(Seq[Any](format.raw/*16.104*/("""
          """),format.raw/*17.39*/("""
        """),format.raw/*18.99*/("""
        """),_display_(/*19.10*/CSRF/*19.14*/.formField),format.raw/*19.24*/("""
                
                
            """),_display_(/*22.14*/inputText(addEmployee("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*22.91*/("""
            """),_display_(/*23.14*/inputText(addEmployee("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*23.89*/("""
            """),_display_(/*24.14*/inputDate(addEmployee("dateOfBirth"), args = 'size -> 10, '_label -> "Date Of Birth", 'class -> "form-control")),format.raw/*24.125*/("""     
            """),_display_(/*25.14*/inputText(addEmployee("role").copy(value=Some("employee")), '_label -> "",'hidden -> "hidden")),format.raw/*25.108*/("""
            """),_display_(/*26.14*/inputText(addEmployee("jobTitle"), '_label -> "jobtitle", 'class -> "form-control")),format.raw/*26.97*/("""
                  """),_display_(/*27.20*/select(
                    addEmployee("department.id"),
                    options(Department.options),
                     '_label -> "Department", '_default -> "-- Choose a department --", 
                '_showConstraints -> false, 'class -> "form-control"
            
                  )),format.raw/*33.20*/("""
                  
  
                  
                       """),format.raw/*37.24*/("""<p><strong>Projects</strong></p>
            """),_display_(/*38.14*/for((value, name) <- Project.options) yield /*38.51*/ {_display_(Seq[Any](format.raw/*38.53*/("""
                """),format.raw/*39.17*/("""<input type="checkbox" name="projectSelect[]" value=""""),_display_(/*39.71*/value),format.raw/*39.76*/(""""  
                    """),_display_(/*40.22*/if(addEmployee("id").getValue.isPresent && addEmployee("id").getValue.get != "")/*40.102*/ {_display_(Seq[Any](format.raw/*40.104*/(""" 
                        """),_display_(/*41.26*/if(Project.inProject(value.toLong, addEmployee("id").getValue.get.toLong))/*41.100*/ {_display_(Seq[Any](format.raw/*41.102*/("""
                            """),format.raw/*42.29*/("""checked
                        """)))}),format.raw/*43.26*/("""
                    """)))}),format.raw/*44.22*/(""" 
                """),format.raw/*45.17*/("""/> """),_display_(/*45.21*/name),format.raw/*45.25*/(""" """),format.raw/*45.26*/("""</br>
            """)))}),format.raw/*46.14*/("""
            """),format.raw/*47.13*/("""<p></p>
                  

            """),_display_(/*50.14*/inputText(addEmployee("Address.street"), '_label -> "Enter Street", 'class -> "form-control")),format.raw/*50.107*/("""
                  """),_display_(/*51.20*/inputText(addEmployee("Address.town"), '_label -> "Enter town", 'class -> "form-control")),format.raw/*51.109*/("""
                  """),_display_(/*52.20*/inputText(addEmployee("Address.county"), '_label -> "Enter county", 'class -> "form-control")),format.raw/*52.113*/("""
             

            """),_display_(/*55.14*/inputText(addEmployee("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*55.97*/("""
             
             """),_display_(/*57.15*/inputText(addEmployee("email"), '_label -> "", 'hidden -> "hidden")),format.raw/*57.82*/("""

          

    

"""),format.raw/*63.1*/("""<div class="actions">
                <input type="submit" value="Add/Update Admin" class="btn btn-primary">
                <a href=""""),_display_(/*65.27*/routes/*65.33*/.HomeController.addEmployeeSubmit()),format.raw/*65.68*/("""">
                    <button type="button" class="btn btn-warning">Cancel</button>
                </a>
            </div>
                  """)))}),format.raw/*69.20*/(""" """),format.raw/*69.38*/("""

              """),format.raw/*71.15*/("""</div>
   
              </div>
          </div>  
      </div>
   
     """)))}))
      }
    }
  }

  def render(addEmployee:Form[models.users.Employee],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(addEmployee,user)

  def f:((Form[models.users.Employee],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (addEmployee,user) => apply(addEmployee,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 01:26:37 GMT 2019
                  SOURCE: /Users/Graham/Desktop/CA1SDEV/app/views/addEmployee.scala.html
                  HASH: 8ef7c846bac04ed6d4570401e7e7119ef7abbcba
                  MATRIX: 993->1|1132->69|1176->89|1210->115|1248->116|1286->128|1555->371|1665->471|1706->473|1745->512|1782->611|1819->621|1832->625|1863->635|1938->683|2036->760|2077->774|2173->849|2214->863|2347->974|2393->993|2509->1087|2550->1101|2654->1184|2701->1204|3019->1501|3112->1566|3185->1612|3238->1649|3278->1651|3323->1668|3404->1722|3430->1727|3482->1752|3572->1832|3613->1834|3667->1861|3751->1935|3792->1937|3849->1966|3913->1999|3966->2021|4012->2039|4043->2043|4068->2047|4097->2048|4147->2067|4188->2080|4256->2121|4371->2214|4418->2234|4529->2323|4576->2343|4691->2436|4747->2465|4851->2548|4907->2577|4995->2644|5042->2664|5204->2799|5219->2805|5275->2840|5450->2984|5479->3002|5523->3018
                  LINES: 28->1|31->2|34->3|34->3|34->3|37->6|47->16|47->16|47->16|48->17|49->18|50->19|50->19|50->19|53->22|53->22|54->23|54->23|55->24|55->24|56->25|56->25|57->26|57->26|58->27|64->33|68->37|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|71->40|72->41|72->41|72->41|73->42|74->43|75->44|76->45|76->45|76->45|76->45|77->46|78->47|81->50|81->50|82->51|82->51|83->52|83->52|86->55|86->55|88->57|88->57|94->63|96->65|96->65|96->65|100->69|100->69|102->71
                  -- GENERATED --
              */
          