package com.zensar.training.ui;

import java.util.ArrayList;
import java.util.List;

import com.zensar.training.bean.EducationaLoan;
import com.zensar.training.bean.CarLoan;
import com.zensar.training.bean.CollegeEducationLoan;
import com.zensar.training.bean.Loan;

public class Main1 {
	
	static void print1(List<? extends Loan> list) {//upper bound wild card character
		System.out.println(list);
	}
	static void print2(List<? super EducationaLoan> list) {//lower bound wcc
		System.out.println(list);
		
	}
	static void print3(List<?> list) {//unbound wcc
		System.out.println(list);
	}

	public static void main(String[] args) {
		List<Loan> loanList1=new ArrayList<>();
		print1(loanList1);
		print2(loanList1);
		print3(loanList1);
		
		List<CarLoan> loanList2=new ArrayList<>();
		print1(loanList2);
		print3(loanList2);
		
		List<EducationaLoan> loanList3=new ArrayList<>();
		print1(loanList3);
		print2(loanList3);
		print3(loanList3);
		
		List<CollegeEducationLoan> loanList4=new ArrayList<>();
		print1(loanList4);
		//print2(loanList4);//error not a super class to educational
		print3(loanList4);
		
		List<Integer> loanList5=new ArrayList<>();
		print3(loanList5);
		//print2(loanList5);
		//print1(loanList5);
		
		List<Object> list6=new ArrayList<>();
		print2(list6);
		//print1(list6);
		print3(list6);
		
	}

}
