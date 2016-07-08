(ns funnel.core
  (:require [rum.core :as rum]
            [funnel.main :as main]))

(enable-console-print!)

#_(println "This text is printed from src/funnel/core.cljs. Go ahead and edit it and see reloading in action.")

;; define your app data so that it doesn't get over-written on reload

(defonce app-state (atom {:text "Hello world!"}))

(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
  )

(defn el [id]
  (.getElementById js/document id))

;;
;; mount main component on html app element
;;
#_(when-let [mount-point (el "app")]
  (rum.core/mount (main/container) mount-point))


(defn mount-component [el]
  (println "mountcomponent called")
  (rum/mount (main/container) el))

(set! (.-mountComponent js/window) mount-component)