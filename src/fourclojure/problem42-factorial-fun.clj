;; Factorial Fun
;; Write a function which calculates factorials.

(ns fourclojure.problem42
  (:require [clojure.test :refer :all]))

(defn __ [n]
  (reduce * (take n (iterate inc 1)))
)

(are [x y] (= x y)
  (__ 1) 1
  (__ 3) 6
  (__ 5) 120
  (__ 8) 40320
)
