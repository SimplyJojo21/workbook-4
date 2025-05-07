package com.pluralsight;

public class Employee {

    //these are the private attributes
    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    //this is the constructor
    public Employee(String employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }
    public double getRegularHours() {
        return Math.min(40, hoursWorked);
    }
    public double getOvertimeHours() {
        return Math.max(0, hoursWorked - 40);
    }
    public double getTotalPay() {
        double regularPay = getRegularHours() * payRate;
        double overtimePay = getOvertimeHours() * payRate * 1.5;
        return regularPay + overtimePay;
    }
}
