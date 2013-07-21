; Drop Every Nth Item
(def p041 ["(= (__ [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8])"
           "(= (__ [:a :b :c :d :e :f] 2) [:a :c :e])"
           "(= (__ [1 2 3 4 5 6] 4) [1 2 3 5 6])"])

(def s041 "#(mapcat identity (partition-all (dec %2) %2 %))")
