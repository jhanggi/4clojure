(ns fourclojure.problem34
  (:require [clojure.test :refer :all]))

(defn __ [low high]
  (take (- high low) (iterate inc low))
)
(are [x y] (= x y)
  (__ 1 4) '(1 2 3)
  (__ -2 2) '(-2 -1 0 1)
  (__ 5 8) '(5 6 7)
)
