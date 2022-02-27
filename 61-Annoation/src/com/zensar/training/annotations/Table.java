package com.zensar.training.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)//policy used to use this in at any level soucre/classandruntime
public @interface Table {
	//elements of annotation
	String tableName();
	String dbName();
}
