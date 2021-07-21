(ns katas.core
  (:gen-class)
  (:require [clojure.string :as s]))


(comment
  (def user-name "Nicolas")

  ;; Upper case
  (s/upper-case user-name)

  (type (seq user-name))

  ;; Listes
  (def my-list '(1 "a" "b" 12.5))
  (type my-list)

  ;; Vecteurs
  (def my-vec [1 "a" "ZZ"])
  (type my-vec)

  (def items (count (seq user-name)))

  (reduce str (interleave (seq user-name) (repeat 7 " ")))

  (reduce str
          (map s/upper-case (interpose " " (seq user-name))))
  )
;; Wrap in a function
(defn capitalize
  "Capitalize Name"
  [s]
  (reduce str
          (map s/upper-case (interpose " " (seq s)))))

;; Code utilisable dans IDE mais non compilé
(comment
  (capitalize "georges"))
