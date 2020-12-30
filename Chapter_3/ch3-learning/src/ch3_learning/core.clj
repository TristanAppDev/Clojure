(ns ch3-learning.core
  (:gen-class))

(def chewi "Chewbacca")

(def names 
  {:first "Han" :last "Solo"})

(def numbers
  '(1 2 3 4 5))

(defn speak [name]
  (str "\"Uglglglglglglgglllll\" - " name))

(defn han_speaks []
  (println (speak (str (:first names) " " (get names :last) (nth numbers 2)))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (apply str (reduce conj () '(1 2 3 4)))))