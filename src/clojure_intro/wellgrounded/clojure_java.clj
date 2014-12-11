(ns clojure-intro.wellgrounded.clojure-java)
;(import '(java.util ArrayList))

(defn lenStr [obj] (.length (.toString obj)))
(lenStr ["Ahoj", "vector"])

; Implement Runnable and override toString
(def runnable (proxy [Runnable] []
          (run [] (println "Called from Runnable"))
          (toString [] "MyRunnable")
          ))

(def javaList (java.util.ArrayList. [1,4,2,10]))
(every? #(< %1 50) javaList)


