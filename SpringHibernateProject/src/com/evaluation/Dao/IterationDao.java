package com.evaluation.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.stereotype.Component;

import com.evaluation.persistence.HibernateUtil;

public class IterationDao {

	//method for fetching  all iterations
	public List iterationList(){
		
		Session session = HibernateUtil.getSessionFactory().openSession();	 
		List i=session.createQuery("FROM IterationInfo").list();
        session.close();
        return i;
	}
	
	
	//method for fetching iterations relatd to releaseID
	
	public List releaseIterations(int release_id){
		Session session = HibernateUtil.getSessionFactory().openSession();
		String sql="select * from iteration_info where iteration_for_release="+release_id;
		SQLQuery q= session.createSQLQuery(sql);
		q.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
		List iterations=q.list();
		session.close();
	     return iterations;
	}
}
