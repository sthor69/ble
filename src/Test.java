import java.util.List;

import tinyb.BluetoothDevice;
import tinyb.BluetoothManager;

public class Test {
	public static void main(String[] args) {
		try {
			BluetoothManager manager = BluetoothManager.getBluetoothManager();
	        BluetoothDevice sensor = null;
	        for (int i = 0; (i < 15); ++i) {
	            List<BluetoothDevice> list = manager.getDevices();
	            if (list == null)
	                ;

	            for (BluetoothDevice device : list) {
	                System.out.println(device.toString());
	                /*
	                 * Here we check if the address matches.
	                 */
	            }

	            if (sensor != null) {
	                ;
	            }
	            Thread.sleep(4000);
	        }
		} catch (Exception e) {

		}
	}
}
