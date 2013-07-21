; Compress a Sequence
(def p030 ["(= (apply str (__ \"Leeeeeerrroyyy\")) \"Leroy\")"
           "(= (__ [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))"
           "(= (__ [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))"])

(def s030 "#(map first (partition-by identity %))")
