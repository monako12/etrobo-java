import java.lang.*;
import lejos.nxt.*;
public class LTCon{
    public static void main(String[] args) {
	LCD.clear();
	LightSensor ls = new LightSensor(SensorPort.S3);
	TouchSensor ts = new TouchSensor(SensorPort.S2);
	int a = 0;
	boolean b = false;
	while(a < 3){
	    b = ts.isPressed();
	    if(b == true){
		if(a == 0){
		    try{
		    b = false;
		    }catch(Exception e){}
		    LCD.drawInt(ls.readValue() ,0,1);
		    //		    ls.setLow(ls.readValue());
		    a++;
		    b = false;
		}if(a == 1){ 
		    try{
			Thread.sleep(4000);
			b = false;
		    }catch(Exception e){}
		    LCD.drawInt(ls.readValue() ,0,2);
		    //  ls.setHigh(ls.readValue() );
		    a++;
		    b = false;

		}if(a == 2){
		    try{
		    Thread.sleep(2000);
		    }catch(Exception e){}
		    a++;
		    b = false;

		}
	    
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

