(ns foreclojure.problems
  (:use [foreclojure.solutions]))

; Nothing but the Truth
(def p001 ["(= __ true)"])

; Simple Math
(def p002 ["(= (- 10 (* 2 3)) __)"])

; Intro to Strings
(def p003 ["(= __ (.toUpperCase \"hello world\"))"])

; Intro to Lists
(def p004 ["(= (list __) '(:a :b :c))"])

; Lists: conj
(def p005 ["(= __ (conj '(2 3 4) 1))"
           "(= __ (conj '(3 4) 2 1))"])

; Intro to Vectors
(def p006 ["(= [__] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))"])

; Vectors: conj
(def p007 ["(= __ (conj [1 2 3] 4))"
           "(= __ (conj [1 2] 3 4))"])

; Intro to Sets
(def p008 ["(= __ (set '(:a :a :b :c :c :c :c :d :d)))"
           "(= __ (clojure.set/union #{:a :b :c} #{:b :c :d}))"])

; Sets: conj
(def p009 ["(= #{1 2 3 4} (conj #{1 4 3} __))"])

; Intro to Maps
(def p010 ["(= __ ((hash-map :a 10, :b 20, :c 30) :b))"
           "(= __ (:b {:a 10, :b 20, :c 30}))"])

; Maps: conj
(def p011 ["(= {:a 1, :b 2, :c 3} (conj {:a 1} __ [:c 3]))"])

; Intro to Sequences
(def p012 ["(= __ (first '(3 2 1)))"
           "(= __ (second [2 3 4]))"
           "(= __ (last (list 1 2 3)))"])

; Sequences: rest
(def p013 ["(= __ (rest [10 20 30 40]))"])

; Intro to Functions
(def p014 ["(= __ ((fn add-five [x] (+ x 5)) 3))"
           "(= __ ((fn [x] (+ x 5)) 3))"
           "(= __ (#(+ % 5) 3))"
           "(= __ ((partial + 5) 3))"])

; Double Down
(def p015 ["(= (__ 2) 4)"
           "(= (__ 3) 6)"
           "(= (__ 11) 22)"
           "(= (__ 7) 14)"])

; Hello World
(def p016 ["(= (__ \"Dave\") \"Hello, Dave!\")"
           "(= (__ \"Jenn\") \"Hello, Jenn!\")"
           "(= (__ \"Rhea\") \"Hello, Rhea!\")"])

; Sequences: map
(def p017 ["(= __ (map #(+ % 5) '(1 2 3)))"])

; Sequences: filter
(def p018 ["(= __ (filter #(> % 5) '(3 4 5 6 7)))"])

; Last Element
; Restrictions: last
(def p019 ["(= (__ [1 2 3 4 5]) 5)"
           "(= (__ '(5 4 3)) 3)"
           "(= (__ [\"b\" \"c\" \"d\"]) \"d\")"])

; Penultimate Element
(def p020 ["(= (__ (list 1 2 3 4 5)) 4)"
           "(= (__ [\"a\" \"b\" \"c\"]) \"b\")"
           "(= (__ [[1 2] [3 4]]) [1 2])"])

; Nth Element
; Restrictions: nth
(def p021 ["(= (__ '(4 5 6 7) 2) 6)"
           "(= (__ [:a :b :c] 0) :a)"
           "(= (__ [1 2 3 4] 1) 2)"
           "(= (__ '([1 2] [3 4] [5 6]) 2) [5 6])"])

; Count a Sequence
; Restrictions: count
(def p022 ["(= (__ '(1 2 3 3 1)) 5)"
           "(= (__ \"Hello World\") 11)"
           "(= (__ [[1 2] [3 4] [5 6]]) 3)"
           "(= (__ '(13)) 1)"
           "(= (__ '(:a :b :c)) 3)"])

; Reverse a Sequence
; Restrictions: reverse rseq
(def p023 ["(= (__ [1 2 3 4 5]) [5 4 3 2 1])"
           "(= (__ (sorted-set 5 7 2 7)) '(7 5 2))"
           "(= (__ [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]])"])

; Sum It All Up
(def p024 ["(= (__ [1 2 3]) 6)"
           "(= (__ (list 0 -2 5 5)) 8)"
           "(= (__ #{4 2 1}) 7)"
           "(= (__ '(0 0 -1)) -1)"
           "(= (__ '(1 10 3)) 14)"])

; Find the odd numbers
(def p025 ["(= (__ #{1 2 3 4 5}) '(1 3 5))"
           "(= (__ [4 2 1 6]) '(1))"
           "(= (__ [2 2 4 6]) '())"
           "(= (__ [1 1 1 3]) '(1 1 1 3))"])

; Fibonacci Sequence
(def p026 ["(= (__ 3) '(1 1 2))"
           "(= (__ 6) '(1 1 2 3 5 8))"
           "(= (__ 8) '(1 1 2 3 5 8 13 21))"])

; Palindrome Detector
(def p027 ["(false? (__ '(1 2 3 4 5)))"
           "(true? (__ \"racecar\"))"
           "(true? (__ [:foo :bar :foo]))"
           "(true? (__ '(1 1 3 3 1 1)))"
           "(false? (__ '(:a :b :c)))"])

; Flatten a Sequence
; Restrictions: flatten
(def p028 ["(= (__ '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))"
           "(= (__ [\"a\" [\"b\"] \"c\"]) '(\"a\" \"b\" \"c\"))"
           "(= (__ '((((:a))))) '(:a))"])

; Get the Caps
(def p029 ["(= (__ \"HeLlO, WoRlD!\") \"HLOWRD\")"
           "(empty? (__ \"nothing\"))"
           "(= (__ \"$#A(*&987Zf\") \"AZ\")"])

; Compress a Sequence
(def p030 ["(= (apply str (__ \"Leeeeeerrroyyy\")) \"Leroy\")"
           "(= (__ [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))"
           "(= (__ [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))"])

; Pack a Sequence
(def p031 ["(= (__ [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3)))"
           "(= (__ [:a :a :b :b :c]) '((:a :a) (:b :b) (:c)))"
           "(= (__ [[1 2] [1 2] [3 4]]) '(([1 2] [1 2]) ([3 4])))"])

; Duplicate a Sequence
(def p032 ["(= (__ [1 2 3]) '(1 1 2 2 3 3))"
           "(= (__ [:a :a :b :b]) '(:a :a :a :a :b :b :b :b))"
           "(= (__ [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))"])

; Replicate a Sequence
(def p033 ["(= (__ [1 2 3] 2) '(1 1 2 2 3 3))"
           "(= (__ [:a :b] 4) '(:a :a :a :a :b :b :b :b))"
           "(= (__ [4 5 6] 1) '(4 5 6))"
           "(= (__ [[1 2] [3 4]] 2) '([1 2] [1 2] [3 4] [3 4]))"
           "(= (__ [44 33] 2) [44 44 33 33])"])

; Implement range
; Restrictions: range
(def p034 ["(= (__ 1 4) '(1 2 3))"
           "(= (__ -2 2) '(-2 -1 0 1))"
           "(= (__ 5 8) '(5 6 7))"])

; Local bindings
(def p035 ["(= __ (let [x 5] (+ 2 x)))"
           "(= __ (let [x 3, y 10] (- y x)))"
           "(= __ (let [x 21] (let [y 3] (/ x y))))"])
