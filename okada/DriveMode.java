import java.*;
import lejos.nxt.*;

public class DriveMode { //how to run
    String states;
    public void Inline(){
        states = "inline";
        LCD.drawString(states,5,5);
	try{
	    Thread.sleep(4000);
	}catch(Exception e){}
    }
    public void Outline(){
        states = "outline";
        LCD.drawString(states,5,5);
	try{
	    Thread.sleep(4000);
	}catch(Exception e){}
    }
}
