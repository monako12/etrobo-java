import java.*;
import lejos.nxt.*;
import lejos.util.*;
import lejos.nxt.comm.*;
import java.util.Map;
import java.lang.Object;
public class experiment {
	public static void main(String[] args){
	    NXTDataLogger log = new NXTDataLogger();
	    LightSensor ls = new LightSensor(SensorPort.S3);
	    int cur;
	    NXTConnection conn = Bluetooth.waitForConnection(5000, NXTConnection.PACKET);
	    try {
		log.startRealtimeLog(conn);
	    } catch (Exception e) {
		// Do nothing. This is hideously bad.
	    }
	    log.setColumns(new LogColumn[] {
		    new LogColumn("cur", LogColumn.DT_FLOAT),
		});
	    
	    Button.ESCAPE.addButtonListener(new EscapeListener());
	    while(true){
		cur = ls.readNormalizedValue();
		log.writeLog((float)cur);
		log.finishLine();
	    }
	}
    
    static class EscapeListener implements ButtonListener {
	public void buttonPressed(Button button) {
	    
	    System.exit(0);
	}
	
	public void buttonReleased(Button button) {
	    
	    System.exit(0);
	}
    }
    
    
}
