; Get the Caps
(def p029 ["(= (__ \"HeLlO, WoRlD!\") \"HLOWRD\")"
           "(empty? (__ \"nothing\"))"
           "(= (__ \"$#A(*&987Zf\") \"AZ\")"])

(def s029 "#(apply str (re-seq #\"[A-Z]\" %))")
