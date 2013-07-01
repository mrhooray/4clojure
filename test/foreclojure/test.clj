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
  (let 
    [v (find-var (symbol (str "foreclojure.solutions/s" (pad-number n width))))]
    (if v (var-get v))))

(defn get-problem [n]
  (let 
    [v (find-var (symbol (str "foreclojure.problems/p" (pad-number n width))))]
    (if v (var-get v))))

(defn solve [problem solution]
  (map (comp load-string #(string/replace % #"__" solution)) problem))

(defn land
  ([] true)
  ([x & xs] (and x (apply land xs))))

(deftest test-all
  (doseq 
    [n (map inc (doall (range (count (ns-publics 'foreclojure.problems)))))]
    (let [problem (get-problem n) solution (get-solution n)]
      (if (and problem solution)
        (is (= (apply land (solve problem solution)) true))))))
