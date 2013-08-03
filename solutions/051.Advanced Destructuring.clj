; Advanced Destructuring

(def p051 ["(= [1 2 [3 4 5] [1 2 3 4 5]] (let [[a b & c :as d] __] [a b c d]))"])

(def s051 "[1 2 3 4 5]")
