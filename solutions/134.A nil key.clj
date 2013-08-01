; A nil key

(def p134 ["(true?  (__ :a {:a nil :b 2}))"
           "(false? (__ :b {:a nil :b 2}))"
           "(false? (__ :c {:a nil :b 2}))"])

(def s134 "#(not (% %2 0))")
