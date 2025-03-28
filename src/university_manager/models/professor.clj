(ns university-manager.models.professor
  (:require [common-core.schema :as schema]
            [common-core.skeletons :as skeletons]
            [schema.core :as s]))

(def professor-skeleton
  {:cod {:schema s/Uuid}
   :name {:schema s/Str}
   :degree {:schema s/Str}
   :age {:schema s/Int}})


(def degree
  #{:bachelor
    :master
    :doctorate})

