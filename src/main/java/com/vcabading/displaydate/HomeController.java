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
		String date = DateTime.getDayOfWeek() + ", the " + DateTime.getDayOfMonth();
		date += " of " + DateTime.getMonth() + ", " + DateTime.getYear();
		model.addAttribute("date", date);
		return "date.jsp";
	}
	
	//	---- TIME ----------------------------------------------
	@GetMapping("/time")
	public String time(Model model) {
		String time = DateTime.getTime();
		model.addAttribute("time", time);
		return "time.jsp";
	}
}