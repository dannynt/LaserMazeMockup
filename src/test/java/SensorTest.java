import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SensorTest
{
    @Test
    public void FR07Test()
    {
        Controller controller = new Controller();
        SensorHandler handler = new SensorHandler(controller);
        controller.start();

        Sensor sensor = new Sensor(1);
        handler.addSensor(sensor);
        Sensor sensor2 = new Sensor(2);//Pseudo sensor that is not in the game..

        sensor.interrupt();
        sensor2.interrupt();
        Assert.assertEquals(controller.getMistakes(), 1);
    }

}