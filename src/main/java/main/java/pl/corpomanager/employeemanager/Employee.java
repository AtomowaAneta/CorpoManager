package main.java.pl.corpomanager.employeemanager;


import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Created by stycz on 26.05.16.
 * class describes states of any employee
 *
 *
 */

@Entity
@Table(name = "ListOfEmployees")
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "USER_ID", unique = true, nullable = false, precision = 5, scale = 0)
    private int id;

    @Column(name = "FIRST_NAME", nullable = false)
    private String firstName;

    @Column(name = "SECOND_NAME", nullable = false)
    private String surname;

    @Column(name = "BIRTH_DATE", nullable = false)
    private Date birthDate;

    @Column(name = "PESEL", unique = true, nullable = false)
    private String PESEL;

    @Column(name = "PASSWORDS" ,nullable = false)
    private String password;

    @Column(name = "USER_MAIL", unique = true, nullable = false)
    private String mailAddress;

    @Column(name = "PHONE_NUMBER", unique = true, nullable = false)
    private int telNumber;

    @Column(name = "PRIVILEGE", nullable = false)
    private Privilege privilage;

    @Column(name = "POSITION", nullable = false)
    private String post;

    private Availability availablility;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (getId() != employee.getId()) return false;
        if (getTelNumber() != employee.getTelNumber()) return false;
        if (!getFirstName().equals(employee.getFirstName())) return false;
        if (!getSurname().equals(employee.getSurname())) return false;
        if (!getBirthDate().equals(employee.getBirthDate())) return false;
        if (!getPESEL().equals(employee.getPESEL())) return false;
        if (!getPassword().equals(employee.getPassword())) return false;
        if (!getMailAddress().equals(employee.getMailAddress())) return false;
        if (getPrivilage() != employee.getPrivilage()) return false;
        return getPost().equals(employee.getPost());

    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + getFirstName().hashCode();
        result = 31 * result + getSurname().hashCode();
        result = 31 * result + getBirthDate().hashCode();
        result = 31 * result + getPESEL().hashCode();
        result = 31 * result + getPassword().hashCode();
        result = 31 * result + getMailAddress().hashCode();
        result = 31 * result + getTelNumber();
        result = 31 * result + getPrivilage().hashCode();
        result = 31 * result + getPost().hashCode();
        return result;
    }

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

    public Employee(String firstName, String surname, Date birthDate, String PESEL, String mailAddress, int telNumber, Privilege privilage, String post) {
        this.firstName = firstName;
        this.surname = surname;
        this.birthDate = birthDate;
        this.PESEL = PESEL;
        this.mailAddress = mailAddress;
        this.telNumber = telNumber;
        this.privilage = privilage;
        this.post = post;

    }


    public Employee() {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }




    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }



    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }



    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }


    public String getPESEL() {
        return PESEL;
    }

    public void setPESEL(String PESEL) {
        this.PESEL = PESEL;
    }


    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }



    public int getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(int telNumber) {
        this.telNumber = telNumber;
    }


    public Privilege getPrivilage() {
        return privilage;
    }

    public void setPrivilage(Privilege privilage) {
        this.privilage = privilage;
    }


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
