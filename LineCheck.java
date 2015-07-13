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
    public double diff[] = new double[3]; //diff[2] equales diff over diff

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
        GrayCheck(cur);
        cur = frwh.pid(ava,cur);
        drivemode.Forward((int) cur, (int) cur2);
    }

    public void GrayCheck(double cur) {//diff[1] is before varue
        diff[0] = cur;
        LCD.clear();
        LCD.drawInt((int)(diff[2] - Math.abs(diff[1]-cur)), 4, 4);
        if(Math.abs(diff[2] - Math.abs(diff[1]-cur)) < 25 && Math.abs(diff[2] - Math.abs(diff[1]-cur)) > 17){
            drivemode.graytask();
        }
        diff[2] = Math.abs(diff[1]-cur);
        diff[1] = diff[0];
    }
}