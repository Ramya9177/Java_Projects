package com.zensar.training.ui;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main1 {
	public static void main(String[] args) throws IOException{
		InputStream is;
		is=new FileInputStream("intro.txt");
		
		while (true) {
		int i = is.read();
		if(i==-1)
			break;
		char ch=(char)i;
		System.out.print(ch);
		}
	is.close();
	}
}