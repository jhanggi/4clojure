;; Intro to some

(ns fourclojure.problem48
  (:require [clojure.test :refer :all]))

(def __ 6)

(are [x y] (= x y)
  __ (some #{2 7 6} [5 6 7 8])
  __ (some #(when (even? %) %) [5 6 7 8])
)


