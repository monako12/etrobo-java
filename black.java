import lejos.nxt.*;
public class black {
	public static void main(String[] args){
		Button.ESCAPE.addButtonListener(new EscapeListener());
		LineCheck linecheck = new LineCheck();

		while(true){
			linecheck.Check();
		}
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
