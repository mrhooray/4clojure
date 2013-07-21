(ns foreclojure.test
  (:use clojure.test)
  (:require clojure.set
            [clojure.pprint :as pprint]
            [clojure.java.io :as io]
            [clojure.string :as string]))

(def width 3)
(def total 150)

(doseq [file (rest (file-seq (io/file "solutions/")))] 
  (->> (. file getName)
       (str "solutions/")
       (load-file)))

(defn pad-number [n width]
  (pprint/cl-format nil (str "~" width ",'0d") n))

(defn get-val [prefix n]
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
    (let [problem (get-val "foreclojure.test/p" n)
          solution (get-val "foreclojure.test/s" n)]
      (if (and problem solution)
        (is (= (apply land (solve problem solution)) true))))))
