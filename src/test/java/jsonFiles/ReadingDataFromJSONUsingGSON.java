package jsonFiles;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;

public class ReadingDataFromJSONUsingGSON {

	public static void main(String[] args) throws FileNotFoundException {
		FileReader reader = new FileReader("./data/employee.json");

		Gson gson = new Gson();
		Person person = gson.fromJson(reader, Person.class);

		// access data
		System.out.println("First Name:" + person.getFirstName());
		System.out.println("Last Name:" + person.getLastName());
		
		for(Address address:person.getAddress()) {
			System.out.println("Street:"+address.getStreet());
			System.out.println("City:"+address.getCity());
			System.out.println("State:"+address.getState());
		}

	}

}
