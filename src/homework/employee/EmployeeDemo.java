package homework.employee;


import java.util.*;

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeStorage storage = new EmployeeStorage();

        while (true) {
            System.out.println("0 for exi || 1 add employee || 2 print all employee || 3 search employee by employee ID, 4 search employee by company name");
            int co = scanner.nextInt();
            scanner.nextLine();

            switch (co) {

                case 0 -> {
                    return;
                }
                case 1 -> {
                    System.out.println("Մուտքագրեք name surname employeeID salary company position:");
                    System.out.println("name");
                    String empName = scanner.nextLine();
                    System.out.println("surname");
                    String empSurname = scanner.nextLine();
                    System.out.println("id");
                    String empID = scanner.nextLine();
                    System.out.println("salary");
                    double empSalary = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("company");
                    String empCompany = scanner.nextLine();
                    System.out.println("position");
                    String empPosition = scanner.nextLine();

                    storage.addEmployee(new Employee(empName, empSurname, empID, empSalary, empCompany, empPosition));
                }
                case 2 -> {
                    System.out.println("տպելու է բոլոր աշխատակիցներին");
                    storage.printAll();
                }
                case 3 -> {
                    System.out.println("Մուտքագրեք employee ID:");
                    String id = scanner.nextLine();
                    Employee e = storage.searchID(id);
                    if (e != null) System.out.println(e);
                    else System.out.println("Չկա նման ID");
                }
                case 4 -> {
                    System.out.println("Մուտքագրեք company name:");
                    String company = scanner.nextLine();
                    storage.searchCompany(company);
                }
                default -> System.out.println("Սխալ հրաման");

            }
        }

    }
}
