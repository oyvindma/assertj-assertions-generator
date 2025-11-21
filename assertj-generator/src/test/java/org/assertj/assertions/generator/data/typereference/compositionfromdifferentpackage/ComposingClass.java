/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2012-2025 the original author or authors.
 */
package org.assertj.assertions.generator.data.typereference.compositionfromdifferentpackage;

import org.assertj.assertions.generator.data.typereference.classesinsamepackage.ReferencedClassInSamePackage;
import org.assertj.assertions.generator.data.typereference.compositionfromdifferentpackage.different_package.ReferencedClassInDifferentPackage;

import java.util.List;

public class ComposingClass {
  // PUBLIC FIELDS - SAME PACKAGE AS OWNING CLASS
  public List<ReferencedClassInSamePackage> klassInSamePackageAsIterable_owningReferencedClasses;
  public List<? extends ReferencedClassInSamePackage> classInSamePackageAsGenericList_owningClass;
  public ReferencedClassInSamePackage[] klassInSamePackageAsArray_owningReferencedClasses;
  public ReferencedClassInSamePackage klassInSamePackageAsField_owningReferencedClass;


  // PUBLIC FIELDS - DIFFERENT PACKAGE THAN OWNING CLASS
  public List<ReferencedClassInDifferentPackage> klassInDifferentPackageAsList_owningReferencedClasses;
  public List<? extends ReferencedClassInDifferentPackage> classInDifferentPackageAsGenericList_owningClass;
  public ReferencedClassInDifferentPackage[] klassInDifferentPackageAsArray_owningReferencedClasses;
  public ReferencedClassInDifferentPackage klassInDifferentPackageAsField_owningReferencedClass;

  // PRIVATE FIELDS - ASSERTED THROUGH GETTER - SAME PACKAGE AS OWNING CLASS
  private List<ReferencedClassInSamePackage> klassInSamePackageAsIterable_getter_owningReferencedClasses;
  private List<? extends ReferencedClassInSamePackage> classInSamePackageAsGenericList_getter_owningClass;
  private ReferencedClassInSamePackage[] classInSamePackageAsArray_getter_owningKlass;
  private ReferencedClassInSamePackage klassInSamePackageAsField_getter_owningReferencedClass;

  // PRIVATE FIELDS - ASSERTED THROUGH GETTER - DIFFERENT PACKAGE THAN OWNING CLASS
  private List<ReferencedClassInDifferentPackage> klassInDifferentPackageAsList_getter_owningReferencedClasses;
  private List<? extends ReferencedClassInDifferentPackage> classInDifferentPackageAsGenericList_getter_owningClass;
  private ReferencedClassInDifferentPackage[] classInDifferentPackageAsArray_getter_owningKlass;
  private ReferencedClassInDifferentPackage klassInDifferentPackageAsField_getter_owningReferencedClass;

  public List<ReferencedClassInSamePackage> getClassInSamePackageAsIterable_getter() {
    return klassInSamePackageAsIterable_getter_owningReferencedClasses;
  }

  public List<? extends ReferencedClassInSamePackage> getClassInSamePackageAsGenericList_getter() {
    return classInSamePackageAsGenericList_getter_owningClass;
  }

  public ReferencedClassInSamePackage[] getClassInSamePackageAsArray_getter() {
    return classInSamePackageAsArray_getter_owningKlass;
  }

  public ReferencedClassInSamePackage getClassInSamePackageAsField_getter() {
    return klassInSamePackageAsField_getter_owningReferencedClass;
  }

  public List<ReferencedClassInDifferentPackage> getClassInDifferentPackageAsList_getter() {
    return klassInDifferentPackageAsList_getter_owningReferencedClasses;
  }

  public List<? extends ReferencedClassInDifferentPackage> getClassInDifferentPackageAsGenericList_getter() {
    return classInDifferentPackageAsGenericList_getter_owningClass;
  }

  public ReferencedClassInDifferentPackage[] getClassInDifferentPackageAsArray_getter() {
    return classInDifferentPackageAsArray_getter_owningKlass;
  }

  public ReferencedClassInDifferentPackage getClassInDifferentPackageAsField_getter() {
    return klassInDifferentPackageAsField_getter_owningReferencedClass;
  }
}
