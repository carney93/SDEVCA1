
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pagename: String, user: models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
      
      <!-- CSS -->
      <link rel="stylesheet" media="screen" href=""""),_display_(/*13.52*/routes/*13.58*/.Assets.versioned("stylesheets/styles.css")),format.raw/*13.101*/("""">
      
      <!-- Font Awesome -->
      <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.1/css/all.css" integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr" crossorigin="anonymous">

    <title>CodeDogs</title>
  </head>
  <body>
  
      <!-- Navbar -->
      <nav class="navbar my-nav fixed-top navbar-expand-lg">
  <a class="navbar-brand" href=""""),_display_(/*24.34*/routes/*24.40*/.HomeController.index()),format.raw/*24.63*/("""">
          <img src=""""),_display_(/*25.22*/routes/*25.28*/.Assets.versioned("images/logo.png")),format.raw/*25.64*/("""" alt="Company Logo" img id ="brand-img"/></a>
  
          <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon">
      </span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item">
        <a class="nav-link" href=""""),_display_(/*35.36*/routes/*35.42*/.HomeController.index()),format.raw/*35.65*/("""#aboutus">Info</a>
          
      </li>
        <li class="nav-item">
            """),_display_(/*39.14*/if((user != null) && ("manager".equals(user.getRole())))/*39.70*/ {_display_(Seq[Any](format.raw/*39.72*/("""
        """),format.raw/*40.9*/("""<a class="nav-link" href=""""),_display_(/*40.36*/routes/*40.42*/.HomeController.employees()),format.raw/*40.69*/("""">View Employees</a>
            """)))}),format.raw/*41.14*/("""
      """),format.raw/*42.7*/("""</li>
         <li class="nav-item">
            """),_display_(/*44.14*/if((user != null) && ("manager".equals(user.getRole())))/*44.70*/ {_display_(Seq[Any](format.raw/*44.72*/("""
        """),format.raw/*45.9*/("""<a class="nav-link" href=""""),_display_(/*45.36*/routes/*45.42*/.HomeController.projects()),format.raw/*45.68*/("""">View Employee Projects</a>
            """)))}),format.raw/*46.14*/("""
             """),_display_(/*47.15*/if((user != null) && ("employee".equals(user.getRole())))/*47.72*/ {_display_(Seq[Any](format.raw/*47.74*/("""
					"""),format.raw/*48.6*/("""<a class="nav-link" href=""""),_display_(/*48.33*/routes/*48.39*/.HomeController.myProjects()),format.raw/*48.67*/("""">View My Projects</a>
				""")))}),format.raw/*49.6*/("""	
      """),format.raw/*50.7*/("""</li>
         <li class="nav-item">
            """),_display_(/*52.14*/if((user != null) && ("manager".equals(user.getRole())))/*52.70*/ {_display_(Seq[Any](format.raw/*52.72*/("""
        """),format.raw/*53.9*/("""<a class="nav-link" href=""""),_display_(/*53.36*/routes/*53.42*/.HomeController.viewProjectsSite()),format.raw/*53.76*/("""">View Projects</a>
            """)))}),format.raw/*54.14*/("""
      """),format.raw/*55.7*/("""</li>
         <li class="nav-item">
             """),_display_(/*57.15*/if((user != null) && ("employee".equals(user.getRole())))/*57.72*/ {_display_(Seq[Any](format.raw/*57.74*/("""
        """),format.raw/*58.9*/("""<a class="nav-link" href=""""),_display_(/*58.36*/routes/*58.42*/.HomeController.account()),format.raw/*58.67*/("""">My Account</a>     
             """)))}),format.raw/*59.15*/("""
      """),format.raw/*60.7*/("""</li>
      
    </ul> 
            <ul class="navbar-nav ml-auto">
       <li class="nav-item">
				"""),_display_(/*65.6*/if(user != null)/*65.22*/ {_display_(Seq[Any](format.raw/*65.24*/("""
					"""),format.raw/*66.6*/("""<a class="nav-link" href=""""),_display_(/*66.33*/routes/*66.39*/.LoginController.logout()),format.raw/*66.64*/("""">Log Out</a>
				""")))}/*67.7*/else/*67.12*/{_display_(Seq[Any](format.raw/*67.13*/("""
					"""),format.raw/*68.6*/("""<a class="nav-link" href=""""),_display_(/*68.33*/routes/*68.39*/.LoginController.login()),format.raw/*68.63*/("""">Log In</a>
				""")))}),format.raw/*69.6*/("""					
			"""),format.raw/*70.4*/("""</li>
    </ul> 

  </div>
          
</nav>
     
      
      <!-- Main -->

"""),_display_(/*80.2*/content),format.raw/*80.9*/("""
      
      """),format.raw/*82.7*/("""<!-- Footer -->
      <footer>
          <div class= container-fluid padding> 
          <div class="row text-center">
              <div class="col-4">
              <hr>
                  <h4>Opening Times</h4>
                <hr>
                  <p>Monday - Friday: 09:00 - 18:00</p>
                  <p>Saturday - Sunday: Closed</p>
              </div> 
             
           
              <div class="col-4">
              <hr>
                  <h4>Address</h4>
                <hr>
                  <p>South County Business Park</p>
                  <p>Dublin 18</p>
                  <p>Ireland</p>
                  </div>
              
              
               <div class="col-4">
              <hr>
                  <h4>Contact Us</h4>
                <hr>
                  <p>01-463333</p>
                  <p>codedogs.gmail.com</p>
                  </div>  
              
              <div class="col-12">
            <span class="footer-copyright-line">
              <hr>
                  </span>
                <h3>©CodeDogs.com</h3>
              </div>
                </div>
          </div>
          
      
          
      
      
      </footer>
      
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
  </body>
</html>
"""))
      }
    }
  }

  def render(pagename:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(pagename,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (pagename,user) => (content) => apply(pagename,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 16:20:04 GMT 2019
                  SOURCE: /Users/Graham/Desktop/CA1SDEV/app/views/main.scala.html
                  HASH: 193b976a0857ada2fbe5fe3ac9c1e9e779baa845
                  MATRIX: 970->1|1122->60|1662->573|1677->579|1742->622|2175->1028|2190->1034|2234->1057|2285->1081|2300->1087|2357->1123|2877->1616|2892->1622|2936->1645|3048->1730|3113->1786|3153->1788|3189->1797|3243->1824|3258->1830|3306->1857|3371->1891|3405->1898|3482->1948|3547->2004|3587->2006|3623->2015|3677->2042|3692->2048|3739->2074|3812->2116|3854->2131|3920->2188|3960->2190|3993->2196|4047->2223|4062->2229|4111->2257|4169->2285|4204->2293|4281->2343|4346->2399|4386->2401|4422->2410|4476->2437|4491->2443|4546->2477|4610->2510|4644->2517|4722->2568|4788->2625|4828->2627|4864->2636|4918->2663|4933->2669|4979->2694|5046->2730|5080->2737|5208->2839|5233->2855|5273->2857|5306->2863|5360->2890|5375->2896|5421->2921|5458->2941|5471->2946|5510->2947|5543->2953|5597->2980|5612->2986|5657->3010|5705->3028|5741->3037|5847->3117|5874->3124|5915->3138
                  LINES: 28->1|33->2|44->13|44->13|44->13|55->24|55->24|55->24|56->25|56->25|56->25|66->35|66->35|66->35|70->39|70->39|70->39|71->40|71->40|71->40|71->40|72->41|73->42|75->44|75->44|75->44|76->45|76->45|76->45|76->45|77->46|78->47|78->47|78->47|79->48|79->48|79->48|79->48|80->49|81->50|83->52|83->52|83->52|84->53|84->53|84->53|84->53|85->54|86->55|88->57|88->57|88->57|89->58|89->58|89->58|89->58|90->59|91->60|96->65|96->65|96->65|97->66|97->66|97->66|97->66|98->67|98->67|98->67|99->68|99->68|99->68|99->68|100->69|101->70|111->80|111->80|113->82
                  -- GENERATED --
              */
          