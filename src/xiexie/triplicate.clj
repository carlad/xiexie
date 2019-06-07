; Define a function triplicate which takes another function and calls it three times, without any arguments.

(ns xiexie.triplicate)

(defn triplicate [f] (f) (f) (f))
