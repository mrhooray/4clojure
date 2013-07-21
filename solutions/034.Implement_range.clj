; Implement range
; Restrictions: range
(def p034 ["(= (__ 1 4) '(1 2 3))"
           "(= (__ -2 2) '(-2 -1 0 1))"
           "(= (__ 5 8) '(5 6 7))"])

(def s034 "#(take (- %2 %) (iterate inc %))")
