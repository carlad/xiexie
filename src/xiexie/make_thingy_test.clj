(ns xiexie.make-thingy-test
  (:require [clojure.test :refer :all]
            [xiexie.make-thingy :refer [make-thingy]]))

(deftest make-thingy-test
  (let [n (rand-int Integer/MAX_VALUE)
        f (make-thingy n)]
    (is (= n (f)))
    (is (= n (f 123)))
    (is (= n (apply f 123 (range))))))

(make-thingy-test)