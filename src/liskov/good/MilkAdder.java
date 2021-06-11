package liskov.good;

public class MilkAdder {

    public void addMilk(Latte latte) {
        latte.milk += 50;
    }
}
