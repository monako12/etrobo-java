import lejos.nxt.*;

public class LineCheck {

    public class Limit {
        public static final int LIMIT = 3;
    }

    int limit_out_count = Limit.LIMIT;
    boolean check=false;
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
        cur = ls.readValue();


        if(cur < ava) {
            limit_out_count = Limit.LIMIT;
            drivemode.Inline(check);
        }if(ava < cur){
            drivemode.Outline(check);
            limit_out_count--;
            LCD.drawInt(limit_out_count,0,2);
        }if(limit_out_count == 0){
            drivemode.CourseoutWhite();
        }
    }
}
