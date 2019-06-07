(ns xiexie.greeting-test
  (:require [clojure.test :refer :all]
            [xiexie.greeting :refer [greeting]]))

(deftest greeting-test
  (is (= "Hello, World!" (greeting)))
  (is (= "Hello, Clojure!" (greeting "Clojure")))
  (is (= "Good morning, Clojure!" (greeting "Good morning" "Clojure"))))

(greeting-test)