(ns university-manager.db.schema.class)


(def schema
  [{:db/ident       :class/code
    :db/valueType   :db.type/string
    :db/unique      :db.unique/identity 
    :db/cardinality :db.cardinality/one}

   {:db/ident       :class/course
    :db/valueType   :db.type/ref       
    :db/cardinality :db.cardinality/one}

   {:db/ident       :class/number
    :db/valueType   :db.type/long
    :db/cardinality :db.cardinality/one}

   {:db/ident       :class/student-count
    :db/valueType   :db.type/long
    :db/cardinality :db.cardinality/one}])