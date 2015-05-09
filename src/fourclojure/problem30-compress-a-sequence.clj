;; Compress a sequence

(ns fourclojure.problem30
  (:require [clojure.test :refer :all]))

(defn __ [input]
  (map first (partition-by identity input))
)

(println (apply str (__ "Leeeeeerrroyyy")))

(are [x y] (= x y)
  (__ [1 1 2 3 3 2 2 3]) '(1 2 3 2 3)
  (__ [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2])
  (__ (apply str (__ "Leeeeeerrroyyy"))) "Leroy"
)

