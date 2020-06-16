package com.home.DesignPatterns;

public class runner {
	
	public static void main1(String[] args) {
		SingleObject s1 = SingleObject.getInstance();
		SingleObject s2 = SingleObject.getInstance();
		
		System.out.println(s1==s2);
		s1.singleInstance = 10;
		System.out.println(s2.singleInstance);

		//================================================
		
		SingleObjectEager s11 = SingleObjectEager.getInstance();
		SingleObjectEager s12 = SingleObjectEager.getInstance();
		System.out.println(s11==s12);

		
	}
	
	public static void main(String[] args) {
		
		Computer computer = new ComputerBuilder().setCompany("HCL").setOS("Windows").setProcessor("Intel").build();
		System.out.println(computer.toString());;
		
		Computer computer1 = new ComputerBuilder().setCompany("DELL").setOS("UNIX").setProcessor("Intel").setHardDisk("1TB")
				 .build();
		System.out.println(computer1.toString());;


		
	}

}
