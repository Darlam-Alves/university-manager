(ns university-manager.db.schema.teaches)

(def schema
  [{:db/ident       :teaches/professor
    :db/valueType   :db.type/ref     ;; N#FuncProf → professor
    :db/cardinality :db.cardinality/one}

   {:db/ident       :teaches/class
    :db/valueType   :db.type/ref     ;; Código → class
    :db/cardinality :db.cardinality/one}

   {:db/ident       :teaches/book
    :db/valueType   :db.type/string
    :db/cardinality :db.cardinality/one}])