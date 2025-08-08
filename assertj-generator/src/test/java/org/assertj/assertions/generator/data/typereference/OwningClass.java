package org.assertj.assertions.generator.data.typereference;

import org.assertj.assertions.generator.data.typereference.different_package.KlassInDifferentPackage;

import java.util.List;

public class OwningClass {
  // PUBLIC FIELDS - SAME PACKAGE AS OWNING CLASS
  public List<KlassInSamePackage> klassInSamePackageAsIterable_owningKlass;
  public List<? extends KlassInSamePackage> classInSamePackageAsGenericList_owningClass;
  public KlassInSamePackage[] klassInSamePackageAsArray_owningKlass;
  public KlassInSamePackage klassInSamePackageAsField_owningKlass;


  // PUBLIC FIELDS - DIFFERENT PACKAGE THAN OWNING CLASS
  public List<KlassInDifferentPackage> klassInDifferentPackageAsList_owningKlass;
  public List<? extends KlassInDifferentPackage> classInDifferentPackageAsGenericList_owningClass;
  public KlassInDifferentPackage[] klassInDifferentPackageAsArray_owningKlasses;
  public KlassInDifferentPackage klassInDifferentPackageAsField_owningKlass;

  // PRIVATE FIELDS - ASSERTED THROUGH GETTER - SAME PACKAGE AS OWNING CLASS
  private List<KlassInSamePackage> klassInSamePackageAsIterable_getter_owningKlass;
  private List<? extends KlassInSamePackage> classInSamePackageAsGenericList_getter_owningClass;
  private KlassInSamePackage[] classInSamePackageAsArray_getter_owningKlass;
  private KlassInSamePackage klassInSamePackageAsField_getter_owningKlass;

  // PRIVATE FIELDS - ASSERTED THROUGH GETTER - DIFFERENT PACKAGE THAN OWNING CLASS
  private List<KlassInDifferentPackage> klassInDifferentPackageAsList_getter_owningKlass;
  private List<? extends KlassInDifferentPackage> classInDifferentPackageAsGenericList_getter_owningClass;
  private KlassInDifferentPackage[] classInDifferentPackageAsArray_getter_owningKlass;
  private KlassInDifferentPackage klassInDifferentPackageAsField_getter_owningKlass;

  public List<KlassInSamePackage> getClassInSamePackageAsIterable_getter() {
    return klassInSamePackageAsIterable_getter_owningKlass;
  }

  public List<? extends KlassInSamePackage> getClassInSamePackageAsGenericList_getter() {
    return classInSamePackageAsGenericList_getter_owningClass;
  }

  public KlassInSamePackage[] getClassInSamePackageAsArray_getter() {
    return classInSamePackageAsArray_getter_owningKlass;
  }

  public KlassInSamePackage getClassInSamePackageAsField_getter() {
    return klassInSamePackageAsField_getter_owningKlass;
  }

  public List<KlassInDifferentPackage> getClassInDifferentPackageAsList_getter() {
    return klassInDifferentPackageAsList_getter_owningKlass;
  }

  public List<? extends KlassInDifferentPackage> getClassInDifferentPackageAsGenericList_getter() {
    return classInDifferentPackageAsGenericList_getter_owningClass;
  }

  public KlassInDifferentPackage[] getClassInDifferentPackageAsArray_getter() {
    return classInDifferentPackageAsArray_getter_owningKlass;
  }

  public KlassInDifferentPackage getClassInDifferentPackageAsField_getter() {
    return klassInDifferentPackageAsField_getter_owningKlass;
  }
}
