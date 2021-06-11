package singleresponsibility.good;

public class Main {

    public static void main(String[] args) {
        HoursCounter hours = new HoursCounter(65);
        hours.getTimeSheet();

        SalaryCounter salary = new SalaryCounter(65, 15);
        salary.getSalaryReport();
    }
}
