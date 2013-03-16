// @SOURCE:/home/sas/Ubuntu One/apps/ideas/webservice-scala/conf/routes
// @HASH:54878700fe78b423b49b4766d87633ae57ba7ea5
// @DATE:Sat Mar 16 17:21:56 ART 2013

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {


// @LINE:5
val controllers_Application_options0 = Route("OPTIONS", PathPattern(List(StaticPart("/api/"),DynamicPart("url", """.+"""))))
                    

// @LINE:7
val controllers_Security_secured1 = Route("GET", PathPattern(List(StaticPart("/api/secured"))))
                    

// @LINE:8
val controllers_Security_logged2 = Route("GET", PathPattern(List(StaticPart("/api/logged"))))
                    

// @LINE:9
val controllers_Security_auth3 = Route("POST", PathPattern(List(StaticPart("/api/auth"))))
                    

// @LINE:12
val controllers_Security_readToken4 = Route("GET", PathPattern(List(StaticPart("/api/token"))))
                    

// @LINE:14
val controllers_Assets_at5 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:15
val controllers_Assets_at6 = Route("GET", PathPattern(List(StaticPart("/app"))))
                    

// @LINE:20
val controllers_Application_api7 = Route("GET", PathPattern(List(StaticPart("/api"))))
                    

// @LINE:22
val controllers_Users_list8 = Route("GET", PathPattern(List(StaticPart("/api/users"))))
                    

// @LINE:23
val controllers_Users_count9 = Route("GET", PathPattern(List(StaticPart("/api/users/count"))))
                    

// @LINE:24
val controllers_Users_update10 = Route("PUT", PathPattern(List(StaticPart("/api/users/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:25
val controllers_Users_save11 = Route("POST", PathPattern(List(StaticPart("/api/users"))))
                    

// @LINE:26
val controllers_Users_show12 = Route("GET", PathPattern(List(StaticPart("/api/users/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:27
val controllers_Users_delete13 = Route("DELETE", PathPattern(List(StaticPart("/api/users/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:28
val controllers_Users_showByToken14 = Route("GET", PathPattern(List(StaticPart("/api/users/token/"),DynamicPart("token", """[^/]+"""))))
                    

// @LINE:30
val controllers_Subscriptions_list15 = Route("GET", PathPattern(List(StaticPart("/api/users/"),DynamicPart("id", """[^/]+"""),StaticPart("/subscriptions"))))
                    

// @LINE:31
val controllers_Subscriptions_count16 = Route("GET", PathPattern(List(StaticPart("/api/users/"),DynamicPart("id", """[^/]+"""),StaticPart("/subscriptions/count"))))
                    

// @LINE:32
val controllers_Subscriptions_save17 = Route("POST", PathPattern(List(StaticPart("/api/users/"),DynamicPart("id", """[^/]+"""),StaticPart("/subscriptions"))))
                    

// @LINE:33
val controllers_Subscriptions_delete18 = Route("DELETE", PathPattern(List(StaticPart("/api/users/"),DynamicPart("id", """[^/]+"""),StaticPart("/subscriptions/"),DynamicPart("ideaId", """[^/]+"""))))
                    

// @LINE:35
val controllers_Users_stats19 = Route("GET", PathPattern(List(StaticPart("/api/users/"),DynamicPart("id", """[^/]+"""),StaticPart("/stats"))))
                    

// @LINE:36
val controllers_Users_votes20 = Route("GET", PathPattern(List(StaticPart("/api/users/"),DynamicPart("id", """[^/]+"""),StaticPart("/votes"))))
                    

// @LINE:38
val controllers_Ideas_list21 = Route("GET", PathPattern(List(StaticPart("/api/ideas"))))
                    

// @LINE:39
val controllers_Ideas_count22 = Route("GET", PathPattern(List(StaticPart("/api/ideas/count"))))
                    

// @LINE:40
val controllers_Ideas_update23 = Route("PUT", PathPattern(List(StaticPart("/api/ideas/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:41
val controllers_Ideas_save24 = Route("POST", PathPattern(List(StaticPart("/api/ideas"))))
                    

// @LINE:42
val controllers_Ideas_show25 = Route("GET", PathPattern(List(StaticPart("/api/ideas/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:43
val controllers_Ideas_delete26 = Route("DELETE", PathPattern(List(StaticPart("/api/ideas/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:44
val controllers_Ideas_up27 = Route("PUT", PathPattern(List(StaticPart("/api/ideas/"),DynamicPart("id", """[^/]+"""),StaticPart("/up"))))
                    

// @LINE:45
val controllers_Ideas_down28 = Route("PUT", PathPattern(List(StaticPart("/api/ideas/"),DynamicPart("id", """[^/]+"""),StaticPart("/down"))))
                    

// @LINE:47
val controllers_Subscribers_list29 = Route("GET", PathPattern(List(StaticPart("/api/ideas/"),DynamicPart("id", """[^/]+"""),StaticPart("/subscribers"))))
                    

// @LINE:48
val controllers_Subscribers_count30 = Route("GET", PathPattern(List(StaticPart("/api/ideas/"),DynamicPart("id", """[^/]+"""),StaticPart("/subscribers/count"))))
                    

// @LINE:49
val controllers_Subscribers_save31 = Route("POST", PathPattern(List(StaticPart("/api/ideas/"),DynamicPart("id", """[^/]+"""),StaticPart("/subscribers"))))
                    

// @LINE:50
val controllers_Subscribers_delete32 = Route("DELETE", PathPattern(List(StaticPart("/api/ideas/"),DynamicPart("id", """[^/]+"""),StaticPart("/subscribers/"),DynamicPart("userId", """[^/]+"""))))
                    

// @LINE:52
val controllers_Comments_listAll33 = Route("GET", PathPattern(List(StaticPart("/api/comments"))))
                    

// @LINE:53
val controllers_Comments_list34 = Route("GET", PathPattern(List(StaticPart("/api/ideas/"),DynamicPart("idea", """[^/]+"""),StaticPart("/comments"))))
                    

// @LINE:56
val controllers_Comments_save35 = Route("POST", PathPattern(List(StaticPart("/api/ideas/"),DynamicPart("idea", """[^/]+"""),StaticPart("/comment"))))
                    

// @LINE:57
val controllers_Comments_show36 = Route("GET", PathPattern(List(StaticPart("/api/ideas/comments/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:60
val controllers_Comments_up37 = Route("PUT", PathPattern(List(StaticPart("/api/ideas/"),DynamicPart("idea", """[^/]+"""),StaticPart("/comments/"),DynamicPart("id", """[^/]+"""),StaticPart("/up"))))
                    

// @LINE:61
val controllers_Comments_down38 = Route("PUT", PathPattern(List(StaticPart("/api/ideas/"),DynamicPart("idea", """[^/]+"""),StaticPart("/comments/"),DynamicPart("id", """[^/]+"""),StaticPart("/down"))))
                    

// @LINE:64
val controllers_Ideas_listTags39 = Route("GET", PathPattern(List(StaticPart("/api/ideas/"),DynamicPart("idea", """[^/]+"""),StaticPart("/tags"))))
                    

// @LINE:65
val controllers_Ideas_countTags40 = Route("GET", PathPattern(List(StaticPart("/api/ideas/"),DynamicPart("idea", """[^/]+"""),StaticPart("/tags/count"))))
                    

// @LINE:67
val controllers_Ideas_updateTags41 = Route("PUT", PathPattern(List(StaticPart("/api/ideas/"),DynamicPart("idea", """[^/]+"""),StaticPart("/tags"))))
                    

// @LINE:69
val controllers_Ideas_saveTag42 = Route("POST", PathPattern(List(StaticPart("/api/ideas/"),DynamicPart("idea", """[^/]+"""),StaticPart("/tags/"),DynamicPart("tag", """[^/]+"""))))
                    

// @LINE:70
val controllers_Ideas_deleteTag43 = Route("DELETE", PathPattern(List(StaticPart("/api/ideas/"),DynamicPart("idea", """[^/]+"""),StaticPart("/tags/"),DynamicPart("tag", """[^/]+"""))))
                    

// @LINE:72
val controllers_Ideas_listGeos44 = Route("GET", PathPattern(List(StaticPart("/api/ideas/"),DynamicPart("idea", """[^/]+"""),StaticPart("/geo"))))
                    

// @LINE:73
val controllers_Ideas_countGeos45 = Route("GET", PathPattern(List(StaticPart("/api/ideas/"),DynamicPart("idea", """[^/]+"""),StaticPart("/geo/count"))))
                    

// @LINE:75
val controllers_Ideas_saveGeo46 = Route("POST", PathPattern(List(StaticPart("/api/ideas/"),DynamicPart("idea", """[^/]+"""),StaticPart("/geo"))))
                    

// @LINE:76
val controllers_Ideas_deleteGeo47 = Route("DELETE", PathPattern(List(StaticPart("/api/ideas/"),DynamicPart("idea", """[^/]+"""),StaticPart("/geo/"),DynamicPart("name", """[^/]+"""))))
                    

// @LINE:78
val controllers_IdeaGeos_list48 = Route("GET", PathPattern(List(StaticPart("/api/geo"))))
                    

// @LINE:79
val controllers_IdeaGeos_count49 = Route("GET", PathPattern(List(StaticPart("/api/geo/count"))))
                    

// @LINE:80
val controllers_IdeaGeos_update50 = Route("PUT", PathPattern(List(StaticPart("/api/geo/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:81
val controllers_IdeaGeos_save51 = Route("POST", PathPattern(List(StaticPart("/api/geo"))))
                    

// @LINE:82
val controllers_IdeaGeos_show52 = Route("GET", PathPattern(List(StaticPart("/api/geo/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:83
val controllers_IdeaGeos_delete53 = Route("DELETE", PathPattern(List(StaticPart("/api/geo/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:85
val controllers_IdeaTypes_list54 = Route("GET", PathPattern(List(StaticPart("/api/types"))))
                    

// @LINE:86
val controllers_IdeaTypes_count55 = Route("GET", PathPattern(List(StaticPart("/api/types/count"))))
                    

// @LINE:87
val controllers_IdeaTypes_update56 = Route("PUT", PathPattern(List(StaticPart("/api/types/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:88
val controllers_IdeaTypes_save57 = Route("POST", PathPattern(List(StaticPart("/api/types"))))
                    

// @LINE:89
val controllers_IdeaTypes_show58 = Route("GET", PathPattern(List(StaticPart("/api/types/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:90
val controllers_IdeaTypes_delete59 = Route("DELETE", PathPattern(List(StaticPart("/api/types/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:92
val controllers_Identities_list60 = Route("GET", PathPattern(List(StaticPart("/api/identities"))))
                    

// @LINE:93
val controllers_Identities_count61 = Route("GET", PathPattern(List(StaticPart("/api/identities/count"))))
                    

// @LINE:94
val controllers_Identities_update62 = Route("PUT", PathPattern(List(StaticPart("/api/identities/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:95
val controllers_Identities_save63 = Route("POST", PathPattern(List(StaticPart("/api/identities"))))
                    

// @LINE:96
val controllers_Identities_show64 = Route("GET", PathPattern(List(StaticPart("/api/identities/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:97
val controllers_Identities_delete65 = Route("DELETE", PathPattern(List(StaticPart("/api/identities/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:109
val controllers_Tags_list66 = Route("GET", PathPattern(List(StaticPart("/api/tags"))))
                    

// @LINE:110
val controllers_Tags_count67 = Route("GET", PathPattern(List(StaticPart("/api/tags/count"))))
                    

// @LINE:111
val controllers_Tags_update68 = Route("PUT", PathPattern(List(StaticPart("/api/tags/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:112
val controllers_Tags_save69 = Route("POST", PathPattern(List(StaticPart("/api/tags"))))
                    

// @LINE:113
val controllers_Tags_show70 = Route("GET", PathPattern(List(StaticPart("/api/tags/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:114
val controllers_Tags_delete71 = Route("DELETE", PathPattern(List(StaticPart("/api/tags/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:115
val controllers_Tags_listIdeasByTagId72 = Route("GET", PathPattern(List(StaticPart("/api/tags/"),DynamicPart("id", """[0-9]+"""),StaticPart("/ideas"))))
                    

// @LINE:116
val controllers_Tags_listIdeas73 = Route("GET", PathPattern(List(StaticPart("/api/tags/"),DynamicPart("tag", """[^/]+"""),StaticPart("/ideas"))))
                    

// @LINE:117
val controllers_Tags_countIdeasByTagId74 = Route("GET", PathPattern(List(StaticPart("/api/tags/"),DynamicPart("id", """[0-9]+"""),StaticPart("/ideas/count"))))
                    

// @LINE:118
val controllers_Tags_countIdeas75 = Route("GET", PathPattern(List(StaticPart("/api/tags/"),DynamicPart("tag", """[^/]+"""),StaticPart("/ideas/count"))))
                    

// @LINE:120
val controllers_Votes_list76 = Route("GET", PathPattern(List(StaticPart("/api/votes"))))
                    

// @LINE:121
val controllers_Votes_count77 = Route("GET", PathPattern(List(StaticPart("/api/votes/count"))))
                    

// @LINE:122
val controllers_Votes_update78 = Route("PUT", PathPattern(List(StaticPart("/api/votes/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:123
val controllers_Votes_save79 = Route("POST", PathPattern(List(StaticPart("/api/votes"))))
                    

// @LINE:124
val controllers_Votes_show80 = Route("GET", PathPattern(List(StaticPart("/api/votes/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:125
val controllers_Votes_delete81 = Route("DELETE", PathPattern(List(StaticPart("/api/votes/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:128
val controllers_Application_javascriptRoutes82 = Route("GET", PathPattern(List(StaticPart("/assets/javascripts/routes"))))
                    

// @LINE:130
val controllers_Application_mail83 = Route("GET", PathPattern(List(StaticPart("/mail/test"))))
                    

// @LINE:134
val controllers_tests_GeoLocator_locate84 = Route("GET", PathPattern(List(StaticPart("/api/tests/geo/"),DynamicPart("address", """[^/]+"""))))
                    

// @LINE:135
val controllers_tests_CSVImporter_CSVimport85 = Route("GET", PathPattern(List(StaticPart("/api/tests/csv/import/"),DynamicPart("file", """[^/]+"""))))
                    

// @LINE:137
val controllers_tests_SecuredIdeaTypes_list86 = Route("GET", PathPattern(List(StaticPart("/api/tests/secured/types"))))
                    

// @LINE:138
val controllers_tests_SecuredIdeaTypes_count87 = Route("GET", PathPattern(List(StaticPart("/api/tests/secured/types/count"))))
                    

// @LINE:139
val controllers_tests_SecuredIdeaTypes_update88 = Route("PUT", PathPattern(List(StaticPart("/api/tests/secured/types/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:140
val controllers_tests_SecuredIdeaTypes_save89 = Route("POST", PathPattern(List(StaticPart("/api/tests/secured/types"))))
                    

// @LINE:141
val controllers_tests_SecuredIdeaTypes_show90 = Route("GET", PathPattern(List(StaticPart("/api/tests/secured/types/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:142
val controllers_tests_SecuredIdeaTypes_delete91 = Route("DELETE", PathPattern(List(StaticPart("/api/tests/secured/types/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:144
val controllers_tests_UnsecuredIdeaTypes_list92 = Route("GET", PathPattern(List(StaticPart("/api/tests/unsecured/types"))))
                    

// @LINE:145
val controllers_tests_UnsecuredIdeaTypes_count93 = Route("GET", PathPattern(List(StaticPart("/api/tests/unsecured/types/count"))))
                    

// @LINE:146
val controllers_tests_UnsecuredIdeaTypes_update94 = Route("PUT", PathPattern(List(StaticPart("/api/tests/unsecured/types/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:147
val controllers_tests_UnsecuredIdeaTypes_save95 = Route("POST", PathPattern(List(StaticPart("/api/tests/unsecured/types"))))
                    

// @LINE:148
val controllers_tests_UnsecuredIdeaTypes_show96 = Route("GET", PathPattern(List(StaticPart("/api/tests/unsecured/types/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:149
val controllers_tests_UnsecuredIdeaTypes_delete97 = Route("DELETE", PathPattern(List(StaticPart("/api/tests/unsecured/types/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:151
val controllers_tests_Categorizer_categorize98 = Route("POST", PathPattern(List(StaticPart("/api/tests/categorize"))))
                    

// @LINE:152
val controllers_Categorizer_categorize99 = Route("GET", PathPattern(List(StaticPart("/api/categorize"))))
                    

// @LINE:156
val controllers_Management_zapIdea100 = Route("GET", PathPattern(List(StaticPart("/api/management/ideas/"),DynamicPart("id", """[^/]+"""),StaticPart("/zap"))))
                    

// @LINE:157
val controllers_Management_zapComment101 = Route("GET", PathPattern(List(StaticPart("/api/management/comments/"),DynamicPart("id", """[^/]+"""),StaticPart("/zap"))))
                    

// @LINE:159
val controllers_Management_updateIdea102 = Route("GET", PathPattern(List(StaticPart("/api/management/ideas/"),DynamicPart("id", """[^/]+"""),StaticPart("/"),DynamicPart("text", """[^/]+"""))))
                    

// @LINE:160
val controllers_Management_updateComment103 = Route("GET", PathPattern(List(StaticPart("/api/management/comments/"),DynamicPart("id", """[^/]+"""),StaticPart("/"),DynamicPart("text", """[^/]+"""))))
                    

// @LINE:163
val controllers_Assets_at104 = Route("GET", PathPattern(List(StaticPart("/"),DynamicPart("file", """.+"""))))
                    
def documentation = List(("""OPTIONS""","""/api/$url<.+>""","""controllers.Application.options(url:String)"""),("""GET""","""/api/secured""","""controllers.Security.secured"""),("""GET""","""/api/logged""","""controllers.Security.logged"""),("""POST""","""/api/auth""","""controllers.Security.auth"""),("""GET""","""/api/token""","""controllers.Security.readToken"""),("""GET""","""/""","""controllers.Assets.at(path:String = "/public", file:String = "index.html")"""),("""GET""","""/app""","""controllers.Assets.at(path:String = "/public", file:String = "index.html")"""),("""GET""","""/api""","""controllers.Application.api"""),("""GET""","""/api/users""","""controllers.Users.list"""),("""GET""","""/api/users/count""","""controllers.Users.count"""),("""PUT""","""/api/users/$id<[^/]+>""","""controllers.Users.update(id:Long)"""),("""POST""","""/api/users""","""controllers.Users.save"""),("""GET""","""/api/users/$id<[^/]+>""","""controllers.Users.show(id:Long)"""),("""DELETE""","""/api/users/$id<[^/]+>""","""controllers.Users.delete(id:Long)"""),("""GET""","""/api/users/token/$token<[^/]+>""","""controllers.Users.showByToken(token:String)"""),("""GET""","""/api/users/$id<[^/]+>/subscriptions""","""controllers.Subscriptions.list(id:Long)"""),("""GET""","""/api/users/$id<[^/]+>/subscriptions/count""","""controllers.Subscriptions.count(id:Long)"""),("""POST""","""/api/users/$id<[^/]+>/subscriptions""","""controllers.Subscriptions.save(id:Long)"""),("""DELETE""","""/api/users/$id<[^/]+>/subscriptions/$ideaId<[^/]+>""","""controllers.Subscriptions.delete(id:Long, ideaId:Long)"""),("""GET""","""/api/users/$id<[^/]+>/stats""","""controllers.Users.stats(id:Long)"""),("""GET""","""/api/users/$id<[^/]+>/votes""","""controllers.Users.votes(id:Long)"""),("""GET""","""/api/ideas""","""controllers.Ideas.list"""),("""GET""","""/api/ideas/count""","""controllers.Ideas.count"""),("""PUT""","""/api/ideas/$id<[^/]+>""","""controllers.Ideas.update(id:Long)"""),("""POST""","""/api/ideas""","""controllers.Ideas.save"""),("""GET""","""/api/ideas/$id<[^/]+>""","""controllers.Ideas.show(id:Long)"""),("""DELETE""","""/api/ideas/$id<[^/]+>""","""controllers.Ideas.delete(id:Long)"""),("""PUT""","""/api/ideas/$id<[^/]+>/up""","""controllers.Ideas.up(id:Long)"""),("""PUT""","""/api/ideas/$id<[^/]+>/down""","""controllers.Ideas.down(id:Long)"""),("""GET""","""/api/ideas/$id<[^/]+>/subscribers""","""controllers.Subscribers.list(id:Long)"""),("""GET""","""/api/ideas/$id<[^/]+>/subscribers/count""","""controllers.Subscribers.count(id:Long)"""),("""POST""","""/api/ideas/$id<[^/]+>/subscribers""","""controllers.Subscribers.save(id:Long)"""),("""DELETE""","""/api/ideas/$id<[^/]+>/subscribers/$userId<[^/]+>""","""controllers.Subscribers.delete(id:Long, userId:Long)"""),("""GET""","""/api/comments""","""controllers.Comments.listAll()"""),("""GET""","""/api/ideas/$idea<[^/]+>/comments""","""controllers.Comments.list(idea:Long)"""),("""POST""","""/api/ideas/$idea<[^/]+>/comment""","""controllers.Comments.save(idea:Long)"""),("""GET""","""/api/ideas/comments/$id<[^/]+>""","""controllers.Comments.show(id:Long)"""),("""PUT""","""/api/ideas/$idea<[^/]+>/comments/$id<[^/]+>/up""","""controllers.Comments.up(idea:Long, id:Long)"""),("""PUT""","""/api/ideas/$idea<[^/]+>/comments/$id<[^/]+>/down""","""controllers.Comments.down(idea:Long, id:Long)"""),("""GET""","""/api/ideas/$idea<[^/]+>/tags""","""controllers.Ideas.listTags(idea:Long)"""),("""GET""","""/api/ideas/$idea<[^/]+>/tags/count""","""controllers.Ideas.countTags(idea:Long)"""),("""PUT""","""/api/ideas/$idea<[^/]+>/tags""","""controllers.Ideas.updateTags(idea:Long)"""),("""POST""","""/api/ideas/$idea<[^/]+>/tags/$tag<[^/]+>""","""controllers.Ideas.saveTag(idea:Long, tag:String)"""),("""DELETE""","""/api/ideas/$idea<[^/]+>/tags/$tag<[^/]+>""","""controllers.Ideas.deleteTag(idea:Long, tag:String)"""),("""GET""","""/api/ideas/$idea<[^/]+>/geo""","""controllers.Ideas.listGeos(idea:Long)"""),("""GET""","""/api/ideas/$idea<[^/]+>/geo/count""","""controllers.Ideas.countGeos(idea:Long)"""),("""POST""","""/api/ideas/$idea<[^/]+>/geo""","""controllers.Ideas.saveGeo(idea:Long)"""),("""DELETE""","""/api/ideas/$idea<[^/]+>/geo/$name<[^/]+>""","""controllers.Ideas.deleteGeo(idea:Long, name:String)"""),("""GET""","""/api/geo""","""controllers.IdeaGeos.list"""),("""GET""","""/api/geo/count""","""controllers.IdeaGeos.count"""),("""PUT""","""/api/geo/$id<[^/]+>""","""controllers.IdeaGeos.update(id:Long)"""),("""POST""","""/api/geo""","""controllers.IdeaGeos.save"""),("""GET""","""/api/geo/$id<[^/]+>""","""controllers.IdeaGeos.show(id:Long)"""),("""DELETE""","""/api/geo/$id<[^/]+>""","""controllers.IdeaGeos.delete(id:Long)"""),("""GET""","""/api/types""","""controllers.IdeaTypes.list"""),("""GET""","""/api/types/count""","""controllers.IdeaTypes.count"""),("""PUT""","""/api/types/$id<[^/]+>""","""controllers.IdeaTypes.update(id:Long)"""),("""POST""","""/api/types""","""controllers.IdeaTypes.save"""),("""GET""","""/api/types/$id<[^/]+>""","""controllers.IdeaTypes.show(id:Long)"""),("""DELETE""","""/api/types/$id<[^/]+>""","""controllers.IdeaTypes.delete(id:Long)"""),("""GET""","""/api/identities""","""controllers.Identities.list"""),("""GET""","""/api/identities/count""","""controllers.Identities.count"""),("""PUT""","""/api/identities/$id<[^/]+>""","""controllers.Identities.update(id:Long)"""),("""POST""","""/api/identities""","""controllers.Identities.save"""),("""GET""","""/api/identities/$id<[^/]+>""","""controllers.Identities.show(id:Long)"""),("""DELETE""","""/api/identities/$id<[^/]+>""","""controllers.Identities.delete(id:Long)"""),("""GET""","""/api/tags""","""controllers.Tags.list"""),("""GET""","""/api/tags/count""","""controllers.Tags.count"""),("""PUT""","""/api/tags/$id<[^/]+>""","""controllers.Tags.update(id:Long)"""),("""POST""","""/api/tags""","""controllers.Tags.save"""),("""GET""","""/api/tags/$id<[^/]+>""","""controllers.Tags.show(id:Long)"""),("""DELETE""","""/api/tags/$id<[^/]+>""","""controllers.Tags.delete(id:Long)"""),("""GET""","""/api/tags/$id<[0-9]+>/ideas""","""controllers.Tags.listIdeasByTagId(id:Long)"""),("""GET""","""/api/tags/$tag<[^/]+>/ideas""","""controllers.Tags.listIdeas(tag:String)"""),("""GET""","""/api/tags/$id<[0-9]+>/ideas/count""","""controllers.Tags.countIdeasByTagId(id:Long)"""),("""GET""","""/api/tags/$tag<[^/]+>/ideas/count""","""controllers.Tags.countIdeas(tag:String)"""),("""GET""","""/api/votes""","""controllers.Votes.list"""),("""GET""","""/api/votes/count""","""controllers.Votes.count"""),("""PUT""","""/api/votes/$id<[^/]+>""","""controllers.Votes.update(id:Long)"""),("""POST""","""/api/votes""","""controllers.Votes.save"""),("""GET""","""/api/votes/$id<[^/]+>""","""controllers.Votes.show(id:Long)"""),("""DELETE""","""/api/votes/$id<[^/]+>""","""controllers.Votes.delete(id:Long)"""),("""GET""","""/assets/javascripts/routes""","""controllers.Application.javascriptRoutes"""),("""GET""","""/mail/test""","""controllers.Application.mail"""),("""GET""","""/api/tests/geo/$address<[^/]+>""","""controllers.tests.GeoLocator.locate(address:String)"""),("""GET""","""/api/tests/csv/import/$file<[^/]+>""","""controllers.tests.CSVImporter.CSVimport(file:String)"""),("""GET""","""/api/tests/secured/types""","""controllers.tests.SecuredIdeaTypes.list"""),("""GET""","""/api/tests/secured/types/count""","""controllers.tests.SecuredIdeaTypes.count"""),("""PUT""","""/api/tests/secured/types/$id<[^/]+>""","""controllers.tests.SecuredIdeaTypes.update(id:Long)"""),("""POST""","""/api/tests/secured/types""","""controllers.tests.SecuredIdeaTypes.save"""),("""GET""","""/api/tests/secured/types/$id<[^/]+>""","""controllers.tests.SecuredIdeaTypes.show(id:Long)"""),("""DELETE""","""/api/tests/secured/types/$id<[^/]+>""","""controllers.tests.SecuredIdeaTypes.delete(id:Long)"""),("""GET""","""/api/tests/unsecured/types""","""controllers.tests.UnsecuredIdeaTypes.list"""),("""GET""","""/api/tests/unsecured/types/count""","""controllers.tests.UnsecuredIdeaTypes.count"""),("""PUT""","""/api/tests/unsecured/types/$id<[^/]+>""","""controllers.tests.UnsecuredIdeaTypes.update(id:Long)"""),("""POST""","""/api/tests/unsecured/types""","""controllers.tests.UnsecuredIdeaTypes.save"""),("""GET""","""/api/tests/unsecured/types/$id<[^/]+>""","""controllers.tests.UnsecuredIdeaTypes.show(id:Long)"""),("""DELETE""","""/api/tests/unsecured/types/$id<[^/]+>""","""controllers.tests.UnsecuredIdeaTypes.delete(id:Long)"""),("""POST""","""/api/tests/categorize""","""controllers.tests.Categorizer.categorize"""),("""GET""","""/api/categorize""","""controllers.Categorizer.categorize"""),("""GET""","""/api/management/ideas/$id<[^/]+>/zap""","""controllers.Management.zapIdea(id:Long)"""),("""GET""","""/api/management/comments/$id<[^/]+>/zap""","""controllers.Management.zapComment(id:Long)"""),("""GET""","""/api/management/ideas/$id<[^/]+>/$text<[^/]+>""","""controllers.Management.updateIdea(id:Long, text:String)"""),("""GET""","""/api/management/comments/$id<[^/]+>/$text<[^/]+>""","""controllers.Management.updateComment(id:Long, text:String)"""),("""GET""","""/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:5
case controllers_Application_options0(params) => {
   call(params.fromPath[String]("url", None)) { (url) =>
        invokeHandler(_root_.controllers.Application.options(url), HandlerDef(this, "controllers.Application", "options", Seq(classOf[String])))
   }
}
                    

// @LINE:7
case controllers_Security_secured1(params) => {
   call { 
        invokeHandler(_root_.controllers.Security.secured, HandlerDef(this, "controllers.Security", "secured", Nil))
   }
}
                    

// @LINE:8
case controllers_Security_logged2(params) => {
   call { 
        invokeHandler(_root_.controllers.Security.logged, HandlerDef(this, "controllers.Security", "logged", Nil))
   }
}
                    

// @LINE:9
case controllers_Security_auth3(params) => {
   call { 
        invokeHandler(_root_.controllers.Security.auth, HandlerDef(this, "controllers.Security", "auth", Nil))
   }
}
                    

// @LINE:12
case controllers_Security_readToken4(params) => {
   call { 
        invokeHandler(_root_.controllers.Security.readToken, HandlerDef(this, "controllers.Security", "readToken", Nil))
   }
}
                    

// @LINE:14
case controllers_Assets_at5(params) => {
   call(Param[String]("path", Right("/public")), Param[String]("file", Right("index.html"))) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    

// @LINE:15
case controllers_Assets_at6(params) => {
   call(Param[String]("path", Right("/public")), Param[String]("file", Right("index.html"))) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    

// @LINE:20
case controllers_Application_api7(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.api, HandlerDef(this, "controllers.Application", "api", Nil))
   }
}
                    

// @LINE:22
case controllers_Users_list8(params) => {
   call { 
        invokeHandler(_root_.controllers.Users.list, HandlerDef(this, "controllers.Users", "list", Nil))
   }
}
                    

// @LINE:23
case controllers_Users_count9(params) => {
   call { 
        invokeHandler(_root_.controllers.Users.count, HandlerDef(this, "controllers.Users", "count", Nil))
   }
}
                    

// @LINE:24
case controllers_Users_update10(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Users.update(id), HandlerDef(this, "controllers.Users", "update", Seq(classOf[Long])))
   }
}
                    

// @LINE:25
case controllers_Users_save11(params) => {
   call { 
        invokeHandler(_root_.controllers.Users.save, HandlerDef(this, "controllers.Users", "save", Nil))
   }
}
                    

// @LINE:26
case controllers_Users_show12(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Users.show(id), HandlerDef(this, "controllers.Users", "show", Seq(classOf[Long])))
   }
}
                    

// @LINE:27
case controllers_Users_delete13(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Users.delete(id), HandlerDef(this, "controllers.Users", "delete", Seq(classOf[Long])))
   }
}
                    

// @LINE:28
case controllers_Users_showByToken14(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        invokeHandler(_root_.controllers.Users.showByToken(token), HandlerDef(this, "controllers.Users", "showByToken", Seq(classOf[String])))
   }
}
                    

// @LINE:30
case controllers_Subscriptions_list15(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Subscriptions.list(id), HandlerDef(this, "controllers.Subscriptions", "list", Seq(classOf[Long])))
   }
}
                    

// @LINE:31
case controllers_Subscriptions_count16(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Subscriptions.count(id), HandlerDef(this, "controllers.Subscriptions", "count", Seq(classOf[Long])))
   }
}
                    

// @LINE:32
case controllers_Subscriptions_save17(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Subscriptions.save(id), HandlerDef(this, "controllers.Subscriptions", "save", Seq(classOf[Long])))
   }
}
                    

// @LINE:33
case controllers_Subscriptions_delete18(params) => {
   call(params.fromPath[Long]("id", None), params.fromPath[Long]("ideaId", None)) { (id, ideaId) =>
        invokeHandler(_root_.controllers.Subscriptions.delete(id, ideaId), HandlerDef(this, "controllers.Subscriptions", "delete", Seq(classOf[Long], classOf[Long])))
   }
}
                    

// @LINE:35
case controllers_Users_stats19(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Users.stats(id), HandlerDef(this, "controllers.Users", "stats", Seq(classOf[Long])))
   }
}
                    

// @LINE:36
case controllers_Users_votes20(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Users.votes(id), HandlerDef(this, "controllers.Users", "votes", Seq(classOf[Long])))
   }
}
                    

// @LINE:38
case controllers_Ideas_list21(params) => {
   call { 
        invokeHandler(_root_.controllers.Ideas.list, HandlerDef(this, "controllers.Ideas", "list", Nil))
   }
}
                    

// @LINE:39
case controllers_Ideas_count22(params) => {
   call { 
        invokeHandler(_root_.controllers.Ideas.count, HandlerDef(this, "controllers.Ideas", "count", Nil))
   }
}
                    

// @LINE:40
case controllers_Ideas_update23(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Ideas.update(id), HandlerDef(this, "controllers.Ideas", "update", Seq(classOf[Long])))
   }
}
                    

// @LINE:41
case controllers_Ideas_save24(params) => {
   call { 
        invokeHandler(_root_.controllers.Ideas.save, HandlerDef(this, "controllers.Ideas", "save", Nil))
   }
}
                    

// @LINE:42
case controllers_Ideas_show25(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Ideas.show(id), HandlerDef(this, "controllers.Ideas", "show", Seq(classOf[Long])))
   }
}
                    

// @LINE:43
case controllers_Ideas_delete26(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Ideas.delete(id), HandlerDef(this, "controllers.Ideas", "delete", Seq(classOf[Long])))
   }
}
                    

// @LINE:44
case controllers_Ideas_up27(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Ideas.up(id), HandlerDef(this, "controllers.Ideas", "up", Seq(classOf[Long])))
   }
}
                    

// @LINE:45
case controllers_Ideas_down28(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Ideas.down(id), HandlerDef(this, "controllers.Ideas", "down", Seq(classOf[Long])))
   }
}
                    

// @LINE:47
case controllers_Subscribers_list29(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Subscribers.list(id), HandlerDef(this, "controllers.Subscribers", "list", Seq(classOf[Long])))
   }
}
                    

// @LINE:48
case controllers_Subscribers_count30(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Subscribers.count(id), HandlerDef(this, "controllers.Subscribers", "count", Seq(classOf[Long])))
   }
}
                    

// @LINE:49
case controllers_Subscribers_save31(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Subscribers.save(id), HandlerDef(this, "controllers.Subscribers", "save", Seq(classOf[Long])))
   }
}
                    

// @LINE:50
case controllers_Subscribers_delete32(params) => {
   call(params.fromPath[Long]("id", None), params.fromPath[Long]("userId", None)) { (id, userId) =>
        invokeHandler(_root_.controllers.Subscribers.delete(id, userId), HandlerDef(this, "controllers.Subscribers", "delete", Seq(classOf[Long], classOf[Long])))
   }
}
                    

// @LINE:52
case controllers_Comments_listAll33(params) => {
   call { 
        invokeHandler(_root_.controllers.Comments.listAll(), HandlerDef(this, "controllers.Comments", "listAll", Nil))
   }
}
                    

// @LINE:53
case controllers_Comments_list34(params) => {
   call(params.fromPath[Long]("idea", None)) { (idea) =>
        invokeHandler(_root_.controllers.Comments.list(idea), HandlerDef(this, "controllers.Comments", "list", Seq(classOf[Long])))
   }
}
                    

// @LINE:56
case controllers_Comments_save35(params) => {
   call(params.fromPath[Long]("idea", None)) { (idea) =>
        invokeHandler(_root_.controllers.Comments.save(idea), HandlerDef(this, "controllers.Comments", "save", Seq(classOf[Long])))
   }
}
                    

// @LINE:57
case controllers_Comments_show36(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Comments.show(id), HandlerDef(this, "controllers.Comments", "show", Seq(classOf[Long])))
   }
}
                    

// @LINE:60
case controllers_Comments_up37(params) => {
   call(params.fromPath[Long]("idea", None), params.fromPath[Long]("id", None)) { (idea, id) =>
        invokeHandler(_root_.controllers.Comments.up(idea, id), HandlerDef(this, "controllers.Comments", "up", Seq(classOf[Long], classOf[Long])))
   }
}
                    

// @LINE:61
case controllers_Comments_down38(params) => {
   call(params.fromPath[Long]("idea", None), params.fromPath[Long]("id", None)) { (idea, id) =>
        invokeHandler(_root_.controllers.Comments.down(idea, id), HandlerDef(this, "controllers.Comments", "down", Seq(classOf[Long], classOf[Long])))
   }
}
                    

// @LINE:64
case controllers_Ideas_listTags39(params) => {
   call(params.fromPath[Long]("idea", None)) { (idea) =>
        invokeHandler(_root_.controllers.Ideas.listTags(idea), HandlerDef(this, "controllers.Ideas", "listTags", Seq(classOf[Long])))
   }
}
                    

// @LINE:65
case controllers_Ideas_countTags40(params) => {
   call(params.fromPath[Long]("idea", None)) { (idea) =>
        invokeHandler(_root_.controllers.Ideas.countTags(idea), HandlerDef(this, "controllers.Ideas", "countTags", Seq(classOf[Long])))
   }
}
                    

// @LINE:67
case controllers_Ideas_updateTags41(params) => {
   call(params.fromPath[Long]("idea", None)) { (idea) =>
        invokeHandler(_root_.controllers.Ideas.updateTags(idea), HandlerDef(this, "controllers.Ideas", "updateTags", Seq(classOf[Long])))
   }
}
                    

// @LINE:69
case controllers_Ideas_saveTag42(params) => {
   call(params.fromPath[Long]("idea", None), params.fromPath[String]("tag", None)) { (idea, tag) =>
        invokeHandler(_root_.controllers.Ideas.saveTag(idea, tag), HandlerDef(this, "controllers.Ideas", "saveTag", Seq(classOf[Long], classOf[String])))
   }
}
                    

// @LINE:70
case controllers_Ideas_deleteTag43(params) => {
   call(params.fromPath[Long]("idea", None), params.fromPath[String]("tag", None)) { (idea, tag) =>
        invokeHandler(_root_.controllers.Ideas.deleteTag(idea, tag), HandlerDef(this, "controllers.Ideas", "deleteTag", Seq(classOf[Long], classOf[String])))
   }
}
                    

// @LINE:72
case controllers_Ideas_listGeos44(params) => {
   call(params.fromPath[Long]("idea", None)) { (idea) =>
        invokeHandler(_root_.controllers.Ideas.listGeos(idea), HandlerDef(this, "controllers.Ideas", "listGeos", Seq(classOf[Long])))
   }
}
                    

// @LINE:73
case controllers_Ideas_countGeos45(params) => {
   call(params.fromPath[Long]("idea", None)) { (idea) =>
        invokeHandler(_root_.controllers.Ideas.countGeos(idea), HandlerDef(this, "controllers.Ideas", "countGeos", Seq(classOf[Long])))
   }
}
                    

// @LINE:75
case controllers_Ideas_saveGeo46(params) => {
   call(params.fromPath[Long]("idea", None)) { (idea) =>
        invokeHandler(_root_.controllers.Ideas.saveGeo(idea), HandlerDef(this, "controllers.Ideas", "saveGeo", Seq(classOf[Long])))
   }
}
                    

// @LINE:76
case controllers_Ideas_deleteGeo47(params) => {
   call(params.fromPath[Long]("idea", None), params.fromPath[String]("name", None)) { (idea, name) =>
        invokeHandler(_root_.controllers.Ideas.deleteGeo(idea, name), HandlerDef(this, "controllers.Ideas", "deleteGeo", Seq(classOf[Long], classOf[String])))
   }
}
                    

// @LINE:78
case controllers_IdeaGeos_list48(params) => {
   call { 
        invokeHandler(_root_.controllers.IdeaGeos.list, HandlerDef(this, "controllers.IdeaGeos", "list", Nil))
   }
}
                    

// @LINE:79
case controllers_IdeaGeos_count49(params) => {
   call { 
        invokeHandler(_root_.controllers.IdeaGeos.count, HandlerDef(this, "controllers.IdeaGeos", "count", Nil))
   }
}
                    

// @LINE:80
case controllers_IdeaGeos_update50(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.IdeaGeos.update(id), HandlerDef(this, "controllers.IdeaGeos", "update", Seq(classOf[Long])))
   }
}
                    

// @LINE:81
case controllers_IdeaGeos_save51(params) => {
   call { 
        invokeHandler(_root_.controllers.IdeaGeos.save, HandlerDef(this, "controllers.IdeaGeos", "save", Nil))
   }
}
                    

// @LINE:82
case controllers_IdeaGeos_show52(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.IdeaGeos.show(id), HandlerDef(this, "controllers.IdeaGeos", "show", Seq(classOf[Long])))
   }
}
                    

// @LINE:83
case controllers_IdeaGeos_delete53(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.IdeaGeos.delete(id), HandlerDef(this, "controllers.IdeaGeos", "delete", Seq(classOf[Long])))
   }
}
                    

// @LINE:85
case controllers_IdeaTypes_list54(params) => {
   call { 
        invokeHandler(_root_.controllers.IdeaTypes.list, HandlerDef(this, "controllers.IdeaTypes", "list", Nil))
   }
}
                    

// @LINE:86
case controllers_IdeaTypes_count55(params) => {
   call { 
        invokeHandler(_root_.controllers.IdeaTypes.count, HandlerDef(this, "controllers.IdeaTypes", "count", Nil))
   }
}
                    

// @LINE:87
case controllers_IdeaTypes_update56(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.IdeaTypes.update(id), HandlerDef(this, "controllers.IdeaTypes", "update", Seq(classOf[Long])))
   }
}
                    

// @LINE:88
case controllers_IdeaTypes_save57(params) => {
   call { 
        invokeHandler(_root_.controllers.IdeaTypes.save, HandlerDef(this, "controllers.IdeaTypes", "save", Nil))
   }
}
                    

// @LINE:89
case controllers_IdeaTypes_show58(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.IdeaTypes.show(id), HandlerDef(this, "controllers.IdeaTypes", "show", Seq(classOf[Long])))
   }
}
                    

// @LINE:90
case controllers_IdeaTypes_delete59(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.IdeaTypes.delete(id), HandlerDef(this, "controllers.IdeaTypes", "delete", Seq(classOf[Long])))
   }
}
                    

// @LINE:92
case controllers_Identities_list60(params) => {
   call { 
        invokeHandler(_root_.controllers.Identities.list, HandlerDef(this, "controllers.Identities", "list", Nil))
   }
}
                    

// @LINE:93
case controllers_Identities_count61(params) => {
   call { 
        invokeHandler(_root_.controllers.Identities.count, HandlerDef(this, "controllers.Identities", "count", Nil))
   }
}
                    

// @LINE:94
case controllers_Identities_update62(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Identities.update(id), HandlerDef(this, "controllers.Identities", "update", Seq(classOf[Long])))
   }
}
                    

// @LINE:95
case controllers_Identities_save63(params) => {
   call { 
        invokeHandler(_root_.controllers.Identities.save, HandlerDef(this, "controllers.Identities", "save", Nil))
   }
}
                    

// @LINE:96
case controllers_Identities_show64(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Identities.show(id), HandlerDef(this, "controllers.Identities", "show", Seq(classOf[Long])))
   }
}
                    

// @LINE:97
case controllers_Identities_delete65(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Identities.delete(id), HandlerDef(this, "controllers.Identities", "delete", Seq(classOf[Long])))
   }
}
                    

// @LINE:109
case controllers_Tags_list66(params) => {
   call { 
        invokeHandler(_root_.controllers.Tags.list, HandlerDef(this, "controllers.Tags", "list", Nil))
   }
}
                    

// @LINE:110
case controllers_Tags_count67(params) => {
   call { 
        invokeHandler(_root_.controllers.Tags.count, HandlerDef(this, "controllers.Tags", "count", Nil))
   }
}
                    

// @LINE:111
case controllers_Tags_update68(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Tags.update(id), HandlerDef(this, "controllers.Tags", "update", Seq(classOf[Long])))
   }
}
                    

// @LINE:112
case controllers_Tags_save69(params) => {
   call { 
        invokeHandler(_root_.controllers.Tags.save, HandlerDef(this, "controllers.Tags", "save", Nil))
   }
}
                    

// @LINE:113
case controllers_Tags_show70(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Tags.show(id), HandlerDef(this, "controllers.Tags", "show", Seq(classOf[Long])))
   }
}
                    

// @LINE:114
case controllers_Tags_delete71(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Tags.delete(id), HandlerDef(this, "controllers.Tags", "delete", Seq(classOf[Long])))
   }
}
                    

// @LINE:115
case controllers_Tags_listIdeasByTagId72(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Tags.listIdeasByTagId(id), HandlerDef(this, "controllers.Tags", "listIdeasByTagId", Seq(classOf[Long])))
   }
}
                    

// @LINE:116
case controllers_Tags_listIdeas73(params) => {
   call(params.fromPath[String]("tag", None)) { (tag) =>
        invokeHandler(_root_.controllers.Tags.listIdeas(tag), HandlerDef(this, "controllers.Tags", "listIdeas", Seq(classOf[String])))
   }
}
                    

// @LINE:117
case controllers_Tags_countIdeasByTagId74(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Tags.countIdeasByTagId(id), HandlerDef(this, "controllers.Tags", "countIdeasByTagId", Seq(classOf[Long])))
   }
}
                    

// @LINE:118
case controllers_Tags_countIdeas75(params) => {
   call(params.fromPath[String]("tag", None)) { (tag) =>
        invokeHandler(_root_.controllers.Tags.countIdeas(tag), HandlerDef(this, "controllers.Tags", "countIdeas", Seq(classOf[String])))
   }
}
                    

// @LINE:120
case controllers_Votes_list76(params) => {
   call { 
        invokeHandler(_root_.controllers.Votes.list, HandlerDef(this, "controllers.Votes", "list", Nil))
   }
}
                    

// @LINE:121
case controllers_Votes_count77(params) => {
   call { 
        invokeHandler(_root_.controllers.Votes.count, HandlerDef(this, "controllers.Votes", "count", Nil))
   }
}
                    

// @LINE:122
case controllers_Votes_update78(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Votes.update(id), HandlerDef(this, "controllers.Votes", "update", Seq(classOf[Long])))
   }
}
                    

// @LINE:123
case controllers_Votes_save79(params) => {
   call { 
        invokeHandler(_root_.controllers.Votes.save, HandlerDef(this, "controllers.Votes", "save", Nil))
   }
}
                    

// @LINE:124
case controllers_Votes_show80(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Votes.show(id), HandlerDef(this, "controllers.Votes", "show", Seq(classOf[Long])))
   }
}
                    

// @LINE:125
case controllers_Votes_delete81(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Votes.delete(id), HandlerDef(this, "controllers.Votes", "delete", Seq(classOf[Long])))
   }
}
                    

// @LINE:128
case controllers_Application_javascriptRoutes82(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.javascriptRoutes, HandlerDef(this, "controllers.Application", "javascriptRoutes", Nil))
   }
}
                    

// @LINE:130
case controllers_Application_mail83(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.mail, HandlerDef(this, "controllers.Application", "mail", Nil))
   }
}
                    

// @LINE:134
case controllers_tests_GeoLocator_locate84(params) => {
   call(params.fromPath[String]("address", None)) { (address) =>
        invokeHandler(_root_.controllers.tests.GeoLocator.locate(address), HandlerDef(this, "controllers.tests.GeoLocator", "locate", Seq(classOf[String])))
   }
}
                    

// @LINE:135
case controllers_tests_CSVImporter_CSVimport85(params) => {
   call(params.fromPath[String]("file", None)) { (file) =>
        invokeHandler(_root_.controllers.tests.CSVImporter.CSVimport(file), HandlerDef(this, "controllers.tests.CSVImporter", "CSVimport", Seq(classOf[String])))
   }
}
                    

// @LINE:137
case controllers_tests_SecuredIdeaTypes_list86(params) => {
   call { 
        invokeHandler(_root_.controllers.tests.SecuredIdeaTypes.list, HandlerDef(this, "controllers.tests.SecuredIdeaTypes", "list", Nil))
   }
}
                    

// @LINE:138
case controllers_tests_SecuredIdeaTypes_count87(params) => {
   call { 
        invokeHandler(_root_.controllers.tests.SecuredIdeaTypes.count, HandlerDef(this, "controllers.tests.SecuredIdeaTypes", "count", Nil))
   }
}
                    

// @LINE:139
case controllers_tests_SecuredIdeaTypes_update88(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.tests.SecuredIdeaTypes.update(id), HandlerDef(this, "controllers.tests.SecuredIdeaTypes", "update", Seq(classOf[Long])))
   }
}
                    

// @LINE:140
case controllers_tests_SecuredIdeaTypes_save89(params) => {
   call { 
        invokeHandler(_root_.controllers.tests.SecuredIdeaTypes.save, HandlerDef(this, "controllers.tests.SecuredIdeaTypes", "save", Nil))
   }
}
                    

// @LINE:141
case controllers_tests_SecuredIdeaTypes_show90(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.tests.SecuredIdeaTypes.show(id), HandlerDef(this, "controllers.tests.SecuredIdeaTypes", "show", Seq(classOf[Long])))
   }
}
                    

// @LINE:142
case controllers_tests_SecuredIdeaTypes_delete91(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.tests.SecuredIdeaTypes.delete(id), HandlerDef(this, "controllers.tests.SecuredIdeaTypes", "delete", Seq(classOf[Long])))
   }
}
                    

// @LINE:144
case controllers_tests_UnsecuredIdeaTypes_list92(params) => {
   call { 
        invokeHandler(_root_.controllers.tests.UnsecuredIdeaTypes.list, HandlerDef(this, "controllers.tests.UnsecuredIdeaTypes", "list", Nil))
   }
}
                    

// @LINE:145
case controllers_tests_UnsecuredIdeaTypes_count93(params) => {
   call { 
        invokeHandler(_root_.controllers.tests.UnsecuredIdeaTypes.count, HandlerDef(this, "controllers.tests.UnsecuredIdeaTypes", "count", Nil))
   }
}
                    

// @LINE:146
case controllers_tests_UnsecuredIdeaTypes_update94(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.tests.UnsecuredIdeaTypes.update(id), HandlerDef(this, "controllers.tests.UnsecuredIdeaTypes", "update", Seq(classOf[Long])))
   }
}
                    

// @LINE:147
case controllers_tests_UnsecuredIdeaTypes_save95(params) => {
   call { 
        invokeHandler(_root_.controllers.tests.UnsecuredIdeaTypes.save, HandlerDef(this, "controllers.tests.UnsecuredIdeaTypes", "save", Nil))
   }
}
                    

// @LINE:148
case controllers_tests_UnsecuredIdeaTypes_show96(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.tests.UnsecuredIdeaTypes.show(id), HandlerDef(this, "controllers.tests.UnsecuredIdeaTypes", "show", Seq(classOf[Long])))
   }
}
                    

// @LINE:149
case controllers_tests_UnsecuredIdeaTypes_delete97(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.tests.UnsecuredIdeaTypes.delete(id), HandlerDef(this, "controllers.tests.UnsecuredIdeaTypes", "delete", Seq(classOf[Long])))
   }
}
                    

// @LINE:151
case controllers_tests_Categorizer_categorize98(params) => {
   call { 
        invokeHandler(_root_.controllers.tests.Categorizer.categorize, HandlerDef(this, "controllers.tests.Categorizer", "categorize", Nil))
   }
}
                    

// @LINE:152
case controllers_Categorizer_categorize99(params) => {
   call { 
        invokeHandler(_root_.controllers.Categorizer.categorize, HandlerDef(this, "controllers.Categorizer", "categorize", Nil))
   }
}
                    

// @LINE:156
case controllers_Management_zapIdea100(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Management.zapIdea(id), HandlerDef(this, "controllers.Management", "zapIdea", Seq(classOf[Long])))
   }
}
                    

// @LINE:157
case controllers_Management_zapComment101(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Management.zapComment(id), HandlerDef(this, "controllers.Management", "zapComment", Seq(classOf[Long])))
   }
}
                    

// @LINE:159
case controllers_Management_updateIdea102(params) => {
   call(params.fromPath[Long]("id", None), params.fromPath[String]("text", None)) { (id, text) =>
        invokeHandler(_root_.controllers.Management.updateIdea(id, text), HandlerDef(this, "controllers.Management", "updateIdea", Seq(classOf[Long], classOf[String])))
   }
}
                    

// @LINE:160
case controllers_Management_updateComment103(params) => {
   call(params.fromPath[Long]("id", None), params.fromPath[String]("text", None)) { (id, text) =>
        invokeHandler(_root_.controllers.Management.updateComment(id, text), HandlerDef(this, "controllers.Management", "updateComment", Seq(classOf[Long], classOf[String])))
   }
}
                    

// @LINE:163
case controllers_Assets_at104(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    
}
    
}
                