; Maximum value
; Restrictions: max, max-key

(def p038 ["(= (__ 1 8 3 4) 8)"
           "(= (__ 30 20) 30)"
           "(= (__ 45 67 11) 67)"])

(def s038 "(fn [& xs] (reduce #(if (> %2 %1) %2 %1) xs))")
