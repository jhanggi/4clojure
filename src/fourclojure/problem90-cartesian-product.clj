;; Cartesian Product
;; Write a function which calculates the Cartesian product of two sets.

(ns fourclojure.problem90
  (:require [clojure.test :refer :all]))

(defn __ [a b]
  (let [repeated-a (mapcat #(repeat (count b) %) a)]
    (set
      (partition 2
        (interleave repeated-a (cycle b))
      )
    )
  )
)


(are [x y] (= x y)
  (__ #{"ace" "king" "queen"} #{"♠" "♥" "♦" "♣"})

      #{["ace"   "♠"] ["ace"   "♥"] ["ace"   "♦"] ["ace"   "♣"]
        ["king"  "♠"] ["king"  "♥"] ["king"  "♦"] ["king"  "♣"]
        ["queen" "♠"] ["queen" "♥"] ["queen" "♦"] ["queen" "♣"]}

  (__ #{1 2 3} #{4 5})
      #{[1 4] [2 4] [3 4] [1 5] [2 5] [3 5]}
  300 (count (__ (into #{} (range 10))
                 (into #{} (range 30))))
)

