package com.forest.dandan.annos;

import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.persistence.Entity;
import javax.persistence.Table;

@Documented
@Target(TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Entity
@Table
public @interface EntityAndTab {

}
