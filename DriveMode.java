import java.*;

import lejos.nxt.*;
public class DriveMode { //how to run
	String states;
	public void Inline(boolean check){
		states = "inline";
		LCD.drawString(states,5,5);
		if(false == check) {
			Motor.A.rotate(20);
		}
		Motor.B.setSpeed(200);
		Motor.C.setSpeed(90);
		Motor.B.backward();
		Motor.C.backward();
	}

	public void Outline(boolean check){
		states = "outline";
		LCD.drawString(states, 5, 5);
		if(true == check) {
			Motor.A.rotate(-15);
		}
		Motor.B.setSpeed(90);
		Motor.C.setSpeed(200);
		Motor.B.backward();
		Motor.C.backward();
	}

	public void Forward(){
		states = "forward";
		LCD.drawString(states, 5, 5);
		Motor.A.rotate(0);
		Motor.B.setSpeed(200);
		Motor.C.setSpeed(200);
		Motor.B.backward();
		Motor.C.backward();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
	}

	public void CourseoutWhite(){
		states = "couseout";
		LCD.drawString(states, 5, 5);
		/*
		Motor.A.rotate(30);
		Motor.B.stop();
		Motor.C.stop();
		Motor.B.setSpeed(200);
		Motor.B.backward();
		//Motor.C.forward();
		Forward();
		*/
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
		}
	}

	public void ContinueBlack(){

	}
}
