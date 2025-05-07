package com.pluralsight;

import java.time.LocalDateTime;

public class Employee {

    //these are the private attributes
    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double currentStartTime;

    //this is the constructor
    public Employee(String employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public void punchIn(double time) {
        currentStartTime = time;
    }

    public void punchIn() {
        LocalDateTime now = LocalDateTime.now();
        currentStartTime = now.getHour() + now.getMinute() / 60.0;
    }

    // Punch out calculates hours worked and adds to total
    public void punchOut(double time) {
        double sessionHours = time - currentStartTime;
        if (sessionHours > 0) {
            hoursWorked += sessionHours;
        }
    }
    public void punchOut() {
        LocalDateTime now = LocalDateTime.now();
        double currentTime = now.getHour() + now.getMinute() / 60.0;
        punchOut(currentTime);
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

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public String getDepartment() {
        return department;
    }
}
