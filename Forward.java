/* 
*Forward.java
*/

import lejos.nxt.Motor;

public class Forward{
	public static void main(String[] args) {
	Motor.C.setSpeed(720);
	Motor.B.setSpeed(720);

	Motor.C.backward();
	Motor.B.backward();
	
	try{
		Thread.sleep(6000);
	} catch(Exception e){
	}
	Motor.C.stop();
	Motor.B.stop();
	}
	}
