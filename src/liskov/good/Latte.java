package liskov.good;

public class Latte {

    int sugar;
    int milk;

    public Latte() {
        this.milk = 300;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }
}
