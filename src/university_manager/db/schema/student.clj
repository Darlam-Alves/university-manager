(ns university-manager.db.schema.student)

(def schema
  [{:db/ident       :student/name
    :db/valueType   :db.type/string
    :db/cardinality :db.cardinality/one}

   {:db/ident       :student/id-university
    :db/valueType   :db.type/long
    :db/unique      :db.unique/identity
    :db/cardinality :db.cardinality/one}

   {:db/ident       :student/age
    :db/valueType   :db.type/long
    :db/cardinality :db.cardinality/one}

   {:db/ident       :student/city
    :db/valueType   :db.type/string
    :db/cardinality :db.cardinality/one}])

