(ns foreclojure.problems
  (:use [foreclojure.solutions]))

(defn ^:private solve [solution problem]
  (map (comp load-string #(clojure.string/replace % #"___" solution)) problem))

;; Nothing but the Truth
(def q001 (solve s001 ["(= ___ true)"]))

;; Simple Math
(def q002 (solve s002 ["(= (- 10 (* 2 3)) ___)"]))

;; Intro to Strings
(def q003 (solve s003 ["(= ___ (.toUpperCase \"hello world\"))"]))

;; Intro to Lists
(def q004 (solve s004 ["(= (list ___) '(:a :b :c))"]))
