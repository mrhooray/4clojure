; Flatten a Sequence
; Restrictions: flatten

(def p028 ["(= (__ '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))"
           "(= (__ [\"a\" [\"b\"] \"c\"]) '(\"a\" \"b\" \"c\"))"
           "(= (__ '((((:a))))) '(:a))"])

(def s028 "#(filter (complement sequential?)
                   (rest (tree-seq sequential? seq %)))")
