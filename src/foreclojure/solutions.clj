(ns foreclojure.solutions)

(def s001 "true")

(def s002 "4")

(def s003 "\"HELLO WORLD\"")

(def s004 ":a :b :c")

(def s005 "[1 2 3 4]")

(def s006 ":a :b :c")

(def s007 "[1 2 3 4]")

(def s008 "#{:a :b :c :d}")

(def s009 "2")

(def s010 "20")

(def s011 "{:b 2}")

(def s012 "3")

(def s013 "[20 30 40]")

(def s014 "8")

(def s015 "* 2")

(def s016 "#(str \"Hello, \" % \"!\")")

(def s017 "[6 7 8]")

(def s018 "[6 7]")

(def s019 "(comp first reverse)")

(def s020 "(comp last butlast)")

(def s021 "(fn [coll n]
            (if (zero? n)
              (first coll)
              (recur (rest coll) (dec n))))")

(def s022 "reduce (fn [c _] (inc c)) 0")

(def s023 "#(into '() %)")

(def s024 "apply +")

(def s025 "filter odd?")

(def s026 "#(take % ((fn fib [a b]
                      (lazy-seq (cons a (fib b (+ a b))))) 1 1))")

(def s027 "#(= (seq %) (reverse %))")

(def s028 "#(filter (complement sequential?)
                   (rest (tree-seq sequential? seq %)))")

(def s029 "#(apply str (re-seq #\"[A-Z]\" %))")

(def s030 "#(map first (partition-by identity %))")

(def s031 "partition-by identity")

(def s032 "#(interleave % %)")

(def s033 "#(mapcat (partial repeat %2) %)")

(def s034 "#(take (- %2 %) (iterate inc %))")

(def s035 "7")

(def s036 "[x 7 y 3 z 1]")

(def s037 "\"ABC\"")

(def s038 "(fn [& xs] (reduce #(if (> %2 %1) %2 %1) xs))")
