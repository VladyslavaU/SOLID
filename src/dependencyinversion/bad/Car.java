package dependencyinversion.bad;

public class Car {

    BluetoothConnector bluetoothConnector;

    public void bluetoothConnection(BluetoothConnector bluetoothConnector) {
        this.bluetoothConnector = bluetoothConnector;
        System.out.println("Car connected via Bluetooth");
    }
}
