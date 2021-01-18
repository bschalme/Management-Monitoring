package ca.airspeed.demo.observability.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@GetMapping(value="/")
	public ModelAndView test(HttpServletResponse response) {
		return new ModelAndView("home");
	}
}
