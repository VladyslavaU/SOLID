package interfacesegregation.bad;

public class Train {
    String name;

    public Train(String name) {
        this.name = name;
    }

    public void flY() {
        throw new UnsupportedOperationException();
    }

    public void move() {
        System.out.println("I'm moving");
    }

    public void start() {
        System.out.println("Start engine");
    }

    public void stop() {
        System.out.println("Stop engine");
    }
}
