(defproject crawler "0.0.1"
  :description "Gradually fills the screen with circles generated w/random coordinates, colors and speed"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [quil "2.3.0" :exclusions [org.clojure/clojure]]]
  :main crawler.core)
