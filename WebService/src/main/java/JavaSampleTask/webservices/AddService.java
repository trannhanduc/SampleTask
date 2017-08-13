package JavaSampleTask.webservices;


import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddService {
	
	
	@RequestMapping(method=RequestMethod.GET,path ="/add")
	public static @ResponseBody String AddServiceFunc(@RequestParam(value="value") String input) {
		
		int output =0;
		List<String> inputList = Arrays.asList(input.split(","));
		for(int i =0; i < inputList.size(); i++)
		{
			try {
			output = output + Integer.parseInt(inputList.get(i));
			}
			catch (NumberFormatException e) {
				
				return "Input must be Integer";
			}
		}

		return Integer.toString(output);
	}
}