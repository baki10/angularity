package js.angular.web.controller;

import js.angular.server.dao.entity.Player;
import js.angular.server.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ilmir on 27.06.16.
 */
@RestController
@RequestMapping(value = "/rest")
public class MyRestController {

  @Autowired
  private PlayerService playerService;

  @ResponseStatus(HttpStatus.OK)
  @RequestMapping(value = "/player", method = RequestMethod.GET)
  public List<Player> getPlayers() {
    return playerService.getAll();
  }

  @RequestMapping(value = "/player/{id}", method = RequestMethod.GET)
  public Player getPlayer(@PathVariable("id") Long id) {
    return playerService.getPlayerById(id);
  }

  @RequestMapping(value= "/player", method = RequestMethod.POST)
  public Player addPlayer(@RequestBody Player player) {
    return playerService.addPlayer(player);
  }

  @RequestMapping(value="/player/{id}", method = RequestMethod.PUT )
  public Player updatePlayer(@RequestBody Player player, @PathVariable("id") Long id) {
    Player playerById = playerService.getPlayerById(id);
    if(player == null || playerById == null){
      return null;
    }
    playerById.setFirstName(player.getFirstName());
    playerById.setLastName(player.getLastName());
    playerService.updatePlayer(playerById);
    return playerById;
  }
  
  @RequestMapping(value="/player/{id}", method = RequestMethod.DELETE )
  public void deletePlayer(@PathVariable("id") Long id) {
    playerService.deletePlayer(id);
  }

  @RequestMapping(value = "/customers", method = RequestMethod.GET)
  public String jsonString() {
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
