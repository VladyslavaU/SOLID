package singleresponsibility.good;

public class SalaryCounter {
    private double wage;
    private final double OVERTIME_WAGE = wage * 1.5;
    private final double DOUBLETIME_WAGE = wage * 2;
    private final double HOURS;
    private final double SALARY;

    public SalaryCounter(double hours, double wage) {
        this.wage = wage;
        this.HOURS = hours;
        this.SALARY = salaryCount(hours, wage);

    }

    public double salaryCount(double hours, double hourlyWage) {
        double overtime = 0;
        double doubleTime = 0;
        if (hours > 50) {
            doubleTime = (hours - 50) * this.DOUBLETIME_WAGE;
        }
        if (hours > 40) {
            overtime *= (hours - 40) * this.OVERTIME_WAGE;
        }
        return hours * hourlyWage + overtime + doubleTime;
    }

    public void getSalaryReport() {
        System.out.println("Hourly wage: " + this.wage);
        System.out.println("Hours worked this week: " + this.HOURS);
        System.out.println("Weekly earnings: " + this.SALARY);
    }
}
