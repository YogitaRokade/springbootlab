package edu.learning.link;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	
public class WebController {

	@GetMapping("/link")
	public String web() {
		return "<a href='https://www.anudip.org.com/'>"
				+ "<body bgcolor='black' text='white'><center><h1>Click ME !</h1></center></body></a>";
	}
		
}
