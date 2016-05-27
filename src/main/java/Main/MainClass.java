package Main;

import main.java.pl.corpomanager.employeemanager.Employee;
import main.java.pl.corpomanager.employeemanager.EmployeeCreator;

import java.text.ParseException;

/**
 * Created by stycz on 26.05.16.
 */
public class MainClass {
    public static void main(String[] args) throws ParseException {
        EmployeeCreator employeeHandler = new EmployeeCreator();
        Employee employee = employeeHandler.createNewEmployee();
        System.out.print(employeeHandler.showEmployee(employee));

    }

}
