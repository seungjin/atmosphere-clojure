(ns atmosphere.core
  (:use ring.adapter.jetty))

(defn app [req]
  {
   :status 200
   :headers {"Content-Type" "text/plain"}
   :body "Hello from Clojure!!\n"
  }
)

(defn -main []
  (let [port (Integer/parseInt (System/getenv "PORT"))]
    (run-jetty app {:port port})))

(defn dev_run []
  (run-jetty #'app {:port 8080})
)