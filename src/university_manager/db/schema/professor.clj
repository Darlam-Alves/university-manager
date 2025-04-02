(ns university-manager.db.schema.professor)

(def schema
  [{:db/ident :profesor/name
    :db/valueType :db.type/string
    :db/cardinality :db.cardinality/one}
   
   {:db/ident :profesor/id-func
    :db/valueType :db.type/long
    :db/unique :db.unique/identity
    :db/cardinality :db.cardinality/one}
   
   {:db/ident :profesor/degree
    :db/valueType :db.type/string
    :db/cardinality :db.cardinality/one}
   
   {:db/ident :profesor/age
    :db/valueType :db.type/long
    :db/cardinality :db.cardinality/one}])