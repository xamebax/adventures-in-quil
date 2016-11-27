(ns crawler.core
  (:require [quil.core :refer :all]))

(defn setup []
  (smooth)
  (frame-rate 1))

(def palette (vector [0 0 0] [60 60 60] [140 140 200]))

(defn generate-circles []
  (let [current-color (nth palette (rand (count palette)))]
    (no-stroke)
    (fill (first current-color) (second current-color) (last current-color))
    (ellipse (rand 600) (rand 600) 15 15)))

(defn draw []
  (background 255)
  
  (generate-circles))
  
(defn update-state [])

(defsketch crawler
  :title "Crawler"
  :setup setup
  :draw draw
  ;; :update update-state
  :size [600 600])

(defn -main [& args])
