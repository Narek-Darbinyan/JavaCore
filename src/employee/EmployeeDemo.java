package employee;

import employee.model.Employee;
import employee.storage.EmployeeStorage;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class EmployeeDemo {
    static Scanner scanner = new Scanner(System.in);
    static EmployeeStorage employeeStorage = new EmployeeStorage();

    public static void main(String[] args) {
        boolean isRun = true;

        employeeStorage.add(new Employee("Narek ", "Darbinyan", "A001", 5000, "company 1", "arxitektor", new Date("02/12/2023")));
        employeeStorage.add(new Employee("Hermine", "Arshakyan", "A002", 2000, "company 2", "junior", new Date("02/12/2023")));
        employeeStorage.add(new Employee("Sevak", "Harutunyan", "A003", 100, "company 3", "manejer", new Date("02/12/2023")));
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    employeePrint();
                    break;
                case "2":
                    employeeStorage.print();
                    break;
                case "3":
                    getEmployeeById();
                    break;
                case "4":
                    System.out.println("Plase input company name");
                    String companyName = scanner.nextLine();
                    employeeStorage.searchCompaniName(companyName);
                    break;
                case "5":
                    searchEmployeesBySalaryRange();
                default:
                    System.out.println("wrong command,try agai!");


            }
        }
    }

    private static void searchEmployeesBySalaryRange() {
        System.out.println("plase input min,max");
        String salaryRangeStr = scanner.nextLine();
        String[] salaryRange = salaryRangeStr.split(",");
        double minSalary = Double.parseDouble(salaryRange[0]);
        double maxSalary = Double.parseDouble(salaryRange[1]);
        if (minSalary > maxSalary) {
            System.out.println("min salary shoul be lesthen max salary");
        } else {
            employeeStorage.searchBySalaryRange(minSalary, maxSalary);

        }

    }


    private static void printCommands() {
        System.out.println("Please input 0 for exit");
        System.out.println("Please input 1 for add employye");
        System.out.println("Please input 2 for print all employye");
        System.out.println("Please input 3 for search employee by employee ID ");
        System.out.println("Please input 4 for search employee by company name ");
        System.out.println("Please input 5 for search employee by salary range");
    }

    private static void employeePrint() {
        System.out.println("Please input name");
        String name = scanner.nextLine();
        System.out.println("Please input surname");
        String surname = scanner.nextLine();
        System.out.println("Please input emplyeeId");
        String emplyeeId = scanner.nextLine();
        System.out.println("Please input salary");
        String salaryStr = scanner.nextLine();
        System.out.println("Please input company");
        String company = scanner.nextLine();
        System.out.println("Please input position");
        String position = scanner.nextLine();
        System.out.println("Please input birthOfDate");
        String birthOfDate = scanner.nextLine();
        Date dateOfBirthDay = new Date(birthOfDate);
        Employee employee = new Employee(name, surname, emplyeeId, Double.parseDouble(salaryStr), company, position, dateOfBirthDay);
        employeeStorage.add(employee);
        System.out.println("Employee was added");
        return;
    }

    private static void getEmployeeById() {
        System.out.println("Plase input employee Id");
        String employeeId = scanner.nextLine();
        Employee employee1 = employeeStorage.getEmployeeById(employeeId);
        if (employee1 == null) {
            System.out.println("Employee with " + employeeId + " dose not exists");
        } else {
            System.out.println(employee1);
        }
        return;
    }

    private static void addEmployee() {
        System.out.println("pleas input name,surname,employeeId,salary,company,position");
        String employeeDataStr = scanner.nextLine();
        String[] employeeData = employeeDataStr.split(",");
        String employeeId = employeeData[2];
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null) {
            Employee newEmployee = new Employee(employeeData[0], employeeData[1],
                    employeeId, Double.parseDouble(employeeData[3]), employeeData[4], employeeData[5], new Date(employeeData[6]));
            employeeStorage.add(newEmployee);
            System.out.println("employee was added");

        } else {
            System.out.println("eployee with" + employeeId + "already exists!!!");
        }

    }

}
