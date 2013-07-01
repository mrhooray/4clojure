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
