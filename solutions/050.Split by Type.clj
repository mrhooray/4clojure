; Split by Type

(def p050 ["(= (set (__ [1 :a 2 :b 3 :c])) #{[1 2 3] [:a :b :c]})"
           "(= (set (__ [:a \"foo\"  \"bar\" :b])) #{[:a :b] [\"foo\" \"bar\"]})"
           "(= (set (__ [[1 2] :a [3 4] 5 6 :b])) #{[[1 2] [3 4]] [:a :b] [5 6]})"])

(def s050 "#(vals (group-by class %))")
