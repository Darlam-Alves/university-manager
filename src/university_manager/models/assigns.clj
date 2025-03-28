(ns university-manager.models.assigns
  (:require [common-core.schema :as schema]
            [common-core.skeletons :as skeletons]
            [schema.core :as s]))

(def assigns-skeleton
    {:cod-professor {:schema s/Uuid}
     :cod-class {:schema s/Uuid}
     :reference-book {:schema s/Str}})