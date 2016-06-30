package com.evaluation.Dao;

import java.util.List;
import java.util.logging.Logger;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Component;

import com.evaluation.persistence.HibernateUtil;
import com.evaluation.pojo.ProjectInfo;

@Component
public class ProjectInfoDao {

	public  final Logger logger = Logger.getLogger(ReleaseDao.class.getName());	
	
	//method for fetching all the list of project
	public List getProjectList(){
		   		Session session = HibernateUtil.getSessionFactory().openSession();
		   		List r=session.createQuery("FROM ProjectInfo").list();
		       session.close();
		   return r;
	   }
	//method for fetching the employee id
	public int getEmployeeID(String employee_name){
		Session session = HibernateUtil.getSessionFactory().openSession();
		String sql="select employeeId from Employee where employee_username=:employee_name";
		Query query = session.createQuery(sql);
		  query.setString("employee_name", employee_name);
		  Object id = query.uniqueResult();;
		 int e_id=Integer.parseInt(id.toString());
		 System.out.println(e_id);
		return e_id;
	}
	
	public List getEmpProjects(int employee_id){
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		//String sql= "SELECT * FROM project_info where employee_id=:employee_id";
		//String sql="select * from release_info where release_project="+release_project;
		String sql="from ProjectInfo where employee_id="+employee_id;
		Query query = session.createQuery(sql);
		//  query.setInteger("employee_id", employee_id);
		  List r=query.list();
       session.close();
       return r;
	}
	   
	   
}
