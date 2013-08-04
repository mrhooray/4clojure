; A Half-Truth

(def p083 ["(= false (__ false false))"
           "(= true (__ true false))"
           "(= false (__ true))"
           "(= true (__ false true false))"
           "(= false (__ true true true))"
           "(= true (__ true true true false))"])

(def s083 "#(apply not= %&)")
