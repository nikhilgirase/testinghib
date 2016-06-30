package com.evaluation.Dao;

import java.util.List;
import java.util.logging.Logger;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.evaluation.persistence.HibernateUtil;
import com.evaluation.pojo.Employee;
import com.evaluation.pojo.ReleaseInfo;
import com.mysql.jdbc.Statement;

/**
 * Hello world! Use rest Controller here of spring
 */

public class ReleaseDao {
	public final Logger logger = Logger.getLogger(ReleaseDao.class.getName());
	//method for fetching release list
	public List getReleaseList() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		List r = session.createQuery("FROM ReleaseInfo").list();
		session.close();
		return r;
	}
	
	//method for fetching releases regarding project
	public List getRelease(int release_project){
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		String sql="select * from release_info where release_project="+release_project;
		SQLQuery q= session.createSQLQuery(sql);
		q.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
		session.close();
	     return q.list();
	}
	
	

}