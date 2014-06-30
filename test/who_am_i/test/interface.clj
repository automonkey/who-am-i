(ns who-am-i.test.interface
  (:require [who-am-i.handler :refer (app)])
  (:require [clojure.test :refer :all]
            [kerodon.core :refer (session visit within)]
            [kerodon.test :refer (has value? text?)]))

(deftest welcome-page-includes-signin-link
  (testing "sigin link"
    (-> (session app)
        (visit "/")
        (within [:a]
                (has (text? "sign-in"))))))
