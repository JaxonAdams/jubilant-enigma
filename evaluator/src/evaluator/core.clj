(ns evaluator.core
  (:gen-class))



(defn collect-input
  [inputs]
  (def new-input (read-line))
  (if (empty? new-input)
    (apply str inputs)
    (collect-input (conj inputs new-input))))


(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Please enter a valid clojure expression...")
  ;; (def user-input (read-line))
  (def user-input (collect-input []))
  (println user-input)
  (def expr (read-string user-input))
  (println "\nYour expression:")
  (println expr)
  (println "\nEvaluated:")
  (println (eval expr)))


