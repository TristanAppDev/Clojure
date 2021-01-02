(ns power-calc.core
  (:gen-class))

(defn power-classic-rec ;; WARNING! StackOverFlow
  [n k]
  (if (zero? k)
    1
    (* n (power-classic-rec n (dec k)))))

(defn power-recur
  [n k acc]
  (if (zero? k)
    acc
    (recur n (- k 1) (* acc n))))

(defn power-recur-loop
  [num exp]
  (loop [n num
         k exp
         acc 1]
    (if (zero? k)
      acc
      (recur n (dec k) (* acc n)))))

(defn power-func
  [n k]
  (reduce * (repeat k n)))

(defn -main
  [& args]
  (println (power-recur-loop 10N 70000)))
