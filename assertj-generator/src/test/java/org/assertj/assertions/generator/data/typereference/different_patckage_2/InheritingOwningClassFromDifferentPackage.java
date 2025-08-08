package org.assertj.assertions.generator.data.typereference.different_patckage_2;


import org.assertj.assertions.generator.data.typereference.KlassInSamePackage;
import org.assertj.assertions.generator.data.typereference.OwningClass;
import org.assertj.assertions.generator.data.typereference.different_package.KlassInDifferentPackage;

import java.util.List;

public class InheritingOwningClassFromDifferentPackage extends OwningClass {

  // PUBLIC FIELDS - SAME PACKAGE AS OWNING CLASS
  public List<KlassInSamePackage> klassInSamePackageAsIterable_subclassDifferentPackageThanOwning;
  public List<? extends KlassInSamePackage> classInSamePackageAsGenericList_subclassDifferentPackageThanOwning;
  public KlassInSamePackage[] klassInSamePackageAsArray_subclassDifferentPackageThanOwning;
  public KlassInSamePackage klassInSamePackageAsField_subclassDifferentPackageThanOwning;

  // PUBLIC FIELDS - DIFFERENT PACKAGE THAN OWNING CLASS
  public List<KlassInDifferentPackage> klassInDifferentPackageAsList_subclassDifferentPackageThanOwning;
  public List<? extends KlassInDifferentPackage> classInDifferentPackageAsGenericList_subclassDifferentPackageThanOwning;
  public KlassInDifferentPackage[] klassInDifferentPackageAsArray_subclassDifferentPackageThanOwning;
  public KlassInDifferentPackage klassInDifferentPackageAsField_subclassDifferentPackageThanOwning;





  // PRIVATE FIELDS - ASSERTED THROUGH GETTER - SAME PACKAGE AS OWNING CLASS
  private List<KlassInSamePackage> klassInSamePackageAsIterable_getter_subclassDifferentPackageThanOwning;
  private List<? extends KlassInSamePackage> classInSamePackageAsGenericList_getter_subclassDifferentPackageThanOwning;
  private KlassInSamePackage[] klassInSamePackageAsArray_getter_subclassDifferentPackageThanOwning;
  private KlassInSamePackage klassInSamePackageAsField_getter_subclassDifferentPackageThanOwning;

  // PRIVATE FIELDS - ASSERTED THROUGH GETTER - DIFFERENT PACKAGE THAN OWNING CLASS
  private List<KlassInDifferentPackage> klassInDifferentPackageAsList_getter_subclassDifferentPackageThanOwning;
  private List<? extends KlassInDifferentPackage> classInDifferentPackageAsGenericList_getter_subclassDifferentPackageThanOwning;
  private KlassInDifferentPackage[] klassInDifferentPackageAsArray_getter_subclassDifferentPackageThanOwning;
  private KlassInDifferentPackage klassInDifferentPackageAsField_getter_subclassDifferentPackageThanOwning;

  public List<KlassInSamePackage> getClassInSamePackageAsIterable_getter_subclassDifferentPackageThanOwning() {
    return klassInSamePackageAsIterable_getter_subclassDifferentPackageThanOwning;
  }

  public List<? extends KlassInSamePackage> getClassInSamePackageAsGenericList_getter_subclassDifferentPackageThanOwning() {
    return classInSamePackageAsGenericList_getter_subclassDifferentPackageThanOwning;
  }

  public KlassInSamePackage[] getClassInSamePackageAsArray_getter_subclassDifferentPackageThanOwning() {
    return klassInSamePackageAsArray_getter_subclassDifferentPackageThanOwning;
  }

  public KlassInSamePackage getClassInSamePackageAsField_getter_subclassDifferentPackageThanOwning() {
    return klassInSamePackageAsField_getter_subclassDifferentPackageThanOwning;
  }

  public List<KlassInDifferentPackage> getClassInDifferentPackageAsList_getter_subclassDifferentPackageThanOwning() {
    return klassInDifferentPackageAsList_getter_subclassDifferentPackageThanOwning;
  }

  public List<? extends KlassInDifferentPackage> getClassInDifferentPackageAsGenericList_getter_subclassDifferentPackageThanOwning() {
    return classInDifferentPackageAsGenericList_getter_subclassDifferentPackageThanOwning;
  }

  public KlassInDifferentPackage[] getClassInDifferentPackageAsArray_getter_subclassDifferentPackageThanOwning() {
    return klassInDifferentPackageAsArray_getter_subclassDifferentPackageThanOwning;
  }

  public KlassInDifferentPackage getClassInDifferentPackageAsField_getter_subclassDifferentPackageThanOwning() {
    return klassInDifferentPackageAsField_getter_subclassDifferentPackageThanOwning;
  }


  }
