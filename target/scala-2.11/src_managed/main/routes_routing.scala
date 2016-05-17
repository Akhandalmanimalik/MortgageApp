// @SOURCE:/home/manoj/projects/Testing/formsPlayApp/conf/routes
// @HASH:4b2027adc5e049c269f198f5ccc4fa8f1e33da90
// @DATE:Mon May 16 20:16:13 IST 2016


import scala.language.reflectiveCalls
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String): Unit = {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:9
private[this] lazy val controllers_Assets_at1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at1_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        

// @LINE:15
private[this] lazy val controllers_SubmitReferral_indexNotVedio2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("clientref"))))
private[this] lazy val controllers_SubmitReferral_indexNotVedio2_invoker = createInvoker(
controllers.SubmitReferral.indexNotVedio(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.SubmitReferral", "indexNotVedio", Nil,"GET", """""", Routes.prefix + """clientref"""))
        

// @LINE:17
private[this] lazy val controllers_SubmitReferral_indexV3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("clientrefV"))))
private[this] lazy val controllers_SubmitReferral_indexV3_invoker = createInvoker(
controllers.SubmitReferral.indexV(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.SubmitReferral", "indexV", Nil,"GET", """""", Routes.prefix + """clientrefV"""))
        

// @LINE:19
private[this] lazy val controllers_SubmitReferral_submitReferral4_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("leadcreation"))))
private[this] lazy val controllers_SubmitReferral_submitReferral4_invoker = createInvoker(
controllers.SubmitReferral.submitReferral(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.SubmitReferral", "submitReferral", Nil,"POST", """""", Routes.prefix + """leadcreation"""))
        

// @LINE:22
private[this] lazy val controllers_SubmitReferral_submitReferral5_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("leadcreationV"))))
private[this] lazy val controllers_SubmitReferral_submitReferral5_invoker = createInvoker(
controllers.SubmitReferral.submitReferral(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.SubmitReferral", "submitReferral", Nil,"POST", """""", Routes.prefix + """leadcreationV"""))
        

// @LINE:29
private[this] lazy val controllers_VisdomReferral_referral6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("referral"))))
private[this] lazy val controllers_VisdomReferral_referral6_invoker = createInvoker(
controllers.VisdomReferral.referral(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.VisdomReferral", "referral", Nil,"GET", """""", Routes.prefix + """referral"""))
        

// @LINE:31
private[this] lazy val controllers_VisdomReferral_referralV7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("referralV"))))
private[this] lazy val controllers_VisdomReferral_referralV7_invoker = createInvoker(
controllers.VisdomReferral.referralV(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.VisdomReferral", "referralV", Nil,"GET", """""", Routes.prefix + """referralV"""))
        

// @LINE:33
private[this] lazy val controllers_VisdomReferral_wfg8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("wfg"))))
private[this] lazy val controllers_VisdomReferral_wfg8_invoker = createInvoker(
controllers.VisdomReferral.wfg(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.VisdomReferral", "wfg", Nil,"GET", """""", Routes.prefix + """wfg"""))
        

// @LINE:34
private[this] lazy val controllers_VisdomReferral_wfgV9_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("wfgv"))))
private[this] lazy val controllers_VisdomReferral_wfgV9_invoker = createInvoker(
controllers.VisdomReferral.wfgV(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.VisdomReferral", "wfgV", Nil,"GET", """""", Routes.prefix + """wfgv"""))
        

// @LINE:36
private[this] lazy val controllers_VisdomReferral_realtor10_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("realtor"))))
private[this] lazy val controllers_VisdomReferral_realtor10_invoker = createInvoker(
controllers.VisdomReferral.realtor(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.VisdomReferral", "realtor", Nil,"GET", """""", Routes.prefix + """realtor"""))
        

// @LINE:38
private[this] lazy val controllers_VisdomReferral_realtorV11_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("realtorV"))))
private[this] lazy val controllers_VisdomReferral_realtorV11_invoker = createInvoker(
controllers.VisdomReferral.realtorV(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.VisdomReferral", "realtorV", Nil,"GET", """""", Routes.prefix + """realtorV"""))
        

// @LINE:40
private[this] lazy val controllers_VisdomReferral_professional12_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("professional"))))
private[this] lazy val controllers_VisdomReferral_professional12_invoker = createInvoker(
controllers.VisdomReferral.professional(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.VisdomReferral", "professional", Nil,"GET", """""", Routes.prefix + """professional"""))
        

// @LINE:42
private[this] lazy val controllers_VisdomReferral_professionalV13_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("professionalV"))))
private[this] lazy val controllers_VisdomReferral_professionalV13_invoker = createInvoker(
controllers.VisdomReferral.professionalV(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.VisdomReferral", "professionalV", Nil,"GET", """""", Routes.prefix + """professionalV"""))
        

// @LINE:44
private[this] lazy val controllers_VisdomReferral_planner14_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("planner"))))
private[this] lazy val controllers_VisdomReferral_planner14_invoker = createInvoker(
controllers.VisdomReferral.planner(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.VisdomReferral", "planner", Nil,"GET", """""", Routes.prefix + """planner"""))
        

// @LINE:46
private[this] lazy val controllers_VisdomReferral_plannerV15_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("plannerV"))))
private[this] lazy val controllers_VisdomReferral_plannerV15_invoker = createInvoker(
controllers.VisdomReferral.plannerV(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.VisdomReferral", "plannerV", Nil,"GET", """""", Routes.prefix + """plannerV"""))
        

// @LINE:48
private[this] lazy val controllers_VisdomReferral_client16_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("client"))))
private[this] lazy val controllers_VisdomReferral_client16_invoker = createInvoker(
controllers.VisdomReferral.client(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.VisdomReferral", "client", Nil,"GET", """""", Routes.prefix + """client"""))
        

// @LINE:50
private[this] lazy val controllers_VisdomReferral_clientV17_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("clientV"))))
private[this] lazy val controllers_VisdomReferral_clientV17_invoker = createInvoker(
controllers.VisdomReferral.clientV(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.VisdomReferral", "clientV", Nil,"GET", """""", Routes.prefix + """clientV"""))
        

// @LINE:53
private[this] lazy val controllers_VisdomReferral_visdomReferral18_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("referal1"))))
private[this] lazy val controllers_VisdomReferral_visdomReferral18_invoker = createInvoker(
controllers.VisdomReferral.visdomReferral(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.VisdomReferral", "visdomReferral", Nil,"POST", """""", Routes.prefix + """referal1"""))
        

// @LINE:54
private[this] lazy val controllers_VisdomReferral_visdomReferralForm219_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("referral2"))))
private[this] lazy val controllers_VisdomReferral_visdomReferralForm219_invoker = createInvoker(
controllers.VisdomReferral.visdomReferralForm2(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.VisdomReferral", "visdomReferralForm2", Nil,"POST", """""", Routes.prefix + """referral2"""))
        

// @LINE:57
private[this] lazy val controllers_VisdomReferral_wfg120_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("wfg1"))))
private[this] lazy val controllers_VisdomReferral_wfg120_invoker = createInvoker(
controllers.VisdomReferral.wfg1(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.VisdomReferral", "wfg1", Nil,"POST", """""", Routes.prefix + """wfg1"""))
        

// @LINE:59
private[this] lazy val controllers_VisdomReferral_wfg221_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("wfg2"))))
private[this] lazy val controllers_VisdomReferral_wfg221_invoker = createInvoker(
controllers.VisdomReferral.wfg2(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.VisdomReferral", "wfg2", Nil,"POST", """""", Routes.prefix + """wfg2"""))
        

// @LINE:64
private[this] lazy val controllers_VisdomReferral_bookmark22_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bookmark"))))
private[this] lazy val controllers_VisdomReferral_bookmark22_invoker = createInvoker(
controllers.VisdomReferral.bookmark(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.VisdomReferral", "bookmark", Nil,"GET", """""", Routes.prefix + """bookmark"""))
        

// @LINE:69
private[this] lazy val controllers_Mortgage_mortgageApplication23_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mortgagePage1"))))
private[this] lazy val controllers_Mortgage_mortgageApplication23_invoker = createInvoker(
controllers.Mortgage.mortgageApplication(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgageApplication", Nil,"GET", """""", Routes.prefix + """mortgagePage1"""))
        

// @LINE:70
private[this] lazy val controllers_Mortgage_mortgagePage1a24_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mortgagePage1a"))))
private[this] lazy val controllers_Mortgage_mortgagePage1a24_invoker = createInvoker(
controllers.Mortgage.mortgagePage1a(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgagePage1a", Nil,"POST", """""", Routes.prefix + """mortgagePage1a"""))
        

// @LINE:71
private[this] lazy val controllers_Mortgage_mortgagePage1b25_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mortgagePage1b"))))
private[this] lazy val controllers_Mortgage_mortgagePage1b25_invoker = createInvoker(
controllers.Mortgage.mortgagePage1b(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgagePage1b", Nil,"POST", """""", Routes.prefix + """mortgagePage1b"""))
        

// @LINE:72
private[this] lazy val controllers_Mortgage_mortgagePage226_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mortgagePage2"))))
private[this] lazy val controllers_Mortgage_mortgagePage226_invoker = createInvoker(
controllers.Mortgage.mortgagePage2(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgagePage2", Nil,"POST", """""", Routes.prefix + """mortgagePage2"""))
        

// @LINE:73
private[this] lazy val controllers_Mortgage_mortgagePage2Pre27_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mortgagePage2Pre"))))
private[this] lazy val controllers_Mortgage_mortgagePage2Pre27_invoker = createInvoker(
controllers.Mortgage.mortgagePage2Pre(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgagePage2Pre", Nil,"POST", """""", Routes.prefix + """mortgagePage2Pre"""))
        

// @LINE:74
private[this] lazy val controllers_Mortgage_mortgagePage2Pur28_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mortgagePage2Pur"))))
private[this] lazy val controllers_Mortgage_mortgagePage2Pur28_invoker = createInvoker(
controllers.Mortgage.mortgagePage2Pur(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgagePage2Pur", Nil,"POST", """""", Routes.prefix + """mortgagePage2Pur"""))
        

// @LINE:75
private[this] lazy val controllers_Mortgage_mortgagePage2Ref29_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mortgagePage2Ref"))))
private[this] lazy val controllers_Mortgage_mortgagePage2Ref29_invoker = createInvoker(
controllers.Mortgage.mortgagePage2Ref(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgagePage2Ref", Nil,"POST", """""", Routes.prefix + """mortgagePage2Ref"""))
        

// @LINE:76
private[this] lazy val controllers_Mortgage_mortgagePage330_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mortgagePage3"))))
private[this] lazy val controllers_Mortgage_mortgagePage330_invoker = createInvoker(
controllers.Mortgage.mortgagePage3(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgagePage3", Nil,"POST", """""", Routes.prefix + """mortgagePage3"""))
        

// @LINE:77
private[this] lazy val controllers_Mortgage_mortgagePage431_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mortgagePage4"))))
private[this] lazy val controllers_Mortgage_mortgagePage431_invoker = createInvoker(
controllers.Mortgage.mortgagePage4(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgagePage4", Nil,"POST", """""", Routes.prefix + """mortgagePage4"""))
        

// @LINE:78
private[this] lazy val controllers_Mortgage_mortgagePage5a32_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mortgagePage5a"))))
private[this] lazy val controllers_Mortgage_mortgagePage5a32_invoker = createInvoker(
controllers.Mortgage.mortgagePage5a(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgagePage5a", Nil,"POST", """""", Routes.prefix + """mortgagePage5a"""))
        

// @LINE:79
private[this] lazy val controllers_Mortgage_mortgagePage5b33_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mortgagePage5b"))))
private[this] lazy val controllers_Mortgage_mortgagePage5b33_invoker = createInvoker(
controllers.Mortgage.mortgagePage5b(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgagePage5b", Nil,"POST", """""", Routes.prefix + """mortgagePage5b"""))
        

// @LINE:80
private[this] lazy val controllers_Mortgage_mortgagePage634_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mortgagePage6"))))
private[this] lazy val controllers_Mortgage_mortgagePage634_invoker = createInvoker(
controllers.Mortgage.mortgagePage6(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgagePage6", Nil,"POST", """""", Routes.prefix + """mortgagePage6"""))
        

// @LINE:81
private[this] lazy val controllers_Mortgage_mortgagePage735_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mortgagePage7"))))
private[this] lazy val controllers_Mortgage_mortgagePage735_invoker = createInvoker(
controllers.Mortgage.mortgagePage7(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgagePage7", Nil,"POST", """""", Routes.prefix + """mortgagePage7"""))
        

// @LINE:82
private[this] lazy val controllers_Mortgage_mortgagePage7a36_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mortgagePage7a"))))
private[this] lazy val controllers_Mortgage_mortgagePage7a36_invoker = createInvoker(
controllers.Mortgage.mortgagePage7a(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgagePage7a", Nil,"POST", """""", Routes.prefix + """mortgagePage7a"""))
        

// @LINE:83
private[this] lazy val controllers_Mortgage_mortgagePage7b37_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mortgagePage7b"))))
private[this] lazy val controllers_Mortgage_mortgagePage7b37_invoker = createInvoker(
controllers.Mortgage.mortgagePage7b(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgagePage7b", Nil,"POST", """""", Routes.prefix + """mortgagePage7b"""))
        

// @LINE:84
private[this] lazy val controllers_Mortgage_mortgageSuplementaryIncomeA38_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mortgageSupplA"))))
private[this] lazy val controllers_Mortgage_mortgageSuplementaryIncomeA38_invoker = createInvoker(
controllers.Mortgage.mortgageSuplementaryIncomeA(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgageSuplementaryIncomeA", Nil,"POST", """""", Routes.prefix + """mortgageSupplA"""))
        

// @LINE:86
private[this] lazy val controllers_Mortgage_mortgagePage10Assets39_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mortgagePage10"))))
private[this] lazy val controllers_Mortgage_mortgagePage10Assets39_invoker = createInvoker(
controllers.Mortgage.mortgagePage10Assets(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgagePage10Assets", Nil,"POST", """POST /mortgagePage8     		controllers.Mortgage.mortgagePage8()""", Routes.prefix + """mortgagePage10"""))
        

// @LINE:87
private[this] lazy val controllers_Mortgage_mortgagePage11Properties40_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mortgagePage11"))))
private[this] lazy val controllers_Mortgage_mortgagePage11Properties40_invoker = createInvoker(
controllers.Mortgage.mortgagePage11Properties(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgagePage11Properties", Nil,"POST", """""", Routes.prefix + """mortgagePage11"""))
        

// @LINE:91
private[this] lazy val controllers_Mortgage_mortgagePage1241_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mortgagePage12"))))
private[this] lazy val controllers_Mortgage_mortgagePage1241_invoker = createInvoker(
controllers.Mortgage.mortgagePage12(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgagePage12", Nil,"POST", """POST /mortgagePage6a     		controllers.Mortgage.mortgagePage6a()
POST /mortgagePage6b     		controllers.Mortgage.mortgagePage6b()
POST /mortgagePage9 	    	controllers.Mortgage.mortgagePage9()""", Routes.prefix + """mortgagePage12"""))
        

// @LINE:92
private[this] lazy val controllers_Mortgage_privacyPolice42_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("privacyPolice"))))
private[this] lazy val controllers_Mortgage_privacyPolice42_invoker = createInvoker(
controllers.Mortgage.privacyPolice(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "privacyPolice", Nil,"GET", """""", Routes.prefix + """privacyPolice"""))
        

// @LINE:95
private[this] lazy val controllers_Mortgage_mortgageBackPage143_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mortgageBackPage1"))))
private[this] lazy val controllers_Mortgage_mortgageBackPage143_invoker = createInvoker(
controllers.Mortgage.mortgageBackPage1(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgageBackPage1", Nil,"GET", """Back pages""", Routes.prefix + """mortgageBackPage1"""))
        

// @LINE:96
private[this] lazy val controllers_Mortgage_mortgageBackPage244_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mortgageBackPage2"))))
private[this] lazy val controllers_Mortgage_mortgageBackPage244_invoker = createInvoker(
controllers.Mortgage.mortgageBackPage2(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgageBackPage2", Nil,"GET", """""", Routes.prefix + """mortgageBackPage2"""))
        

// @LINE:97
private[this] lazy val controllers_Mortgage_mortgageBackPage2345_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mortgageBackPage23"))))
private[this] lazy val controllers_Mortgage_mortgageBackPage2345_invoker = createInvoker(
controllers.Mortgage.mortgageBackPage23(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgageBackPage23", Nil,"GET", """""", Routes.prefix + """mortgageBackPage23"""))
        

// @LINE:98
private[this] lazy val controllers_Mortgage_mortgageBackPage446_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mortgageBackPage4"))))
private[this] lazy val controllers_Mortgage_mortgageBackPage446_invoker = createInvoker(
controllers.Mortgage.mortgageBackPage4(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgageBackPage4", Nil,"GET", """""", Routes.prefix + """mortgageBackPage4"""))
        

// @LINE:99
private[this] lazy val controllers_Mortgage_mortgageBackPage5a47_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mortgageBackPage5a"))))
private[this] lazy val controllers_Mortgage_mortgageBackPage5a47_invoker = createInvoker(
controllers.Mortgage.mortgageBackPage5a(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgageBackPage5a", Nil,"GET", """""", Routes.prefix + """mortgageBackPage5a"""))
        

// @LINE:100
private[this] lazy val controllers_Mortgage_mortgageBackPage5b48_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mortgageBackPage5b"))))
private[this] lazy val controllers_Mortgage_mortgageBackPage5b48_invoker = createInvoker(
controllers.Mortgage.mortgageBackPage5b(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgageBackPage5b", Nil,"GET", """""", Routes.prefix + """mortgageBackPage5b"""))
        

// @LINE:101
private[this] lazy val controllers_Mortgage_mortgageBackPage649_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mortgageBackPage6"))))
private[this] lazy val controllers_Mortgage_mortgageBackPage649_invoker = createInvoker(
controllers.Mortgage.mortgageBackPage6(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgageBackPage6", Nil,"GET", """""", Routes.prefix + """mortgageBackPage6"""))
        

// @LINE:102
private[this] lazy val controllers_Mortgage_mortgageBackPage750_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mortgageBackPage7"))))
private[this] lazy val controllers_Mortgage_mortgageBackPage750_invoker = createInvoker(
controllers.Mortgage.mortgageBackPage7(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgageBackPage7", Nil,"GET", """""", Routes.prefix + """mortgageBackPage7"""))
        

// @LINE:103
private[this] lazy val controllers_Mortgage_mortgageBackSuplementaryIncomeA51_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mortgageBackPageSuplA"))))
private[this] lazy val controllers_Mortgage_mortgageBackSuplementaryIncomeA51_invoker = createInvoker(
controllers.Mortgage.mortgageBackSuplementaryIncomeA(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgageBackSuplementaryIncomeA", Nil,"GET", """""", Routes.prefix + """mortgageBackPageSuplA"""))
        

// @LINE:106
private[this] lazy val controllers_Mortgage_mortgageBackPage1052_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mortgageBackPage10"))))
private[this] lazy val controllers_Mortgage_mortgageBackPage1052_invoker = createInvoker(
controllers.Mortgage.mortgageBackPage10(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgageBackPage10", Nil,"GET", """GET /mortgageBackPage9	    	controllers.Mortgage.mortgageBackPage9()
GET /mortgageBackPage89		controllers.Mortgage.mortgageBackPage89()""", Routes.prefix + """mortgageBackPage10"""))
        

// @LINE:107
private[this] lazy val controllers_Mortgage_mortgageBackPage1153_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mortgageBackPage11"))))
private[this] lazy val controllers_Mortgage_mortgageBackPage1153_invoker = createInvoker(
controllers.Mortgage.mortgageBackPage11(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgageBackPage11", Nil,"GET", """""", Routes.prefix + """mortgageBackPage11"""))
        

// @LINE:108
private[this] lazy val controllers_Mortgage_mortgageBackPage1a54_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mortgageBackPage1a"))))
private[this] lazy val controllers_Mortgage_mortgageBackPage1a54_invoker = createInvoker(
controllers.Mortgage.mortgageBackPage1a(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgageBackPage1a", Nil,"GET", """""", Routes.prefix + """mortgageBackPage1a"""))
        

// @LINE:109
private[this] lazy val controllers_Mortgage_mortgageBackPage6a55_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mortgageBackPage6a"))))
private[this] lazy val controllers_Mortgage_mortgageBackPage6a55_invoker = createInvoker(
controllers.Mortgage.mortgageBackPage6a(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgageBackPage6a", Nil,"GET", """""", Routes.prefix + """mortgageBackPage6a"""))
        

// @LINE:110
private[this] lazy val controllers_Mortgage_mortgageBackPage6b56_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mortgageBackPage6b"))))
private[this] lazy val controllers_Mortgage_mortgageBackPage6b56_invoker = createInvoker(
controllers.Mortgage.mortgageBackPage6b(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgageBackPage6b", Nil,"GET", """""", Routes.prefix + """mortgageBackPage6b"""))
        

// @LINE:111
private[this] lazy val controllers_Mortgage_mortgageBackPage7a57_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mortgageBackPage7a"))))
private[this] lazy val controllers_Mortgage_mortgageBackPage7a57_invoker = createInvoker(
controllers.Mortgage.mortgageBackPage7a(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgageBackPage7a", Nil,"GET", """""", Routes.prefix + """mortgageBackPage7a"""))
        

// @LINE:113
private[this] lazy val controllers_Application_mortgagePage3358_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("test1"))))
private[this] lazy val controllers_Application_mortgagePage3358_invoker = createInvoker(
controllers.Application.mortgagePage33(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "mortgagePage33", Nil,"GET", """""", Routes.prefix + """test1"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """clientref""","""controllers.SubmitReferral.indexNotVedio()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """clientrefV""","""controllers.SubmitReferral.indexV()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """leadcreation""","""controllers.SubmitReferral.submitReferral()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """leadcreationV""","""controllers.SubmitReferral.submitReferral()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """referral""","""controllers.VisdomReferral.referral()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """referralV""","""controllers.VisdomReferral.referralV()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """wfg""","""controllers.VisdomReferral.wfg()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """wfgv""","""controllers.VisdomReferral.wfgV()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """realtor""","""controllers.VisdomReferral.realtor()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """realtorV""","""controllers.VisdomReferral.realtorV()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """professional""","""controllers.VisdomReferral.professional()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """professionalV""","""controllers.VisdomReferral.professionalV()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """planner""","""controllers.VisdomReferral.planner()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """plannerV""","""controllers.VisdomReferral.plannerV()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """client""","""controllers.VisdomReferral.client()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """clientV""","""controllers.VisdomReferral.clientV()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """referal1""","""controllers.VisdomReferral.visdomReferral()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """referral2""","""controllers.VisdomReferral.visdomReferralForm2()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """wfg1""","""controllers.VisdomReferral.wfg1()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """wfg2""","""controllers.VisdomReferral.wfg2()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bookmark""","""controllers.VisdomReferral.bookmark()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mortgagePage1""","""controllers.Mortgage.mortgageApplication()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mortgagePage1a""","""controllers.Mortgage.mortgagePage1a()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mortgagePage1b""","""controllers.Mortgage.mortgagePage1b()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mortgagePage2""","""controllers.Mortgage.mortgagePage2()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mortgagePage2Pre""","""controllers.Mortgage.mortgagePage2Pre()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mortgagePage2Pur""","""controllers.Mortgage.mortgagePage2Pur()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mortgagePage2Ref""","""controllers.Mortgage.mortgagePage2Ref()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mortgagePage3""","""controllers.Mortgage.mortgagePage3()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mortgagePage4""","""controllers.Mortgage.mortgagePage4()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mortgagePage5a""","""controllers.Mortgage.mortgagePage5a()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mortgagePage5b""","""controllers.Mortgage.mortgagePage5b()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mortgagePage6""","""controllers.Mortgage.mortgagePage6()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mortgagePage7""","""controllers.Mortgage.mortgagePage7()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mortgagePage7a""","""controllers.Mortgage.mortgagePage7a()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mortgagePage7b""","""controllers.Mortgage.mortgagePage7b()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mortgageSupplA""","""controllers.Mortgage.mortgageSuplementaryIncomeA()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mortgagePage10""","""controllers.Mortgage.mortgagePage10Assets()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mortgagePage11""","""controllers.Mortgage.mortgagePage11Properties()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mortgagePage12""","""controllers.Mortgage.mortgagePage12()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """privacyPolice""","""controllers.Mortgage.privacyPolice()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mortgageBackPage1""","""controllers.Mortgage.mortgageBackPage1()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mortgageBackPage2""","""controllers.Mortgage.mortgageBackPage2()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mortgageBackPage23""","""controllers.Mortgage.mortgageBackPage23()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mortgageBackPage4""","""controllers.Mortgage.mortgageBackPage4()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mortgageBackPage5a""","""controllers.Mortgage.mortgageBackPage5a()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mortgageBackPage5b""","""controllers.Mortgage.mortgageBackPage5b()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mortgageBackPage6""","""controllers.Mortgage.mortgageBackPage6()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mortgageBackPage7""","""controllers.Mortgage.mortgageBackPage7()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mortgageBackPageSuplA""","""controllers.Mortgage.mortgageBackSuplementaryIncomeA()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mortgageBackPage10""","""controllers.Mortgage.mortgageBackPage10()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mortgageBackPage11""","""controllers.Mortgage.mortgageBackPage11()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mortgageBackPage1a""","""controllers.Mortgage.mortgageBackPage1a()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mortgageBackPage6a""","""controllers.Mortgage.mortgageBackPage6a()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mortgageBackPage6b""","""controllers.Mortgage.mortgageBackPage6b()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mortgageBackPage7a""","""controllers.Mortgage.mortgageBackPage7a()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """test1""","""controllers.Application.mortgagePage33()""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index())
   }
}
        

// @LINE:9
case controllers_Assets_at1_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at1_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:15
case controllers_SubmitReferral_indexNotVedio2_route(params) => {
   call { 
        controllers_SubmitReferral_indexNotVedio2_invoker.call(controllers.SubmitReferral.indexNotVedio())
   }
}
        

// @LINE:17
case controllers_SubmitReferral_indexV3_route(params) => {
   call { 
        controllers_SubmitReferral_indexV3_invoker.call(controllers.SubmitReferral.indexV())
   }
}
        

// @LINE:19
case controllers_SubmitReferral_submitReferral4_route(params) => {
   call { 
        controllers_SubmitReferral_submitReferral4_invoker.call(controllers.SubmitReferral.submitReferral())
   }
}
        

// @LINE:22
case controllers_SubmitReferral_submitReferral5_route(params) => {
   call { 
        controllers_SubmitReferral_submitReferral5_invoker.call(controllers.SubmitReferral.submitReferral())
   }
}
        

// @LINE:29
case controllers_VisdomReferral_referral6_route(params) => {
   call { 
        controllers_VisdomReferral_referral6_invoker.call(controllers.VisdomReferral.referral())
   }
}
        

// @LINE:31
case controllers_VisdomReferral_referralV7_route(params) => {
   call { 
        controllers_VisdomReferral_referralV7_invoker.call(controllers.VisdomReferral.referralV())
   }
}
        

// @LINE:33
case controllers_VisdomReferral_wfg8_route(params) => {
   call { 
        controllers_VisdomReferral_wfg8_invoker.call(controllers.VisdomReferral.wfg())
   }
}
        

// @LINE:34
case controllers_VisdomReferral_wfgV9_route(params) => {
   call { 
        controllers_VisdomReferral_wfgV9_invoker.call(controllers.VisdomReferral.wfgV())
   }
}
        

// @LINE:36
case controllers_VisdomReferral_realtor10_route(params) => {
   call { 
        controllers_VisdomReferral_realtor10_invoker.call(controllers.VisdomReferral.realtor())
   }
}
        

// @LINE:38
case controllers_VisdomReferral_realtorV11_route(params) => {
   call { 
        controllers_VisdomReferral_realtorV11_invoker.call(controllers.VisdomReferral.realtorV())
   }
}
        

// @LINE:40
case controllers_VisdomReferral_professional12_route(params) => {
   call { 
        controllers_VisdomReferral_professional12_invoker.call(controllers.VisdomReferral.professional())
   }
}
        

// @LINE:42
case controllers_VisdomReferral_professionalV13_route(params) => {
   call { 
        controllers_VisdomReferral_professionalV13_invoker.call(controllers.VisdomReferral.professionalV())
   }
}
        

// @LINE:44
case controllers_VisdomReferral_planner14_route(params) => {
   call { 
        controllers_VisdomReferral_planner14_invoker.call(controllers.VisdomReferral.planner())
   }
}
        

// @LINE:46
case controllers_VisdomReferral_plannerV15_route(params) => {
   call { 
        controllers_VisdomReferral_plannerV15_invoker.call(controllers.VisdomReferral.plannerV())
   }
}
        

// @LINE:48
case controllers_VisdomReferral_client16_route(params) => {
   call { 
        controllers_VisdomReferral_client16_invoker.call(controllers.VisdomReferral.client())
   }
}
        

// @LINE:50
case controllers_VisdomReferral_clientV17_route(params) => {
   call { 
        controllers_VisdomReferral_clientV17_invoker.call(controllers.VisdomReferral.clientV())
   }
}
        

// @LINE:53
case controllers_VisdomReferral_visdomReferral18_route(params) => {
   call { 
        controllers_VisdomReferral_visdomReferral18_invoker.call(controllers.VisdomReferral.visdomReferral())
   }
}
        

// @LINE:54
case controllers_VisdomReferral_visdomReferralForm219_route(params) => {
   call { 
        controllers_VisdomReferral_visdomReferralForm219_invoker.call(controllers.VisdomReferral.visdomReferralForm2())
   }
}
        

// @LINE:57
case controllers_VisdomReferral_wfg120_route(params) => {
   call { 
        controllers_VisdomReferral_wfg120_invoker.call(controllers.VisdomReferral.wfg1())
   }
}
        

// @LINE:59
case controllers_VisdomReferral_wfg221_route(params) => {
   call { 
        controllers_VisdomReferral_wfg221_invoker.call(controllers.VisdomReferral.wfg2())
   }
}
        

// @LINE:64
case controllers_VisdomReferral_bookmark22_route(params) => {
   call { 
        controllers_VisdomReferral_bookmark22_invoker.call(controllers.VisdomReferral.bookmark())
   }
}
        

// @LINE:69
case controllers_Mortgage_mortgageApplication23_route(params) => {
   call { 
        controllers_Mortgage_mortgageApplication23_invoker.call(controllers.Mortgage.mortgageApplication())
   }
}
        

// @LINE:70
case controllers_Mortgage_mortgagePage1a24_route(params) => {
   call { 
        controllers_Mortgage_mortgagePage1a24_invoker.call(controllers.Mortgage.mortgagePage1a())
   }
}
        

// @LINE:71
case controllers_Mortgage_mortgagePage1b25_route(params) => {
   call { 
        controllers_Mortgage_mortgagePage1b25_invoker.call(controllers.Mortgage.mortgagePage1b())
   }
}
        

// @LINE:72
case controllers_Mortgage_mortgagePage226_route(params) => {
   call { 
        controllers_Mortgage_mortgagePage226_invoker.call(controllers.Mortgage.mortgagePage2())
   }
}
        

// @LINE:73
case controllers_Mortgage_mortgagePage2Pre27_route(params) => {
   call { 
        controllers_Mortgage_mortgagePage2Pre27_invoker.call(controllers.Mortgage.mortgagePage2Pre())
   }
}
        

// @LINE:74
case controllers_Mortgage_mortgagePage2Pur28_route(params) => {
   call { 
        controllers_Mortgage_mortgagePage2Pur28_invoker.call(controllers.Mortgage.mortgagePage2Pur())
   }
}
        

// @LINE:75
case controllers_Mortgage_mortgagePage2Ref29_route(params) => {
   call { 
        controllers_Mortgage_mortgagePage2Ref29_invoker.call(controllers.Mortgage.mortgagePage2Ref())
   }
}
        

// @LINE:76
case controllers_Mortgage_mortgagePage330_route(params) => {
   call { 
        controllers_Mortgage_mortgagePage330_invoker.call(controllers.Mortgage.mortgagePage3())
   }
}
        

// @LINE:77
case controllers_Mortgage_mortgagePage431_route(params) => {
   call { 
        controllers_Mortgage_mortgagePage431_invoker.call(controllers.Mortgage.mortgagePage4())
   }
}
        

// @LINE:78
case controllers_Mortgage_mortgagePage5a32_route(params) => {
   call { 
        controllers_Mortgage_mortgagePage5a32_invoker.call(controllers.Mortgage.mortgagePage5a())
   }
}
        

// @LINE:79
case controllers_Mortgage_mortgagePage5b33_route(params) => {
   call { 
        controllers_Mortgage_mortgagePage5b33_invoker.call(controllers.Mortgage.mortgagePage5b())
   }
}
        

// @LINE:80
case controllers_Mortgage_mortgagePage634_route(params) => {
   call { 
        controllers_Mortgage_mortgagePage634_invoker.call(controllers.Mortgage.mortgagePage6())
   }
}
        

// @LINE:81
case controllers_Mortgage_mortgagePage735_route(params) => {
   call { 
        controllers_Mortgage_mortgagePage735_invoker.call(controllers.Mortgage.mortgagePage7())
   }
}
        

// @LINE:82
case controllers_Mortgage_mortgagePage7a36_route(params) => {
   call { 
        controllers_Mortgage_mortgagePage7a36_invoker.call(controllers.Mortgage.mortgagePage7a())
   }
}
        

// @LINE:83
case controllers_Mortgage_mortgagePage7b37_route(params) => {
   call { 
        controllers_Mortgage_mortgagePage7b37_invoker.call(controllers.Mortgage.mortgagePage7b())
   }
}
        

// @LINE:84
case controllers_Mortgage_mortgageSuplementaryIncomeA38_route(params) => {
   call { 
        controllers_Mortgage_mortgageSuplementaryIncomeA38_invoker.call(controllers.Mortgage.mortgageSuplementaryIncomeA())
   }
}
        

// @LINE:86
case controllers_Mortgage_mortgagePage10Assets39_route(params) => {
   call { 
        controllers_Mortgage_mortgagePage10Assets39_invoker.call(controllers.Mortgage.mortgagePage10Assets())
   }
}
        

// @LINE:87
case controllers_Mortgage_mortgagePage11Properties40_route(params) => {
   call { 
        controllers_Mortgage_mortgagePage11Properties40_invoker.call(controllers.Mortgage.mortgagePage11Properties())
   }
}
        

// @LINE:91
case controllers_Mortgage_mortgagePage1241_route(params) => {
   call { 
        controllers_Mortgage_mortgagePage1241_invoker.call(controllers.Mortgage.mortgagePage12())
   }
}
        

// @LINE:92
case controllers_Mortgage_privacyPolice42_route(params) => {
   call { 
        controllers_Mortgage_privacyPolice42_invoker.call(controllers.Mortgage.privacyPolice())
   }
}
        

// @LINE:95
case controllers_Mortgage_mortgageBackPage143_route(params) => {
   call { 
        controllers_Mortgage_mortgageBackPage143_invoker.call(controllers.Mortgage.mortgageBackPage1())
   }
}
        

// @LINE:96
case controllers_Mortgage_mortgageBackPage244_route(params) => {
   call { 
        controllers_Mortgage_mortgageBackPage244_invoker.call(controllers.Mortgage.mortgageBackPage2())
   }
}
        

// @LINE:97
case controllers_Mortgage_mortgageBackPage2345_route(params) => {
   call { 
        controllers_Mortgage_mortgageBackPage2345_invoker.call(controllers.Mortgage.mortgageBackPage23())
   }
}
        

// @LINE:98
case controllers_Mortgage_mortgageBackPage446_route(params) => {
   call { 
        controllers_Mortgage_mortgageBackPage446_invoker.call(controllers.Mortgage.mortgageBackPage4())
   }
}
        

// @LINE:99
case controllers_Mortgage_mortgageBackPage5a47_route(params) => {
   call { 
        controllers_Mortgage_mortgageBackPage5a47_invoker.call(controllers.Mortgage.mortgageBackPage5a())
   }
}
        

// @LINE:100
case controllers_Mortgage_mortgageBackPage5b48_route(params) => {
   call { 
        controllers_Mortgage_mortgageBackPage5b48_invoker.call(controllers.Mortgage.mortgageBackPage5b())
   }
}
        

// @LINE:101
case controllers_Mortgage_mortgageBackPage649_route(params) => {
   call { 
        controllers_Mortgage_mortgageBackPage649_invoker.call(controllers.Mortgage.mortgageBackPage6())
   }
}
        

// @LINE:102
case controllers_Mortgage_mortgageBackPage750_route(params) => {
   call { 
        controllers_Mortgage_mortgageBackPage750_invoker.call(controllers.Mortgage.mortgageBackPage7())
   }
}
        

// @LINE:103
case controllers_Mortgage_mortgageBackSuplementaryIncomeA51_route(params) => {
   call { 
        controllers_Mortgage_mortgageBackSuplementaryIncomeA51_invoker.call(controllers.Mortgage.mortgageBackSuplementaryIncomeA())
   }
}
        

// @LINE:106
case controllers_Mortgage_mortgageBackPage1052_route(params) => {
   call { 
        controllers_Mortgage_mortgageBackPage1052_invoker.call(controllers.Mortgage.mortgageBackPage10())
   }
}
        

// @LINE:107
case controllers_Mortgage_mortgageBackPage1153_route(params) => {
   call { 
        controllers_Mortgage_mortgageBackPage1153_invoker.call(controllers.Mortgage.mortgageBackPage11())
   }
}
        

// @LINE:108
case controllers_Mortgage_mortgageBackPage1a54_route(params) => {
   call { 
        controllers_Mortgage_mortgageBackPage1a54_invoker.call(controllers.Mortgage.mortgageBackPage1a())
   }
}
        

// @LINE:109
case controllers_Mortgage_mortgageBackPage6a55_route(params) => {
   call { 
        controllers_Mortgage_mortgageBackPage6a55_invoker.call(controllers.Mortgage.mortgageBackPage6a())
   }
}
        

// @LINE:110
case controllers_Mortgage_mortgageBackPage6b56_route(params) => {
   call { 
        controllers_Mortgage_mortgageBackPage6b56_invoker.call(controllers.Mortgage.mortgageBackPage6b())
   }
}
        

// @LINE:111
case controllers_Mortgage_mortgageBackPage7a57_route(params) => {
   call { 
        controllers_Mortgage_mortgageBackPage7a57_invoker.call(controllers.Mortgage.mortgageBackPage7a())
   }
}
        

// @LINE:113
case controllers_Application_mortgagePage3358_route(params) => {
   call { 
        controllers_Application_mortgagePage3358_invoker.call(controllers.Application.mortgagePage33())
   }
}
        
}

}
     