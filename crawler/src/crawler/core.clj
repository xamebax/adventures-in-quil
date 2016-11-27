(ns crawler.core
  (:require [quil.core :refer :all]))

(defn setup []
  (smooth)
  (frame-rate (random 1 5)))

(def palette
   (vector [ 16   4  14]   ;10040e
           [ 32   8  28]   ;20081c
           [ 49  13  41]   ;310d29
           [ 65  17  55]   ;411137
           [ 81  21  69]   ;511545
           [114  29  97]   ;721d61
           [130  33 110]   ;82216e
           [146  38 124]   ;92267c
           [162  42 138]   ;a22a8a
           [ 97  25  83])) ;611953

(defn generate-circles []
  (let [current-color (nth palette (rand (count palette)))]
    (no-stroke)
    (fill (first current-color) (second current-color) (last current-color))
    (ellipse (rand 200) (rand 200) 15 15)))

(defn draw []
  (background 255)
  
  (generate-circles)
  (generate-circles)
  (generate-circles)
  (generate-circles)
  (generate-circles))
  
(defn update-state [])

(defsketch crawler
  :title "Crawler"
  :setup setup
  :draw draw
  ;; :update update-state
  :size [200 200])

(defn -main [& args])
