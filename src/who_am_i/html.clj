(ns who-am-i.html
  (:require [hiccup.core :refer (html)]))

(defn signin-page-html [auth-url]
  [:html
   [:head
    [:title "Who am I?"]]
   [:body
    [:a {:href auth-url} "sign-in"]]])

(defn signin-page [auth-url]
  (html (signin-page-html auth-url)))
