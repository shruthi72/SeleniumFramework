package json.data;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.databind.ObjectMapper;

public class DataReader {
	
	public void getJSONDataToMap() throws IOException
	{
		//readjson to string --> using java inbulid FileUtils
		String jsonContent = FileUtils.readFileToString(new File(System.getProperty("user.dir")+"\\src\\test\\java\\json\\data\\LoginDetails"));
		
		//String to Hashmap Jackson Databind
		ObjectMapper mapper= new ObjectMapper();
	}

}
