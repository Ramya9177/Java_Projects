package com.zensar.training.ui;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Main1 {

	public static void main(String[] args) {
	     Date today=new Date();
	     System.out.println(today);
	     
	    // Date otherday=new Date(2017,12,14);
	    // System.out.println(otherday);
	     
	     SimpleDateFormat sdf=new SimpleDateFormat("dd MMMM yyy",Locale.GERMANY);
	     String str=sdf.format(today);
	     System.out.println(str);

	}

}
