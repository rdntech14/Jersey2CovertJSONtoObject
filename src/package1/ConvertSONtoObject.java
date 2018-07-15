package package1;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertSONtoObject {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		
		//JSON from file to Object
		POJOObject objfromJSONFile = mapper.readValue(new File("resp.json"), POJOObject.class);
		
		System.out.println(objfromJSONFile);
		System.out.println(objfromJSONFile.getName());
		
		//JSON from String to Object
		String jsonInString = "{\"name\" : \"mike\", \"id\" : 11, \"roles\" : [ \"dev\", \"tester\" ]}";
		POJOObject objfromJSONInString = mapper.readValue(jsonInString, POJOObject.class);
		
		System.out.println(objfromJSONInString);
		System.out.println(objfromJSONInString.getId());
		
		//JSON from URL to Object. URL Return JSON array
		POJOforURLResponse[] objfromURLReturnJSON = mapper.readValue(new URL("http://localhost:8080/student/list"), POJOforURLResponse[].class);
		System.out.println(objfromURLReturnJSON[1]);
	}

}
