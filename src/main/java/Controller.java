import jdk.jshell.spi.ExecutionControl;

public class Controller
{
    private Game currentGame;

    public void start() {}
    public void stop() {}
    public void pause() {}
    public void makeMistake() {}
    public int getMistakes() { throw new RuntimeException("Not implemented"); }

    public Game getCurrentGame()
    {
        return currentGame;
    }
}
