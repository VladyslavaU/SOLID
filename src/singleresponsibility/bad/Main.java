package singleresponsibility.bad;

public class Main {

    public static void main(String[] args) {
        SalaryCounter weekOne = new SalaryCounter(65, 15.40);
        weekOne.getSalaryReport();
        weekOne.getTimeSheet();
    }
}
