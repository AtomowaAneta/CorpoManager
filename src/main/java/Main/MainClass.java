package Main;

import main.java.pl.corpomanager.employeemanager.Employee;
import pl.corpomanager.databasehandler.EmployeePersist;

import java.text.ParseException;

/**
 * Created by stycz on 26.05.16.
 */
public class MainClass {
    public static void main(String[] args) throws ParseException {
        EmployeePersist employeePersister = new EmployeePersist();


        employeePersister.saveEmployeeinDatabase(new Employee());

    }

}
