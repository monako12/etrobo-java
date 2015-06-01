import lejos.nxt.*;

public class LineCheck {

    public class Limit {
        public static final int LIMIT = 300;
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
            ava = colorchecker.Extract();
        }
        cur = ls.readNormalizedValue();
        LCD.drawString("now_value",0,1);
        LCD.drawInt(cur,0,2);
        if(cur < ava) {
            cur = ls.readValue();
            limit_out_count = Limit.LIMIT;
            drivemode.Inline(check);
        }if(limit_out_count <= 0){
            cur = ls.readValue();
            drivemode.CourseoutWhite();
        }else if(ava < cur){
            cur = ls.readValue();
            drivemode.Outline(check);
            limit_out_count--;
            LCD.drawInt(limit_out_count,0,2);
        }
    }
}
