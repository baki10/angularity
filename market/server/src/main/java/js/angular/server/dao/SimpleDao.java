package js.angular.server.dao;

import js.angular.server.dao.entity.Identified;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository("simpleDao")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public final class SimpleDao<Entity extends Identified> extends BaseDao<Entity> {
	public SimpleDao() {
		super(null);
	}

}
