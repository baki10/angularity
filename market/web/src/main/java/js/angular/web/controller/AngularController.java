package js.angular.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/angularPage")
public class AngularController {

	@RequestMapping(method = RequestMethod.GET)
	public String main() {
		return "angularMainPage";
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

	@RequestMapping(value = "/angular4", method = RequestMethod.GET)
	public String sort() {
		return "angularSort";
	}

	@RequestMapping(value = "/angular5", method = RequestMethod.GET)
	public String time() {
		return "angularTime";
	}

	@RequestMapping(value = "/angular6", method = RequestMethod.GET)
	public String http() {
		return "angularHttp";
	}

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public @ResponseBody String welcome() {
		return "{\"message\":\"This Welcome Text is from spring controller\"}";
	}

	@RequestMapping(value = "/customers", method = RequestMethod.GET)
	@ResponseBody
	public String customers(){
		return "{\n" +
				"  \"records\": [\n" +
				"    {\n" +
				"      \"Name\": \"Alfreds Futterkiste\",\n" +
				"      \"City\": \"Berlin\",\n" +
				"      \"Country\": \"Germany\"\n" +
				"    },\n" +
				"    {\n" +
				"      \"Name\": \"Ana Trujillo Emparedados y helados\",\n" +
				"      \"City\": \"México D.F.\",\n" +
				"      \"Country\": \"Mexico\"\n" +
				"    },\n" +
				"    {\n" +
				"      \"Name\": \"Antonio Moreno Taquería\",\n" +
				"      \"City\": \"México D.F.\",\n" +
				"      \"Country\": \"Mexico\"\n" +
				"    },\n" +
				"    {\n" +
				"      \"Name\": \"Around the Horn\",\n" +
				"      \"City\": \"London\",\n" +
				"      \"Country\": \"UK\"\n" +
				"    },\n" +
				"    {\n" +
				"      \"Name\": \"B's Beverages\",\n" +
				"      \"City\": \"London\",\n" +
				"      \"Country\": \"UK\"\n" +
				"    },\n" +
				"    {\n" +
				"      \"Name\": \"Berglunds snabbköp\",\n" +
				"      \"City\": \"Luleå\",\n" +
				"      \"Country\": \"Sweden\"\n" +
				"    },\n" +
				"    {\n" +
				"      \"Name\": \"Blauer See Delikatessen\",\n" +
				"      \"City\": \"Mannheim\",\n" +
				"      \"Country\": \"Germany\"\n" +
				"    },\n" +
				"    {\n" +
				"      \"Name\": \"Blondel père et fils\",\n" +
				"      \"City\": \"Strasbourg\",\n" +
				"      \"Country\": \"France\"\n" +
				"    },\n" +
				"    {\n" +
				"      \"Name\": \"Bólido Comidas preparadas\",\n" +
				"      \"City\": \"Madrid\",\n" +
				"      \"Country\": \"Spain\"\n" +
				"    },\n" +
				"    {\n" +
				"      \"Name\": \"Bon app'\",\n" +
				"      \"City\": \"Marseille\",\n" +
				"      \"Country\": \"France\"\n" +
				"    },\n" +
				"    {\n" +
				"      \"Name\": \"Bottom-Dollar Marketse\",\n" +
				"      \"City\": \"Tsawassen\",\n" +
				"      \"Country\": \"Canada\"\n" +
				"    },\n" +
				"    {\n" +
				"      \"Name\": \"Cactus Comidas para llevar\",\n" +
				"      \"City\": \"Buenos Aires\",\n" +
				"      \"Country\": \"Argentina\"\n" +
				"    },\n" +
				"    {\n" +
				"      \"Name\": \"Centro comercial Moctezuma\",\n" +
				"      \"City\": \"México D.F.\",\n" +
				"      \"Country\": \"Mexico\"\n" +
				"    },\n" +
				"    {\n" +
				"      \"Name\": \"Chop-suey Chinese\",\n" +
				"      \"City\": \"Bern\",\n" +
				"      \"Country\": \"Switzerland\"\n" +
				"    },\n" +
				"    {\n" +
				"      \"Name\": \"Comércio Mineiro\",\n" +
				"      \"City\": \"São Paulo\",\n" +
				"      \"Country\": \"Brazil\"\n" +
				"    }\n" +
				"  ]\n" +
				"}";
	}

}