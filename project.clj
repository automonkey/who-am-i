(defproject who-am-i "0.1.0-SNAPSHOT"
  :description "Basic Google Auth OpenID Connect web app"
  :url "https://github.com/automonkey/who-am-i"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.1.8"]
                 [ring/ring-jetty-adapter "1.3.0"]]
  :plugins [[lein-ring "0.8.11"]]
  :ring {:handler who-am-i.handler/app}
  :uberjar-name "who-am-i.jar"
  :min-lein-version "2.0.0"
  :profiles
  {:dev {:source-paths ["./dev"]
         :dependencies [[javax.servlet/servlet-api "2.5"]
                        [org.clojure/tools.namespace "0.2.4"]
                        [ring-mock "0.1.5"]]}})
