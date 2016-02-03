(ns non-dick-dev.config
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [non-dick-dev.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[non-dick-dev started successfully using the development profile]=-"))
   :middleware wrap-dev})
