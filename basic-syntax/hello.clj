(ns clojure.tutorial.hello
  (:gen-class))
(defn hello-world []
  (println "Hello world")
  (println (str "Hello world"))
  (println (+ 1 2)))
(hello-world)

