package main.java.pl.corpomanager.employeemanager;

import EmployeeApi.EmployeeInterface;
import org.hibernate.SessionFactory;


import java.util.Scanner;

/**
 * Created by stycz on 26.05.16.
 */
public class EmployeeCreator implements EmployeeInterface {

    private Scanner scanner = new Scanner(System.in);
    private Privilege privilege;
    private Employee employee = new Employee();


    public Employee createNewEmployee() {
        employee.setFirstName(insertName());
        employee.setSurname(insertSurname());
        employee.setPassword(insertPassword());
        employee.setBirthDate(insertDate());
        employee.setId(insertPESEL());
        employee.setPrivilage(establishPrivilege());
        employee.setMailAddress(insertMailAddress());
        employee.setTelNumber(insertTelNumber());
        employee.setPost(insertPost());
        return employee;
    }

    public String insertName() {
        System.out.println("Insert name: ");
        return scanner.nextLine();
    }

    public String insertSurname() {
        System.out.println("Insert surname: ");
        return scanner.nextLine();
    }

    public String insertDate() {
        System.out.println("Insert birthday(dd-MM-yyyy): ");
        return scanner.nextLine();
    }

    public String insertPESEL() {
        System.out.println("Insert PESEL: ");
        return scanner.nextLine();
    }

    public String insertMailAddress() {
        System.out.println("Insert mail address: ");
        return scanner.nextLine();
    }

    public int insertTelNumber() {
        System.out.println("Insert phone number: ");
        return scanner.nextInt();
    }

    public Privilege establishPrivilege() {
        System.out.println("Establish privilege: ");
        String choice = scanner.nextLine();
        if (choice.equals("JUNIOR")) {
            privilege = Privilege.JUNIOR;
        } else if (choice.equals("SENIOR")) {
            privilege = Privilege.SENIOR;
        } else if (choice.equals("ARCHITECT")) {
            privilege = Privilege.ARCHITECT;
        } else if (choice.equals("BOSS")) {
            privilege = Privilege.BOSS;
        } else if (choice.equals("REGULAR")) {
            privilege = Privilege.REGULAR;
        } else {
            System.out.println("Wrong type try again!");
            establishPrivilege();
        }

        return privilege;
    }

    public String insertPost() {
        System.out.println("Insert position: ");
        return scanner.nextLine();
    }

    public String insertPassword() {
        System.out.println("Insert password: ");
        return scanner.nextLine();
    }

    public String showEmployee(Employee employee) {
        return employee.toString();
    }

}
