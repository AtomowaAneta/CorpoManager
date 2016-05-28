package pl.corpomanager.databasehandler;

import main.java.pl.corpomanager.employeemanager.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Created by stycz on 28.05.16.
 */
public class SaverRemover {

    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    private Session session;

    public boolean saveEmployeeinDatabase(Employee employee){

        session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(employee);
        session.getTransaction().commit();
        session.close();

        return true;
    }

    public boolean deleteEmployeeFromDatabase(Employee employee){
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(employee);
        session.getTransaction().commit();
        session.close();

        return true;
    }




}
