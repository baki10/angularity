package js.angular.server.dao;

import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * Created by ilmir on 02.06.16.
 */
@Repository
public abstract class AbstractDao {
	protected Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void setSessionFactory(SessionFactory aSessionFactory) {
		sessionFactory = aSessionFactory;
	}

	public Serializable save(Object obj) {
		return getSession().save(obj);
	}

	public void saveOrUpdate(Object obj) {
		getSession().saveOrUpdate(obj);
	}

	public void update(Object obj) {
		getSession().update(obj);
	}


	public <E> List<E> getAll(Class<E> persistentClass) {
		return getSession().createCriteria(persistentClass).list();
	}

	public <E> E load(Class<E> entityClass, Serializable id) {
		return (E) getSession().load(entityClass, id);
	}

	public <E> E findById(String entityClass, Serializable id) {
		try {
			return (E) getSession().get(entityClass, id);
		} catch (ObjectNotFoundException e) {
			logger.debug(e.getMessage(), e);
			return null;
		}
	}

	public <E> E findById(Class<E> entityClass, Serializable id) {
		try {
			return (E) getSession().get(entityClass, id);
		} catch (ObjectNotFoundException e) {
			logger.debug(e.getMessage(), e);
			return null;
		}
	}

	public void clearSession() {
		getSession().clear();
	}


	public void flush() {
		getSession().flush();
	}

	public void flushAndClear() {
		getSession().flush();
		clearSession();
	}
}
