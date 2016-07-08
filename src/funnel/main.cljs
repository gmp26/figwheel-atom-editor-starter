(ns funnel.main
  (:require [rum.core :as rum]))

(rum/defc container []
  [:div {:style {:width            "100px"
                 :height           "100px"
                 :border           "1px solid black"
                 :background-color "red"}}])
