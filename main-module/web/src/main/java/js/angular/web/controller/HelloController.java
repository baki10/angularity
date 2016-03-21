package js.angular.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	private static final String message = "Hello, %s!";

	@RequestMapping({"/", "/hello*"})
	public ModelAndView helloWorld(@RequestParam(value = "name", defaultValue = "world") String name) {
		return new ModelAndView("hello", "message", String.format(message, name));
	}
}