import lejos.nxt.*;
public class LineCheck {
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
            drivemode.Inline();
        }if(ava < cur){
            drivemode.Outline();
        }
    }
}
