(ns university-manager.models.enrollment
  (:require [schema.core :as s]))

(def enrollment-skeleton
    {:cod-class {:schema s/Uuid} 
     :cod-student {:schema s/Uuid}
     :grade {:schema s/Int}})


