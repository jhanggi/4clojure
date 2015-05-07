(ns fourclojure.problem32
  (:require [clojure.test :refer :all]))

(defn duplicate-each-element [input]
  (#(interleave % %) input)
)

(are [x y] (= x y)
  (duplicate-each-element [1 2 3]) '(1 1 2 2 3 3)
  (duplicate-each-element [:a :a :b :b]) '(:a :a :a :a :b :b :b :b)
  (duplicate-each-element [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))

