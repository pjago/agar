(defproject agar "0.0.0"
  :description "agar.io and evolutions"
  :dependencies [[org.clojure/clojure "1.9.0-alpha14"]
                 [net.mikera/core.matrix "0.58.0"]
                 [net.mikera/vectorz-clj "0.46.0"]
                 [quil "2.5.0"]]
  :profiles {:dev {:source-paths ["src" "test"]
                   :dependencies [[org.clojure/test.check "0.9.0"]
                                  [org.clojure/tools.namespace "0.2.11"]
                                  [proto-repl "0.3.1"]
                                  [proto-repl-charts "0.3.2"]
                                  [proto-repl-sayid "0.1.3"]]}}
  :aot [agar.io]
  :main agar.io
  :source-paths ["src"]
  :test-paths ["test"])
