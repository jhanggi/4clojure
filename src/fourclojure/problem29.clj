;; Get the Caps

(ns fourclojure.problem29
  (:require [clojure.test :refer :all]))

(defn __ [string]
  (apply str (filter #(Character/isUpperCase %) string))
)

(are [x y] (= x y)
  (__ "HeLlO, WoRlD!") "HLOWRD"
  (__ "$#A(*&987Zf") "AZ"
)

(is (empty? (__ "nothing")))

