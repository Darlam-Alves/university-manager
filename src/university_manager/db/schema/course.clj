(ns university-manager.db.schema.course)

(def schema
  [{:db/ident       :course/code
    :db/valueType   :db.type/string
    :db/unique      :db.unique/identity 
    :db/cardinality :db.cardinality/one}
   
   {:db/ident       :course/number
    :db/valueType   :db.type/bigdec
    :db/cardinality :db.cardinality/one}

   {:db/ident       :course/name
    :db/valueType   :db.type/string
    :db/cardinality :db.cardinality/one}

   {:db/ident       :course/prereq
    :db/valueType   :db.type/ref       
    :db/cardinality :db.cardinality/one}

   {:db/ident       :course/credits
    :db/valueType   :db.type/long
    :db/cardinality :db.cardinality/one}])