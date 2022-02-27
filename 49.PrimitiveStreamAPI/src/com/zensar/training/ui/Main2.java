package com.zensar.training.ui;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.function.Predicate;
import java.util.stream.DoubleStream;

public class Main2 {

	public static void main(String[] args) {
		DoubleStream ds1=DoubleStream.of(16.0,22.5,7.8);
		//sum,min,max,average,count
		System.out.println("Sum : "+ds1.sum());
		
		DoubleStream ds2=DoubleStream.of(16.0,22.5,7.8);
		OptionalDouble max=ds2.max();
		if(max.isPresent())
			System.out.println(max.getAsDouble());
		else
			System.out.println("souurce is empty");
		
		DoubleStream ds3=DoubleStream.of(16.0,22.5,7.8);
		OptionalDouble min=ds3.min();
		if(min.isPresent())
			System.out.println(min.getAsDouble());
		else
			System.out.println("souurce is empty");
		
		DoubleStream ds4=DoubleStream.of(16.0,22.5,7.8);
		OptionalDouble average=ds4.average();
		if(average.isPresent())
			System.out.println(average.getAsDouble());
		else
			System.out.println("souurce is empty");
		
		DoubleStream ds5=DoubleStream.of(16.0,22.5,7.8);
		long d=ds5.count();
		System.out.println(d);
		//print all elements
		DoubleStream ds6=DoubleStream.of(16.0,22.5,7.8);
		System.out.println("values are : ");
		ds6.forEach((d1)->System.out.println(d1));
		//print all elements above 15
		DoubleStream ds7=DoubleStream.of(16.0,22.5,7.8);
		System.out.println("greater than 15");
		ds7.filter((d2)->d2>15).forEach((d2)->System.out.println(d2));

	}

}
