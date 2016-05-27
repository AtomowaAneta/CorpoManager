package EmployeeApi;

import main.java.pl.corpomanager.employeemanager.Privilege;

/**
 * Created by stycz on 27.05.16.
 */
public interface EmployeeInterface {
    String insertName();
    String insertSurname();
    String insertDate();
    String insertPESEL();
    String insertMailAddress();
    int insertTelNumber();
    Privilege establishPrivilege();
    String insertPost();
}
