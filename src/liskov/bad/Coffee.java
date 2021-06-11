package liskov.bad;

abstract class Coffee {
    public int sugar;
    public int milk;

    abstract void makeCoffee(int sugar);

}
