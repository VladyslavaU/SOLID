package openclosed.good;

public class Main {

    public static void main(String[] args) {

        Pizza margherita = new Margherita();
        Pizza marinara = new Marinara();

        margherita.cookPizza();
        marinara.cookPizza();
    }
}
