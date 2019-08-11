package dummy.project.service.controller;

import java.io.IOException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dummy.project.service.model.Topic;

@RestController
public class DummyProjectController
{
	@RequestMapping(value="/oms/capture/request",method=RequestMethod.POST)
	public Topic getTopic(@RequestBody String data) throws JsonParseException, JsonMappingException, IOException
	{
		System.out.println("Hi");
		return new ObjectMapper().readValue(data, Topic.class);
	}
}