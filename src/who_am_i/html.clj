(ns who-am-i.html
  (:require [hiccup.core :refer (html)]))

(defn signin-page-html []
  [:html
   [:head
    [:title "Who am I?"]]
   [:body
    [:a {:href "https://some-url"} "sign-in"]]])

(defn signin-page []
  (html (signin-page-html)))
