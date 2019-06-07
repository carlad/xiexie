;;  Define a function make-thingy which takes a single argument x. 
;   It should return another function, which takes any number of arguments and always returns x.

(ns xiexie.make-thingy)

(defn make-thingy [x]
  (fn foo [& args] x))
