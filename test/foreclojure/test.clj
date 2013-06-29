(ns foreclojure.test
  (:use [clojure.test] 
        [foreclojure.problems]))

(defn land
  ([] true)
  ([x & xs] (and x (apply land xs))))

(deftest test-all
  (doseq [expr-coll (map var-get (vals (ns-publics 'foreclojure.problems)))] 
    (is (= (apply land expr-coll) true))))
