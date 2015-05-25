import java.*;
import lejos.nxt.*;

public class DriveMode { //how to run
    String states;
    public void Inline(){
        states = "inline";

        LCD.drawString(states,5,5);


    }
    public void Outline(){
        states = "outline";

        LCD.drawString(states,5,5);

    }
}
