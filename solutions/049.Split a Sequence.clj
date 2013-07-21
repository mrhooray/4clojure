; Split a sequence
; Restrictions: split-at

(def p049 ["(= (__ 3 [1 2 3 4 5 6]) [[1 2 3] [4 5 6]])"
           "(= (__ 1 [:a :b :c :d]) [[:a] [:b :c :d]])"
           "(= (__ 2 [[1 2] [3 4] [5 6]]) [[[1 2] [3 4]] [[5 6]]])"])

(def s049 "(juxt take drop)")
