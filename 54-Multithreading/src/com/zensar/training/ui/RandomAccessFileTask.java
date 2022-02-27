package com.zensar.training.ui;

import java.io.RandomAccessFile;

public class RandomAccessFileTask implements Runnable{
	
	@Override
	public void run() {

		try {
			RandomAccessFile accessFile = new RandomAccessFile("Intro.txt", "rw");

			int count = 0;
			while(accessFile.readLine() != null) {
				
				count++;
			}
			System.out.println(Thread.currentThread().getName() + " : No.of Lines: " + count);
			accessFile.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
