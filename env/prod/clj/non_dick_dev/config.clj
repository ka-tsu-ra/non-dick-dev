(ns non-dick-dev.config
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[non-dick-dev started successfully]=-"))
   :middleware identity})
