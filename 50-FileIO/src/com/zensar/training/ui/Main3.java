package com.zensar.training.ui;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Main3 {

	public static void main(String[] args) throws IOException {
		RandomAccessFile accessFile;
		accessFile=new RandomAccessFile("intro.txt", "r");
		int count=0;
		while(true) {
			String str=accessFile.readLine();
			if(str==null)
				break;
			count++;
			System.out.println(str);
		}
		System.out.println(count);
		accessFile.close();
	}

}