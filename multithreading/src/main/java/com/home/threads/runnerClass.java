package com.home.threads;

public class runnerClass {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Thread t1 = new printNumbers(); Thread t2 = new printNumbers();
		 * 
		 * t1.start(); t2.start();
		 */

		Runnable objRunnable = new printAlphabets();
		Runnable objRunnable1 = new printAlphabets();

		
		  Thread t1 = new Thread(objRunnable);
		  
		  Thread t2 = new Thread(objRunnable1);
		  t1.start(); 
		  t2.start();
		 


	}
}
