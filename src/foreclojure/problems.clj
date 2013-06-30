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
(def p019 ["(= (__ [1 2 3 4 5]) 5)"
           "(= (__ '(5 4 3)) 3)"
           "(= (__ [\"b\" \"c\" \"d\"]) \"d\")"])

(def p020 ["(= (__ (list 1 2 3 4 5)) 4)"
                                 "(= (__ [\"a\" \"b\" \"c\"]) \"b\")"
                                 "(= (__ [[1 2] [3 4]]) [1 2])"])
