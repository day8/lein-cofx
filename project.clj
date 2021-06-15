(defproject    day8/lein-git-inject "lein-git-inject/version"
  :description "Injects project.clj with some execution context."
  :url         "https://github.com/day8/lein-git-inject"
  :license     {:name "EPL-2.0"
                :url "https://www.eclipse.org/legal/epl-2.0/"}

  :eval-in-leiningen true

  :plugins      [[day8/lein-git-inject "0.0.14"]]

  :middleware   [leiningen.git-inject/middleware]

  :release-tasks [["vcs" "assert-committed"]
                  ["deploy" "clojars"]]

  :deploy-repositories [["clojars" {:sign-releases false
                                    :url           "https://clojars.org/repo"
                                    :username      :env/CLOJARS_USERNAME
                                    :password      :env/CLOJARS_TOKEN}]])
