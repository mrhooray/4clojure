; Comparisons

(def p166 ["(= :gt (__ < 5 1))"
           "(= :eq (__ (fn [x y] (< (count x) (count y))) \"pear\" \"plum\"))"
           "(= :lt (__ (fn [x y] (< (mod x 5) (mod y 5))) 21 3))"
           "(= :gt (__ > 0 2))"])

(def s166 "#(cond
            (% %2 %3) :lt
            (% %3 %2) :gt
            :else :eq)")
