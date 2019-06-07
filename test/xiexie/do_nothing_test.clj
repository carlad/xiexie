(ns xiexie.do-nothing-test
  (:require [clojure.test :refer :all]
            [xiexie.do-nothing :refer [do-nothing]]))

(deftest do-nothing-test
  (is (= 123 (do-nothing 123))))

(do-nothing-test)
