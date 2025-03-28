(ns university-manager.models.course
  (:require [schema.core :as s]))

(def course-skeleton
    {:abbreviation {:schema s/Str}
     :number {:schema s/Int} 
     :cod {:schema s/Uuid}
     :number-of-credits {:schema s/Int}})
