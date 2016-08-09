(ns funnel.core
  (:require [rum.core :as rum]
            [funnel.main :as main]))

(enable-console-print!)

;; define app state once only, so reload does not change it
(defonce app-state (atom {:text "Hello world!"}))

(defn on-js-reload [])
  ;; optionally touch app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)


(defn el [id]
  (.getElementById js/document id))

;;
;; mount main component on html app element
;;
(when-let [mount-point (el "app")]
  (rum.core/mount (main/container) mount-point))


(defn mount-component [el]
  (println "mountcomponent called")
  (rum/mount (main/container) el))

#_(defn export-as [symbol exported-name]
   (aset js/window exported-name symbol))

#_(export-as mount-component "mountComponent")

(set! (.-mountComponent js/window) mount-component)
