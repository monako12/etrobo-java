import lejos.nxt.*;
public class LineCheck {
    DriveMode drivemode = new DriveMode();
    ColorChecker colorchecker = new ColorChecker();
    LightSensor ls = new LightSensor(SensorPort.S3);
    public String states = "inline";
    public void Check(){
	int ava = 0;
	int cur;
    int limit_out_count = 10;
	if(ava == 0){
	    ava = colorchecker.Extract();
	}
	cur = ls.readValue();

        if(cur < ava) {
            limit_out_count = 10;
            drivemode.Inline();
        }if(ava < cur){
            limit_out_count--;
	        drivemode.Outline();
        }if(limit_out_count = 0){
            drivemode.Courceout();
        }
    }
}
