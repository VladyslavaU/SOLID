package dependencyinversion.bad;

public class Earphones {

    BluetoothConnector bluetoothConnector;

    public void bluetoothConnection(BluetoothConnector bluetoothConnector) {
        this.bluetoothConnector = bluetoothConnector;
        System.out.println("Earphones connected via Bluetooth");
    }
}
