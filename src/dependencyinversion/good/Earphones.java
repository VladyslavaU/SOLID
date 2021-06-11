package dependencyinversion.good;

public class Earphones implements Connector {
    BluetoothConnector bluetoothConnector;


    @Override
    public void connect(BluetoothConnector bluetoothConnector) {
        this.bluetoothConnector = bluetoothConnector;
        System.out.println("Earphones connected via Bluetooth");
    }
}
