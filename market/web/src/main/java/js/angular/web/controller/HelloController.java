package js.angular.web.controller;

import js.angular.common.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@Autowired
	private HelloWorldService helloWorldService;

	@RequestMapping({"/", "/hello*"})
	public ModelAndView helloWorld(@RequestParam(value = "name", defaultValue = "world") String name) {
		return new ModelAndView("hello", "message", helloWorldService.getMessage(name));
	}

	@RequestMapping({"/aquarium"})
	public ModelAndView aquarium() {
		return new ModelAndView("aquarium");
	}
}