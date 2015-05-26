import lejos.nxt.*;
public class black {
	public static void main(String[] args){
		Button.ESCAPE.addButtonListener(new EscapeListener());
		LineCheck linecheck = new LineCheck();
		DriveMode drivemode = new DriveMode();
		//	ColorChecker colorchecker = new ColorChecker();
		//	colorchecker.Extract();

		drivemode.Forward();

		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		drivemode.CourseoutWhite();
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
		}
		drivemode.Forward();
/*
		while(true){
			linecheck.Check();
		}*/
	}

	static class EscapeListener implements ButtonListener {
		public void buttonPressed(Button button) {
			System.exit(0);
		}

		public void buttonReleased(Button button) {
			System.exit(0);
		}
	}
}
