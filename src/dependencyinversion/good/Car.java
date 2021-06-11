package dependencyinversion.good;

public class Car implements Connector {

    BluetoothConnector bluetoothConnector;

    @Override
    public void connect(BluetoothConnector bluetoothConnector) {
        this.bluetoothConnector = bluetoothConnector;
        System.out.println("Car connected via Bluetooth");
    }
}
