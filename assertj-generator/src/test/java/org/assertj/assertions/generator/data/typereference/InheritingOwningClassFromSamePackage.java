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
package org.assertj.assertions.generator.data.typereference;

import org.assertj.assertions.generator.data.typereference.different_package.KlassInDifferentPackage;

import java.util.List;

public class InheritingOwningClassFromSamePackage extends OwningClass{

  // PUBLIC FIELDS - SAME PACKAGE AS OWNING CLASS
  public List<KlassInSamePackage> klassInSamePackageAsIterable_subclassSamePackageAsOwning;
  public List<? extends KlassInSamePackage> classInSamePackageAsGenericList_subclassSamePackageAsOwning;
  public KlassInSamePackage[] klassInSamePackageAsArray_subclassSamePackageAsOwning;
  public KlassInSamePackage klassInSamePackageAsField_subclassSamePackageAsOwning;

  // PUBLIC FIELDS - DIFFERENT PACKAGE THAN OWNING CLASS
  public List<KlassInDifferentPackage> klassInDifferentPackageAsList_subclassSamePackageAsOwning;
  public List<? extends KlassInDifferentPackage> classInDifferentPackageAsGenericList_subclassSamePackageAsOwning;
  public KlassInDifferentPackage[] klassInDifferentPackageAsArray_subclassSamePackageAsOwning;
  public KlassInDifferentPackage klassInDifferentPackageAsField_subclassSamePackageAsOwning;





  // PRIVATE FIELDS - ASSERTED THROUGH GETTER - SAME PACKAGE AS OWNING CLASS
  private List<KlassInSamePackage> klassInSamePackageAsIterable_getter_subclassSamePackageAsOwning;
  private List<? extends KlassInSamePackage> classInSamePackageAsGenericList_getter_subclassSamePackageAsOwning;
  private KlassInSamePackage[] klassInSamePackageAsArray_getter_subclassSamePackageAsOwning;
  private KlassInSamePackage klassInSamePackageAsField_getter_subclassSamePackageAsOwning;

  // PRIVATE FIELDS - ASSERTED THROUGH GETTER - DIFFERENT PACKAGE THAN OWNING CLASS
  private List<KlassInDifferentPackage> klassInDifferentPackageAsList_getter_subclassSamePackageAsOwning;
  private List<? extends KlassInDifferentPackage> classInDifferentPackageAsGenericList_getter_subclassSamePackageAsOwning;
  private KlassInDifferentPackage[] klassInDifferentPackageAsArray_getter_subclassSamePackageAsOwning;
  private KlassInDifferentPackage klassInDifferentPackageAsField_getter_subclassSamePackageAsOwning;

  public List<KlassInSamePackage> getClassInSamePackageAsIterable_getter_subclassSamePackageAsOwning() {
    return klassInSamePackageAsIterable_getter_subclassSamePackageAsOwning;
  }

  public List<? extends KlassInSamePackage> getClassInSamePackageAsGenericList_getter_subclassSamePackageAsOwning() {
    return classInSamePackageAsGenericList_getter_subclassSamePackageAsOwning;
  }

  public KlassInSamePackage[] getClassInSamePackageAsArray_getter_subclassSamePackageAsOwning() {
    return klassInSamePackageAsArray_getter_subclassSamePackageAsOwning;
  }

  public KlassInSamePackage getClassInSamePackageAsField_getter_subclassSamePackageAsOwning() {
    return klassInSamePackageAsField_getter_subclassSamePackageAsOwning;
  }

  public List<KlassInDifferentPackage> getClassInDifferentPackageAsList_getter_subclassSamePackageAsOwning() {
    return klassInDifferentPackageAsList_getter_subclassSamePackageAsOwning;
  }

  public List<? extends KlassInDifferentPackage> getClassInDifferentPackageAsGenericList_getter_subclassSamePackageAsOwning() {
    return classInDifferentPackageAsGenericList_getter_subclassSamePackageAsOwning;
  }

  public KlassInDifferentPackage[] getClassInDifferentPackageAsArray_getter_subclassSamePackageAsOwning() {
    return klassInDifferentPackageAsArray_getter_subclassSamePackageAsOwning;
  }

  public KlassInDifferentPackage getClassInDifferentPackageAsField_getter_subclassSamePackageAsOwning() {
    return klassInDifferentPackageAsField_getter_subclassSamePackageAsOwning;
  }
}
