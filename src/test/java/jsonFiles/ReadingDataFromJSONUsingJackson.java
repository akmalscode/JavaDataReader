package jsonFiles;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;



public class ReadingDataFromJSONUsingJackson {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {

		ObjectMapper objectMapper = new ObjectMapper();
		
		File file2=new File("./data/employee.json");

		// Read JSON data from the file and map to Person class
		Person person = objectMapper.readValue(file2, Person.class);

		// Accessing Data
		System.out.println("FirstName:" + person.getFirstName());
		System.out.println("LastName:" + person.getLastName());

		for (Address address : person.getAddress()) {
			System.out.println("Street" + address.getStreet());
			System.out.println("City" + address.getCity());
			System.out.println("State" + address.getState());
		}

	}
}
 