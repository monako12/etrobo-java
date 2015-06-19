import java.*;
import lejos.nxt.*;
public class ColorChecker {
    static int min_lightValue = 0;
    static int max_lightValue = 0;
    public int lightAverage;

    boolean Valuecheck = false;
    static LightSensor light = new LightSensor(SensorPort.S3);
    TouchSensor touch = new TouchSensor(SensorPort.S2);

    public int Extract() {
        int lightAverage;
        while (Valuecheck != true) {
            LCD.drawInt(min_lightValue, 0, 1);
            LCD.drawInt(max_lightValue, 0, 2);
            if (touch.isPressed() == true) {
                Valuecheck = true;

            }
        }

        lightAverage = (min_lightValue + max_lightValue) / 2;
        LCD.drawInt(lightAverage, 0, 3);
        return lightAverage;
    }
    public static void kuro(){
        max_lightValue = light.readNormalizedValue();

    }
public static void shiro(){

    min_lightValue = light.readNormalizedValue();
}
}
