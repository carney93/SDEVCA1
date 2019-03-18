
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Home",user)/*2.19*/{_display_(Seq[Any](format.raw/*2.20*/("""
     
      
      """),format.raw/*5.7*/("""<!-- Jumbotron -->

<div class="jumbotron jumbotron-fluid">
  <div class="container">
    <h1 class="display-3">CodeDogs</h1>
    <p class="lead">Project Management</p>
  </div>
</div>
 
        <!-- About Us -->                                              
    <div class= container-fluid padding> 
        <div id ="aboutus">
        <div class="row text-center">
            <div class="col-12">
                <h1 class ="display-4">About Us</h1>
           <hr>
                <div class"col-12">
                <p class="about">Welcome to the Code Dogs Project management site built for our employees.
                <br> From this website our managers can view what projects employees are currently working on and what department they are in. They can also make any changes necessary. <br>It is also for employees to check their current projects. Please login into your account to view this information.
                    </p>
                    </div>
                </div>
            
     
        </div>
      
      </div>
      </div>
      
    """)))}))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 17 19:17:22 GMT 2019
                  SOURCE: /Users/Graham/Desktop/CA1SDEV/app/views/index.scala.html
                  HASH: 343749862a108fef71cc3024e75d309667d11a0b
                  MATRIX: 959->1|1078->28|1103->45|1141->46|1187->66
                  LINES: 28->1|33->2|33->2|33->2|36->5
                  -- GENERATED --
              */
          