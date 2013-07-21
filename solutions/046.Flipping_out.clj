; Flipping out
(def p046 ["(= 3 ((__ nth) 2 [1 2 3 4 5]))"
           "(= true ((__ >) 7 8))"
           "(= 4 ((__ quot) 2 8))"
           "(= [1 2 3] ((__ take) [1 2 3 4 5] 3))"])

(def s046 "(fn [f] #(apply f (reverse %&)))")
