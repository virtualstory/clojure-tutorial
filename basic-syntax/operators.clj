(ns clojure.tutorial.operators
  (:gen-class))

(defn Operators []
  (def x (+ 2 2))
  (println x)
  
  (def x (- 2 1))
  (println x)
  
  (def x (* 2 2))
  (println x)
  
  (def x (float(/ 2 1)))
  (println x)
  
  (def x (inc 2))
  (println x)
  
  (def x (dec 2))
  (println x)
  
  (def x (min 1 2 3))
  (println x)
  
  (def x (rem 3 2))
  (println x)

  (def x (= 2 2))
  (println x)

  (def x (not= 3 2))
  (println x)

  (def x (< 2 3))
  (println x)

  (def x (> 3 2))
  (println x)

  (def x (>= 3 2))
  (println x)


  (def x (or true true))
  (println x)

  (def x (and true false))
  (println x)

  (def x (not true))
  (println x)

  (def x (bit-and 00111100 00001101))
  (println x)

  (def x (bit-or 00111100 00001101))
  (println x)

  (def x (bit-xor 00111100 00001101))
  (println x)
)

(Operators)
