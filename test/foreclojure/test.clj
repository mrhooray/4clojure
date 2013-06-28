(ns foreclojure.test
  (:use [clojure.test] 
        [foreclojure.question]))

(defn land
  ([] true)
  ([x & xs] (and x (apply land xs))))

(deftest test-all
  (is (= (apply land q001) true))
  (is (= (apply land q002) true))
  )
