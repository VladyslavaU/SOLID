package interfacesegregation.good;

public class Train implements Transport {

    String name;

    public Train(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println("I'm moving");
    }

    @Override
    public void start() {
        System.out.println("Start engine");
    }

    @Override
    public void stop() {
        System.out.println("Stop engine");
    }
}
