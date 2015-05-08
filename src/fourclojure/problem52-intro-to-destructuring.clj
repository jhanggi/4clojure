;; Intro to destructuring
;; Let bindings and function parameter lists support destructuring.

(ns fourclojure.problem52
  (:require [clojure.test :refer :all]))

(is (= [2 4] (let [[a b c d e f g] (range)] [c e])))
