import java.*;

import lejos.nxt.*;
public class DriveMode { //how to run
	String states;
	public void Inline(){
		states = "inline";
		LCD.drawString(states,5,5);
		Motor.A.rotate(40);
		Motor.B.setSpeed(100);
		Motor.C.setSpeed(20);
		Motor.B.backward();
		Motor.C.backward();
	}
	public void Outline(){
		states = "outline";
		LCD.drawString(states, 5, 5);
		Motor.A.rotate(-30);
		Motor.B.setSpeed(50);
		Motor.C.setSpeed(100);
		Motor.B.backward();
		Motor.C.backward();
	}
	public void Forward(){
		Motor.A.rotate(0);
		Motor.B.setSpeed(200);
		Motor.C.setSpeed(200);
		Motor.B.backward();
		Motor.C.backward();
	}
    public void Courceout(){
        states = "courceout";
    }
}
