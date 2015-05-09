;; Flatten a sequence
;; Lexical scope and first-class functions are two of the most basic building
;; blocks of a functional language like Clojure. When you combine the two
;; together, you get something very powerful called lexical closures. With these,
;; you can exercise a great deal of control over the lifetime of your local
;; bindings, saving their values for use later, long after the code you're
;; running now has finished.

;; It can be hard to follow in the abstract, so let's build a simple closure.
;; Given a positive integer n, return a function (f x) which computes xn.
;; Observe that the effect of this is to preserve the value of n for use outside
;; the scope in which it is defined.

(ns fourclojure.problem28
  (:require [clojure.test :refer :all]))

;; Without Math/pow and the need to cast from float to int
(defn __ [n]
  (let [expt (fn [a b] (reduce * (take b (repeat a))))]
    (fn [input] (expt input n))
  )
)

(defn __ [exponent]
  (fn [x] (int (Math/pow x exponent)))
)

(is (= (expt 2 3) 8))
(is (= (expt 2 4) 16))

(are [x y] (= x y)
  256 ((__ 2) 16)
  256 ((__ 8) 2)
  [1 8 27 64] (map (__ 3) [1 2 3 4])
  [1 2 4 8 16] (map #((__ %) 2) [0 1 2 3 4])
)


