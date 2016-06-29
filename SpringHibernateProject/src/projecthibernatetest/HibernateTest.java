package projecthibernatetest;

import org.hibernate.Session;

import com.evaluation.persistence.HibernateUtil;


/**
 * Hello world!
 *
 */
public class HibernateTest 
{
    public static void main( String[] args )
    {
    	Session session = HibernateUtil.getSessionFactory().openSession();
		
    	session.close();
    	HibernateUtil.getSessionFactory().close();
    }
}