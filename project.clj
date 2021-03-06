;; The contents of this file are subject to the LGPL License, Version 3.0.

;; Copyright (C) 2012-2018, Newcastle University

;; This program is free software: you can redistribute it and/or modify
;; it under the terms of the GNU Lesser General Public License as published by
;; the Free Software Foundation, either version 3 of the License, or
;; (at your option) any later version.

;; This program is distributed in the hope that it will be useful,
;; but WITHOUT ANY WARRANTY; without even the implied warranty of
;; MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
;; GNU Lesser General Public License for more details.

;; You should have received a copy of the GNU Lesser General Public License
;; along with this program.  If not, see http://www.gnu.org/licenses/.

(defproject ncl.karyotype "1.0.1"
  :description "Modelling karyotypes in OWL"
  :dependencies [[uk.org.russet/tawny-owl "2.3.0"]
                 [incanter "1.9.3"]]
  :scm {:url "https://github.com/jaydchan/tawny-karyotype.git"
        :name "git"}
  :license {:name "LGPL"
            :url "http://www.gnu.org/licenses/lgpl-3.0.txt"
            :distribution :repo}
  :main ncl.karyotype.core
  :profiles
  {:light {:plugins [[nightlight/lein-nightlight "RELEASE"]]}}
  :aot [ncl.karyotype.core])
