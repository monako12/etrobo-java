import java.*;
import lejos.nxt.*;
public class DriveMode { //how to run
    String states;
    static boolean i;
    public void Inline(){
	 states = "inline";
        LCD.drawString(states,5,5);
       	Motor.A.rotateTo(40 ,i);
	Motor.B.setSpeed(100);
	Motor.C.setSpeed(20);
	Motor.B.backward();
	Motor.C.backward();
    }
    public void Outline(){
	 states = "outline";
	 Motor.A.rotateTo(-30,i);
	 
	Motor.C.setSpeed(100);
	Motor.B.setSpeed(50);
	Motor.B.backward();
	Motor.C.backward();
        LCD.drawString(states,5,5);

    }
}
