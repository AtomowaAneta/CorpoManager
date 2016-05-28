package pl.corpomanager.databasehandler;

import main.java.pl.corpomanager.employeemanager.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Created by stycz on 28.05.16.
 */
public class EmployeePersist {

    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    private Session session;

    public boolean saveEmployeeinDatabase(Employee employeeCreator){

        session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(employeeCreator);
        session.getTransaction().commit();
        session.close();

        return true;
    }


}
