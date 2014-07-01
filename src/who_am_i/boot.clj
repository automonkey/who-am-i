(ns who-am-i.boot
  (:require [who-am-i.handler :as handler])
  (:require [ring.adapter.jetty :as jetty]))

(defn overriden-default-config [overrides]
  (let [defaults {:auth-base-url (System/getenv "AUTH_BASE_URL")}]
    (merge defaults overrides)))

(defn -main
  ([port config]
     (let [full-config (overriden-default-config config)]
       (jetty/run-jetty (handler/app full-config) {:port (Integer. port)
                                                   :join? false})))
  ([port]
     (-main port {})))
