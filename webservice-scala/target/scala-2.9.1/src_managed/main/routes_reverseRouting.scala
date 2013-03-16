// @SOURCE:/home/sas/Ubuntu One/apps/ideas/webservice-scala/conf/routes
// @HASH:54878700fe78b423b49b4766d87633ae57ba7ea5
// @DATE:Sat Mar 16 17:21:56 ART 2013

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:151
// @LINE:149
// @LINE:148
// @LINE:147
// @LINE:146
// @LINE:145
// @LINE:144
// @LINE:142
// @LINE:141
// @LINE:140
// @LINE:139
// @LINE:138
// @LINE:137
// @LINE:135
// @LINE:134
package controllers.tests {

// @LINE:142
// @LINE:141
// @LINE:140
// @LINE:139
// @LINE:138
// @LINE:137
class ReverseSecuredIdeaTypes {
    


 
// @LINE:142
def delete(id:Long) = {
   Call("DELETE", "/api/tests/secured/types/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:138
def count() = {
   Call("GET", "/api/tests/secured/types/count")
}
                                                        
 
// @LINE:139
def update(id:Long) = {
   Call("PUT", "/api/tests/secured/types/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:137
def list() = {
   Call("GET", "/api/tests/secured/types")
}
                                                        
 
// @LINE:141
def show(id:Long) = {
   Call("GET", "/api/tests/secured/types/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:140
def save() = {
   Call("POST", "/api/tests/secured/types")
}
                                                        

                      
    
}
                            

// @LINE:149
// @LINE:148
// @LINE:147
// @LINE:146
// @LINE:145
// @LINE:144
class ReverseUnsecuredIdeaTypes {
    


 
// @LINE:149
def delete(id:Long) = {
   Call("DELETE", "/api/tests/unsecured/types/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:145
def count() = {
   Call("GET", "/api/tests/unsecured/types/count")
}
                                                        
 
// @LINE:146
def update(id:Long) = {
   Call("PUT", "/api/tests/unsecured/types/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:144
def list() = {
   Call("GET", "/api/tests/unsecured/types")
}
                                                        
 
// @LINE:148
def show(id:Long) = {
   Call("GET", "/api/tests/unsecured/types/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:147
def save() = {
   Call("POST", "/api/tests/unsecured/types")
}
                                                        

                      
    
}
                            

// @LINE:134
class ReverseGeoLocator {
    


 
// @LINE:134
def locate(address:String) = {
   Call("GET", "/api/tests/geo/" + implicitly[PathBindable[String]].unbind("address", address))
}
                                                        

                      
    
}
                            

// @LINE:151
class ReverseCategorizer {
    


 
// @LINE:151
def categorize() = {
   Call("POST", "/api/tests/categorize")
}
                                                        

                      
    
}
                            

// @LINE:135
class ReverseCSVImporter {
    


 
// @LINE:135
def CSVimport(file:String) = {
   Call("GET", "/api/tests/csv/import/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            
}
                    

// @LINE:163
// @LINE:160
// @LINE:159
// @LINE:157
// @LINE:156
// @LINE:152
// @LINE:130
// @LINE:128
// @LINE:125
// @LINE:124
// @LINE:123
// @LINE:122
// @LINE:121
// @LINE:120
// @LINE:118
// @LINE:117
// @LINE:116
// @LINE:115
// @LINE:114
// @LINE:113
// @LINE:112
// @LINE:111
// @LINE:110
// @LINE:109
// @LINE:97
// @LINE:96
// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:90
// @LINE:89
// @LINE:88
// @LINE:87
// @LINE:86
// @LINE:85
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:76
// @LINE:75
// @LINE:73
// @LINE:72
// @LINE:70
// @LINE:69
// @LINE:67
// @LINE:65
// @LINE:64
// @LINE:61
// @LINE:60
// @LINE:57
// @LINE:56
// @LINE:53
// @LINE:52
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:36
// @LINE:35
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:20
// @LINE:15
// @LINE:14
// @LINE:12
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:5
package controllers {

// @LINE:163
// @LINE:15
// @LINE:14
class ReverseAssets {
    


 
// @LINE:163
// @LINE:15
// @LINE:14
def at(file:String) = {
   (file) match {
// @LINE:14
case (file) if file == "index.html" => Call("GET", "/")
                                                                
// @LINE:15
case (file) if file == "index.html" => Call("GET", "/app")
                                                                
// @LINE:163
case (file) if true => Call("GET", "/" + implicitly[PathBindable[String]].unbind("file", file))
                                                                    
   }
}
                                                        

                      
    
}
                            

// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
class ReverseIdeaGeos {
    


 
// @LINE:83
def delete(id:Long) = {
   Call("DELETE", "/api/geo/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:79
def count() = {
   Call("GET", "/api/geo/count")
}
                                                        
 
// @LINE:80
def update(id:Long) = {
   Call("PUT", "/api/geo/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:78
def list() = {
   Call("GET", "/api/geo")
}
                                                        
 
// @LINE:82
def show(id:Long) = {
   Call("GET", "/api/geo/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:81
def save() = {
   Call("POST", "/api/geo")
}
                                                        

                      
    
}
                            

// @LINE:36
// @LINE:35
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
class ReverseUsers {
    


 
// @LINE:35
def stats(id:Long) = {
   Call("GET", "/api/users/" + implicitly[PathBindable[Long]].unbind("id", id) + "/stats")
}
                                                        
 
// @LINE:27
def delete(id:Long) = {
   Call("DELETE", "/api/users/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:23
def count() = {
   Call("GET", "/api/users/count")
}
                                                        
 
// @LINE:36
def votes(id:Long) = {
   Call("GET", "/api/users/" + implicitly[PathBindable[Long]].unbind("id", id) + "/votes")
}
                                                        
 
// @LINE:28
def showByToken(token:String) = {
   Call("GET", "/api/users/token/" + implicitly[PathBindable[String]].unbind("token", token))
}
                                                        
 
// @LINE:24
def update(id:Long) = {
   Call("PUT", "/api/users/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:22
def list() = {
   Call("GET", "/api/users")
}
                                                        
 
// @LINE:26
def show(id:Long) = {
   Call("GET", "/api/users/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:25
def save() = {
   Call("POST", "/api/users")
}
                                                        

                      
    
}
                            

// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
class ReverseSubscriptions {
    


 
// @LINE:31
def count(id:Long) = {
   Call("GET", "/api/users/" + implicitly[PathBindable[Long]].unbind("id", id) + "/subscriptions/count")
}
                                                        
 
// @LINE:30
def list(id:Long) = {
   Call("GET", "/api/users/" + implicitly[PathBindable[Long]].unbind("id", id) + "/subscriptions")
}
                                                        
 
// @LINE:32
def save(id:Long) = {
   Call("POST", "/api/users/" + implicitly[PathBindable[Long]].unbind("id", id) + "/subscriptions")
}
                                                        
 
// @LINE:33
def delete(id:Long, ideaId:Long) = {
   Call("DELETE", "/api/users/" + implicitly[PathBindable[Long]].unbind("id", id) + "/subscriptions/" + implicitly[PathBindable[Long]].unbind("ideaId", ideaId))
}
                                                        

                      
    
}
                            

// @LINE:90
// @LINE:89
// @LINE:88
// @LINE:87
// @LINE:86
// @LINE:85
class ReverseIdeaTypes {
    


 
// @LINE:90
def delete(id:Long) = {
   Call("DELETE", "/api/types/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:86
def count() = {
   Call("GET", "/api/types/count")
}
                                                        
 
// @LINE:87
def update(id:Long) = {
   Call("PUT", "/api/types/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:85
def list() = {
   Call("GET", "/api/types")
}
                                                        
 
// @LINE:89
def show(id:Long) = {
   Call("GET", "/api/types/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:88
def save() = {
   Call("POST", "/api/types")
}
                                                        

                      
    
}
                            

// @LINE:97
// @LINE:96
// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:92
class ReverseIdentities {
    


 
// @LINE:97
def delete(id:Long) = {
   Call("DELETE", "/api/identities/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:93
def count() = {
   Call("GET", "/api/identities/count")
}
                                                        
 
// @LINE:94
def update(id:Long) = {
   Call("PUT", "/api/identities/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:92
def list() = {
   Call("GET", "/api/identities")
}
                                                        
 
// @LINE:96
def show(id:Long) = {
   Call("GET", "/api/identities/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:95
def save() = {
   Call("POST", "/api/identities")
}
                                                        

                      
    
}
                            

// @LINE:152
class ReverseCategorizer {
    


 
// @LINE:152
def categorize() = {
   Call("GET", "/api/categorize")
}
                                                        

                      
    
}
                            

// @LINE:61
// @LINE:60
// @LINE:57
// @LINE:56
// @LINE:53
// @LINE:52
class ReverseComments {
    


 
// @LINE:56
def save(idea:Long) = {
   Call("POST", "/api/ideas/" + implicitly[PathBindable[Long]].unbind("idea", idea) + "/comment")
}
                                                        
 
// @LINE:61
def down(idea:Long, id:Long) = {
   Call("PUT", "/api/ideas/" + implicitly[PathBindable[Long]].unbind("idea", idea) + "/comments/" + implicitly[PathBindable[Long]].unbind("id", id) + "/down")
}
                                                        
 
// @LINE:57
def show(id:Long) = {
   Call("GET", "/api/ideas/comments/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:52
def listAll() = {
   Call("GET", "/api/comments")
}
                                                        
 
// @LINE:53
def list(idea:Long) = {
   Call("GET", "/api/ideas/" + implicitly[PathBindable[Long]].unbind("idea", idea) + "/comments")
}
                                                        
 
// @LINE:60
def up(idea:Long, id:Long) = {
   Call("PUT", "/api/ideas/" + implicitly[PathBindable[Long]].unbind("idea", idea) + "/comments/" + implicitly[PathBindable[Long]].unbind("id", id) + "/up")
}
                                                        

                      
    
}
                            

// @LINE:76
// @LINE:75
// @LINE:73
// @LINE:72
// @LINE:70
// @LINE:69
// @LINE:67
// @LINE:65
// @LINE:64
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
class ReverseIdeas {
    


 
// @LINE:44
def up(id:Long) = {
   Call("PUT", "/api/ideas/" + implicitly[PathBindable[Long]].unbind("id", id) + "/up")
}
                                                        
 
// @LINE:45
def down(id:Long) = {
   Call("PUT", "/api/ideas/" + implicitly[PathBindable[Long]].unbind("id", id) + "/down")
}
                                                        
 
// @LINE:64
def listTags(idea:Long) = {
   Call("GET", "/api/ideas/" + implicitly[PathBindable[Long]].unbind("idea", idea) + "/tags")
}
                                                        
 
// @LINE:72
def listGeos(idea:Long) = {
   Call("GET", "/api/ideas/" + implicitly[PathBindable[Long]].unbind("idea", idea) + "/geo")
}
                                                        
 
// @LINE:67
def updateTags(idea:Long) = {
   Call("PUT", "/api/ideas/" + implicitly[PathBindable[Long]].unbind("idea", idea) + "/tags")
}
                                                        
 
// @LINE:69
def saveTag(idea:Long, tag:String) = {
   Call("POST", "/api/ideas/" + implicitly[PathBindable[Long]].unbind("idea", idea) + "/tags/" + implicitly[PathBindable[String]].unbind("tag", tag))
}
                                                        
 
// @LINE:76
def deleteGeo(idea:Long, name:String) = {
   Call("DELETE", "/api/ideas/" + implicitly[PathBindable[Long]].unbind("idea", idea) + "/geo/" + implicitly[PathBindable[String]].unbind("name", name))
}
                                                        
 
// @LINE:43
def delete(id:Long) = {
   Call("DELETE", "/api/ideas/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:39
def count() = {
   Call("GET", "/api/ideas/count")
}
                                                        
 
// @LINE:73
def countGeos(idea:Long) = {
   Call("GET", "/api/ideas/" + implicitly[PathBindable[Long]].unbind("idea", idea) + "/geo/count")
}
                                                        
 
// @LINE:70
def deleteTag(idea:Long, tag:String) = {
   Call("DELETE", "/api/ideas/" + implicitly[PathBindable[Long]].unbind("idea", idea) + "/tags/" + implicitly[PathBindable[String]].unbind("tag", tag))
}
                                                        
 
// @LINE:65
def countTags(idea:Long) = {
   Call("GET", "/api/ideas/" + implicitly[PathBindable[Long]].unbind("idea", idea) + "/tags/count")
}
                                                        
 
// @LINE:40
def update(id:Long) = {
   Call("PUT", "/api/ideas/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:75
def saveGeo(idea:Long) = {
   Call("POST", "/api/ideas/" + implicitly[PathBindable[Long]].unbind("idea", idea) + "/geo")
}
                                                        
 
// @LINE:38
def list() = {
   Call("GET", "/api/ideas")
}
                                                        
 
// @LINE:42
def show(id:Long) = {
   Call("GET", "/api/ideas/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:41
def save() = {
   Call("POST", "/api/ideas")
}
                                                        

                      
    
}
                            

// @LINE:125
// @LINE:124
// @LINE:123
// @LINE:122
// @LINE:121
// @LINE:120
class ReverseVotes {
    


 
// @LINE:125
def delete(id:Long) = {
   Call("DELETE", "/api/votes/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:121
def count() = {
   Call("GET", "/api/votes/count")
}
                                                        
 
// @LINE:122
def update(id:Long) = {
   Call("PUT", "/api/votes/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:120
def list() = {
   Call("GET", "/api/votes")
}
                                                        
 
// @LINE:124
def show(id:Long) = {
   Call("GET", "/api/votes/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:123
def save() = {
   Call("POST", "/api/votes")
}
                                                        

                      
    
}
                            

// @LINE:160
// @LINE:159
// @LINE:157
// @LINE:156
class ReverseManagement {
    


 
// @LINE:159
def updateIdea(id:Long, text:String) = {
   Call("GET", "/api/management/ideas/" + implicitly[PathBindable[Long]].unbind("id", id) + "/" + implicitly[PathBindable[String]].unbind("text", text))
}
                                                        
 
// @LINE:157
def zapComment(id:Long) = {
   Call("GET", "/api/management/comments/" + implicitly[PathBindable[Long]].unbind("id", id) + "/zap")
}
                                                        
 
// @LINE:160
def updateComment(id:Long, text:String) = {
   Call("GET", "/api/management/comments/" + implicitly[PathBindable[Long]].unbind("id", id) + "/" + implicitly[PathBindable[String]].unbind("text", text))
}
                                                        
 
// @LINE:156
def zapIdea(id:Long) = {
   Call("GET", "/api/management/ideas/" + implicitly[PathBindable[Long]].unbind("id", id) + "/zap")
}
                                                        

                      
    
}
                            

// @LINE:130
// @LINE:128
// @LINE:20
// @LINE:5
class ReverseApplication {
    


 
// @LINE:130
def mail() = {
   Call("GET", "/mail/test")
}
                                                        
 
// @LINE:20
def api() = {
   Call("GET", "/api")
}
                                                        
 
// @LINE:5
def options(url:String) = {
   Call("OPTIONS", "/api/" + implicitly[PathBindable[String]].unbind("url", url))
}
                                                        
 
// @LINE:128
def javascriptRoutes() = {
   Call("GET", "/assets/javascripts/routes")
}
                                                        

                      
    
}
                            

// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
class ReverseSubscribers {
    


 
// @LINE:48
def count(id:Long) = {
   Call("GET", "/api/ideas/" + implicitly[PathBindable[Long]].unbind("id", id) + "/subscribers/count")
}
                                                        
 
// @LINE:47
def list(id:Long) = {
   Call("GET", "/api/ideas/" + implicitly[PathBindable[Long]].unbind("id", id) + "/subscribers")
}
                                                        
 
// @LINE:49
def save(id:Long) = {
   Call("POST", "/api/ideas/" + implicitly[PathBindable[Long]].unbind("id", id) + "/subscribers")
}
                                                        
 
// @LINE:50
def delete(id:Long, userId:Long) = {
   Call("DELETE", "/api/ideas/" + implicitly[PathBindable[Long]].unbind("id", id) + "/subscribers/" + implicitly[PathBindable[Long]].unbind("userId", userId))
}
                                                        

                      
    
}
                            

// @LINE:118
// @LINE:117
// @LINE:116
// @LINE:115
// @LINE:114
// @LINE:113
// @LINE:112
// @LINE:111
// @LINE:110
// @LINE:109
class ReverseTags {
    


 
// @LINE:115
def listIdeasByTagId(id:Long) = {
   Call("GET", "/api/tags/" + implicitly[PathBindable[Long]].unbind("id", id) + "/ideas")
}
                                                        
 
// @LINE:114
def delete(id:Long) = {
   Call("DELETE", "/api/tags/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:110
def count() = {
   Call("GET", "/api/tags/count")
}
                                                        
 
// @LINE:116
def listIdeas(tag:String) = {
   Call("GET", "/api/tags/" + implicitly[PathBindable[String]].unbind("tag", tag) + "/ideas")
}
                                                        
 
// @LINE:118
def countIdeas(tag:String) = {
   Call("GET", "/api/tags/" + implicitly[PathBindable[String]].unbind("tag", tag) + "/ideas/count")
}
                                                        
 
// @LINE:111
def update(id:Long) = {
   Call("PUT", "/api/tags/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:109
def list() = {
   Call("GET", "/api/tags")
}
                                                        
 
// @LINE:113
def show(id:Long) = {
   Call("GET", "/api/tags/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:112
def save() = {
   Call("POST", "/api/tags")
}
                                                        
 
// @LINE:117
def countIdeasByTagId(id:Long) = {
   Call("GET", "/api/tags/" + implicitly[PathBindable[Long]].unbind("id", id) + "/ideas/count")
}
                                                        

                      
    
}
                            

// @LINE:12
// @LINE:9
// @LINE:8
// @LINE:7
class ReverseSecurity {
    


 
// @LINE:7
def secured() = {
   Call("GET", "/api/secured")
}
                                                        
 
// @LINE:8
def logged() = {
   Call("GET", "/api/logged")
}
                                                        
 
// @LINE:12
def readToken() = {
   Call("GET", "/api/token")
}
                                                        
 
// @LINE:9
def auth() = {
   Call("POST", "/api/auth")
}
                                                        

                      
    
}
                            
}
                    


// @LINE:151
// @LINE:149
// @LINE:148
// @LINE:147
// @LINE:146
// @LINE:145
// @LINE:144
// @LINE:142
// @LINE:141
// @LINE:140
// @LINE:139
// @LINE:138
// @LINE:137
// @LINE:135
// @LINE:134
package controllers.tests.javascript {

// @LINE:142
// @LINE:141
// @LINE:140
// @LINE:139
// @LINE:138
// @LINE:137
class ReverseSecuredIdeaTypes {
    


 
// @LINE:142
def delete = JavascriptReverseRoute(
   "controllers.tests.SecuredIdeaTypes.delete",
   """
      function(id) {
      return _wA({method:"DELETE", url:"/api/tests/secured/types/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:138
def count = JavascriptReverseRoute(
   "controllers.tests.SecuredIdeaTypes.count",
   """
      function() {
      return _wA({method:"GET", url:"/api/tests/secured/types/count"})
      }
   """
)
                                                        
 
// @LINE:139
def update = JavascriptReverseRoute(
   "controllers.tests.SecuredIdeaTypes.update",
   """
      function(id) {
      return _wA({method:"PUT", url:"/api/tests/secured/types/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:137
def list = JavascriptReverseRoute(
   "controllers.tests.SecuredIdeaTypes.list",
   """
      function() {
      return _wA({method:"GET", url:"/api/tests/secured/types"})
      }
   """
)
                                                        
 
// @LINE:141
def show = JavascriptReverseRoute(
   "controllers.tests.SecuredIdeaTypes.show",
   """
      function(id) {
      return _wA({method:"GET", url:"/api/tests/secured/types/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:140
def save = JavascriptReverseRoute(
   "controllers.tests.SecuredIdeaTypes.save",
   """
      function() {
      return _wA({method:"POST", url:"/api/tests/secured/types"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:149
// @LINE:148
// @LINE:147
// @LINE:146
// @LINE:145
// @LINE:144
class ReverseUnsecuredIdeaTypes {
    


 
// @LINE:149
def delete = JavascriptReverseRoute(
   "controllers.tests.UnsecuredIdeaTypes.delete",
   """
      function(id) {
      return _wA({method:"DELETE", url:"/api/tests/unsecured/types/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:145
def count = JavascriptReverseRoute(
   "controllers.tests.UnsecuredIdeaTypes.count",
   """
      function() {
      return _wA({method:"GET", url:"/api/tests/unsecured/types/count"})
      }
   """
)
                                                        
 
// @LINE:146
def update = JavascriptReverseRoute(
   "controllers.tests.UnsecuredIdeaTypes.update",
   """
      function(id) {
      return _wA({method:"PUT", url:"/api/tests/unsecured/types/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:144
def list = JavascriptReverseRoute(
   "controllers.tests.UnsecuredIdeaTypes.list",
   """
      function() {
      return _wA({method:"GET", url:"/api/tests/unsecured/types"})
      }
   """
)
                                                        
 
// @LINE:148
def show = JavascriptReverseRoute(
   "controllers.tests.UnsecuredIdeaTypes.show",
   """
      function(id) {
      return _wA({method:"GET", url:"/api/tests/unsecured/types/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:147
def save = JavascriptReverseRoute(
   "controllers.tests.UnsecuredIdeaTypes.save",
   """
      function() {
      return _wA({method:"POST", url:"/api/tests/unsecured/types"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:134
class ReverseGeoLocator {
    


 
// @LINE:134
def locate = JavascriptReverseRoute(
   "controllers.tests.GeoLocator.locate",
   """
      function(address) {
      return _wA({method:"GET", url:"/api/tests/geo/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("address", address)})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:151
class ReverseCategorizer {
    


 
// @LINE:151
def categorize = JavascriptReverseRoute(
   "controllers.tests.Categorizer.categorize",
   """
      function() {
      return _wA({method:"POST", url:"/api/tests/categorize"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:135
class ReverseCSVImporter {
    


 
// @LINE:135
def CSVimport = JavascriptReverseRoute(
   "controllers.tests.CSVImporter.CSVimport",
   """
      function(file) {
      return _wA({method:"GET", url:"/api/tests/csv/import/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        

                      
    
}
                            
}
                    

// @LINE:163
// @LINE:160
// @LINE:159
// @LINE:157
// @LINE:156
// @LINE:152
// @LINE:130
// @LINE:128
// @LINE:125
// @LINE:124
// @LINE:123
// @LINE:122
// @LINE:121
// @LINE:120
// @LINE:118
// @LINE:117
// @LINE:116
// @LINE:115
// @LINE:114
// @LINE:113
// @LINE:112
// @LINE:111
// @LINE:110
// @LINE:109
// @LINE:97
// @LINE:96
// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:90
// @LINE:89
// @LINE:88
// @LINE:87
// @LINE:86
// @LINE:85
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:76
// @LINE:75
// @LINE:73
// @LINE:72
// @LINE:70
// @LINE:69
// @LINE:67
// @LINE:65
// @LINE:64
// @LINE:61
// @LINE:60
// @LINE:57
// @LINE:56
// @LINE:53
// @LINE:52
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:36
// @LINE:35
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:20
// @LINE:15
// @LINE:14
// @LINE:12
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:5
package controllers.javascript {

// @LINE:163
// @LINE:15
// @LINE:14
class ReverseAssets {
    


 
// @LINE:163
// @LINE:15
// @LINE:14
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      if (file == """ + implicitly[JavascriptLitteral[String]].to("index.html") + """) {
      return _wA({method:"GET", url:"/"})
      }
      if (file == """ + implicitly[JavascriptLitteral[String]].to("index.html") + """) {
      return _wA({method:"GET", url:"/app"})
      }
      if (true) {
      return _wA({method:"GET", url:"/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
class ReverseIdeaGeos {
    


 
// @LINE:83
def delete = JavascriptReverseRoute(
   "controllers.IdeaGeos.delete",
   """
      function(id) {
      return _wA({method:"DELETE", url:"/api/geo/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:79
def count = JavascriptReverseRoute(
   "controllers.IdeaGeos.count",
   """
      function() {
      return _wA({method:"GET", url:"/api/geo/count"})
      }
   """
)
                                                        
 
// @LINE:80
def update = JavascriptReverseRoute(
   "controllers.IdeaGeos.update",
   """
      function(id) {
      return _wA({method:"PUT", url:"/api/geo/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:78
def list = JavascriptReverseRoute(
   "controllers.IdeaGeos.list",
   """
      function() {
      return _wA({method:"GET", url:"/api/geo"})
      }
   """
)
                                                        
 
// @LINE:82
def show = JavascriptReverseRoute(
   "controllers.IdeaGeos.show",
   """
      function(id) {
      return _wA({method:"GET", url:"/api/geo/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:81
def save = JavascriptReverseRoute(
   "controllers.IdeaGeos.save",
   """
      function() {
      return _wA({method:"POST", url:"/api/geo"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:36
// @LINE:35
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
class ReverseUsers {
    


 
// @LINE:35
def stats = JavascriptReverseRoute(
   "controllers.Users.stats",
   """
      function(id) {
      return _wA({method:"GET", url:"/api/users/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/stats"})
      }
   """
)
                                                        
 
// @LINE:27
def delete = JavascriptReverseRoute(
   "controllers.Users.delete",
   """
      function(id) {
      return _wA({method:"DELETE", url:"/api/users/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:23
def count = JavascriptReverseRoute(
   "controllers.Users.count",
   """
      function() {
      return _wA({method:"GET", url:"/api/users/count"})
      }
   """
)
                                                        
 
// @LINE:36
def votes = JavascriptReverseRoute(
   "controllers.Users.votes",
   """
      function(id) {
      return _wA({method:"GET", url:"/api/users/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/votes"})
      }
   """
)
                                                        
 
// @LINE:28
def showByToken = JavascriptReverseRoute(
   "controllers.Users.showByToken",
   """
      function(token) {
      return _wA({method:"GET", url:"/api/users/token/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", token)})
      }
   """
)
                                                        
 
// @LINE:24
def update = JavascriptReverseRoute(
   "controllers.Users.update",
   """
      function(id) {
      return _wA({method:"PUT", url:"/api/users/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:22
def list = JavascriptReverseRoute(
   "controllers.Users.list",
   """
      function() {
      return _wA({method:"GET", url:"/api/users"})
      }
   """
)
                                                        
 
// @LINE:26
def show = JavascriptReverseRoute(
   "controllers.Users.show",
   """
      function(id) {
      return _wA({method:"GET", url:"/api/users/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:25
def save = JavascriptReverseRoute(
   "controllers.Users.save",
   """
      function() {
      return _wA({method:"POST", url:"/api/users"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
class ReverseSubscriptions {
    


 
// @LINE:31
def count = JavascriptReverseRoute(
   "controllers.Subscriptions.count",
   """
      function(id) {
      return _wA({method:"GET", url:"/api/users/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/subscriptions/count"})
      }
   """
)
                                                        
 
// @LINE:30
def list = JavascriptReverseRoute(
   "controllers.Subscriptions.list",
   """
      function(id) {
      return _wA({method:"GET", url:"/api/users/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/subscriptions"})
      }
   """
)
                                                        
 
// @LINE:32
def save = JavascriptReverseRoute(
   "controllers.Subscriptions.save",
   """
      function(id) {
      return _wA({method:"POST", url:"/api/users/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/subscriptions"})
      }
   """
)
                                                        
 
// @LINE:33
def delete = JavascriptReverseRoute(
   "controllers.Subscriptions.delete",
   """
      function(id,ideaId) {
      return _wA({method:"DELETE", url:"/api/users/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/subscriptions/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("ideaId", ideaId)})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:90
// @LINE:89
// @LINE:88
// @LINE:87
// @LINE:86
// @LINE:85
class ReverseIdeaTypes {
    


 
// @LINE:90
def delete = JavascriptReverseRoute(
   "controllers.IdeaTypes.delete",
   """
      function(id) {
      return _wA({method:"DELETE", url:"/api/types/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:86
def count = JavascriptReverseRoute(
   "controllers.IdeaTypes.count",
   """
      function() {
      return _wA({method:"GET", url:"/api/types/count"})
      }
   """
)
                                                        
 
// @LINE:87
def update = JavascriptReverseRoute(
   "controllers.IdeaTypes.update",
   """
      function(id) {
      return _wA({method:"PUT", url:"/api/types/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:85
def list = JavascriptReverseRoute(
   "controllers.IdeaTypes.list",
   """
      function() {
      return _wA({method:"GET", url:"/api/types"})
      }
   """
)
                                                        
 
// @LINE:89
def show = JavascriptReverseRoute(
   "controllers.IdeaTypes.show",
   """
      function(id) {
      return _wA({method:"GET", url:"/api/types/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:88
def save = JavascriptReverseRoute(
   "controllers.IdeaTypes.save",
   """
      function() {
      return _wA({method:"POST", url:"/api/types"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:97
// @LINE:96
// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:92
class ReverseIdentities {
    


 
// @LINE:97
def delete = JavascriptReverseRoute(
   "controllers.Identities.delete",
   """
      function(id) {
      return _wA({method:"DELETE", url:"/api/identities/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:93
def count = JavascriptReverseRoute(
   "controllers.Identities.count",
   """
      function() {
      return _wA({method:"GET", url:"/api/identities/count"})
      }
   """
)
                                                        
 
// @LINE:94
def update = JavascriptReverseRoute(
   "controllers.Identities.update",
   """
      function(id) {
      return _wA({method:"PUT", url:"/api/identities/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:92
def list = JavascriptReverseRoute(
   "controllers.Identities.list",
   """
      function() {
      return _wA({method:"GET", url:"/api/identities"})
      }
   """
)
                                                        
 
// @LINE:96
def show = JavascriptReverseRoute(
   "controllers.Identities.show",
   """
      function(id) {
      return _wA({method:"GET", url:"/api/identities/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:95
def save = JavascriptReverseRoute(
   "controllers.Identities.save",
   """
      function() {
      return _wA({method:"POST", url:"/api/identities"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:152
class ReverseCategorizer {
    


 
// @LINE:152
def categorize = JavascriptReverseRoute(
   "controllers.Categorizer.categorize",
   """
      function() {
      return _wA({method:"GET", url:"/api/categorize"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:61
// @LINE:60
// @LINE:57
// @LINE:56
// @LINE:53
// @LINE:52
class ReverseComments {
    


 
// @LINE:56
def save = JavascriptReverseRoute(
   "controllers.Comments.save",
   """
      function(idea) {
      return _wA({method:"POST", url:"/api/ideas/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idea", idea) + "/comment"})
      }
   """
)
                                                        
 
// @LINE:61
def down = JavascriptReverseRoute(
   "controllers.Comments.down",
   """
      function(idea,id) {
      return _wA({method:"PUT", url:"/api/ideas/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idea", idea) + "/comments/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/down"})
      }
   """
)
                                                        
 
// @LINE:57
def show = JavascriptReverseRoute(
   "controllers.Comments.show",
   """
      function(id) {
      return _wA({method:"GET", url:"/api/ideas/comments/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:52
def listAll = JavascriptReverseRoute(
   "controllers.Comments.listAll",
   """
      function() {
      return _wA({method:"GET", url:"/api/comments"})
      }
   """
)
                                                        
 
// @LINE:53
def list = JavascriptReverseRoute(
   "controllers.Comments.list",
   """
      function(idea) {
      return _wA({method:"GET", url:"/api/ideas/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idea", idea) + "/comments"})
      }
   """
)
                                                        
 
// @LINE:60
def up = JavascriptReverseRoute(
   "controllers.Comments.up",
   """
      function(idea,id) {
      return _wA({method:"PUT", url:"/api/ideas/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idea", idea) + "/comments/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/up"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:76
// @LINE:75
// @LINE:73
// @LINE:72
// @LINE:70
// @LINE:69
// @LINE:67
// @LINE:65
// @LINE:64
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
class ReverseIdeas {
    


 
// @LINE:44
def up = JavascriptReverseRoute(
   "controllers.Ideas.up",
   """
      function(id) {
      return _wA({method:"PUT", url:"/api/ideas/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/up"})
      }
   """
)
                                                        
 
// @LINE:45
def down = JavascriptReverseRoute(
   "controllers.Ideas.down",
   """
      function(id) {
      return _wA({method:"PUT", url:"/api/ideas/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/down"})
      }
   """
)
                                                        
 
// @LINE:64
def listTags = JavascriptReverseRoute(
   "controllers.Ideas.listTags",
   """
      function(idea) {
      return _wA({method:"GET", url:"/api/ideas/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idea", idea) + "/tags"})
      }
   """
)
                                                        
 
// @LINE:72
def listGeos = JavascriptReverseRoute(
   "controllers.Ideas.listGeos",
   """
      function(idea) {
      return _wA({method:"GET", url:"/api/ideas/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idea", idea) + "/geo"})
      }
   """
)
                                                        
 
// @LINE:67
def updateTags = JavascriptReverseRoute(
   "controllers.Ideas.updateTags",
   """
      function(idea) {
      return _wA({method:"PUT", url:"/api/ideas/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idea", idea) + "/tags"})
      }
   """
)
                                                        
 
// @LINE:69
def saveTag = JavascriptReverseRoute(
   "controllers.Ideas.saveTag",
   """
      function(idea,tag) {
      return _wA({method:"POST", url:"/api/ideas/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idea", idea) + "/tags/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("tag", tag)})
      }
   """
)
                                                        
 
// @LINE:76
def deleteGeo = JavascriptReverseRoute(
   "controllers.Ideas.deleteGeo",
   """
      function(idea,name) {
      return _wA({method:"DELETE", url:"/api/ideas/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idea", idea) + "/geo/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", name)})
      }
   """
)
                                                        
 
// @LINE:43
def delete = JavascriptReverseRoute(
   "controllers.Ideas.delete",
   """
      function(id) {
      return _wA({method:"DELETE", url:"/api/ideas/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:39
def count = JavascriptReverseRoute(
   "controllers.Ideas.count",
   """
      function() {
      return _wA({method:"GET", url:"/api/ideas/count"})
      }
   """
)
                                                        
 
// @LINE:73
def countGeos = JavascriptReverseRoute(
   "controllers.Ideas.countGeos",
   """
      function(idea) {
      return _wA({method:"GET", url:"/api/ideas/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idea", idea) + "/geo/count"})
      }
   """
)
                                                        
 
// @LINE:70
def deleteTag = JavascriptReverseRoute(
   "controllers.Ideas.deleteTag",
   """
      function(idea,tag) {
      return _wA({method:"DELETE", url:"/api/ideas/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idea", idea) + "/tags/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("tag", tag)})
      }
   """
)
                                                        
 
// @LINE:65
def countTags = JavascriptReverseRoute(
   "controllers.Ideas.countTags",
   """
      function(idea) {
      return _wA({method:"GET", url:"/api/ideas/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idea", idea) + "/tags/count"})
      }
   """
)
                                                        
 
// @LINE:40
def update = JavascriptReverseRoute(
   "controllers.Ideas.update",
   """
      function(id) {
      return _wA({method:"PUT", url:"/api/ideas/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:75
def saveGeo = JavascriptReverseRoute(
   "controllers.Ideas.saveGeo",
   """
      function(idea) {
      return _wA({method:"POST", url:"/api/ideas/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idea", idea) + "/geo"})
      }
   """
)
                                                        
 
// @LINE:38
def list = JavascriptReverseRoute(
   "controllers.Ideas.list",
   """
      function() {
      return _wA({method:"GET", url:"/api/ideas"})
      }
   """
)
                                                        
 
// @LINE:42
def show = JavascriptReverseRoute(
   "controllers.Ideas.show",
   """
      function(id) {
      return _wA({method:"GET", url:"/api/ideas/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:41
def save = JavascriptReverseRoute(
   "controllers.Ideas.save",
   """
      function() {
      return _wA({method:"POST", url:"/api/ideas"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:125
// @LINE:124
// @LINE:123
// @LINE:122
// @LINE:121
// @LINE:120
class ReverseVotes {
    


 
// @LINE:125
def delete = JavascriptReverseRoute(
   "controllers.Votes.delete",
   """
      function(id) {
      return _wA({method:"DELETE", url:"/api/votes/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:121
def count = JavascriptReverseRoute(
   "controllers.Votes.count",
   """
      function() {
      return _wA({method:"GET", url:"/api/votes/count"})
      }
   """
)
                                                        
 
// @LINE:122
def update = JavascriptReverseRoute(
   "controllers.Votes.update",
   """
      function(id) {
      return _wA({method:"PUT", url:"/api/votes/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:120
def list = JavascriptReverseRoute(
   "controllers.Votes.list",
   """
      function() {
      return _wA({method:"GET", url:"/api/votes"})
      }
   """
)
                                                        
 
// @LINE:124
def show = JavascriptReverseRoute(
   "controllers.Votes.show",
   """
      function(id) {
      return _wA({method:"GET", url:"/api/votes/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:123
def save = JavascriptReverseRoute(
   "controllers.Votes.save",
   """
      function() {
      return _wA({method:"POST", url:"/api/votes"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:160
// @LINE:159
// @LINE:157
// @LINE:156
class ReverseManagement {
    


 
// @LINE:159
def updateIdea = JavascriptReverseRoute(
   "controllers.Management.updateIdea",
   """
      function(id,text) {
      return _wA({method:"GET", url:"/api/management/ideas/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("text", text)})
      }
   """
)
                                                        
 
// @LINE:157
def zapComment = JavascriptReverseRoute(
   "controllers.Management.zapComment",
   """
      function(id) {
      return _wA({method:"GET", url:"/api/management/comments/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/zap"})
      }
   """
)
                                                        
 
// @LINE:160
def updateComment = JavascriptReverseRoute(
   "controllers.Management.updateComment",
   """
      function(id,text) {
      return _wA({method:"GET", url:"/api/management/comments/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("text", text)})
      }
   """
)
                                                        
 
// @LINE:156
def zapIdea = JavascriptReverseRoute(
   "controllers.Management.zapIdea",
   """
      function(id) {
      return _wA({method:"GET", url:"/api/management/ideas/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/zap"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:130
// @LINE:128
// @LINE:20
// @LINE:5
class ReverseApplication {
    


 
// @LINE:130
def mail = JavascriptReverseRoute(
   "controllers.Application.mail",
   """
      function() {
      return _wA({method:"GET", url:"/mail/test"})
      }
   """
)
                                                        
 
// @LINE:20
def api = JavascriptReverseRoute(
   "controllers.Application.api",
   """
      function() {
      return _wA({method:"GET", url:"/api"})
      }
   """
)
                                                        
 
// @LINE:5
def options = JavascriptReverseRoute(
   "controllers.Application.options",
   """
      function(url) {
      return _wA({method:"OPTIONS", url:"/api/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("url", url)})
      }
   """
)
                                                        
 
// @LINE:128
def javascriptRoutes = JavascriptReverseRoute(
   "controllers.Application.javascriptRoutes",
   """
      function() {
      return _wA({method:"GET", url:"/assets/javascripts/routes"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
class ReverseSubscribers {
    


 
// @LINE:48
def count = JavascriptReverseRoute(
   "controllers.Subscribers.count",
   """
      function(id) {
      return _wA({method:"GET", url:"/api/ideas/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/subscribers/count"})
      }
   """
)
                                                        
 
// @LINE:47
def list = JavascriptReverseRoute(
   "controllers.Subscribers.list",
   """
      function(id) {
      return _wA({method:"GET", url:"/api/ideas/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/subscribers"})
      }
   """
)
                                                        
 
// @LINE:49
def save = JavascriptReverseRoute(
   "controllers.Subscribers.save",
   """
      function(id) {
      return _wA({method:"POST", url:"/api/ideas/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/subscribers"})
      }
   """
)
                                                        
 
// @LINE:50
def delete = JavascriptReverseRoute(
   "controllers.Subscribers.delete",
   """
      function(id,userId) {
      return _wA({method:"DELETE", url:"/api/ideas/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/subscribers/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("userId", userId)})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:118
// @LINE:117
// @LINE:116
// @LINE:115
// @LINE:114
// @LINE:113
// @LINE:112
// @LINE:111
// @LINE:110
// @LINE:109
class ReverseTags {
    


 
// @LINE:115
def listIdeasByTagId = JavascriptReverseRoute(
   "controllers.Tags.listIdeasByTagId",
   """
      function(id) {
      return _wA({method:"GET", url:"/api/tags/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/ideas"})
      }
   """
)
                                                        
 
// @LINE:114
def delete = JavascriptReverseRoute(
   "controllers.Tags.delete",
   """
      function(id) {
      return _wA({method:"DELETE", url:"/api/tags/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:110
def count = JavascriptReverseRoute(
   "controllers.Tags.count",
   """
      function() {
      return _wA({method:"GET", url:"/api/tags/count"})
      }
   """
)
                                                        
 
// @LINE:116
def listIdeas = JavascriptReverseRoute(
   "controllers.Tags.listIdeas",
   """
      function(tag) {
      return _wA({method:"GET", url:"/api/tags/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("tag", tag) + "/ideas"})
      }
   """
)
                                                        
 
// @LINE:118
def countIdeas = JavascriptReverseRoute(
   "controllers.Tags.countIdeas",
   """
      function(tag) {
      return _wA({method:"GET", url:"/api/tags/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("tag", tag) + "/ideas/count"})
      }
   """
)
                                                        
 
// @LINE:111
def update = JavascriptReverseRoute(
   "controllers.Tags.update",
   """
      function(id) {
      return _wA({method:"PUT", url:"/api/tags/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:109
def list = JavascriptReverseRoute(
   "controllers.Tags.list",
   """
      function() {
      return _wA({method:"GET", url:"/api/tags"})
      }
   """
)
                                                        
 
// @LINE:113
def show = JavascriptReverseRoute(
   "controllers.Tags.show",
   """
      function(id) {
      return _wA({method:"GET", url:"/api/tags/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:112
def save = JavascriptReverseRoute(
   "controllers.Tags.save",
   """
      function() {
      return _wA({method:"POST", url:"/api/tags"})
      }
   """
)
                                                        
 
// @LINE:117
def countIdeasByTagId = JavascriptReverseRoute(
   "controllers.Tags.countIdeasByTagId",
   """
      function(id) {
      return _wA({method:"GET", url:"/api/tags/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/ideas/count"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:12
// @LINE:9
// @LINE:8
// @LINE:7
class ReverseSecurity {
    


 
// @LINE:7
def secured = JavascriptReverseRoute(
   "controllers.Security.secured",
   """
      function() {
      return _wA({method:"GET", url:"/api/secured"})
      }
   """
)
                                                        
 
// @LINE:8
def logged = JavascriptReverseRoute(
   "controllers.Security.logged",
   """
      function() {
      return _wA({method:"GET", url:"/api/logged"})
      }
   """
)
                                                        
 
// @LINE:12
def readToken = JavascriptReverseRoute(
   "controllers.Security.readToken",
   """
      function() {
      return _wA({method:"GET", url:"/api/token"})
      }
   """
)
                                                        
 
// @LINE:9
def auth = JavascriptReverseRoute(
   "controllers.Security.auth",
   """
      function() {
      return _wA({method:"POST", url:"/api/auth"})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:151
// @LINE:149
// @LINE:148
// @LINE:147
// @LINE:146
// @LINE:145
// @LINE:144
// @LINE:142
// @LINE:141
// @LINE:140
// @LINE:139
// @LINE:138
// @LINE:137
// @LINE:135
// @LINE:134
package controllers.tests.ref {

// @LINE:142
// @LINE:141
// @LINE:140
// @LINE:139
// @LINE:138
// @LINE:137
class ReverseSecuredIdeaTypes {
    


 
// @LINE:142
def delete(id:Long) = new play.api.mvc.HandlerRef(
   controllers.tests.SecuredIdeaTypes.delete(id), HandlerDef(this, "controllers.tests.SecuredIdeaTypes", "delete", Seq(classOf[Long]))
)
                              
 
// @LINE:138
def count() = new play.api.mvc.HandlerRef(
   controllers.tests.SecuredIdeaTypes.count(), HandlerDef(this, "controllers.tests.SecuredIdeaTypes", "count", Seq())
)
                              
 
// @LINE:139
def update(id:Long) = new play.api.mvc.HandlerRef(
   controllers.tests.SecuredIdeaTypes.update(id), HandlerDef(this, "controllers.tests.SecuredIdeaTypes", "update", Seq(classOf[Long]))
)
                              
 
// @LINE:137
def list() = new play.api.mvc.HandlerRef(
   controllers.tests.SecuredIdeaTypes.list(), HandlerDef(this, "controllers.tests.SecuredIdeaTypes", "list", Seq())
)
                              
 
// @LINE:141
def show(id:Long) = new play.api.mvc.HandlerRef(
   controllers.tests.SecuredIdeaTypes.show(id), HandlerDef(this, "controllers.tests.SecuredIdeaTypes", "show", Seq(classOf[Long]))
)
                              
 
// @LINE:140
def save() = new play.api.mvc.HandlerRef(
   controllers.tests.SecuredIdeaTypes.save(), HandlerDef(this, "controllers.tests.SecuredIdeaTypes", "save", Seq())
)
                              

                      
    
}
                            

// @LINE:149
// @LINE:148
// @LINE:147
// @LINE:146
// @LINE:145
// @LINE:144
class ReverseUnsecuredIdeaTypes {
    


 
// @LINE:149
def delete(id:Long) = new play.api.mvc.HandlerRef(
   controllers.tests.UnsecuredIdeaTypes.delete(id), HandlerDef(this, "controllers.tests.UnsecuredIdeaTypes", "delete", Seq(classOf[Long]))
)
                              
 
// @LINE:145
def count() = new play.api.mvc.HandlerRef(
   controllers.tests.UnsecuredIdeaTypes.count(), HandlerDef(this, "controllers.tests.UnsecuredIdeaTypes", "count", Seq())
)
                              
 
// @LINE:146
def update(id:Long) = new play.api.mvc.HandlerRef(
   controllers.tests.UnsecuredIdeaTypes.update(id), HandlerDef(this, "controllers.tests.UnsecuredIdeaTypes", "update", Seq(classOf[Long]))
)
                              
 
// @LINE:144
def list() = new play.api.mvc.HandlerRef(
   controllers.tests.UnsecuredIdeaTypes.list(), HandlerDef(this, "controllers.tests.UnsecuredIdeaTypes", "list", Seq())
)
                              
 
// @LINE:148
def show(id:Long) = new play.api.mvc.HandlerRef(
   controllers.tests.UnsecuredIdeaTypes.show(id), HandlerDef(this, "controllers.tests.UnsecuredIdeaTypes", "show", Seq(classOf[Long]))
)
                              
 
// @LINE:147
def save() = new play.api.mvc.HandlerRef(
   controllers.tests.UnsecuredIdeaTypes.save(), HandlerDef(this, "controllers.tests.UnsecuredIdeaTypes", "save", Seq())
)
                              

                      
    
}
                            

// @LINE:134
class ReverseGeoLocator {
    


 
// @LINE:134
def locate(address:String) = new play.api.mvc.HandlerRef(
   controllers.tests.GeoLocator.locate(address), HandlerDef(this, "controllers.tests.GeoLocator", "locate", Seq(classOf[String]))
)
                              

                      
    
}
                            

// @LINE:151
class ReverseCategorizer {
    


 
// @LINE:151
def categorize() = new play.api.mvc.HandlerRef(
   controllers.tests.Categorizer.categorize(), HandlerDef(this, "controllers.tests.Categorizer", "categorize", Seq())
)
                              

                      
    
}
                            

// @LINE:135
class ReverseCSVImporter {
    


 
// @LINE:135
def CSVimport(file:String) = new play.api.mvc.HandlerRef(
   controllers.tests.CSVImporter.CSVimport(file), HandlerDef(this, "controllers.tests.CSVImporter", "CSVimport", Seq(classOf[String]))
)
                              

                      
    
}
                            
}
                    

// @LINE:163
// @LINE:160
// @LINE:159
// @LINE:157
// @LINE:156
// @LINE:152
// @LINE:130
// @LINE:128
// @LINE:125
// @LINE:124
// @LINE:123
// @LINE:122
// @LINE:121
// @LINE:120
// @LINE:118
// @LINE:117
// @LINE:116
// @LINE:115
// @LINE:114
// @LINE:113
// @LINE:112
// @LINE:111
// @LINE:110
// @LINE:109
// @LINE:97
// @LINE:96
// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:90
// @LINE:89
// @LINE:88
// @LINE:87
// @LINE:86
// @LINE:85
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:76
// @LINE:75
// @LINE:73
// @LINE:72
// @LINE:70
// @LINE:69
// @LINE:67
// @LINE:65
// @LINE:64
// @LINE:61
// @LINE:60
// @LINE:57
// @LINE:56
// @LINE:53
// @LINE:52
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:36
// @LINE:35
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:20
// @LINE:15
// @LINE:14
// @LINE:12
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:5
package controllers.ref {

// @LINE:163
// @LINE:15
// @LINE:14
class ReverseAssets {
    


 
// @LINE:14
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            

// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
class ReverseIdeaGeos {
    


 
// @LINE:83
def delete(id:Long) = new play.api.mvc.HandlerRef(
   controllers.IdeaGeos.delete(id), HandlerDef(this, "controllers.IdeaGeos", "delete", Seq(classOf[Long]))
)
                              
 
// @LINE:79
def count() = new play.api.mvc.HandlerRef(
   controllers.IdeaGeos.count(), HandlerDef(this, "controllers.IdeaGeos", "count", Seq())
)
                              
 
// @LINE:80
def update(id:Long) = new play.api.mvc.HandlerRef(
   controllers.IdeaGeos.update(id), HandlerDef(this, "controllers.IdeaGeos", "update", Seq(classOf[Long]))
)
                              
 
// @LINE:78
def list() = new play.api.mvc.HandlerRef(
   controllers.IdeaGeos.list(), HandlerDef(this, "controllers.IdeaGeos", "list", Seq())
)
                              
 
// @LINE:82
def show(id:Long) = new play.api.mvc.HandlerRef(
   controllers.IdeaGeos.show(id), HandlerDef(this, "controllers.IdeaGeos", "show", Seq(classOf[Long]))
)
                              
 
// @LINE:81
def save() = new play.api.mvc.HandlerRef(
   controllers.IdeaGeos.save(), HandlerDef(this, "controllers.IdeaGeos", "save", Seq())
)
                              

                      
    
}
                            

// @LINE:36
// @LINE:35
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
class ReverseUsers {
    


 
// @LINE:35
def stats(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Users.stats(id), HandlerDef(this, "controllers.Users", "stats", Seq(classOf[Long]))
)
                              
 
// @LINE:27
def delete(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Users.delete(id), HandlerDef(this, "controllers.Users", "delete", Seq(classOf[Long]))
)
                              
 
// @LINE:23
def count() = new play.api.mvc.HandlerRef(
   controllers.Users.count(), HandlerDef(this, "controllers.Users", "count", Seq())
)
                              
 
// @LINE:36
def votes(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Users.votes(id), HandlerDef(this, "controllers.Users", "votes", Seq(classOf[Long]))
)
                              
 
// @LINE:28
def showByToken(token:String) = new play.api.mvc.HandlerRef(
   controllers.Users.showByToken(token), HandlerDef(this, "controllers.Users", "showByToken", Seq(classOf[String]))
)
                              
 
// @LINE:24
def update(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Users.update(id), HandlerDef(this, "controllers.Users", "update", Seq(classOf[Long]))
)
                              
 
// @LINE:22
def list() = new play.api.mvc.HandlerRef(
   controllers.Users.list(), HandlerDef(this, "controllers.Users", "list", Seq())
)
                              
 
// @LINE:26
def show(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Users.show(id), HandlerDef(this, "controllers.Users", "show", Seq(classOf[Long]))
)
                              
 
// @LINE:25
def save() = new play.api.mvc.HandlerRef(
   controllers.Users.save(), HandlerDef(this, "controllers.Users", "save", Seq())
)
                              

                      
    
}
                            

// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
class ReverseSubscriptions {
    


 
// @LINE:31
def count(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Subscriptions.count(id), HandlerDef(this, "controllers.Subscriptions", "count", Seq(classOf[Long]))
)
                              
 
// @LINE:30
def list(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Subscriptions.list(id), HandlerDef(this, "controllers.Subscriptions", "list", Seq(classOf[Long]))
)
                              
 
// @LINE:32
def save(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Subscriptions.save(id), HandlerDef(this, "controllers.Subscriptions", "save", Seq(classOf[Long]))
)
                              
 
// @LINE:33
def delete(id:Long, ideaId:Long) = new play.api.mvc.HandlerRef(
   controllers.Subscriptions.delete(id, ideaId), HandlerDef(this, "controllers.Subscriptions", "delete", Seq(classOf[Long], classOf[Long]))
)
                              

                      
    
}
                            

// @LINE:90
// @LINE:89
// @LINE:88
// @LINE:87
// @LINE:86
// @LINE:85
class ReverseIdeaTypes {
    


 
// @LINE:90
def delete(id:Long) = new play.api.mvc.HandlerRef(
   controllers.IdeaTypes.delete(id), HandlerDef(this, "controllers.IdeaTypes", "delete", Seq(classOf[Long]))
)
                              
 
// @LINE:86
def count() = new play.api.mvc.HandlerRef(
   controllers.IdeaTypes.count(), HandlerDef(this, "controllers.IdeaTypes", "count", Seq())
)
                              
 
// @LINE:87
def update(id:Long) = new play.api.mvc.HandlerRef(
   controllers.IdeaTypes.update(id), HandlerDef(this, "controllers.IdeaTypes", "update", Seq(classOf[Long]))
)
                              
 
// @LINE:85
def list() = new play.api.mvc.HandlerRef(
   controllers.IdeaTypes.list(), HandlerDef(this, "controllers.IdeaTypes", "list", Seq())
)
                              
 
// @LINE:89
def show(id:Long) = new play.api.mvc.HandlerRef(
   controllers.IdeaTypes.show(id), HandlerDef(this, "controllers.IdeaTypes", "show", Seq(classOf[Long]))
)
                              
 
// @LINE:88
def save() = new play.api.mvc.HandlerRef(
   controllers.IdeaTypes.save(), HandlerDef(this, "controllers.IdeaTypes", "save", Seq())
)
                              

                      
    
}
                            

// @LINE:97
// @LINE:96
// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:92
class ReverseIdentities {
    


 
// @LINE:97
def delete(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Identities.delete(id), HandlerDef(this, "controllers.Identities", "delete", Seq(classOf[Long]))
)
                              
 
// @LINE:93
def count() = new play.api.mvc.HandlerRef(
   controllers.Identities.count(), HandlerDef(this, "controllers.Identities", "count", Seq())
)
                              
 
// @LINE:94
def update(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Identities.update(id), HandlerDef(this, "controllers.Identities", "update", Seq(classOf[Long]))
)
                              
 
// @LINE:92
def list() = new play.api.mvc.HandlerRef(
   controllers.Identities.list(), HandlerDef(this, "controllers.Identities", "list", Seq())
)
                              
 
// @LINE:96
def show(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Identities.show(id), HandlerDef(this, "controllers.Identities", "show", Seq(classOf[Long]))
)
                              
 
// @LINE:95
def save() = new play.api.mvc.HandlerRef(
   controllers.Identities.save(), HandlerDef(this, "controllers.Identities", "save", Seq())
)
                              

                      
    
}
                            

// @LINE:152
class ReverseCategorizer {
    


 
// @LINE:152
def categorize() = new play.api.mvc.HandlerRef(
   controllers.Categorizer.categorize(), HandlerDef(this, "controllers.Categorizer", "categorize", Seq())
)
                              

                      
    
}
                            

// @LINE:61
// @LINE:60
// @LINE:57
// @LINE:56
// @LINE:53
// @LINE:52
class ReverseComments {
    


 
// @LINE:56
def save(idea:Long) = new play.api.mvc.HandlerRef(
   controllers.Comments.save(idea), HandlerDef(this, "controllers.Comments", "save", Seq(classOf[Long]))
)
                              
 
// @LINE:61
def down(idea:Long, id:Long) = new play.api.mvc.HandlerRef(
   controllers.Comments.down(idea, id), HandlerDef(this, "controllers.Comments", "down", Seq(classOf[Long], classOf[Long]))
)
                              
 
// @LINE:57
def show(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Comments.show(id), HandlerDef(this, "controllers.Comments", "show", Seq(classOf[Long]))
)
                              
 
// @LINE:52
def listAll() = new play.api.mvc.HandlerRef(
   controllers.Comments.listAll(), HandlerDef(this, "controllers.Comments", "listAll", Seq())
)
                              
 
// @LINE:53
def list(idea:Long) = new play.api.mvc.HandlerRef(
   controllers.Comments.list(idea), HandlerDef(this, "controllers.Comments", "list", Seq(classOf[Long]))
)
                              
 
// @LINE:60
def up(idea:Long, id:Long) = new play.api.mvc.HandlerRef(
   controllers.Comments.up(idea, id), HandlerDef(this, "controllers.Comments", "up", Seq(classOf[Long], classOf[Long]))
)
                              

                      
    
}
                            

// @LINE:76
// @LINE:75
// @LINE:73
// @LINE:72
// @LINE:70
// @LINE:69
// @LINE:67
// @LINE:65
// @LINE:64
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
class ReverseIdeas {
    


 
// @LINE:44
def up(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Ideas.up(id), HandlerDef(this, "controllers.Ideas", "up", Seq(classOf[Long]))
)
                              
 
// @LINE:45
def down(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Ideas.down(id), HandlerDef(this, "controllers.Ideas", "down", Seq(classOf[Long]))
)
                              
 
// @LINE:64
def listTags(idea:Long) = new play.api.mvc.HandlerRef(
   controllers.Ideas.listTags(idea), HandlerDef(this, "controllers.Ideas", "listTags", Seq(classOf[Long]))
)
                              
 
// @LINE:72
def listGeos(idea:Long) = new play.api.mvc.HandlerRef(
   controllers.Ideas.listGeos(idea), HandlerDef(this, "controllers.Ideas", "listGeos", Seq(classOf[Long]))
)
                              
 
// @LINE:67
def updateTags(idea:Long) = new play.api.mvc.HandlerRef(
   controllers.Ideas.updateTags(idea), HandlerDef(this, "controllers.Ideas", "updateTags", Seq(classOf[Long]))
)
                              
 
// @LINE:69
def saveTag(idea:Long, tag:String) = new play.api.mvc.HandlerRef(
   controllers.Ideas.saveTag(idea, tag), HandlerDef(this, "controllers.Ideas", "saveTag", Seq(classOf[Long], classOf[String]))
)
                              
 
// @LINE:76
def deleteGeo(idea:Long, name:String) = new play.api.mvc.HandlerRef(
   controllers.Ideas.deleteGeo(idea, name), HandlerDef(this, "controllers.Ideas", "deleteGeo", Seq(classOf[Long], classOf[String]))
)
                              
 
// @LINE:43
def delete(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Ideas.delete(id), HandlerDef(this, "controllers.Ideas", "delete", Seq(classOf[Long]))
)
                              
 
// @LINE:39
def count() = new play.api.mvc.HandlerRef(
   controllers.Ideas.count(), HandlerDef(this, "controllers.Ideas", "count", Seq())
)
                              
 
// @LINE:73
def countGeos(idea:Long) = new play.api.mvc.HandlerRef(
   controllers.Ideas.countGeos(idea), HandlerDef(this, "controllers.Ideas", "countGeos", Seq(classOf[Long]))
)
                              
 
// @LINE:70
def deleteTag(idea:Long, tag:String) = new play.api.mvc.HandlerRef(
   controllers.Ideas.deleteTag(idea, tag), HandlerDef(this, "controllers.Ideas", "deleteTag", Seq(classOf[Long], classOf[String]))
)
                              
 
// @LINE:65
def countTags(idea:Long) = new play.api.mvc.HandlerRef(
   controllers.Ideas.countTags(idea), HandlerDef(this, "controllers.Ideas", "countTags", Seq(classOf[Long]))
)
                              
 
// @LINE:40
def update(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Ideas.update(id), HandlerDef(this, "controllers.Ideas", "update", Seq(classOf[Long]))
)
                              
 
// @LINE:75
def saveGeo(idea:Long) = new play.api.mvc.HandlerRef(
   controllers.Ideas.saveGeo(idea), HandlerDef(this, "controllers.Ideas", "saveGeo", Seq(classOf[Long]))
)
                              
 
// @LINE:38
def list() = new play.api.mvc.HandlerRef(
   controllers.Ideas.list(), HandlerDef(this, "controllers.Ideas", "list", Seq())
)
                              
 
// @LINE:42
def show(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Ideas.show(id), HandlerDef(this, "controllers.Ideas", "show", Seq(classOf[Long]))
)
                              
 
// @LINE:41
def save() = new play.api.mvc.HandlerRef(
   controllers.Ideas.save(), HandlerDef(this, "controllers.Ideas", "save", Seq())
)
                              

                      
    
}
                            

// @LINE:125
// @LINE:124
// @LINE:123
// @LINE:122
// @LINE:121
// @LINE:120
class ReverseVotes {
    


 
// @LINE:125
def delete(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Votes.delete(id), HandlerDef(this, "controllers.Votes", "delete", Seq(classOf[Long]))
)
                              
 
// @LINE:121
def count() = new play.api.mvc.HandlerRef(
   controllers.Votes.count(), HandlerDef(this, "controllers.Votes", "count", Seq())
)
                              
 
// @LINE:122
def update(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Votes.update(id), HandlerDef(this, "controllers.Votes", "update", Seq(classOf[Long]))
)
                              
 
// @LINE:120
def list() = new play.api.mvc.HandlerRef(
   controllers.Votes.list(), HandlerDef(this, "controllers.Votes", "list", Seq())
)
                              
 
// @LINE:124
def show(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Votes.show(id), HandlerDef(this, "controllers.Votes", "show", Seq(classOf[Long]))
)
                              
 
// @LINE:123
def save() = new play.api.mvc.HandlerRef(
   controllers.Votes.save(), HandlerDef(this, "controllers.Votes", "save", Seq())
)
                              

                      
    
}
                            

// @LINE:160
// @LINE:159
// @LINE:157
// @LINE:156
class ReverseManagement {
    


 
// @LINE:159
def updateIdea(id:Long, text:String) = new play.api.mvc.HandlerRef(
   controllers.Management.updateIdea(id, text), HandlerDef(this, "controllers.Management", "updateIdea", Seq(classOf[Long], classOf[String]))
)
                              
 
// @LINE:157
def zapComment(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Management.zapComment(id), HandlerDef(this, "controllers.Management", "zapComment", Seq(classOf[Long]))
)
                              
 
// @LINE:160
def updateComment(id:Long, text:String) = new play.api.mvc.HandlerRef(
   controllers.Management.updateComment(id, text), HandlerDef(this, "controllers.Management", "updateComment", Seq(classOf[Long], classOf[String]))
)
                              
 
// @LINE:156
def zapIdea(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Management.zapIdea(id), HandlerDef(this, "controllers.Management", "zapIdea", Seq(classOf[Long]))
)
                              

                      
    
}
                            

// @LINE:130
// @LINE:128
// @LINE:20
// @LINE:5
class ReverseApplication {
    


 
// @LINE:130
def mail() = new play.api.mvc.HandlerRef(
   controllers.Application.mail(), HandlerDef(this, "controllers.Application", "mail", Seq())
)
                              
 
// @LINE:20
def api() = new play.api.mvc.HandlerRef(
   controllers.Application.api(), HandlerDef(this, "controllers.Application", "api", Seq())
)
                              
 
// @LINE:5
def options(url:String) = new play.api.mvc.HandlerRef(
   controllers.Application.options(url), HandlerDef(this, "controllers.Application", "options", Seq(classOf[String]))
)
                              
 
// @LINE:128
def javascriptRoutes() = new play.api.mvc.HandlerRef(
   controllers.Application.javascriptRoutes(), HandlerDef(this, "controllers.Application", "javascriptRoutes", Seq())
)
                              

                      
    
}
                            

// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
class ReverseSubscribers {
    


 
// @LINE:48
def count(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Subscribers.count(id), HandlerDef(this, "controllers.Subscribers", "count", Seq(classOf[Long]))
)
                              
 
// @LINE:47
def list(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Subscribers.list(id), HandlerDef(this, "controllers.Subscribers", "list", Seq(classOf[Long]))
)
                              
 
// @LINE:49
def save(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Subscribers.save(id), HandlerDef(this, "controllers.Subscribers", "save", Seq(classOf[Long]))
)
                              
 
// @LINE:50
def delete(id:Long, userId:Long) = new play.api.mvc.HandlerRef(
   controllers.Subscribers.delete(id, userId), HandlerDef(this, "controllers.Subscribers", "delete", Seq(classOf[Long], classOf[Long]))
)
                              

                      
    
}
                            

// @LINE:118
// @LINE:117
// @LINE:116
// @LINE:115
// @LINE:114
// @LINE:113
// @LINE:112
// @LINE:111
// @LINE:110
// @LINE:109
class ReverseTags {
    


 
// @LINE:115
def listIdeasByTagId(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Tags.listIdeasByTagId(id), HandlerDef(this, "controllers.Tags", "listIdeasByTagId", Seq(classOf[Long]))
)
                              
 
// @LINE:114
def delete(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Tags.delete(id), HandlerDef(this, "controllers.Tags", "delete", Seq(classOf[Long]))
)
                              
 
// @LINE:110
def count() = new play.api.mvc.HandlerRef(
   controllers.Tags.count(), HandlerDef(this, "controllers.Tags", "count", Seq())
)
                              
 
// @LINE:116
def listIdeas(tag:String) = new play.api.mvc.HandlerRef(
   controllers.Tags.listIdeas(tag), HandlerDef(this, "controllers.Tags", "listIdeas", Seq(classOf[String]))
)
                              
 
// @LINE:118
def countIdeas(tag:String) = new play.api.mvc.HandlerRef(
   controllers.Tags.countIdeas(tag), HandlerDef(this, "controllers.Tags", "countIdeas", Seq(classOf[String]))
)
                              
 
// @LINE:111
def update(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Tags.update(id), HandlerDef(this, "controllers.Tags", "update", Seq(classOf[Long]))
)
                              
 
// @LINE:109
def list() = new play.api.mvc.HandlerRef(
   controllers.Tags.list(), HandlerDef(this, "controllers.Tags", "list", Seq())
)
                              
 
// @LINE:113
def show(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Tags.show(id), HandlerDef(this, "controllers.Tags", "show", Seq(classOf[Long]))
)
                              
 
// @LINE:112
def save() = new play.api.mvc.HandlerRef(
   controllers.Tags.save(), HandlerDef(this, "controllers.Tags", "save", Seq())
)
                              
 
// @LINE:117
def countIdeasByTagId(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Tags.countIdeasByTagId(id), HandlerDef(this, "controllers.Tags", "countIdeasByTagId", Seq(classOf[Long]))
)
                              

                      
    
}
                            

// @LINE:12
// @LINE:9
// @LINE:8
// @LINE:7
class ReverseSecurity {
    


 
// @LINE:7
def secured() = new play.api.mvc.HandlerRef(
   controllers.Security.secured(), HandlerDef(this, "controllers.Security", "secured", Seq())
)
                              
 
// @LINE:8
def logged() = new play.api.mvc.HandlerRef(
   controllers.Security.logged(), HandlerDef(this, "controllers.Security", "logged", Seq())
)
                              
 
// @LINE:12
def readToken() = new play.api.mvc.HandlerRef(
   controllers.Security.readToken(), HandlerDef(this, "controllers.Security", "readToken", Seq())
)
                              
 
// @LINE:9
def auth() = new play.api.mvc.HandlerRef(
   controllers.Security.auth(), HandlerDef(this, "controllers.Security", "auth", Seq())
)
                              

                      
    
}
                            
}
                    
                