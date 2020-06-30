package com.home.threads;


// Thread can be created extending Thread class
public class printNumbers extends Thread {

	
	public void run() {
		System.out.print("Starting print");
		for(int i=0;i<500;i++) {
			System.out.print(i+" ");
		}
	}
}
