(defproject who-am-i "0.1.0-SNAPSHOT"
  :description "Basic Google Auth OpenID Connect web app"
  :url "https://github.com/automonkey/who-am-i"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.1.8"]]
  :plugins [[lein-ring "0.8.11"]]
  :ring {:handler who-am-i.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring-mock "0.1.5"]]}})
