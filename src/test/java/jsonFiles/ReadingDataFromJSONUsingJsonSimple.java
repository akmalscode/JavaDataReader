package jsonFiles;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadingDataFromJSONUsingJsonSimple {

	public static void main(String[] args) throws IOException, ParseException {

		JSONParser jsonParser = new JSONParser();

		FileReader fileReader1 = new FileReader("./data/employee.json");
		

		// Approach 1
		Object object = jsonParser.parse(fileReader1); // convert json file to java object
		JSONObject empJsonObj1 = (JSONObject) object; // convert java to JSON object

		String fName1 = (String) empJsonObj1.get("firstName");
		String lName1 = (String) empJsonObj1.get("lastName");
		System.out.println("First Name:" + fName1 + "Last Name:" + lName1);

		JSONArray addressArray1 = (JSONArray) empJsonObj1.get("address");

		for (int i = 0; i < addressArray1.size(); i++) {
			JSONObject address = (JSONObject) addressArray1.get(i);

			String street = (String) address.get("street");
			String city = (String) address.get("city");
			String state = (String) address.get("state");

			System.out.println(street + "/t" + city + "/t" + state);

		}
		System.out.println("*********************");
		
		// Approach 2
		
		FileReader fileReader2 = new FileReader("./data/employee.json");
		
		JSONObject empJsonObj2 = (JSONObject) jsonParser.parse(fileReader2);

		String fname2 = (String) empJsonObj2.get("firstName");
		String lname2 = (String) empJsonObj2.get("lastName");
		System.out.println("First Name:" + fname2 + " Last Name:" + lname2);

		JSONArray addressArray2 = (JSONArray) empJsonObj2.get("address");

		for (int i = 0; i < addressArray2.size(); i++) {
			JSONObject address = (JSONObject) addressArray2.get(i);
			
			String street = (String) address.get("street");
			String city = (String) address.get("city");
			String state = (String) address.get("state");
			
			System.out.println(street + "\t" + city + "\t" + state);
		}
	}

}
