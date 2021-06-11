package interfacesegregation.bad;

public class Plane implements Transport {
    String name;

    public Plane(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
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
