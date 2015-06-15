import lejos.nxt.*;

import java.util.Map;

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
        if (ava == 0) {
            ava = colorchecker.Extract();
        }
        cur = ls.readNormalizedValue();
        LCD.drawInt(cur, 0, 3);
        cur = cur - ava;
        cur = cur^3;
        //	LCD.drawInt(cur, 0, 4);
        drivemode.Forward(cur);
    }
}
