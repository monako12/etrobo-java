import java.*;
import lejos.nxt.*;
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
    static int i = 0;
    static int t = 0;
    Mathmatical frwh =  new Mathmatical(0.34,0.34,0.34,1);
    Mathmatical riwh =  new Mathmatical(0.34,0.34,0.34,0);
    Mathmatical lewh =  new Mathmatical(0.34,0.34,0.34,0);
    double cur;
    double cur2;
    public void Check() {
        if (ava == 0) {
            ava = colorchecker.Extract();
        }
        cur = ls.readNormalizedValue();
        GrayCheck(cur);
        cur2 = riwh.pid(ava,cur);
        cur = frwh.pid(ava,cur);

        drivemode.Forward((int) cur, (int) cur2);
    }
    public void GrayCheck(double now){
        int haiiro = colorchecker.haiiroreturn();
        int haiiro_min = haiiro-3;
        int haiiro_max = haiiro+3;

        if ( haiiro_min < now && now < haiiro_max) {
                drivemode.graytask();
            }
    }
}
