package liskov.bad;

public class Americano extends Coffee {

    public Americano() {
        this.milk = 0;
    }

    public void makeCoffee(int sugar) {
        this.sugar = sugar;
    }
}
