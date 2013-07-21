; Simple Recursion

(def p057 ["(= __ ((fn foo [x] (when (> x 0) (conj (foo (dec x)) x))) 5))"])

(def s057 "'(5 4 3 2 1)")
