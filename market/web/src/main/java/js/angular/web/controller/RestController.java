package js.angular.web.controller;

import js.angular.server.service.PlayerService;
import js.angular.server.dao.entity.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by ilmir on 27.06.16.
 */
@Controller
@RequestMapping(value = "/rest")
@ResponseBody
public class RestController {

	@Autowired
	private PlayerService playerService;

	@RequestMapping(value = "/players", method = RequestMethod.GET)
	public List<Player> getPlayers() {
		return playerService.getAll();
	}

	@RequestMapping(value = "/customers", method = RequestMethod.GET)
	@ResponseBody
	public String jsonString(){
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
				"      \"Name\": \"Comércio Mineiro\",\n" +
				"      \"City\": \"São Paulo\",\n" +
				"      \"Country\": \"Brazil\"\n" +
				"    }\n" +
				"  ]\n" +
				"}";
	}
}
