package Main;

import main.java.pl.corpomanager.employeemanager.Employee;
import pl.corpomanager.databasehandler.SaverRemover;

import java.text.ParseException;

/**
 * Created by stycz on 26.05.16.
 */
public class MainClass {
    public static void main(String[] args) throws ParseException {
        SaverRemover employeePersister = new SaverRemover();

        Employee employee1 = new Employee();
        employee1.setFirstName("jan");
        employeePersister.saveEmployeeinDatabase(employee1);

    }

}
