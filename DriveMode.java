import java.*;

import lejos.nxt.*;
public class DriveMode { //how to run
	String states;
	public void Inline(){
		states = "inline";
		LCD.drawString(states,5,5);
		Motor.A.rotate(20);
		Motor.B.setSpeed(200);
		Motor.C.setSpeed(90);
		Motor.B.backward();
		Motor.C.backward();
	}

	public void Outline(){
		states = "outline";
		LCD.drawString(states, 5, 5);
		Motor.A.rotate(-15);
		Motor.B.setSpeed(90);
		Motor.C.setSpeed(200);
		Motor.B.backward();
		Motor.C.backward();
	}

	public void Forward(){
		Motor.A.rotate(0);
		Motor.B.setSpeed(400);
		Motor.C.setSpeed(400);
		Motor.B.backward();
		Motor.C.backward();
	}

	public void CourseoutWhite(){
		Motor.A.rotate(30);
		Motor.B.stop();
		Motor.C.stop();
		Motor.B.setSpeed(200);
		Motor.B.backward();
		Motor.A.forward();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
		}
	}

	public void ContinueBlack(){

	}

}
