import lejos.nxt.*;

public class LineCheck {
    boolean check = false;
    static int limit_out_count;
    DriveMode drivemode = new DriveMode();
    ColorChecker colorchecker = new ColorChecker();
    LightSensor ls = new LightSensor(SensorPort.S3);
    public String states = "inline";
    static int ava = 0;
    public void Check() {
        int cur;
	int nowtacho = 0;
        if (ava == 0) {
            ava = colorchecker.Extract();
        }
	cur = ls.readNormalizedValue();
	cur = cur - ava;
	nowtacho = Motor.A.getTachoCount();
	cur = cur^3; 
	LCD.drawInt(cur, 0, 4);
	drivemode.Forward(cur);
    }	
}
