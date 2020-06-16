package com.home.DesignPatterns;

public class Computer {
	
	
	public String OS;
	public String RAM;
	public String HardDisk;
	public String Processor;
	public String company;
	
	public Computer(String oS, String rAM, String hardDisk, String processor, String company) {
		super();
		OS = oS;
		RAM = rAM;
		HardDisk = hardDisk;
		Processor = processor;
		this.company = company;
	}

	@Override
	public String toString() {
		return "Computer [OS=" + OS + ", RAM=" + RAM + ", HardDisk=" + HardDisk + ", Processor=" + Processor
				+ ", company=" + company + "]";
	}
	
	

}
