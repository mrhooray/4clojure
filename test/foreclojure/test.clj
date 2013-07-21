(ns foreclojure.test
  (:use clojure.test 
        clojure.set)
  (:require [clojure.pprint :as pprint]
            [clojure.string :as string]))

(def width 3)
(def total 150)

(doseq [file (rest (file-seq (clojure.java.io/file "solutions/")))] 
  (->> (. file getName)
       (str "solutions/")
       (load-file)))

(defn pad-number [n width]
  (pprint/cl-format nil (str "~" width ",'0d") n))

(defn get-prefixed [prefix n]
  (let 
    [v (find-var (symbol (str prefix (pad-number n width))))]
    (if v (var-get v))))

(defn solve [problem solution]
  (map (comp load-string #(string/replace % #"__" solution)) problem))

(defn land
  ([] true)
  ([x & xs] (and x (apply land xs))))

(deftest test-all
  (doseq 
    [n (map inc (doall (range total)))]
    (let [problem (get-prefixed "foreclojure.test/p" n)
          solution (get-prefixed "foreclojure.test/s" n)]
      (if (and problem solution)
        (is (= (apply land (solve problem solution)) true))))))
