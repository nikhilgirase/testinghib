package com.evaluation.Dao;

import java.util.List;
import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.evaluation.persistence.HibernateUtil;
import com.evaluation.pojo.ReleaseInfo;
import com.mysql.jdbc.Statement;


/**
 * Hello world!
 * Use rest Controller here of spring
 */

public class ReleaseDao 
{
	public  final Logger logger = Logger.getLogger(ReleaseDao.class.getName());	
   public ReleaseInfo  getList(){
	   		Session session = HibernateUtil.getSessionFactory().openSession();
	 
	   		ReleaseInfo r = (ReleaseInfo) session.get(ReleaseInfo.class, new Integer(2));
	   		
	   		System.out.println(r.toString());
	       session.close();
	       	HibernateUtil.getSessionFactory().close();
	   return r;
   }
    
    
}