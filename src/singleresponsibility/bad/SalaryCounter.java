package singleresponsibility.bad;

public class SalaryCounter {

    private final double HOURS;
    private final double HOURLY_WAGE;
    private final double EARNED_WEEKLY;
    private final double OVERTIME;
    private final double DOUBLETIME;

    public SalaryCounter(double hours, double hourlyWage) {
        this.HOURS = hours;
        this.HOURLY_WAGE = hourlyWage;
        this.DOUBLETIME = hours < 50 ? 0 : hours - 50;
        this.OVERTIME = hours < 40 ? 0 : hours - 40 - DOUBLETIME;
        this.EARNED_WEEKLY = salaryCount(hours, hourlyWage);
    }

    public static double salaryCount(double hours, double hourlyWage) {
        double overtime = 0;
        double doubleTime = 0;
        if (hours > 50) {
            doubleTime = (hours - 50) * hourlyWage * 2;
        }
        if (hours > 40) {
            overtime *= (hours - 40) * hourlyWage * 1.5;
        }
        return hours * hourlyWage + overtime + doubleTime;
    }

    public void getTimeSheet() {
        System.out.println("Hours worked: " + this.HOURS);
        System.out.println("Overtime hours: " + this.OVERTIME);
        System.out.println("Double time: " + this.DOUBLETIME);
    }

    public void getSalaryReport() {
        System.out.println("Hourly wage: " + this.HOURLY_WAGE);
        System.out.println("Hours worked this week: " + this.HOURS);
        System.out.println("Weekly earnings: " + this.EARNED_WEEKLY);
    }


}
