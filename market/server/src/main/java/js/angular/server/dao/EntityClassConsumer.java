package js.angular.server.dao;

import js.angular.server.dao.entity.IdentifiedEntity;

/**
 * Created by ilmir on 02.06.16.
 */
public interface EntityClassConsumer {

	void setEntityClass(Class<? extends IdentifiedEntity> entityClass);

	Class<? extends IdentifiedEntity> getEntityClass();
}
