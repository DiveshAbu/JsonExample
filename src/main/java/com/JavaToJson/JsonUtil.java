package com.JavaToJson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {
	
	public static void main(String[] args) {
		
		ObjectMapper mapper= new ObjectMapper();
		Employee exam= JsonExample();
		
		try {
			String jsonString=mapper.writeValueAsString(exam);
			System.out.println(jsonString);
		} 
		catch (JsonProcessingException e) {
			
			e.printStackTrace();
		}
	}

	private static Employee JsonExample() {
		Employee exam =new Employee();
		exam.setid(001);
		exam.setname("Divesh");
		exam.setprice(10.00f);
		return exam;
	}

}
