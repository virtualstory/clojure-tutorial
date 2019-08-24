(ns clojure.tutorial.variable
  (:gen-class))

(defn Variable []
  (def x 1)
  (println x)
  (def y 1.25)
  (println y)
  (def str1 "hello")
  (println str1))

(Variable)
