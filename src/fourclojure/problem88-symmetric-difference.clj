;; Symmetric Difference
;; Write a function which returns the symmetric difference of two sets.
;; The symmetric difference is the set of items belonging to one but
;; not both of the two sets.

(ns fourclojure.problem88
  (:require [clojure.test :refer :all]))

(defn solves [__]
  (are [x y] (= x y)
    (__ #{1 2 3 4 5 6} #{1 3 5 7}) #{2 4 6 7}
    (__ #{:a :b :c} #{}) #{:a :b :c}
    (__ #{} #{4 5 6}) #{4 5 6}
    (__ #{[1 2] [2 3]} #{[2 3] [3 4]}) #{[1 2] [3 4]}
  )
)

;; first solution
(defn symmetric-difference [a b]
  (clojure.set/difference (clojure.set/union a b)
                          (clojure.set/intersection a b)
  )
)

(solves symmetric-difference)

;; probably a little clearer and easier to read
(defn symmetric-difference2 [a b]
  (clojure.set/union (clojure.set/difference a b)
                     (clojure.set/difference b a)
  )
)

(solves symmetric-difference2)
