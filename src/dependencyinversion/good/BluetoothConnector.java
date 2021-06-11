package dependencyinversion.good;

public class BluetoothConnector {

    public void connect(Connector connector){
        connector.connect(this);
    }
}
