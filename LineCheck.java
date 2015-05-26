import lejos.nxt.*;

public class LineCheck {

    public class Limit {
        public static final int LIMIT = 3;
    }

    DriveMode drivemode = new DriveMode();
    ColorChecker colorchecker = new ColorChecker();
    LightSensor ls = new LightSensor(SensorPort.S3);
    public String states = "inline";
    public void Check(){
        int ava = 0;
        int cur;
        int limit_out_count = Limit.LIMIT;
        if(ava == 0){
            ava = colorchecker.Extract();
        }
        cur = ls.readValue();


        if(cur < ava) {
            limit_out_count = Limit.LIMIT;
            drivemode.Inline();
        }if(ava < cur){

            drivemode.Outline();
            limit_out_count--;
            drivemode.Outline();
        }if(limit_out_count == 0){
            drivemode.CourseoutWhite();
        }
    }
}
