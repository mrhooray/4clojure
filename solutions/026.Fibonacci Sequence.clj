; Fibonacci Sequence

(def p026 ["(= (__ 3) '(1 1 2))"
           "(= (__ 6) '(1 1 2 3 5 8))"
           "(= (__ 8) '(1 1 2 3 5 8 13 21))"])

(def s026 "#(take % ((fn fib [a b]
                      (lazy-seq (cons a (fib b (+ a b))))) 1 1))")
