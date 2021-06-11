package liskov.bad;

public class MilkAdder {

    public void addMilk(Coffee coffee) {
        if (coffee.getClass() != Americano.class) {
            coffee.milk += 50;
        }
    }
}
