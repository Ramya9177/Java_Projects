package com.zensar.training.ui;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.zensar.training.bean.CollectionFactory;
import com.zensar.training.bean.Student;
import com.zensar.training.bean.comparator.StudentDepartmentComparator;
import com.zensar.training.bean.comparator.StudentMarkComparator;

public class Main1 {
	public static void main(String[] args) {
		
		IntStream stream=IntStream.rangeClosed(1, 10);
		
		
		//stream=Arrays.stream(arr);
		stream.forEach((i)->System.out.println(i));
		
		
		/*OptionalInt optionalInt=stream.max();
		if(optionalInt.isPresent())
			System.out.println(optionalInt.getAsInt());
		else
			System.out.println("souurce is empty");*/
		/*OptionalInt optionalInt=stream.min();
		if(optionalInt.isPresent())
			System.out.println(optionalInt.getAsInt());
		else
			System.out.println("souurce is empty");*/
		//long count=stream.count();
		//System.out.println(count);
		/*OptionalDouble optionalDouble=stream.average();
		if(optionalDouble.isPresent())
			System.out.println(optionalDouble.getAsDouble());
		else
			System.out.println("souurce is empty");*/
		
		//stream.distinct().forEach((i)->System.out.println(i));
		//stream.filter((i)->i%2==0).distinct().forEach((i)->System.out.println(i));
		//int total=stream.filter((i)->i%2==0).distinct().sum();
		//System.out.println(total);
		
		//boolean result=stream.noneMatch((i)->i%2!=0);
		//System.out.println(result);
		
		//System.out.println(stream.reduce((i,j)->i+j));
		//OptionalInt integer1=stream.reduce((i,j)->i+j);
		//System.out.println(integer1.getAsInt());
		//List<Integer> list=stream.boxed().collect(Collectors.toList());
		//System.out.println(list);
	}
}
