import java.*;
import lejos.nxt.*;
public class ColorChecker {
    int min_lightValue = 0;
    int max_lightValue = 0;
    public int lightAverage;
    boolean Valuecheck = false;

    LightSensor light = new LightSensor(SensorPort.S3);
    TouchSensor touch = new TouchSensor(SensorPort.S2);

    public int Extract() {
        int lightAverage;
        while (Valuecheck != true) {
            if (touch.isPressed() == true) {
                Valuecheck = true;
                min_lightValue = light.readNormalizedValue();
                //LCD.drawInt(min_lightValue,0,1);
                try {
                    Thread.sleep(4000);
                } catch (Exception e) {
                }
                max_lightValue = light.readNormalizedValue();
                //LCD.drawInt(max_lightValue,0,2);
            }
        }
        lightAverage = (min_lightValue + max_lightValue) / 2;
        LCD.drawInt(lightAverage, 0, 1);
        return lightAverage;
    }
}
