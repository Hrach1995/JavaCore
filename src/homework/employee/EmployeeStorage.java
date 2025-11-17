package homework.employee;

import java.util.*;

public class EmployeeStorage {

    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public void printAll() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public Employee searchID(String id) {
        for (Employee employee : employees) {
            if (employee.getEmployeeID().equals(id)) {
                return employee;
            }
        }
        return null;
    }

    public void searchCompany(String comp) {
        for (Employee e : employees) {
            if (e.getCompany().equals(comp)) {
                System.out.println(e);
            }
        }
    }


}
