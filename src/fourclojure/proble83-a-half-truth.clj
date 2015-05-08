;; A Half Truth
;; Write a function which takes a variable number of booleans.
;; Your function should return true if some of the parameters are
;; true, but not all of the parameters are true. Otherwise your
;; function should return false.

(ns fourclojure.problem83
  (:require [clojure.test :refer :all]))

(defn __ [& arr]
  (and (not (every? true? arr))
       (true? (some true? arr)))
  ; (if (every? true? arr)
  ;   false
  ;   (true? (some true? arr)))
)
(are [x y] (= x y)
  false (__ false false)
  true (__ true false)
  false (__ true)
  true (__ false true false)
  false (__ true true true)
  true (__ true true true false)
)
