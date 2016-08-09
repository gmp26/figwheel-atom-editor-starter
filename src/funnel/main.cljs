(ns funnel.main
  (:require [rum.core]))

(rum.core/defc container []
  [:div {:style {:width            "100px"
                 :height           "100px"
                 :border           "1px solid rgb(0, 0, 0)"
                 :background-color "#f00"}}])
