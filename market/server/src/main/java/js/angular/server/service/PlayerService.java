package js.angular.server.service;

import js.angular.server.dao.entity.Player;

import java.util.List;

/**
 * Created by ilmir on 27.06.16.
 */
public interface PlayerService {
	List<Player> getAll();
}
