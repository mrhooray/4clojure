; Logical falsity and truth

(def p162 ["(= __ (if-not false 1 0))"
           "(= __ (if-not nil 1 0))"
           "(= __ (if true 1 0))"
           "(= __ (if [] 1 0))"
           "(= __ (if [0] 1 0))"
           "(= __ (if 0 1 0))"
           "(= __ (if 1 1 0))"])

(def s162 "1")
