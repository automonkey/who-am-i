(ns user
  (:require [who-am-i.boot :as boot])
  (:require [clojure.tools.namespace.repl :refer (refresh)]))

(defonce app nil)

(def config
  {:auth-base-url "https://some-url"})

(defn go []
  (alter-var-root #'app
                  (constantly (boot/-main 3000 config))))

(defn stop []
  (.stop app))

(defn reset []
  (stop)
  (refresh :after 'user/go))
