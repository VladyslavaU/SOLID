package dependencyinversion.bad;

public class BluetoothConnector {
    Earphones earphones;
    Car car;
    String environment;

    public BluetoothConnector() {
        this.earphones = new Earphones();
        this.car = new Car();
    }

    public void connect(String environment) {
        this.environment = environment;
        if (environment.equals("In the car")) {
            this.car.bluetoothConnection(this);
        } else {
            this.earphones.bluetoothConnection(this);
        }
    }
}
