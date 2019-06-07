(ns xiexie.always-thingy-test
  (:require [clojure.test :refer :all]
            [xiexie.always-thingy :refer [always-thingy]]))

(deftest always-thingy-test
  (is (= 100 (always-thingy 133 123 435 "string"))))

(always-thingy-test)
