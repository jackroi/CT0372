package it.unive.ch3.e11;

public class Employee {
    private String employeeName;
    private double currentSalary;

    public Employee(String employeeName, double currentSalary) {
        this.employeeName = employeeName;
        this.currentSalary = currentSalary;
    }

    /**
     * @return the employeeName
     */
    public String getEmployeeName() {
        return this.employeeName;
    }

    /**
     * @return the currentSalary
     */
    public double getCurrentSalary() {
        return this.currentSalary;
    }

    public void raiseSalary(double byPercent) {
        if (byPercent < 0) {
            throw new IllegalArgumentException("byPercent can't be negative");
        }

        this.currentSalary += this.currentSalary * byPercent / 100;
    }
}
