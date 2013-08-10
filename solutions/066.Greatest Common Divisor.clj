; Greatest Common Divisor

(def p066 ["(= (__ 2 4) 2)"
           "(= (__ 10 5) 5)"
           "(= (__ 5 7) 1)"
           "(= (__ 1023 858) 33)"])

(def s066 "(fn [a b]
             (if (zero? (rem a b))
               b
               (recur b (rem a b))))")
