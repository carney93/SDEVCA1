
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.Login],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.users.Login],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](_display_(/*3.2*/main("Login",user)/*3.20*/{_display_(Seq[Any](format.raw/*3.21*/("""
     
 
        """),format.raw/*6.9*/("""<!-- Main -->  
      
      <div class= container-fluid padding>
          <div class="login">
              <h1> Welcome to the Account Sign In Page</h1>
              
               <!-- Display login errors if there are any-->
    """),_display_(/*13.6*/if(loginForm.hasGlobalErrors)/*13.35*/ {_display_(Seq[Any](format.raw/*13.37*/("""
        """),format.raw/*14.9*/("""<p class="alert alert-warning">
            """),_display_(/*15.14*/for(e <- loginForm.globalErrors) yield /*15.46*/ {_display_(Seq[Any](format.raw/*15.48*/("""
                """),_display_(/*16.18*/e/*16.19*/.message),format.raw/*16.27*/("""<br/>
            """)))}),format.raw/*17.14*/("""
        """),format.raw/*18.9*/("""</p>
    """)))}),format.raw/*19.6*/("""
              """),format.raw/*20.67*/("""
	"""),_display_(/*21.3*/if(flash.containsKey("error"))/*21.33*/ {_display_(Seq[Any](format.raw/*21.35*/("""
		"""),format.raw/*22.3*/("""<div class="alert alert-success">
			"""),_display_(/*23.5*/flash/*23.10*/.get("error")),format.raw/*23.23*/("""
		"""),format.raw/*24.3*/("""</div>
	""")))}),format.raw/*25.3*/("""
              
               """),format.raw/*27.16*/("""<!-- The login form-->
    """),_display_(/*28.6*/helper/*28.12*/.form(action = controllers.routes.LoginController.loginSubmit())/*28.76*/ {_display_(Seq[Any](format.raw/*28.78*/("""
        """),format.raw/*29.37*/("""
        """),format.raw/*31.84*/("""
        """),_display_(/*32.10*/CSRF/*32.14*/.formField),format.raw/*32.24*/("""
              
         """),format.raw/*34.10*/("""<div class="row">
              <div class="col-md-5">
                <form>
  <div class="form-group">
      <h4>Login</h4>
      """),_display_(/*39.8*/inputText(loginForm("email"), '_label -> "", 
            'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*40.72*/("""
  """),format.raw/*41.3*/("""</div>
  <div class="form-group">
                """),_display_(/*43.18*/inputPassword(loginForm("password"), '_label -> "", 
            'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*44.75*/("""
  """),format.raw/*45.3*/("""</div>
  <button type="submit" class="btn btn-primary">Login</button>
</form>  """)))}),format.raw/*47.11*/(""" """),format.raw/*47.29*/("""

              """),format.raw/*49.15*/("""</div>
         
              </div>
          </div>  
      </div>
      
""")))}))
      }
    }
  }

  def render(loginForm:Form[models.users.Login],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,user)

  def f:((Form[models.users.Login],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,user) => apply(loginForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Mar 12 18:15:00 GMT 2019
                  SOURCE: /Users/Graham/Desktop/CA1SDEV/app/views/login.scala.html
                  HASH: 34c1fafe43d9580a77ef999a1b50f8a5672b1f06
                  MATRIX: 984->1|1118->64|1162->81|1188->99|1226->100|1269->117|1532->354|1570->383|1610->385|1646->394|1718->439|1766->471|1806->473|1851->491|1861->492|1890->500|1940->519|1976->528|2016->538|2059->605|2088->608|2127->638|2167->640|2197->643|2261->681|2275->686|2309->699|2339->702|2378->711|2437->742|2491->770|2506->776|2579->840|2619->842|2656->879|2693->1040|2730->1050|2743->1054|2774->1064|2827->1089|2986->1222|3124->1339|3154->1342|3232->1393|3380->1520|3410->1523|3521->1603|3550->1621|3594->1637
                  LINES: 28->1|31->2|34->3|34->3|34->3|37->6|44->13|44->13|44->13|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|49->18|50->19|51->20|52->21|52->21|52->21|53->22|54->23|54->23|54->23|55->24|56->25|58->27|59->28|59->28|59->28|59->28|60->29|61->31|62->32|62->32|62->32|64->34|69->39|70->40|71->41|73->43|74->44|75->45|77->47|77->47|79->49
                  -- GENERATED --
              */
          