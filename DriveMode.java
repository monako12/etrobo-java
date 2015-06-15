import java.*;

import lejos.nxt.*;
public class DriveMode { //how to run
	String states;
	int a;
	public void Forward(int fw){
		a = Math.abs(Motor.A.getTachoCount());
		LCD.drawInt(a, 0, 4);
		if(a < 500 || (0 > fw * Motor.A.getTachoCount())) {
			Motor.A.setSpeed(500);
			Motor.A.rotate(fw);
		}

		Motor.B.setSpeed(50);
		Motor.C.setSpeed(50);
		Motor.B.backward();
		Motor.C.backward();
	}
}
