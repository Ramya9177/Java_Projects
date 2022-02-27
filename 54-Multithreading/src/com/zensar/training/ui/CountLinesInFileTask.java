package com.zensar.training.ui;

import java.io.FileNotFoundException;


import java.io.IOException;
import java.io.RandomAccessFile;

public class CountLinesInFileTask implements Runnable {

	@Override
	public void run()  {
		
		try {
			RandomAccessFile accessFile=new RandomAccessFile("Intro.txt", "r");
			int count=0;
			
			while(true) {
				String str=accessFile.readLine();
			if(str==null) 
				break;
			count++;
			System.out.println(str);
			}
			System.out.println(Thread.currentThread().getName()+" : "+count);
			accessFile.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
