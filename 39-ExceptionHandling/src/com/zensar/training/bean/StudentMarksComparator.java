package com.zensar.training.bean;

import java.util.Comparator;

public class StudentMarksComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.marks<o2.marks)
			return -1;
		if(o1.marks>o2.marks)
			return 1;
		return 0;
	}

}
