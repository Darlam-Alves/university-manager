(ns university-manager.models.professor
  (:require [schema.core :as s]))

(def professor-skeleton
  {:cod {:schema s/Uuid}
   :name {:schema s/Str}
   :degree {:schema s/Str}
   :age {:schema s/Int}})


(def degree
  #{:bachelor
    :master
    :doctorate})

