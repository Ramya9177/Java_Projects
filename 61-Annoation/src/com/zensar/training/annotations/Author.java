package com.zensar.training.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)

public @interface Author {
	String name() default("Ramya");
}
