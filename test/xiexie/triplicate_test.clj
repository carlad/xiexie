(ns xiexie.triplicate-test
  (:require [clojure.test :refer :all]
            [xiexie.triplicate :refer [triplicate]]))

(deftest triplicate-test
  (is (= nil (triplicate #(println "hello world")))))

(triplicate-test)
