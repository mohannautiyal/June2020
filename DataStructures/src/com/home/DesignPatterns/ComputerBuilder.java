package com.home.DesignPatterns;

// Builder Design pattern
public class ComputerBuilder {

	public String OS;
	public String RAM;
	public String HardDisk;
	public String Processor;
	public String company;

	public ComputerBuilder setOS(String oS) {
		this.OS = oS;
		return this;
	}

	public ComputerBuilder setRAM(String rAM) {
		
		RAM = rAM;
		return this;

	}

	public ComputerBuilder setHardDisk(String hardDisk) {
		
		HardDisk = hardDisk;
		return this;
	}

	public ComputerBuilder setProcessor(String processor) {
		Processor = processor;
		return this;
	}

	public ComputerBuilder setCompany(String company) {
		this.company = company;
		return this;
	}
	
	public Computer build() {
		if (HardDisk==null)
			HardDisk ="500GB";
		if(RAM==null)
			RAM="2GB";
		return new Computer( OS,  RAM,  HardDisk,  Processor,  company);
	}

}
