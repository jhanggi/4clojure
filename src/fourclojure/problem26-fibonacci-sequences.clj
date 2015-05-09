;; Fibonacci sequences
(ns fourclojure.problem26)

(defn fib [i]
  (loop [cnt (- i 2) out '[1 1]]
    (if (zero? cnt)
      out
      (recur (- cnt 1)
        (conj out (+ ((vec (reverse out)) 0) ((vec (reverse out)) 1)))))))

;; Based on http://yyhh.org/blog/2011/05/my-solutions-first-50-problems-4clojure-com
(defn fibinacci [i]
  (take i
    ((fn fib [a b]
      (cons a (lazy-seq (fib b (+ a b)))))
      1 1)
  ))
(println (fib 9))
