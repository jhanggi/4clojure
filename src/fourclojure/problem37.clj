(ns fourclojure.problem37)

(def x "ABC")

(= x (apply str (re-seq #"[A-Z]+" "bA1B3Ce ")))

(println
  (loop [x 5
         result []]
    (if (> x 0)
      (recur (dec x) (conj result (+ 2 x)))
      result))))
