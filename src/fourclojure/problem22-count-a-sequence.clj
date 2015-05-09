;; Count a sequence

(ns fourclojure.problem22)

(defn cnt [arr]
  (loop [in arr out 0]
    (if (seq in)
      (recur (rest in) (+ out 1))
      out)))

(println (= (cnt '(13)) 1))
(println (= (cnt '(:a :b :c)) 3))
