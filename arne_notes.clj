;;; when using REPL 
; (require '[clojure.test :refer :all])
; (require '[clojure.test :as t])
; (require '[clojure.test :refer [deftest is]])

;;; in test files
;(ns project-name.test-1
;  (:require [clojure.test :refer :all]))

; src directory with project files
; test directory with test files


;;; honeysql - a dsl for querying sql
;;; has clojure.java.jdbc under the hood

;;; clojure.script compiles to javascript - used w react to build user interfaces



--------------------------
; defines a var as an atom reference type (ie a box)
(def xxx (atom 125))

; swaps the value of xxx by incrementint it
(swap! xxx inc)

; '@' is same as 'deref' - gets the value form inside the box - nb @ is a sign that something has state
@xxx


