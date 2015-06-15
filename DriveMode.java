import java.*;

import lejos.nxt.*;
public class DriveMode { //how to run
    String states;
    int a;
    public void Forward(int ch){
	a = Math.abs(Motor.A.getTachoCount());
	LCD.drawInt(a, 0, 4);
	if(a < 400){
	Motor.A.setSpeed(500);
	Motor.A.rotate(ch);
	}
	Motor.B.setSpeed(50);
	Motor.C.setSpeed(50);
	Motor.B.backward();
	Motor.C.backward();
    }
}
