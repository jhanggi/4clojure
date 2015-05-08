;; Intro to Iterate

(ns fourclojure.problem45
  (:require [clojure.test :refer :all]))

(def __
  '(1 4 7 10 13)
)

(is
  (= __ (take 5 (iterate #(+ 3 %) 1)))
)

