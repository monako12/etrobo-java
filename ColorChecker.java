public class ColorChecker {
    int min_lightValue = 0;
    int max_lightValue = 0;
    int lightAverage;
    boolean Valuecheck = false;

    LightSensor light = new LightSensor(SensorPort.S3);
    TouchSensor touch = new TouchSensor(SensorPort.S2);

    while(true != Valuecheck) {
        if (touch.isPressed()) {
            Valuecheck = true;
            min_lightValue = SensorPort.S3.readValue();
            try {
                Thread.sleep(4000);
            } catch (Exception e) {
            }
            max_lightValue = SensorPort.S3.readValue();
        }
    }
    lightAverage = (min_lightValue + max_lightValue)/2;
}