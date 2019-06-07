;; Define a function greeting which:
;  Given no arguments, returns "Hello, World!"
;  Given one argument x, returns "Hello, x!"
;  Given two arguments x and y, returns "x, y!"


(ns xiexie.greeting)

  (defn greeting
    ([]  (str "Hello, World!"))
    ([x] (str "Hello, " x "!"))
    ([x y] (str x ", " y "!")))
