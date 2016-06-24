package js.angular.server.service;

import js.angular.common.HelloWorldService;
import js.angular.server.dao.PlayerDao;
import js.angular.server.dao.SimpleDao;
import js.angular.server.dao.entity.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by ilmir on 02.06.16.
 */
@Service("helloWorldService")
@Transactional
public class HelloWorldServiceImpl implements HelloWorldService {

	@Autowired
	private PlayerDao playerDao;
	@Autowired
	private SimpleDao simpleDao;

	private static final String message = "Hello, %s!!!!!";

	@Override
	public String getMessage(String name) {
		if (playerDao != null) {
			List<Player> all = playerDao.getAll();
			if (all != null && !all.isEmpty()) {
				String firstName = all.get(0).getFirstName();
				String lastName = all.get(0).getLastName();
				return String.format(message, (firstName + " " + lastName));
			}
		}
		return String.format(message, name);
	}
}
