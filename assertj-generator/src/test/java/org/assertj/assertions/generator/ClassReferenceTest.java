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
package org.assertj.assertions.generator;

import com.google.common.base.Optional;
import com.google.common.reflect.TypeToken;
import org.assertj.assertions.generator.data.*;
import org.assertj.assertions.generator.data.art.ArtWork;
import org.assertj.assertions.generator.data.nba.Player;
import org.assertj.assertions.generator.data.nba.PlayerAgent;
import org.assertj.assertions.generator.data.typereference.classesinsamepackage.ComposingClass;
import org.assertj.assertions.generator.description.ClassDescription;
import org.assertj.assertions.generator.description.converter.AnnotationConfiguration;
import org.assertj.assertions.generator.description.converter.ClassToClassDescriptionConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.FieldSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static com.google.common.collect.Lists.newArrayList;
import static java.lang.reflect.Modifier.isPublic;
import static java.nio.charset.Charset.defaultCharset;
import static java.util.Arrays.asList;
import static org.apache.commons.lang3.StringUtils.remove;
import static org.apache.commons.lang3.StringUtils.replace;
import static org.assertj.assertions.generator.util.ClassUtil.collectClasses;
import static org.assertj.core.api.Assertions.*;

public class ClassReferenceTest implements BeanWithExceptionsTest, NestedClassesTest {

  private static final String LINE_SEPARATOR = System.lineSeparator();
  private static final Set<TypeToken<?>> EMPTY_HIERARCHY = new HashSet<>();
  private static final Logger logger = LoggerFactory.getLogger(ClassReferenceTest.class);

  private ClassToClassDescriptionConverter converter;
  private BaseAssertionGenerator assertionGenerator;
  public GenerationHandler generationHandler;

  @BeforeEach
  void beforeEach(@TempDir Path tempDir) throws IOException {
    converter = new ClassToClassDescriptionConverter();
    assertionGenerator = new BaseAssertionGenerator();
    assertionGenerator.setDirectoryWhereAssertionFilesAreGenerated(tempDir.toFile());
    generationHandler = new GenerationHandler(tempDir, Paths.get("src/test/resources"));
  }

  @Nested
  class ClassesInSamePackageWithoutGeneratedAssertionPackageSet{
    @Test
    @Disabled
    void should_generate_flat_assertions_for_OwningClass() throws Exception {
      verifyFlatAssertionGenerationFor(ComposingClass.class);

    }

//    @Test
//    @Disabled
//    void should_generate_flat_assertions_for_InheritingOwningClassFromSamePackage() throws Exception {
////    String generatedAssertionPackage = "my.assertions";
////    assertionGenerator.setGeneratedAssertionsPackage(generatedAssertionPackage);
//
//      verifyFlatAssertionGenerationFor(InheritingOwningClassFromSamePackage.class);
//    }
//
//    @Test
//    @Disabled
//    void should_generate_assertions_with_correct_use_of_import_and_fully_qualified_type_names() throws Exception {
////    String generatedAssertionPackage = "my.assertions";
////    assertionGenerator.setGeneratedAssertionsPackage(generatedAssertionPackage);
//
//      verifyFlatAssertionGenerationFor(OwningClass.class);
//
////    verifyFlatAssertionGenerationFor(InheritingOwningClassFromSamePackage.class, generatedAssertionPackage);
////
////    verifyFlatAssertionGenerationFor(InheritingOwningClassFromDifferentPackage.class, generatedAssertionPackage);
//
//
////    verifyHierarchicalAssertionGenerationFor(
////      BlockBuster.class,
////      setOfTypeTokens(BlockBuster.class, Movie.class, ArtWork.class),
////      generatedAssertionPackage
////    );
    }


  private String expectedContentFromTemplate(NestedClass nestedClass, String fileTemplate) throws IOException {
    String template = contentOf(generationHandler.getResourcesDir().resolve(fileTemplate).toFile(),
                                defaultCharset());
    String content = replace(template, "${nestedClass}Assert",
                             remove(nestedClass.classNameWithOuterClass, '.') + "Assert");
    content = replace(content, "${nestedClass}", nestedClass.classNameWithOuterClass);
    content = replace(content, "${fullyQualifiedOuterClassName}", nestedClass.fullyQualifiedOuterClassName);
    return content;
  }

  static class MyClassLoader extends ClassLoader {
    public MyClassLoader(ClassLoader parent) {
      super(parent);
    }
  }

  private void verifyFlatAssertionGenerationFor(Class<?> clazz) throws IOException {
    logger.info("Generating flat assertions for {}", clazz);
    ClassDescription classDescription = converter.convertToClassDescription(clazz);
    assertionGenerator.generateCustomAssertionFor(classDescription);
    String expectedAssertFile = clazz.getSimpleName() + "Assert.flat.expected.txt";
    File expectedFile = generationHandler.getResourcesDir().resolve(expectedAssertFile).toAbsolutePath().toFile();
    File actualFile = generationHandler.fileGeneratedFor(clazz);
    // compile it!
    generationHandler.compileGeneratedFilesFor(clazz);

    assertThat(actualFile).hasSameTextualContentAs(expectedFile);
  }

  private void verifyFlatAssertionGenerationFor(Class<?> clazz, String generatedAssertionPackage) throws IOException {
    String expectedAssertFile = clazz.getSimpleName() + "Assert.generated.in.custom.package.flat.expected.txt";
    logger.info("Generating flat assertions for {} in package {}", clazz, generatedAssertionPackage);
    ClassDescription classDescription = converter.convertToClassDescription(clazz);
    assertionGenerator.generateCustomAssertionFor(classDescription);
    File expectedFile = generationHandler.getResourcesDir().resolve(expectedAssertFile).toAbsolutePath().toFile();
    File actualFile = generationHandler.fileGeneratedFor(clazz, generatedAssertionPackage);
    // compile it!

    assertThat(actualFile).hasSameTextualContentAs(expectedFile);
    generationHandler.compileGeneratedFilesFor(generatedAssertionPackage, clazz);
  }







  private void verifyHierarchicalAssertionGenerationFor(Class<?> clazz) throws IOException {
    verifyHierarchicalAssertionGenerationFor(clazz, EMPTY_HIERARCHY);
  }

  private void verifyHierarchicalAssertionGenerationFor(Class<?> aClass, Set<TypeToken<?>> typeHierarchy) throws IOException {

    List<File> generatedAssertFiles = newArrayList();
    Set<Class<?>> classes = toClasses(aClass, typeHierarchy);
    logger.info("Generating hierarchical assertions for {}", classes);

    for (Class<?> clazz : classes) {
      ClassDescription classDescription = converter.convertToClassDescription(clazz);
      generatedAssertFiles.addAll(asList(assertionGenerator.generateHierarchicalCustomAssertionFor(classDescription, typeHierarchy)));

      String expectedConcreteAssertFile = clazz.getSimpleName() + "Assert.expected.txt";
      File expectedFile1 = generationHandler.getResourcesDir().resolve(expectedConcreteAssertFile).toAbsolutePath().toFile();
      File actualFile = generationHandler.fileGeneratedFor(clazz);

      assertThat(actualFile).hasSameTextualContentAs(expectedFile1);

      String expectedAbstractAssertFile = "Abstract" + clazz.getSimpleName() + "Assert.expected.txt";
      File expectedFile = generationHandler.getResourcesDir().resolve(expectedAbstractAssertFile).toAbsolutePath().toFile();
      assertThat(generationHandler.abstractFileGeneratedFor(clazz)).hasSameTextualContentAs(expectedFile);
    }
    generationHandler.compileGeneratedFiles(generatedAssertFiles);
  }

  private void verifyHierarchicalAssertionGenerationFor(Class<?> aClass,
                                                        Set<TypeToken<?>> typeHierarchy,
                                                        String generatedAssertionPackage) throws IOException {

    List<File> generatedAssertFiles = newArrayList();
    for (Class<?> clazz : toClasses(aClass, typeHierarchy)) {
      logger.info("Generating hierarchical assertion for {}", clazz);
      ClassDescription classDescription = converter.convertToClassDescription(clazz);
      generatedAssertFiles.addAll(asList(assertionGenerator.generateHierarchicalCustomAssertionFor(classDescription, typeHierarchy)));

      String expectedConcreteAssertFile = clazz.getSimpleName() + "Assert.generated.in.custom.package.expected.txt";
      File expectedFile1 = generationHandler.getResourcesDir().resolve(expectedConcreteAssertFile).toAbsolutePath().toFile();
      File actualFile = generationHandler.fileGeneratedFor(clazz, generatedAssertionPackage);
      assertThat(actualFile).hasSameTextualContentAs(expectedFile1);

      String expectedAbstractAssertFile = "Abstract" + clazz.getSimpleName() + "Assert.generated.in.custom.package.expected.txt";
      File expectedFile = generationHandler.getResourcesDir().resolve(expectedAbstractAssertFile).toAbsolutePath().toFile();
      assertThat(generationHandler.abstractFileGeneratedFor(clazz, generatedAssertionPackage)).hasSameTextualContentAs(expectedFile);

    }
    generationHandler.compileGeneratedFiles(generatedAssertFiles);
  }

  private void verifyHierarchicalAssertionGenerationFor(Class<?> aClass, String generatedAssertionPackage) throws IOException {

    List<File> generatedAssertFiles = newArrayList();
    Set<Class<?>> classes = toClasses(aClass, EMPTY_HIERARCHY);
    logger.info("Generating hierarchical assertions for {} in package {}", aClass, generatedAssertionPackage);

    for (Class<?> clazz : classes) {
      ClassDescription classDescription = converter.convertToClassDescription(clazz);
      generatedAssertFiles.addAll(asList(assertionGenerator.generateHierarchicalCustomAssertionFor(classDescription, EMPTY_HIERARCHY)));

      String expectedConcreteAssertFile = clazz.getSimpleName() + "Assert.generated.in.custom.package.expected.txt";
      File expectedFile1 = generationHandler.getResourcesDir().resolve(expectedConcreteAssertFile).toAbsolutePath().toFile();
      File actualFile = generationHandler.fileGeneratedFor(clazz, generatedAssertionPackage);

      assertThat(actualFile).hasSameTextualContentAs(expectedFile1);

      String expectedAbstractAssertFile = "Abstract" + clazz.getSimpleName() + "Assert.generated.in.custom.package.expected.txt";
      File expectedFile = generationHandler.getResourcesDir().resolve(expectedAbstractAssertFile).toAbsolutePath().toFile();
      assertThat(generationHandler.abstractFileGeneratedFor(clazz, generatedAssertionPackage)).hasSameTextualContentAs(expectedFile);
    }
    generationHandler.compileGeneratedFiles(generatedAssertFiles);
  }

  private static Set<Class<?>> toClasses(Class<?> clazz, Set<TypeToken<?>> typeHierarchy) {
    Set<Class<?>> classes = new HashSet<>();
    for (TypeToken<?> type : typeHierarchy) {
      classes.add(type.getRawType());
    }
    classes.add(clazz);
    return classes;
  }

  private static String generateThrowsClause(Class<?> exception, String property, boolean booleanType) {
    String getter = (booleanType ? "is" : "get") + Character.toUpperCase(property.charAt(0)) + property.substring(1);
    return "   * @throws " + exception.getName() + " if actual." + getter + "() throws one." + LINE_SEPARATOR;
  }

  private static Set<TypeToken<?>> setOfTypeTokens(Class<?>... classes) {
    Set<TypeToken<?>> types = new HashSet<>();
    for (Class<?> clazz : classes) {
      types.add(TypeToken.of(clazz));
    }
    return types;
  }

}
