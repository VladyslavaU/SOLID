package liskov.bad;

public class Latte extends Coffee {

    public Latte() {
        this.milk = 300;
    }

    public void makeCoffee(int sugar) {
        this.sugar = sugar;
    }

}
