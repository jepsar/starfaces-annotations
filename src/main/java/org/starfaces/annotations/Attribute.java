/*
 * Copyright (c) Jasper de Vries.
 */
package org.starfaces.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation used to generate {@code taglib.xml} and documentation. Use on {@code PropertyKeys} enumeration elements in
 * {@code @FacesComponent} classes.
 *
 * @author Jasper de Vries &lt;jepsar@gmail.com&gt;
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Attribute {

  /**
   * Returns {@code true} if the attribute is required.
   *
   * @return {@code true} if the attribute is required.
   */
  boolean required();

  /**
   * Returns type of the attribute.
   *
   * @return type of the attribute.
   */
  Class<?> type();

  /**
   * Returns description of the attribute.
   *
   * @return Description of the attribute.
   */
  String value();

}
