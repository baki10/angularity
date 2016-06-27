package js.angular.server.service.impl;

import js.angular.server.dao.PlayerDao;
import js.angular.server.dao.entity.Player;
import js.angular.server.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by ilmir on 27.06.16.
 */
@Service
@Transactional
public class PlayerServiceImpl implements PlayerService {

	@Autowired
	private PlayerDao playerDao;

	@Override
	public List<Player> getAll() {
		return playerDao.getAll();
	}
}
