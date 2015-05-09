;; Least common multiple
;; Write a function which calculates the least common multiple.
;; Your function should accept a variable number of positive integers
;; or ratios.

(ns fourclojure.problem100
  (:require [clojure.test :refer :all]))

(defn solves [__]
  (are [x y] (== x y)
    (__ 2 3) 6
    (__ 5 3 7) 105
    (__ 1/3 2/5) 2
    (__ 3/4 1/6) 3/2
    (__ 7 5/7 2 3/5) 210
  )
)

;; Euclid's algorithm
(defn gcd [a b]
  (if (zero? b)
    a
    (recur b (mod a b))
  )
)

(defn lcm [& args]
  (letfn [
    (lcm-inner [x y]
      (/ (* x y) (gcd x y)))]
    (reduce lcm-inner args)
  )
)

;; final for 4clojure w/o defn
(fn [& args]
  (letfn [
    (gcd [a b]
      (if (zero? b) a (recur b (mod a b))))
    (lcm [x y]
      (/ (* x y) (gcd x y)))]
    (reduce lcm args)
  )
)

(is (= (gcd 3 5) 1))
(is (= (gcd 15 20) 5))
(is (= (gcd 20 15) 5))

(solves lcm)

