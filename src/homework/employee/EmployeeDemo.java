package homework.employee;


import java.util.*;

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeStorage storage = new EmployeeStorage();

        while (true) {
            System.out.println("""
                    0 exit
                    1 add
                    2 print all
                    3 search by ID
                    4 search by company
                    5 search by position level (JUNIOR/MIDDLE/SENIOR/LEAD)
                    """);
            int sc = scanner.nextInt();
            scanner.nextLine();

            switch (sc) {

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
                    String empLevelStr = scanner.nextLine().toUpperCase();
                    PositionLevel level = PositionLevel.valueOf(empLevelStr);

                    storage.addEmployee(new Employee(empName, empSurname, empID, empSalary, empCompany, empPosition,level));
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
                case 5 -> {
                    System.out.println("Մուտքագրեք position level:");
                    String lvl = scanner.nextLine().toUpperCase();
                    PositionLevel level = PositionLevel.valueOf(lvl);
                    storage.searchByLevel(level);
                }
                default -> System.out.println("Սխալ հրաման");

            }
        }

    }
}
