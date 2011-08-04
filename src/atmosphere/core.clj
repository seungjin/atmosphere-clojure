(ns atmosphere.core
  (:use ring.adapter.jetty)
  (:use compojure.core)
  (:require 
    [compojure.route :as route]
    [compojure.handler :as handler])
)

(defn app [req]
  {
   :status 200
   :headers {"Content-Type" "text/plain"}
   :body "Hello from Clojure!!\n"
  }
)

(defroutes rts
  (GET "/" [] "Address Book!!")
  (GET "/aa" [] "kkkk")
  (route/not-found "Page not found")
)

(def application-routes rts)

(defn dev_run []
  (run-jetty application-routes {:port 8080})
)