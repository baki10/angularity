package js.angular.server.dao;

import org.hibernate.Criteria;

import java.io.Serializable;
import java.util.List;

/**
 * Created by ilmir on 02.06.16.
 */
public interface Dao<E> {

	List<E> getAll();

	E load(Serializable id);

	E findById(Serializable id);

	void remove(Serializable id);

	Criteria createBaseCriteria();

	void flush();

	Class<E> getType();

	Serializable save(Object obj);

}
