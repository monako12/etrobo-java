import lejos.nxt.*;
//blackies
public class black {
	ColorChecker color = new ColorChecker();
	public static void main(String[] args){

		Button.ESCAPE.addButtonListener(new EscapeListener());
		Button.RIGHT.addButtonListener(new RightListener());
		Button.LEFT.addButtonListener(new LeftListener());
		Button.ENTER.addButtonListener(new EnterListener());
		LineCheck linecheck = new LineCheck();
		while(true){
			linecheck.Check();
		}
		//ColorChecker color = new ColorChecker();
		//color.Extract();
		//color.ganegane();
	}

	static class EscapeListener implements ButtonListener {
		public void buttonPressed(Button button) {
			System.exit(0);
		}

		public void buttonReleased(Button button) {
			System.exit(0);
		}
	}

	static class RightListener implements ButtonListener {

		public void buttonPressed(Button button) {
			ColorChecker.kuro();

		}
		public void buttonReleased(Button button){}
	}
	static class LeftListener implements ButtonListener {

		public void buttonPressed(Button button) {
			ColorChecker.shiro();

		}
		public void buttonReleased(Button button){}
	}
	static class EnterListener implements ButtonListener {

		public void buttonPressed(Button button) {
			ColorChecker.haiiro();

		}
		public void buttonReleased(Button button){}
	}
}
