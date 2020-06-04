package com.home.serializeDeserialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class serializeDeserialize {
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		/*
		 * Student stu = new Student("Madan",1234);
		 *  SerializeObject(stu);
		 */

		Student st = (Student)DeserializeObject("SerializedObject.txt");
		System.out.println(st);
		
	}
	
	
	
	public static void SerializeObject(Object obj) throws IOException {
        FileOutputStream fos = new FileOutputStream("SerializedObject.txt");		
		ObjectOutputStream os = new ObjectOutputStream(fos);
		os.writeObject(obj);		
		os.close();
		fos.close();
	}

	
	public static Object DeserializeObject(String filename) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(filename);
		ObjectInputStream os = new ObjectInputStream(fis);
		Object obj = os.readObject();
		return obj;
			
	}
	
	
	
	
}
