(ns foreclojure.test
  (:use clojure.test 
        clojure.set
        foreclojure.solutions
        foreclojure.problems)
  (:require [clojure.pprint :as pprint]
            [clojure.string :as string]))

(def width 3)

(defn pad-number [n width]
  (pprint/cl-format nil (str "~" width ",'0d") n))

(defn get-solution [n]
  ((comp var-get find-var symbol)
   (str "foreclojure.solutions/s" (pad-number n width))))

(defn get-problem [n]
  ((comp var-get find-var symbol)
   (str "foreclojure.problems/p" (pad-number n width))))

(defn solve [problem solution]
  (map (comp load-string #(string/replace % #"__" solution)) problem))

(defn land
  ([] true)
  ([x & xs] (and x (apply land xs))))

(deftest test-all
  (doseq [n (map inc (doall (range (count (ns-publics 'foreclojure.problems)))))]
    (is (= (apply land (solve (get-problem n) (get-solution n))) true))))
