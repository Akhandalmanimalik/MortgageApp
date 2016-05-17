
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(message:String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*2.18*/("""
"""),format.raw/*3.1*/("""<html ng-app="app">
<head>
  <title>ngSignaturePad demo</title>
  <meta charset="utf-8" />
</head>
<body>
  <canvas ng-signature-pad="signature"></canvas>
  <pre ng-bind="signature | json"></pre>
  <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.8/angular.min.js"></script>
  <script src="https://cdn.rawgit.com/szimek/signature_pad/master/signature_pad.js"></script>
  <script src="https://cdn.rawgit.com/ecentinela/ng-signature-pad/master/dist/ng-signature-pad.js"></script>
  <script>
    angular.module('app', ['ngSignaturePad']);
  </script>
  """),format.raw/*17.3*/("""{"""),format.raw/*17.4*/("""{"""),format.raw/*17.5*/("""signature"""),format.raw/*17.14*/("""}"""),format.raw/*17.15*/("""}"""),format.raw/*17.16*/("""
"""),format.raw/*18.1*/("""</body>
</html>"""))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon May 16 20:16:15 IST 2016
                  SOURCE: /home/manoj/projects/Testing/formsPlayApp/app/views/index.scala.html
                  HASH: 836408dff466727d242061192f271867a8cce24e
                  MATRIX: 723->2|827->18|854->19|1447->585|1475->586|1503->587|1540->596|1569->597|1598->598|1626->599
                  LINES: 26->2|29->2|30->3|44->17|44->17|44->17|44->17|44->17|44->17|45->18
                  -- GENERATED --
              */
          