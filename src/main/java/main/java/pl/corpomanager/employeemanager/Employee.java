package main.java.pl.corpomanager.employeemanager;


import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Created by stycz on 26.05.16.
 * class describes states of any employee
 *
 * @see main.java.pl.corpomanager.employeemanager.EmployeeCreator
 */

@Entity
@Table(name = "ListOfEmployees")
public class Employee {


    private int Id;

    private String firstName;
    private String surname;
    private String birthDate;
    private String PESEL;



    private String password;
    private String mailAddress;
    private int telNumber;
    private Privilege privilage;
    private String post;
    private Availability availablility;

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", id=" + PESEL +
                ", mailAddress='" + mailAddress + '\'' +
                ", telNumber=" + telNumber +
                ", privilage=" + privilage +
                ", post='" + post + '\'' +
                ", availablility=" + availablility +
                '}';
    }

    public Employee(String firstName, String surname, String birthDate, String id, String mailAddress, int telNumber, Privilege privilage, String post) {
        this.firstName = firstName;
        this.surname = surname;
        this.birthDate = birthDate;
        this.PESEL = id;
        this.mailAddress = mailAddress;
        this.telNumber = telNumber;
        this.privilage = privilage;
        this.post = post;

    }


    public Employee() {

    }

    @Column(name = "PASSWORDS" ,nullable = false)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "USER_ID")
    public int getId() {
        return Id;
    }

    public void setId(String id) {
        this.PESEL = id;
    }

    @Column(name = "FIRST_NAME", nullable = false)
    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    @Column(name = "SECOND_NAME", nullable = false)
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    @Column(name = "BIRTH_DATE", nullable = false)
    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Column(name = "PESEL", unique = true, nullable = false)
    public String getPESEL() {
        return PESEL;
    }

    public void setPESEL(int PESEL) {
        Id = PESEL;
    }

    @Column(name = "USER_MAIL", unique = true, nullable = false)
    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }


    @Column(name = "PHONE_NUMBER", unique = true, nullable = false)
    public int getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(int telNumber) {
        this.telNumber = telNumber;
    }


    @Column(name = "PRIVILEGE", unique = true, nullable = false)
    public Privilege getPrivilage() {
        return privilage;
    }

    public void setPrivilage(Privilege privilage) {
        this.privilage = privilage;
    }

    @Id
    @Column(name = "POSITION", unique = true, nullable = false)
    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public Availability getAvailablility() {
        return availablility;
    }

    public void setAvailablility(Availability availablility) {
        this.availablility = availablility;
    }


}
