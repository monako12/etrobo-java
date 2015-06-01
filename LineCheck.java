import lejos.nxt.*;

public class LineCheck {

    public class Limit {
        public static final int LIMIT = 500;
    }

    boolean check = false;
    int limit_out_count = Limit.LIMIT;
    DriveMode drivemode = new DriveMode();
    ColorChecker colorchecker = new ColorChecker();
    LightSensor ls = new LightSensor(SensorPort.S3);
    public String states = "inline";
    public void Check(){
        int ava = 0;
        int cur;
        if(ava == 0){
            ava = colorchecker.ganegane();
        }
        cur = ls.readNormalizedValue();
        LCD.drawInt(cur,0,3);
        if(limit_out_count <= 0){
            LCD.drawInt(limit_out_count,0,2);
            cur = ls.readNormalizedValue();
            drivemode.CourseoutWhite();
        }if(cur < ava) {
            cur = ls.readNormalizedValue();
            limit_out_count = Limit.LIMIT;
            drivemode.Inline(check);
        }else if(ava > cur){
            cur = ls.readNormalizedValue();
            drivemode.Outline(check);
            limit_out_count--;
            LCD.drawInt(limit_out_count,0,2);
        }
    }
}
