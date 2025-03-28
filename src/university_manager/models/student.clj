(ns university-manager.models.student
  (:require [common-core.schema :as schema]
            [common-core.skeletons :as skeletons] 
            [schema.core :as s]
            ))

(def student-skeleton
  {:cod {:schema s/Uuid}
   :name {:schema s/Str}
   :surname {:schema s/Str}
   :email {:schema s/Str}
   :city {:schema s/Str} 
   :media {:schema s/Int} 
   :courses {:schema s/Any}})

(def situation
  #{:active 
    :inactive})

(def status
  #{:approved 
    :disapproved})

(def student-schema
  (s/defschema Student
    (s/keys :req [::student-skeleton]
            :opt [::situation
                  ::status])))

(defn create-student
  [student]
  (s/validate student-schema student))
