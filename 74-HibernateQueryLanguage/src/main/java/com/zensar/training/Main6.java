package com.zensar.training;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.query.Query;

import com.zensar.training.bean.Doctor;
import com.zensar.training.util.HibernateUtil;

public class Main6 {
	
	static void readNativeQuery1() {
		
		
		String str="select * from doctors";
		
		
		
	}
	
	static void readNativeQuery2() {
		
		
		String str="select name,fees,gender from doctors";
		
		
		
	}
	
	static void readNativeQuery3() {
		
		String str="select * from doctors";
		
		
		
	}


	public static void main(String[] args) {
		readNativeQuery3();

	}

}
