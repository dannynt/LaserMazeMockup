public class Sensor
{
    private int id;
    private SensorHandler sh;

    public Sensor(int id)
    {
        this.id = id;
    }

    public void interrupt()
    {
    }


    public int getId()
    {
        return id;
    }
}
