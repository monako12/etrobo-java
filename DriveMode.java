import java.*;

import lejos.nxt.*;
public class DriveMode { //how to run
	String states;
	public void Inline(boolean check){
	    states = "inline";
		LCD.drawString(states,5,5);
		if(40<=Motor.A.getTachoCount()){
		}else if(40>=Motor.A.getTachoCount()){
		    Motor.A.rotate(20);		
		    
		}
		Motor.B.setSpeed(100);
		Motor.C.setSpeed(80);
		Motor.B.backward();
		Motor.C.backward();
	}

	public void Outline(boolean check){
		states = "outline";
		LCD.drawString(states,5,5);
		if(-40>=Motor.A.getTachoCount()){
		}else if(-40<=Motor.A.getTachoCount()){
		    Motor.A.rotate(-20);

		}
		Motor.B.setSpeed(80);
		Motor.C.setSpeed(100);
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
		Motor.B.setSpeed(2000);
		Motor.B.backward();
		Motor.C.stop();
	}

	public void ContinueBlack(){

	}
}
