package com.home.threads;


// Thread can be created implementing Runnable interface
public class printAlphabets implements Runnable{

	public void run() {

		for(int i = 0;i<500;i++) {
			System.out.print("ABC  "+i);
		}
	}

}
