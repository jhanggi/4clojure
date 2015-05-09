;; Greatest Common Divisor
;; Given two integers, write a function which returns the
;; greatest common divisor.

(ns fourclojure.problem66
  (:require [clojure.test :refer :all]
            [clojure.set :refer :all]))

(defn divisor? [large n]
  (zero? (mod large n))
)

(defn divisors [n]
  (filter #(divisor? n %) (range 1 (inc n)))
)

(defn __ [a b]
  (apply max (intersection (set (divisors a)) (set (divisors b))))
)

;; Final solution without defn
(defn __ [a b]
  (let [divisor? (fn [large n] (zero? (mod large n)))
        divisors (fn [n] (into #{} (filter #(divisor? n %) (range 1 (inc n)))))
        common-divisors (clojure.set/intersection (divisors a) (divisors b))]
    (apply max common-divisors)
  )
)

;; Eucid's algorithm. Implemented during problem 100 (GCD)
(defn __ [a b]
  (if (zero? b)
    a
    (recur b (mod a b))
  )
)

(is (divisor? 10 5))
(is (not (divisor? 10 6)))

(are [x y] (= x y)
  (divisors 10) '(1 2 5 10)
  (divisors 9) '(1 3 9)
)

(are [x y] (= x y)
  (__ 2 4) 2
  (__ 10 5) 5
  (__ 5 7) 1
  (__ 1023 858) 33
)
