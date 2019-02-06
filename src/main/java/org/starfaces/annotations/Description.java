/*
 * Copyright (c) Jasper de Vries.
 */
package org.starfaces.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation used to generate {@code taglib.xml} and documentation. Use on {@code @FacesComponent} classes.
 * 
 * @author Jasper de Vries &lt;jepsar@gmail.com&gt;
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Description {

  /**
   * Returns documentation for component.
   *
   * @return Documentation for component.
   */
  String value();

}
