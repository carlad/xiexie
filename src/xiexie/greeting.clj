(ns xiexie.greeting)

  (defn greeting
    ([]  (str "Hello, World!"))
    ([x] (str "Hello, " x "!"))
    ([x y] (str x ", " y "!")))
