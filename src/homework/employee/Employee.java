package homework.employee;

import java.util.*;

public class Employee {

    private String name;
    private String surname;
    private String employeeID;
    private double salary;
    private String company;
    private String position;

    public Employee() {
    }

    public Employee(String name, String surname, String employeeID, double salary, String company, String position) {
        this.name = name;
        this.surname = surname;
        this.employeeID = employeeID;
        this.salary = salary;
        this.company = company;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Employee thos = (Employee) object;
        return Objects.equals(employeeID, thos.employeeID);
    }

    @Override
    public int hashCode() {
        return employeeID != null ? employeeID.hashCode() : 0;
    }

    @Override
    public String toString() {
        return String.format("employee{name=%s, surname = %s, ID - %s, salary - %.2f,company = %s, position = %s}\n",
                name, surname, employeeID, salary, company, position);
    }

}

