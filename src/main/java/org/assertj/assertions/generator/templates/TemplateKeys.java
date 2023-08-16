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
 * Copyright 2012-2021 the original author or authors.
 */
package org.assertj.assertions.generator.templates;

public class TemplateKeys{
  public static final String ABSTRACT_SUPER_ASSERTION_CLASS = "${super_assertion_class}";
  // S is used in custom_abstract_assertion_class_template.txt
  public static final String ABSTRACT_ASSERT_SELF_TYPE = "S";
  public static final String ALL_ASSERTIONS_ENTRY_POINTS = "${all_assertions_entry_points}";
  public static final String CLASS_TO_ASSERT = "${class_to_assert}";
  public static final String CUSTOM_ASSERTION_CLASS = "${custom_assertion_class}";
  public static final String ELEMENT_ASSERT_TYPE = "${elementAssertType}";
  public static final String ELEMENT_TYPE = "${elementType}";
  public static final String IMPORTS = "${imports}";
  public static final String IMPORT_LINE = "import %s;%s";
  public static final String LINE_SEPARATOR = "\n";
  public static final String MYSELF = "${myself}";
  public static final String NEGATIVE_PREDICATE_FOR_FOR_ERROR_MESSAGE_PART1 = "${negative_predicate_for_error_message_part1}";
  public static final String NEGATIVE_PREDICATE_FOR_FOR_ERROR_MESSAGE_PART2 = "${negative_predicate_for_error_message_part2}";
  public static final String NEGATIVE_PREDICATE_FOR_JAVADOC = "${negative_predicate_for_javadoc}";
  public static final String PACKAGE = "${package}";
  public static final String PREDICATE = "${predicate}";
  public static final String PREDICATE_FOR_FOR_ERROR_MESSAGE_PART1 = "${predicate_for_error_message_part1}";
  public static final String PREDICATE_FOR_FOR_ERROR_MESSAGE_PART2 = "${predicate_for_error_message_part2}";
  public static final String PREDICATE_FOR_JAVADOC = "${predicate_for_javadoc}";
  public static final String PREDICATE_NEG = "${neg_predicate}";
  public static final String PROPERTY_ASSERT_TYPE = "${propertyAssertType}";
  public static final String PROPERTY_GETTER_CALL = "${getter}";
  public static final String PROPERTY_SIMPLE_TYPE = "${propertySimpleType}";
  public static final String PROPERTY_TYPE = "${propertyType}";
  public static final String PROPERTY_WITH_LOWERCASE_FIRST_CHAR = "${property}";
  public static final String PROPERTY_WITH_SAFE = "${property_safe}";
  public static final String PROPERTY_WITH_UPPERCASE_FIRST_CHAR = "${Property}";
  public static final String SELF_TYPE = "${self_type}";
  public static final String THROWS = "${throws}";
  public static final String THROWS_JAVADOC = "${throws_javadoc}";

}