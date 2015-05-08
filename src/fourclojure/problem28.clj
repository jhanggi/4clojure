;; Flatten a sequence
;; TODO incomplete
(ns fourclojure.problem28)

(defn my-flatten [arr]
  ((fn inner-flatten [in out]
    (if (seq? in)
      (inner-flatten (first in) '())
      ; (reduce inner-flatten in '())
      (conj out in)
    )
  ) arr '())
)



(println (my-flatten '((1 2) 3 [4 [5 6]])))
(println (my-flatten '((((:a))))))
