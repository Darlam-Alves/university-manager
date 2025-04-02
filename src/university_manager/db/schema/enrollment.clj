(ns university-manager.db.schema.enrollment)

(def schema
  [{:db/ident       :enrollment/class
    :db/valueType   :db.type/ref     
    :db/cardinality :db.cardinality/one}

   {:db/ident       :enrollment/student
    :db/valueType   :db.type/ref     ;; N#USP → student
    :db/cardinality :db.cardinality/one}

   {:db/ident       :enrollment/grade
    :db/valueType   :db.type/double
    :db/cardinality :db.cardinality/one}])