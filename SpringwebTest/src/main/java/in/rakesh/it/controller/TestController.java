package in.rakesh.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@GetMapping("/reg")
	public String stdreg()
	{
		
		System.out.println("Displaying");
		return "register";
	}
}
