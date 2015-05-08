(ns fourclojure.problem32
  (:require [clojure.test :refer :all]))

(defn __ [arr n]
  (apply concat (map #(take (dec n) %) (partition-all n arr)))
)

(are [x y] (= x y)
  (__ [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8]
  (__ [:a :b :c :d :e :f] 2) [:a :c :e]
  (__ [1 2 3 4 5 6] 4) [1 2 3 5 6]
)

