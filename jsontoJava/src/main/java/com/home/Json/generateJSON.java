package com.home.Json;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.home.entity.Student;
import com.home.entity.Subject;

public class generateJSON {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {

		ObjectMapper obj = new ObjectMapper();
		Student Student1 = new Student();
		Student1.setName("Mohan");
		Student1.setRollno("1234");
		List<Subject> subjects= new ArrayList<Subject>();
				subjects.add(new Subject("Maths",100));
				subjects.add(new Subject("Englist",200));

		Student1.setSubjects(subjects);
		
		obj.writeValue(new File("JsonFile.json"), Student1);
		
		
	}

}
