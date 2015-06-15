import java.*;

import lejos.nxt.*;
public class DriveMode { //how to run
    String states;
    int a;
    float b;
    public void Forward(int fw){
	a = Math.abs(Motor.A.getTachoCount());
	b = Math.signum(fw);
	LCD.drawInt(a, 0, 4);
	if(a < 500 || (0 > fw * Motor.A.getTachoCount())) {
	    Motor.A.setSpeed(500);
	    Motor.A.rotate(fw);
	}
	b = 20*b;
	Motor.B.setSpeed(50+b);
	Motor.C.setSpeed(50-b);
	Motor.B.backward();
	Motor.C.backward();
	
    }
    
}
