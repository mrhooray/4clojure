; Nth Element
; Restrictions: nth
(def p021 ["(= (__ '(4 5 6 7) 2) 6)"
           "(= (__ [:a :b :c] 0) :a)"
           "(= (__ [1 2 3 4] 1) 2)"
           "(= (__ '([1 2] [3 4] [5 6]) 2) [5 6])"])

(def s021 "(fn [coll n]
            (if (zero? n)
              (first coll)
              (recur (rest coll) (dec n))))")
