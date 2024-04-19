package Ex_03;

import Ex_03.Enums.EmployeeRole;

public class Employee extends Person {
    private EmployeeRole employeeRole;

    public Employee(String name, int yearOfBirth, String email, String phone, EmployeeRole employeeRole) {
        super(name, yearOfBirth, email, phone);
        this.employeeRole = employeeRole;
    }

    @Override
    public void jobTitle() {

    }

    @Override
    public void printTimetable() {

    }
}
