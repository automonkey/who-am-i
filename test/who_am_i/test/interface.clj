(ns who-am-i.test.interface
  (:require [who-am-i.handler :refer (app)])
  (:require [clojure.test :refer :all]
            [kerodon.core :refer (session visit within)]
            [kerodon.test :refer (attr? has value? text?)]))

(def test-config
  {:auth-base-url "http://idp"})

(deftest welcome-page-includes-signin-link
  (testing "sigin link"
    (-> (session (app test-config))
        (visit "/")
        (within [:a]
                (has (text? "sign-in")))
        (has (attr? [:a] :href "http://idp")))))
