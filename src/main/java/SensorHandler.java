import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SensorHandler
{
    private Controller controller;
    private List<Sensor> sensors;

    public SensorHandler(Controller controller)
    {
        this.controller = controller;
        sensors = new ArrayList<Sensor>();
    }

    public void addSensor(Sensor sensor)
    {
        sensor.setSensorHandler(this);
        sensors.add(sensor);
    }

    public void removeSensor(Sensor sensor)
    {
    }

    public Controller getController()
    {
        return controller;
    }
}