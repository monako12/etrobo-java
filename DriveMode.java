import java.*;

import lejos.nxt.*;
public class DriveMode { //how to run
    String states;
    int a;
    float b,c;
    public void Forward(int fw,int fw2) {
        a = Math.abs(Motor.A.getTachoCount());
        b = Math.signum(fw);
        LCD.drawInt(a, 0, 4);
        LCD.drawInt(fw, 0, 5);
        if (a < 500 || (0 > fw * Motor.A.getTachoCount())) {
            Motor.A.setSpeed(500);
            Motor.A.rotate(fw);
        }
        b = 20*b;
        LCD.drawInt(fw2, 0, 6);
        Motor.B.setSpeed(50 + b);
        Motor.C.setSpeed(50 - b);
        Motor.B.backward();
        Motor.C.backward();
    }
    public void graytask(){
        try{
            Motor.A.stop();
            Motor.B.stop();
            Motor.C.stop();
            Thread.sleep(5000);

        }catch (Exception e){
        }
    }
}
