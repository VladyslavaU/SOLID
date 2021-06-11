package singleresponsibility.good;

public class HoursCounter {
    private final double HOURS;
    private final double OVERTIME;
    private final double DOUBLETIME;

    public HoursCounter(double hours) {
        this.HOURS = hours;
        this.DOUBLETIME = hours < 50 ? 0 : hours - 50;
        this.OVERTIME = hours < 40 ? 0 : hours - 40 - DOUBLETIME;
    }

    public void getTimeSheet() {
        System.out.println("Hours worked: " + this.HOURS);
        System.out.println("Overtime hours: " + this.OVERTIME);
        System.out.println("Double time: " + this.DOUBLETIME);
    }
}
