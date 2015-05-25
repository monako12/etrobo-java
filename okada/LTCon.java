import java.lang.*;
import lejos.nxt.*;
public class LTCon{
    public static void main(String[] args) {
	LCD.clear();
	LightSensor ls = new LightSensor(SensorPort.S3);
	TouchSensor ts = new TouchSensor(SensorPort.S2);
	int a = 0;
	boolean b = false;
    boolean c = false;
    boolean d = false;
	while(a < 3){
	    b = ts.isPressed();


	    if(b == true){
		if(a == 0){
		    try{
		    }catch(Exception e){}
		    LCD.drawInt(ls.readValue() ,0,1);
		    //		    ls.setLow(ls.readValue());
		    a++;
		    TouchSensor ts2 = new TouchSensor(SensorPort.S2);
		}if(a == 1 && c == true){
		    try{
			Thread.sleep(4000);
		    }catch(Exception e){}
		    LCD.drawInt(ls.readValue() ,0,2);
		    //  ls.setHigh(ls.readValue() );
		    a++;
                TouchSensor ts3 = new TouchSensor(SensorPort.S3);


		}if(a == 2 && c == true){
		    try{
		    Thread.sleep(2000);
		    }catch(Exception e){}
		    a++;
		    b = false;

		}
            c = ts2.isPressed();
            d = ts3.isPressed();
	}

	}
	try{
	    while(true){

		LCD.drawInt(ls.readValue() ,0,3);
		
	    }
	} catch(Exception e){
	}
    }
}

