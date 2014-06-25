(ns who-am-i.boot
  (:require [who-am-i.handler :as handler])
  (:require [ring.adapter.jetty :as jetty]))

(defn -main [port]
  (jetty/run-jetty handler/app {:port (Integer. port)
                                :join? false}))
