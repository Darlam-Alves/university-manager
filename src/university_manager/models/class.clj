(ns university-manager.models.class
  (:require [schema.core :as s]))

(def class-skeleton
  {:cod {:schema s/Uuid}
   :number {:schema s/Int}
   :number-of-students {:schema s/Int}
   :abbreviation {:schema s/Str}})


  
  
