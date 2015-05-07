(ns fourclojure.problem23)

(defn rever [input]
  (loop [in input out '()]
    (if (seq in)
      (recur (rest in) (conj out (first in)))
      out)))

(def rever
  (fn [input]
    (reduce conj '() input)))

(println (rever [1 2 3 4 5]))
