package com.evaluation.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

import com.evaluation.persistence.HibernateUtil;

public class ItemsDao {

	//method for fetching  all iterations
		public List itemList(){
			
			Session session = HibernateUtil.getSessionFactory().openSession();	 
			List i=session.createQuery("FROM ItemsInfo").list();
	        session.close();
	        return i;
		}
		
		
		//method for fetching iterations relatd to releaseID
		
		public List iterationItemList(int iteration_id){
			Session session = HibernateUtil.getSessionFactory().openSession();
			String sql="select * from item_info where item_for_iteration="+iteration_id;
			SQLQuery q= session.createSQLQuery(sql);
			q.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
			List iterations=q.list();
			session.close();
		     return iterations;
		}
}
