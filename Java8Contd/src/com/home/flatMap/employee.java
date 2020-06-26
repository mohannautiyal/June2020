package com.home.flatMap;

import java.util.HashSet;
import java.util.Set;

public class employee {

	String empName;
	 Set <String> devices;
	
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Set<String> getDevices() {
		return devices;
	}
	public void setDevices(Set<String> devices) {
		this.devices = devices;
	}
	 
   
	public void addDevice(String devicename) {
		if (devices == null)
		       devices = new HashSet<String>();
		
		devices.add(devicename);
		
	}
	@Override
	public String toString() {
		return "employee [empName=" + empName + ", devices=" + devices + "]";
	}
	
	
	
	
}
