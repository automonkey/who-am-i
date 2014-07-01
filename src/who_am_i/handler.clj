(ns who-am-i.handler
  (:require [who-am-i.html :as html])
  (:require [compojure.core :refer :all]
            [compojure.handler :as handler]
            [compojure.route :as route]))

(defn app-routes [cfg]
  (routes
   (GET "/" [] (html/signin-page (:auth-base-url cfg)))
   (route/resources "/")
   (route/not-found "Not Found")))

(defn app [cfg]
  (handler/site (app-routes cfg)))
