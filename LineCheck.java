import lejos.nxt.*;
import java.*;
import java.util.Map;
import java.lang.Object;

public class LineCheck {
    boolean check = false;
    static int limit_out_count;
    DriveMode drivemode = new DriveMode();
    ColorChecker colorchecker = new ColorChecker();
    LightSensor ls = new LightSensor(SensorPort.S3);
    public String states = "inline";
    static int ava = 0;

    Mathmatical frwh =  new Mathmatical(0.34,0.34,0.34);
    Mathmatical riwh =  new Mathmatical(0.34,0.34,0.34);
    Mathmatical lewh =  new Mathmatical(0.34,0.34,0.34);
    double cur;
    double cur2 = 0;
    public void Check() {
        if (ava == 0) {
            ava = colorchecker.Extract();
        }
        cur = ls.readNormalizedValue();
        cur = frwh.pid(ava,cur);
        drivemode.Forward((int) cur, (int) cur2);
    }
}