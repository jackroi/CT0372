package it.unive.ch3.e11;

public class EmployeeTester {
    public static void main(String[] args) {
        Employee e = new Employee("Pippo", 1000);

        System.out.println("Name: " + e.getEmployeeName());
        System.out.println("Salary: " + e.getCurrentSalary());

        e.raiseSalary(50);
        System.out.println("New salary: " + e.getCurrentSalary());

        e.raiseSalary(-50);
        System.out.println("New salary: " + e.getCurrentSalary());
    }
}
