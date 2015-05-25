/* 
*Forward.java
*/

import lejos.nxt.Motor;
import lejos.nxt.LightSensor;
import lejos.nxt.*;

<<<<<<< Updated upstream
import java.lang.*;
import java.lang.Exception;
import java.lang.InterruptedException;
import java.lang.String;
import java.lang.Throwable;

public class Forward {

	public class Color {
		public static final int WHITE = 39;
		public static final int BLACK = 37;
	}

	public static void main(String[] args) {
		/*
=======
public class Forward{
	public static void main(String[] args) {
>>>>>>> Stashed changes
		Motor.C.setSpeed(720);
		Motor.B.setSpeed(720);

		Motor.C.backward();
		Motor.B.backward();
<<<<<<< Updated upstream
		LightSensor lightsensor = new LightSensor(SensorPort.S3);

		try {
			Thread.sleep(4000);
		} catch (Exception e) {
		}
		Motor.C.stop();
		Motor.B.stop();
		*/

		LightSensor lightsensor = new LightSensor(SensorPort.S3);
		TouchSensor touchsensor = new TouchSensor(SensorPort.S2);
		int values = lightsensor.readValue();
		LCD.drawInt(values, 5, 5);
		//hitotumenohikisuugasyuutryokusaserumojide,nokorihutatuha xjiku to y jiku
		int angle = 0;
		Motor.A.rotate(angle);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		Motor.C.setSpeed(100);
		Motor.B.setSpeed(100);


		Motor.C.backward();
		Motor.B.backward();
		String str = "pressed";

		int check = 0;
		while (true != touchsensor.isPressed()) {
			values = lightsensor.readValue();
			LCD.drawInt(values, 5, 5);
			if (values >= Color.WHITE) { //white
	/*			Motor.B.setSpeed(50);
				Motor.C.setSpeed(500);
				str = "white";
				LCD.drawString(str,5,7);
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
				Motor.B.setSpeed(400);
				Motor.C.setSpeed(400);*/
				str = "white";
				LCD.drawString(str,5,7);
				angle = angle - 15;
				Motor.A.rotate(angle);
			} else if (values <= Color.BLACK) { //black
	/*			Motor.C.setSpeed(50);
				Motor.B.setSpeed(500);
				str = "black";
				LCD.drawString(str,5,7);
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
				Motor.B.setSpeed(400);
				Motor.C.setSpeed(400);*/
				str = "black";
				LCD.drawString(str,5,7);
				angle = 0;
				Motor.B.rotate(angle);
				check = 0;
				try {
					Motor.C.setSpeed(200);
					Motor.B.setSpeed(200);
					Thread.sleep(1000);
					Motor.C.backward();
					Motor.B.backward();
				} catch (Exception e) {
				}
				Motor.C.setSpeed(2000);
				Motor.B.setSpeed(2000);
				Motor.C.backward();
				Motor.B.backward();
			} else { //glay
				Motor.B.stop();
				Motor.C.stop();
				str = "glay";
				LCD.drawString(str,5,7);
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
				}
				angle = 0;
				Motor.C.backward();
				Motor.B.backward();
				Motor.A.rotate(angle);
				check = 0;
			}

			if(Math.abs(angle) >= 80){
				angle = 0;
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
			}
		}
	}
}

=======
	
	try{
		Thread.sleep(4000);
		} catch(Exception e){
		}
		Motor.C.stop();
		Motor.B.stop();
		}
	}
>>>>>>> Stashed changes
