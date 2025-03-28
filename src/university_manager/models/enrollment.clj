(ns university-manager.models.enrollment
  (:require [common-core.schema :as schema]
            [common-core.skeletons :as skeletons]
            [schema.core :as s]))

(def enrollment-skeleton
    {:cod-class {:schema s/Uuid} 
     :cod-student {:schema s/Uuid}
     :grade {:schema s/Int}})


