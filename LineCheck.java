import lejos.nxt.*;

public class LineCheck {
    boolean check = false;
    static int limit_out_count;
    DriveMode drivemode = new DriveMode();
    ColorChecker colorchecker = new ColorChecker();
    LightSensor ls = new LightSensor(SensorPort.S3);
    public String states = "inline";
    public void Check() {
        int ava = 0;
        int cur;
        if (ava == 0) {
            ava = colorchecker.Extract();
        }
        cur = ls.readNormalizedValue();
        LCD.drawInt(cur, 0, 2);
        if (cur > ava) {
            limit_out_count = 1000;
            cur = ls.readNormalizedValue();
            drivemode.Inline(check);
        }if (limit_out_count <= 0) {
            cur = ls.readNormalizedValue();
            drivemode.CourseoutWhite();
        }else if (cur < ava) {
            limit_out_count --;
            LCD.drawInt(limit_out_count, 0, 3);
            cur = ls.readNormalizedValue();
            drivemode.Outline(check);
        }
    }
}
