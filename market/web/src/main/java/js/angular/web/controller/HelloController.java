package js.angular.web.controller;

import js.angular.common.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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

	@RequestMapping(value = "/lesson2", method = RequestMethod.GET)
	public String showLesson2() {
		return "lesson2";
	}

	@RequestMapping(value = "/lesson3", method = RequestMethod.GET)
	public String showLesson3() {
		return "lesson3";
	}

	@RequestMapping(value = "/lesson4", method = RequestMethod.GET)
	public String showLesson4() {
		return "lesson4";
	}

	@RequestMapping(value = "/lesson5", method = RequestMethod.GET)
	public String showLesson5() {
		return "lesson5";
	}
	@RequestMapping(value = "/lesson5", method = RequestMethod.POST)
	public @ResponseBody
	String responseLesson5() {
		return "Text from server";
	}
}