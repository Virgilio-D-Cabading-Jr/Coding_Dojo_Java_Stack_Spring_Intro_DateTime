package com.vcabading.displaydate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/////////////////////////////////////////////////////////////////
//HOME CONTROLLER
/////////////////////////////////////////////////////////////////

@Controller
public class HomeController {
	
	//	---- INDEX ----------------------------------------------
	@GetMapping("/")
	public String index(Model model) {
		return "index.jsp";
	}
	
//	---- DATE ----------------------------------------------
	@GetMapping("/date")
	public String date(Model model) {
		return "date.jsp";
	}
}