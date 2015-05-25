public class black {
    public static void main(String[] args){
        LineCheck linecheck = new LineCheck();
        DriveMode drivemode = new DriveMode();
        ColorChecker colorchecker = new ColorChecker();
	colorchecker.check();
        drivemode.Outline();
        linecheck.Check();
    }
}
