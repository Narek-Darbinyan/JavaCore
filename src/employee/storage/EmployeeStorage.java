package employee.storage;

import employee.model.Employee;

import java.util.Date;

public class EmployeeStorage {
    private Employee[] employees = new Employee[10];
    private int size = 0;

    public void add(Employee value) {
        if (size == employees.length) {
            extend();
        }
        value.setRegisterDate(new Date());
        employees[size++] = value;
    }

    private void extend() {
        Employee[] newArray = new Employee[employees.length + 10];
        for (int i = 0; i < size; i++) {
            newArray[i] = employees[i];
        }
        employees = newArray;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i] + " ");
        }
    }


    public void searchByemplyeeId(String keyword) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getEmplyeeId().contains(keyword)) {
                found = true;
                System.out.println(employee);
            }

        }
        if (!found) {
            System.out.println("Emplyee with" + "not found");
        }


    }

    public void searchCompaniName(String companyName) {
        for (int i = 0; i < size; i++) {

        }

    }

    public Employee getEmployeeById(String employeeId) {

        return null;
    }

    public void searchBySalaryRange(double minSalary, double maxSalary) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getSalary() >= minSalary && employee.getSalary() <= maxSalary) {
                System.out.println(employee);
            }
        }
    }
}
