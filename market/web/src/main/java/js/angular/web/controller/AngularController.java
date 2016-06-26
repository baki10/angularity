package js.angular.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/angularPage")
public class AngularController {

	@RequestMapping(method = RequestMethod.GET)
	public String main() {
		return "angularPage";
	}

	@RequestMapping(value = "/angular1", method = RequestMethod.GET)
	public String basics() {
		return "angularBasic";
	}

	@RequestMapping(value = "/angular2", method = RequestMethod.GET)
	public String toDo() {
		return "angularToDo";
	}

	@RequestMapping(value = "/angular3", method = RequestMethod.GET)
	public String search() {
		return "angularSearch";
	}

}