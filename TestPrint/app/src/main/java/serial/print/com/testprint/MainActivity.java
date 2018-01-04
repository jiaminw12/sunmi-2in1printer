package serial.print.com.testprint;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.io.IOException;

import serial.print.com.testprint.utils.BluetoothUtil;
import serial.print.com.testprint.utils.AidlUtil;

public class MainActivity extends AppCompatActivity {

    private boolean isAidl;

    public boolean isAidl() {
        return isAidl;
    }

    public void setAidl(boolean aidl) {
        isAidl = aidl;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        BluetoothAdapter btAdapter = BluetoothUtil.getBTAdapter();
//        if(btAdapter == null){
//            Toast.makeText(getBaseContext(), "Please Open Bluetooth!", Toast
//                    .LENGTH_LONG).show();
//            return;
//        }
//
//        BluetoothDevice device = BluetoothUtil.getDevice(btAdapter);
//        if(device == null){
//            Toast.makeText(getBaseContext(), "Please make sure printer has " +
//                    "innterprinter",Toast.LENGTH_LONG).show();
//            return;
//        }
//
//        byte[] data = null;
//
//        try {
//            BluetoothSocket socket = BluetoothUtil.getSocket(device);
//            BluetoothUtil.sendData(data);
//        } catch(IOException E){
//
//        }

        isAidl = true;
        AidlUtil.getInstance().connectPrinterService(this);

        AidlUtil.getInstance().printText("sdfsdfs", 12, false, false);


    }
}
