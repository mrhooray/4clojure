; Factorial Fun
(def p042 ["(= (__ 1) 1)"
           "(= (__ 3) 6)"
           "(= (__ 5) 120)"
           "(= (__ 8) 40320)"])

(def s042 "#(reduce * (take % (iterate dec %)))")
