public class LineCheck {
    DriveMode drivemode = new DriveMode();
    public String states = "inline";
    public void Check(){

        if("inline" == states) {
            drivemode.Inline();
        }
    }
}