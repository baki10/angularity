package js.angular.server.dao;

import js.angular.server.dao.entity.Player;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

/**
 * Created by ilmir on 02.06.16.
 */
@Repository("playerDao")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PlayerDao extends BaseDao<Player> {
	public PlayerDao() {
		super(Player.class);
	}
}
