package com.jz.xxl.dao;

import java.sql.Timestamp;
import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;

import static org.hibernate.criterion.Example.create;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jz.xxl.bean.Black;
import com.jz.xxl.util.BaseHibernateDAO;

/**
 	* A data access object (DAO) providing persistence and search support for Black entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.jz.xxl.bean.Black
  * @author MyEclipse Persistence Tools 
 */
public class BlackDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(BlackDAO.class);
		//property constants
	public static final String USERNAME = "username";
	public static final String REMOVED = "removed";



    
    public void save(Black transientInstance) {
        log.debug("saving Black instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Black persistentInstance) {
        log.debug("deleting Black instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Black findById( java.lang.Integer id) {
        log.debug("getting Black instance with id: " + id);
        try {
            Black instance = (Black) getSession()
                    .get("com.jz.xxl.bean.Black", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List<Black> findByExample(Black instance) {
        log.debug("finding Black instance by example");
        try {
            List<Black> results = (List<Black>) getSession()
                    .createCriteria("com.jz.xxl.bean.Black")
                    .add( create(instance) )
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    
    public List findByProperty(String propertyName, Object value) {
      log.debug("finding Black instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Black as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List<Black> findByUsername(Object username
	) {
		return findByProperty(USERNAME, username
		);
	}
	
	public List<Black> findByRemoved(Object removed
	) {
		return findByProperty(REMOVED, removed
		);
	}
	

	public List findAll() {
		log.debug("finding all Black instances");
		try {
			String queryString = "from Black";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Black merge(Black detachedInstance) {
        log.debug("merging Black instance");
        try {
            Black result = (Black) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Black instance) {
        log.debug("attaching dirty Black instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Black instance) {
        log.debug("attaching clean Black instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    public static void main(String[] args) {
		
	}
}