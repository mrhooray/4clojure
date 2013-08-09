; Map Construction

(def p061 ["(= (__ [:a :b :c] [1 2 3]) {:a 1, :b 2, :c 3})"
           "(= (__ [1 2 3 4] [\"one\" \"two\" \"three\"]) {1 \"one\", 2 \"two\", 3 \"three\"})"
           "(= (__ [:foo :bar] [\"foo\" \"bar\" \"baz\"]) {:foo \"foo\", :bar \"bar\"})"])

(def s061 "#(into {} (map vector % %2))")
