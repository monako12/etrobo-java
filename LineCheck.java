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
    public void Check() {
        double p,i,d;
        double delta_t = 2;
        double diff[] = new double[3];
        double integral = 0;
        double cur;
        if (ava == 0) {
            ava = colorchecker.Extract();
        }
        cur = ls.readNormalizedValue();
        //LCD.draw(cur, 0, 3);
        diff[0] = diff[1];
        diff[1] = cur - ava;
        integral += (diff[1] + diff[0])/2*delta_t;
        p = *diff[1];
        i = 2*integral;
        d = 2*(diff[1]-diff[0])/delta_t;
        cur = p+i+d;
        //cur = cur - ava;
        //cur = cur^3;
        //	LCD.drawInt(cur, 0, 4);
        drivemode.Forward((int)cur);
    }
}
