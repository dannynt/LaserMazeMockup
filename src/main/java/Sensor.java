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
        if(sh != null)sh.getController().makeMistake();
    }


    public int getId()
    {
        return id;
    }

    public void setSensorHandler(SensorHandler sh)
    {
        this.sh = sh;
    }
}
