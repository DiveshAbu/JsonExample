package ReadJsonfile;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Util {
	
	public static void main(String[] args) {
		
		ObjectMapper obj =new ObjectMapper();
		
		try {
			Address cus=obj.readValue(new File("Customer.json"),Address.class);
			Customer customer=obj.readValue(new File("Customer.json"),Customer.class);
			
			System.out.println(cus);
			System.out.println(customer);
			
		} 
		
		catch (JsonParseException e) {
			
			e.printStackTrace();
		} catch (JsonMappingException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
