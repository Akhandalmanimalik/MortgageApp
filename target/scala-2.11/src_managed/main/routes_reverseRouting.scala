// @SOURCE:/home/manoj/projects/Testing/formsPlayApp/conf/routes
// @HASH:4b2027adc5e049c269f198f5ccc4fa8f1e33da90
// @DATE:Mon May 16 20:16:13 IST 2016

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:113
// @LINE:111
// @LINE:110
// @LINE:109
// @LINE:108
// @LINE:107
// @LINE:106
// @LINE:103
// @LINE:102
// @LINE:101
// @LINE:100
// @LINE:99
// @LINE:98
// @LINE:97
// @LINE:96
// @LINE:95
// @LINE:92
// @LINE:91
// @LINE:87
// @LINE:86
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:64
// @LINE:59
// @LINE:57
// @LINE:54
// @LINE:53
// @LINE:50
// @LINE:48
// @LINE:46
// @LINE:44
// @LINE:42
// @LINE:40
// @LINE:38
// @LINE:36
// @LINE:34
// @LINE:33
// @LINE:31
// @LINE:29
// @LINE:22
// @LINE:19
// @LINE:17
// @LINE:15
// @LINE:9
// @LINE:6
package controllers {

// @LINE:9
class ReverseAssets {


// @LINE:9
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:22
// @LINE:19
// @LINE:17
// @LINE:15
class ReverseSubmitReferral {


// @LINE:17
def indexV(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "clientrefV")
}
                        

// @LINE:15
def indexNotVedio(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "clientref")
}
                        

// @LINE:22
// @LINE:19
def submitReferral(): Call = {
   () match {
// @LINE:19
case ()  =>
  import ReverseRouteContext.empty
  Call("POST", _prefix + { _defaultPrefix } + "leadcreation")
                                         
   }
}
                                                

}
                          

// @LINE:113
// @LINE:6
class ReverseApplication {


// @LINE:113
def mortgagePage33(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "test1")
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

}
                          

// @LINE:111
// @LINE:110
// @LINE:109
// @LINE:108
// @LINE:107
// @LINE:106
// @LINE:103
// @LINE:102
// @LINE:101
// @LINE:100
// @LINE:99
// @LINE:98
// @LINE:97
// @LINE:96
// @LINE:95
// @LINE:92
// @LINE:91
// @LINE:87
// @LINE:86
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
class ReverseMortgage {


// @LINE:74
def mortgagePage2Pur(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "mortgagePage2Pur")
}
                        

// @LINE:91
def mortgagePage12(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "mortgagePage12")
}
                        

// @LINE:100
def mortgageBackPage5b(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "mortgageBackPage5b")
}
                        

// @LINE:92
def privacyPolice(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "privacyPolice")
}
                        

// @LINE:79
def mortgagePage5b(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "mortgagePage5b")
}
                        

// @LINE:109
def mortgageBackPage6a(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "mortgageBackPage6a")
}
                        

// @LINE:83
def mortgagePage7b(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "mortgagePage7b")
}
                        

// @LINE:72
def mortgagePage2(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "mortgagePage2")
}
                        

// @LINE:81
def mortgagePage7(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "mortgagePage7")
}
                        

// @LINE:108
def mortgageBackPage1a(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "mortgageBackPage1a")
}
                        

// @LINE:84
def mortgageSuplementaryIncomeA(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "mortgageSupplA")
}
                        

// @LINE:76
def mortgagePage3(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "mortgagePage3")
}
                        

// @LINE:99
def mortgageBackPage5a(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "mortgageBackPage5a")
}
                        

// @LINE:75
def mortgagePage2Ref(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "mortgagePage2Ref")
}
                        

// @LINE:97
def mortgageBackPage23(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "mortgageBackPage23")
}
                        

// @LINE:80
def mortgagePage6(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "mortgagePage6")
}
                        

// @LINE:96
def mortgageBackPage2(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "mortgageBackPage2")
}
                        

// @LINE:86
def mortgagePage10Assets(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "mortgagePage10")
}
                        

// @LINE:95
def mortgageBackPage1(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "mortgageBackPage1")
}
                        

// @LINE:87
def mortgagePage11Properties(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "mortgagePage11")
}
                        

// @LINE:111
def mortgageBackPage7a(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "mortgageBackPage7a")
}
                        

// @LINE:106
def mortgageBackPage10(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "mortgageBackPage10")
}
                        

// @LINE:73
def mortgagePage2Pre(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "mortgagePage2Pre")
}
                        

// @LINE:77
def mortgagePage4(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "mortgagePage4")
}
                        

// @LINE:69
def mortgageApplication(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "mortgagePage1")
}
                        

// @LINE:103
def mortgageBackSuplementaryIncomeA(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "mortgageBackPageSuplA")
}
                        

// @LINE:110
def mortgageBackPage6b(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "mortgageBackPage6b")
}
                        

// @LINE:107
def mortgageBackPage11(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "mortgageBackPage11")
}
                        

// @LINE:102
def mortgageBackPage7(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "mortgageBackPage7")
}
                        

// @LINE:98
def mortgageBackPage4(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "mortgageBackPage4")
}
                        

// @LINE:78
def mortgagePage5a(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "mortgagePage5a")
}
                        

// @LINE:82
def mortgagePage7a(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "mortgagePage7a")
}
                        

// @LINE:70
def mortgagePage1a(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "mortgagePage1a")
}
                        

// @LINE:101
def mortgageBackPage6(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "mortgageBackPage6")
}
                        

// @LINE:71
def mortgagePage1b(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "mortgagePage1b")
}
                        

}
                          

// @LINE:64
// @LINE:59
// @LINE:57
// @LINE:54
// @LINE:53
// @LINE:50
// @LINE:48
// @LINE:46
// @LINE:44
// @LINE:42
// @LINE:40
// @LINE:38
// @LINE:36
// @LINE:34
// @LINE:33
// @LINE:31
// @LINE:29
class ReverseVisdomReferral {


// @LINE:34
def wfgV(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "wfgv")
}
                        

// @LINE:57
def wfg1(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "wfg1")
}
                        

// @LINE:50
def clientV(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "clientV")
}
                        

// @LINE:29
def referral(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "referral")
}
                        

// @LINE:46
def plannerV(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "plannerV")
}
                        

// @LINE:33
def wfg(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "wfg")
}
                        

// @LINE:48
def client(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "client")
}
                        

// @LINE:64
def bookmark(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "bookmark")
}
                        

// @LINE:59
def wfg2(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "wfg2")
}
                        

// @LINE:44
def planner(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "planner")
}
                        

// @LINE:38
def realtorV(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "realtorV")
}
                        

// @LINE:40
def professional(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "professional")
}
                        

// @LINE:54
def visdomReferralForm2(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "referral2")
}
                        

// @LINE:36
def realtor(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "realtor")
}
                        

// @LINE:42
def professionalV(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "professionalV")
}
                        

// @LINE:53
def visdomReferral(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "referal1")
}
                        

// @LINE:31
def referralV(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "referralV")
}
                        

}
                          
}
                  


// @LINE:113
// @LINE:111
// @LINE:110
// @LINE:109
// @LINE:108
// @LINE:107
// @LINE:106
// @LINE:103
// @LINE:102
// @LINE:101
// @LINE:100
// @LINE:99
// @LINE:98
// @LINE:97
// @LINE:96
// @LINE:95
// @LINE:92
// @LINE:91
// @LINE:87
// @LINE:86
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:64
// @LINE:59
// @LINE:57
// @LINE:54
// @LINE:53
// @LINE:50
// @LINE:48
// @LINE:46
// @LINE:44
// @LINE:42
// @LINE:40
// @LINE:38
// @LINE:36
// @LINE:34
// @LINE:33
// @LINE:31
// @LINE:29
// @LINE:22
// @LINE:19
// @LINE:17
// @LINE:15
// @LINE:9
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:9
class ReverseAssets {


// @LINE:9
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:22
// @LINE:19
// @LINE:17
// @LINE:15
class ReverseSubmitReferral {


// @LINE:17
def indexV : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SubmitReferral.indexV",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clientrefV"})
      }
   """
)
                        

// @LINE:15
def indexNotVedio : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SubmitReferral.indexNotVedio",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clientref"})
      }
   """
)
                        

// @LINE:22
// @LINE:19
def submitReferral : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SubmitReferral.submitReferral",
   """
      function() {
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "leadcreation"})
      }
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "leadcreationV"})
      }
      }
   """
)
                        

}
              

// @LINE:113
// @LINE:6
class ReverseApplication {


// @LINE:113
def mortgagePage33 : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.mortgagePage33",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "test1"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

}
              

// @LINE:111
// @LINE:110
// @LINE:109
// @LINE:108
// @LINE:107
// @LINE:106
// @LINE:103
// @LINE:102
// @LINE:101
// @LINE:100
// @LINE:99
// @LINE:98
// @LINE:97
// @LINE:96
// @LINE:95
// @LINE:92
// @LINE:91
// @LINE:87
// @LINE:86
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
class ReverseMortgage {


// @LINE:74
def mortgagePage2Pur : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Mortgage.mortgagePage2Pur",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "mortgagePage2Pur"})
      }
   """
)
                        

// @LINE:91
def mortgagePage12 : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Mortgage.mortgagePage12",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "mortgagePage12"})
      }
   """
)
                        

// @LINE:100
def mortgageBackPage5b : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Mortgage.mortgageBackPage5b",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mortgageBackPage5b"})
      }
   """
)
                        

// @LINE:92
def privacyPolice : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Mortgage.privacyPolice",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "privacyPolice"})
      }
   """
)
                        

// @LINE:79
def mortgagePage5b : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Mortgage.mortgagePage5b",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "mortgagePage5b"})
      }
   """
)
                        

// @LINE:109
def mortgageBackPage6a : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Mortgage.mortgageBackPage6a",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mortgageBackPage6a"})
      }
   """
)
                        

// @LINE:83
def mortgagePage7b : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Mortgage.mortgagePage7b",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "mortgagePage7b"})
      }
   """
)
                        

// @LINE:72
def mortgagePage2 : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Mortgage.mortgagePage2",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "mortgagePage2"})
      }
   """
)
                        

// @LINE:81
def mortgagePage7 : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Mortgage.mortgagePage7",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "mortgagePage7"})
      }
   """
)
                        

// @LINE:108
def mortgageBackPage1a : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Mortgage.mortgageBackPage1a",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mortgageBackPage1a"})
      }
   """
)
                        

// @LINE:84
def mortgageSuplementaryIncomeA : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Mortgage.mortgageSuplementaryIncomeA",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "mortgageSupplA"})
      }
   """
)
                        

// @LINE:76
def mortgagePage3 : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Mortgage.mortgagePage3",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "mortgagePage3"})
      }
   """
)
                        

// @LINE:99
def mortgageBackPage5a : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Mortgage.mortgageBackPage5a",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mortgageBackPage5a"})
      }
   """
)
                        

// @LINE:75
def mortgagePage2Ref : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Mortgage.mortgagePage2Ref",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "mortgagePage2Ref"})
      }
   """
)
                        

// @LINE:97
def mortgageBackPage23 : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Mortgage.mortgageBackPage23",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mortgageBackPage23"})
      }
   """
)
                        

// @LINE:80
def mortgagePage6 : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Mortgage.mortgagePage6",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "mortgagePage6"})
      }
   """
)
                        

// @LINE:96
def mortgageBackPage2 : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Mortgage.mortgageBackPage2",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mortgageBackPage2"})
      }
   """
)
                        

// @LINE:86
def mortgagePage10Assets : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Mortgage.mortgagePage10Assets",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "mortgagePage10"})
      }
   """
)
                        

// @LINE:95
def mortgageBackPage1 : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Mortgage.mortgageBackPage1",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mortgageBackPage1"})
      }
   """
)
                        

// @LINE:87
def mortgagePage11Properties : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Mortgage.mortgagePage11Properties",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "mortgagePage11"})
      }
   """
)
                        

// @LINE:111
def mortgageBackPage7a : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Mortgage.mortgageBackPage7a",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mortgageBackPage7a"})
      }
   """
)
                        

// @LINE:106
def mortgageBackPage10 : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Mortgage.mortgageBackPage10",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mortgageBackPage10"})
      }
   """
)
                        

// @LINE:73
def mortgagePage2Pre : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Mortgage.mortgagePage2Pre",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "mortgagePage2Pre"})
      }
   """
)
                        

// @LINE:77
def mortgagePage4 : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Mortgage.mortgagePage4",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "mortgagePage4"})
      }
   """
)
                        

// @LINE:69
def mortgageApplication : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Mortgage.mortgageApplication",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mortgagePage1"})
      }
   """
)
                        

// @LINE:103
def mortgageBackSuplementaryIncomeA : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Mortgage.mortgageBackSuplementaryIncomeA",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mortgageBackPageSuplA"})
      }
   """
)
                        

// @LINE:110
def mortgageBackPage6b : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Mortgage.mortgageBackPage6b",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mortgageBackPage6b"})
      }
   """
)
                        

// @LINE:107
def mortgageBackPage11 : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Mortgage.mortgageBackPage11",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mortgageBackPage11"})
      }
   """
)
                        

// @LINE:102
def mortgageBackPage7 : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Mortgage.mortgageBackPage7",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mortgageBackPage7"})
      }
   """
)
                        

// @LINE:98
def mortgageBackPage4 : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Mortgage.mortgageBackPage4",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mortgageBackPage4"})
      }
   """
)
                        

// @LINE:78
def mortgagePage5a : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Mortgage.mortgagePage5a",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "mortgagePage5a"})
      }
   """
)
                        

// @LINE:82
def mortgagePage7a : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Mortgage.mortgagePage7a",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "mortgagePage7a"})
      }
   """
)
                        

// @LINE:70
def mortgagePage1a : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Mortgage.mortgagePage1a",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "mortgagePage1a"})
      }
   """
)
                        

// @LINE:101
def mortgageBackPage6 : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Mortgage.mortgageBackPage6",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mortgageBackPage6"})
      }
   """
)
                        

// @LINE:71
def mortgagePage1b : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Mortgage.mortgagePage1b",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "mortgagePage1b"})
      }
   """
)
                        

}
              

// @LINE:64
// @LINE:59
// @LINE:57
// @LINE:54
// @LINE:53
// @LINE:50
// @LINE:48
// @LINE:46
// @LINE:44
// @LINE:42
// @LINE:40
// @LINE:38
// @LINE:36
// @LINE:34
// @LINE:33
// @LINE:31
// @LINE:29
class ReverseVisdomReferral {


// @LINE:34
def wfgV : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.VisdomReferral.wfgV",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "wfgv"})
      }
   """
)
                        

// @LINE:57
def wfg1 : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.VisdomReferral.wfg1",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "wfg1"})
      }
   """
)
                        

// @LINE:50
def clientV : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.VisdomReferral.clientV",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clientV"})
      }
   """
)
                        

// @LINE:29
def referral : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.VisdomReferral.referral",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "referral"})
      }
   """
)
                        

// @LINE:46
def plannerV : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.VisdomReferral.plannerV",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "plannerV"})
      }
   """
)
                        

// @LINE:33
def wfg : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.VisdomReferral.wfg",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "wfg"})
      }
   """
)
                        

// @LINE:48
def client : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.VisdomReferral.client",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "client"})
      }
   """
)
                        

// @LINE:64
def bookmark : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.VisdomReferral.bookmark",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bookmark"})
      }
   """
)
                        

// @LINE:59
def wfg2 : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.VisdomReferral.wfg2",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "wfg2"})
      }
   """
)
                        

// @LINE:44
def planner : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.VisdomReferral.planner",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "planner"})
      }
   """
)
                        

// @LINE:38
def realtorV : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.VisdomReferral.realtorV",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "realtorV"})
      }
   """
)
                        

// @LINE:40
def professional : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.VisdomReferral.professional",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "professional"})
      }
   """
)
                        

// @LINE:54
def visdomReferralForm2 : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.VisdomReferral.visdomReferralForm2",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "referral2"})
      }
   """
)
                        

// @LINE:36
def realtor : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.VisdomReferral.realtor",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "realtor"})
      }
   """
)
                        

// @LINE:42
def professionalV : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.VisdomReferral.professionalV",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "professionalV"})
      }
   """
)
                        

// @LINE:53
def visdomReferral : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.VisdomReferral.visdomReferral",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "referal1"})
      }
   """
)
                        

// @LINE:31
def referralV : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.VisdomReferral.referralV",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "referralV"})
      }
   """
)
                        

}
              
}
        


// @LINE:113
// @LINE:111
// @LINE:110
// @LINE:109
// @LINE:108
// @LINE:107
// @LINE:106
// @LINE:103
// @LINE:102
// @LINE:101
// @LINE:100
// @LINE:99
// @LINE:98
// @LINE:97
// @LINE:96
// @LINE:95
// @LINE:92
// @LINE:91
// @LINE:87
// @LINE:86
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:64
// @LINE:59
// @LINE:57
// @LINE:54
// @LINE:53
// @LINE:50
// @LINE:48
// @LINE:46
// @LINE:44
// @LINE:42
// @LINE:40
// @LINE:38
// @LINE:36
// @LINE:34
// @LINE:33
// @LINE:31
// @LINE:29
// @LINE:22
// @LINE:19
// @LINE:17
// @LINE:15
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:9
class ReverseAssets {


// @LINE:9
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:22
// @LINE:19
// @LINE:17
// @LINE:15
class ReverseSubmitReferral {


// @LINE:17
def indexV(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SubmitReferral.indexV(), HandlerDef(this.getClass.getClassLoader, "", "controllers.SubmitReferral", "indexV", Seq(), "GET", """""", _prefix + """clientrefV""")
)
                      

// @LINE:15
def indexNotVedio(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SubmitReferral.indexNotVedio(), HandlerDef(this.getClass.getClassLoader, "", "controllers.SubmitReferral", "indexNotVedio", Seq(), "GET", """""", _prefix + """clientref""")
)
                      

// @LINE:19
def submitReferral(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SubmitReferral.submitReferral(), HandlerDef(this.getClass.getClassLoader, "", "controllers.SubmitReferral", "submitReferral", Seq(), "POST", """""", _prefix + """leadcreation""")
)
                      

}
                          

// @LINE:113
// @LINE:6
class ReverseApplication {


// @LINE:113
def mortgagePage33(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.mortgagePage33(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "mortgagePage33", Seq(), "GET", """""", _prefix + """test1""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          

// @LINE:111
// @LINE:110
// @LINE:109
// @LINE:108
// @LINE:107
// @LINE:106
// @LINE:103
// @LINE:102
// @LINE:101
// @LINE:100
// @LINE:99
// @LINE:98
// @LINE:97
// @LINE:96
// @LINE:95
// @LINE:92
// @LINE:91
// @LINE:87
// @LINE:86
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
class ReverseMortgage {


// @LINE:74
def mortgagePage2Pur(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Mortgage.mortgagePage2Pur(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgagePage2Pur", Seq(), "POST", """""", _prefix + """mortgagePage2Pur""")
)
                      

// @LINE:91
def mortgagePage12(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Mortgage.mortgagePage12(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgagePage12", Seq(), "POST", """POST /mortgagePage6a     		controllers.Mortgage.mortgagePage6a()
POST /mortgagePage6b     		controllers.Mortgage.mortgagePage6b()
POST /mortgagePage9 	    	controllers.Mortgage.mortgagePage9()""", _prefix + """mortgagePage12""")
)
                      

// @LINE:100
def mortgageBackPage5b(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Mortgage.mortgageBackPage5b(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgageBackPage5b", Seq(), "GET", """""", _prefix + """mortgageBackPage5b""")
)
                      

// @LINE:92
def privacyPolice(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Mortgage.privacyPolice(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "privacyPolice", Seq(), "GET", """""", _prefix + """privacyPolice""")
)
                      

// @LINE:79
def mortgagePage5b(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Mortgage.mortgagePage5b(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgagePage5b", Seq(), "POST", """""", _prefix + """mortgagePage5b""")
)
                      

// @LINE:109
def mortgageBackPage6a(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Mortgage.mortgageBackPage6a(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgageBackPage6a", Seq(), "GET", """""", _prefix + """mortgageBackPage6a""")
)
                      

// @LINE:83
def mortgagePage7b(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Mortgage.mortgagePage7b(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgagePage7b", Seq(), "POST", """""", _prefix + """mortgagePage7b""")
)
                      

// @LINE:72
def mortgagePage2(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Mortgage.mortgagePage2(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgagePage2", Seq(), "POST", """""", _prefix + """mortgagePage2""")
)
                      

// @LINE:81
def mortgagePage7(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Mortgage.mortgagePage7(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgagePage7", Seq(), "POST", """""", _prefix + """mortgagePage7""")
)
                      

// @LINE:108
def mortgageBackPage1a(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Mortgage.mortgageBackPage1a(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgageBackPage1a", Seq(), "GET", """""", _prefix + """mortgageBackPage1a""")
)
                      

// @LINE:84
def mortgageSuplementaryIncomeA(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Mortgage.mortgageSuplementaryIncomeA(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgageSuplementaryIncomeA", Seq(), "POST", """""", _prefix + """mortgageSupplA""")
)
                      

// @LINE:76
def mortgagePage3(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Mortgage.mortgagePage3(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgagePage3", Seq(), "POST", """""", _prefix + """mortgagePage3""")
)
                      

// @LINE:99
def mortgageBackPage5a(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Mortgage.mortgageBackPage5a(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgageBackPage5a", Seq(), "GET", """""", _prefix + """mortgageBackPage5a""")
)
                      

// @LINE:75
def mortgagePage2Ref(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Mortgage.mortgagePage2Ref(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgagePage2Ref", Seq(), "POST", """""", _prefix + """mortgagePage2Ref""")
)
                      

// @LINE:97
def mortgageBackPage23(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Mortgage.mortgageBackPage23(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgageBackPage23", Seq(), "GET", """""", _prefix + """mortgageBackPage23""")
)
                      

// @LINE:80
def mortgagePage6(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Mortgage.mortgagePage6(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgagePage6", Seq(), "POST", """""", _prefix + """mortgagePage6""")
)
                      

// @LINE:96
def mortgageBackPage2(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Mortgage.mortgageBackPage2(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgageBackPage2", Seq(), "GET", """""", _prefix + """mortgageBackPage2""")
)
                      

// @LINE:86
def mortgagePage10Assets(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Mortgage.mortgagePage10Assets(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgagePage10Assets", Seq(), "POST", """POST /mortgagePage8     		controllers.Mortgage.mortgagePage8()""", _prefix + """mortgagePage10""")
)
                      

// @LINE:95
def mortgageBackPage1(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Mortgage.mortgageBackPage1(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgageBackPage1", Seq(), "GET", """Back pages""", _prefix + """mortgageBackPage1""")
)
                      

// @LINE:87
def mortgagePage11Properties(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Mortgage.mortgagePage11Properties(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgagePage11Properties", Seq(), "POST", """""", _prefix + """mortgagePage11""")
)
                      

// @LINE:111
def mortgageBackPage7a(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Mortgage.mortgageBackPage7a(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgageBackPage7a", Seq(), "GET", """""", _prefix + """mortgageBackPage7a""")
)
                      

// @LINE:106
def mortgageBackPage10(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Mortgage.mortgageBackPage10(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgageBackPage10", Seq(), "GET", """GET /mortgageBackPage9	    	controllers.Mortgage.mortgageBackPage9()
GET /mortgageBackPage89		controllers.Mortgage.mortgageBackPage89()""", _prefix + """mortgageBackPage10""")
)
                      

// @LINE:73
def mortgagePage2Pre(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Mortgage.mortgagePage2Pre(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgagePage2Pre", Seq(), "POST", """""", _prefix + """mortgagePage2Pre""")
)
                      

// @LINE:77
def mortgagePage4(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Mortgage.mortgagePage4(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgagePage4", Seq(), "POST", """""", _prefix + """mortgagePage4""")
)
                      

// @LINE:69
def mortgageApplication(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Mortgage.mortgageApplication(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgageApplication", Seq(), "GET", """""", _prefix + """mortgagePage1""")
)
                      

// @LINE:103
def mortgageBackSuplementaryIncomeA(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Mortgage.mortgageBackSuplementaryIncomeA(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgageBackSuplementaryIncomeA", Seq(), "GET", """""", _prefix + """mortgageBackPageSuplA""")
)
                      

// @LINE:110
def mortgageBackPage6b(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Mortgage.mortgageBackPage6b(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgageBackPage6b", Seq(), "GET", """""", _prefix + """mortgageBackPage6b""")
)
                      

// @LINE:107
def mortgageBackPage11(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Mortgage.mortgageBackPage11(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgageBackPage11", Seq(), "GET", """""", _prefix + """mortgageBackPage11""")
)
                      

// @LINE:102
def mortgageBackPage7(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Mortgage.mortgageBackPage7(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgageBackPage7", Seq(), "GET", """""", _prefix + """mortgageBackPage7""")
)
                      

// @LINE:98
def mortgageBackPage4(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Mortgage.mortgageBackPage4(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgageBackPage4", Seq(), "GET", """""", _prefix + """mortgageBackPage4""")
)
                      

// @LINE:78
def mortgagePage5a(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Mortgage.mortgagePage5a(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgagePage5a", Seq(), "POST", """""", _prefix + """mortgagePage5a""")
)
                      

// @LINE:82
def mortgagePage7a(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Mortgage.mortgagePage7a(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgagePage7a", Seq(), "POST", """""", _prefix + """mortgagePage7a""")
)
                      

// @LINE:70
def mortgagePage1a(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Mortgage.mortgagePage1a(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgagePage1a", Seq(), "POST", """""", _prefix + """mortgagePage1a""")
)
                      

// @LINE:101
def mortgageBackPage6(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Mortgage.mortgageBackPage6(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgageBackPage6", Seq(), "GET", """""", _prefix + """mortgageBackPage6""")
)
                      

// @LINE:71
def mortgagePage1b(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Mortgage.mortgagePage1b(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Mortgage", "mortgagePage1b", Seq(), "POST", """""", _prefix + """mortgagePage1b""")
)
                      

}
                          

// @LINE:64
// @LINE:59
// @LINE:57
// @LINE:54
// @LINE:53
// @LINE:50
// @LINE:48
// @LINE:46
// @LINE:44
// @LINE:42
// @LINE:40
// @LINE:38
// @LINE:36
// @LINE:34
// @LINE:33
// @LINE:31
// @LINE:29
class ReverseVisdomReferral {


// @LINE:34
def wfgV(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.VisdomReferral.wfgV(), HandlerDef(this.getClass.getClassLoader, "", "controllers.VisdomReferral", "wfgV", Seq(), "GET", """""", _prefix + """wfgv""")
)
                      

// @LINE:57
def wfg1(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.VisdomReferral.wfg1(), HandlerDef(this.getClass.getClassLoader, "", "controllers.VisdomReferral", "wfg1", Seq(), "POST", """""", _prefix + """wfg1""")
)
                      

// @LINE:50
def clientV(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.VisdomReferral.clientV(), HandlerDef(this.getClass.getClassLoader, "", "controllers.VisdomReferral", "clientV", Seq(), "GET", """""", _prefix + """clientV""")
)
                      

// @LINE:29
def referral(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.VisdomReferral.referral(), HandlerDef(this.getClass.getClassLoader, "", "controllers.VisdomReferral", "referral", Seq(), "GET", """""", _prefix + """referral""")
)
                      

// @LINE:46
def plannerV(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.VisdomReferral.plannerV(), HandlerDef(this.getClass.getClassLoader, "", "controllers.VisdomReferral", "plannerV", Seq(), "GET", """""", _prefix + """plannerV""")
)
                      

// @LINE:33
def wfg(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.VisdomReferral.wfg(), HandlerDef(this.getClass.getClassLoader, "", "controllers.VisdomReferral", "wfg", Seq(), "GET", """""", _prefix + """wfg""")
)
                      

// @LINE:48
def client(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.VisdomReferral.client(), HandlerDef(this.getClass.getClassLoader, "", "controllers.VisdomReferral", "client", Seq(), "GET", """""", _prefix + """client""")
)
                      

// @LINE:64
def bookmark(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.VisdomReferral.bookmark(), HandlerDef(this.getClass.getClassLoader, "", "controllers.VisdomReferral", "bookmark", Seq(), "GET", """""", _prefix + """bookmark""")
)
                      

// @LINE:59
def wfg2(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.VisdomReferral.wfg2(), HandlerDef(this.getClass.getClassLoader, "", "controllers.VisdomReferral", "wfg2", Seq(), "POST", """""", _prefix + """wfg2""")
)
                      

// @LINE:44
def planner(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.VisdomReferral.planner(), HandlerDef(this.getClass.getClassLoader, "", "controllers.VisdomReferral", "planner", Seq(), "GET", """""", _prefix + """planner""")
)
                      

// @LINE:38
def realtorV(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.VisdomReferral.realtorV(), HandlerDef(this.getClass.getClassLoader, "", "controllers.VisdomReferral", "realtorV", Seq(), "GET", """""", _prefix + """realtorV""")
)
                      

// @LINE:40
def professional(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.VisdomReferral.professional(), HandlerDef(this.getClass.getClassLoader, "", "controllers.VisdomReferral", "professional", Seq(), "GET", """""", _prefix + """professional""")
)
                      

// @LINE:54
def visdomReferralForm2(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.VisdomReferral.visdomReferralForm2(), HandlerDef(this.getClass.getClassLoader, "", "controllers.VisdomReferral", "visdomReferralForm2", Seq(), "POST", """""", _prefix + """referral2""")
)
                      

// @LINE:36
def realtor(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.VisdomReferral.realtor(), HandlerDef(this.getClass.getClassLoader, "", "controllers.VisdomReferral", "realtor", Seq(), "GET", """""", _prefix + """realtor""")
)
                      

// @LINE:42
def professionalV(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.VisdomReferral.professionalV(), HandlerDef(this.getClass.getClassLoader, "", "controllers.VisdomReferral", "professionalV", Seq(), "GET", """""", _prefix + """professionalV""")
)
                      

// @LINE:53
def visdomReferral(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.VisdomReferral.visdomReferral(), HandlerDef(this.getClass.getClassLoader, "", "controllers.VisdomReferral", "visdomReferral", Seq(), "POST", """""", _prefix + """referal1""")
)
                      

// @LINE:31
def referralV(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.VisdomReferral.referralV(), HandlerDef(this.getClass.getClassLoader, "", "controllers.VisdomReferral", "referralV", Seq(), "GET", """""", _prefix + """referralV""")
)
                      

}
                          
}
        
    