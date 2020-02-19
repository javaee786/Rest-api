package springbootstarter.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	String name = "My Name is: Raghu";

	@RequestMapping("/name")
	public String getName() {
		return name;
	}

}// class
