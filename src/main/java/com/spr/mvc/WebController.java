package com.spr.mvc;

import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {
	Logger log=Logger.getLogger("controllerLog");
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getMessage(Model model)
	{
		model.addAttribute("greeting","Hi Greeting of the day");
		model.addAttribute("tagline", "Welcome --------------");
		log.info("getMessage Method is called in controller class:\n >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		return "welcome";
	}
	@RequestMapping(value = "/details", method = RequestMethod.GET)
	public String getDetails(Model model)
	{
		model.addAttribute("greeting","Hi Greeting of the day");
		model.addAttribute("tagline", "Website containing the list of products, information on products and stocks, "
				+ "prices and a function for ordering");
		log.info("Website containing the list of products, information on products and stocks, "
				+ "prices and a function for ordering");
		return "welcome";
	}
	
}
