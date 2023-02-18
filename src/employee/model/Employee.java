package employee.model;

import java.util.Date;
import java.util.Objects;

public class Employee {
    private String name;
    private String surname;
    private String emplyeeId;
    private double salary;
    private String company;
    private String position;
    private boolean active = true;

    private Date registerDate;

    private Date dateOfBirthDay;

    public Employee(String name, String surname, String emplyeeId, double salary, String company, String position, Date dateOfBirthDay
    ) {
        this.name = name;
        this.surname = surname;
        this.emplyeeId = emplyeeId;
        this.salary = salary;
        this.company = company;
        this.position = position;
        this.dateOfBirthDay = dateOfBirthDay;
    }

    public Employee() {
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

    public String getEmplyeeId() {
        return emplyeeId;
    }

    public void setEmplyeeId(String emplyeeId) {
        this.emplyeeId = emplyeeId;
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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Date getDateOfBirthDay() {
        return dateOfBirthDay;
    }

    public void setDateOfBirthDay(Date dateOfBirthDay) {
        this.dateOfBirthDay = dateOfBirthDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && active == employee.active && Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname) && Objects.equals(emplyeeId, employee.emplyeeId) && Objects.equals(company, employee.company) && Objects.equals(position, employee.position) && registerDate.equals(employee.registerDate) && dateOfBirthDay.equals(employee.dateOfBirthDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, emplyeeId, salary, company, position, active, registerDate, dateOfBirthDay);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", emplyeeId='" + emplyeeId + '\'' +
                ", salary=" + salary +
                ", company='" + company + '\'' +
                ", position='" + position + '\'' +
                ", active=" + active +
                ", registerDate=" + registerDate +
                ", dateOfBirthDay=" + dateOfBirthDay +
                '}';
    }
}
