import java.*;

import lejos.nxt.*;
public class DriveMode { //how to run
	String states;
	public void Forward(int ch){
	    Motor.A.setSpeed(300);
	    Motor.A.rotate(ch);
	    Motor.B.setSpeed(50);
	    Motor.C.setSpeed(50);
	    Motor.B.backward();
	    Motor.C.backward();
	}
}
