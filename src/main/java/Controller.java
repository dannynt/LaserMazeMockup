import jdk.jshell.spi.ExecutionControl;

public class Controller
{
    private Game currentGame;

    public void start()
    {
        if (currentGame == null) currentGame = new Game();
        currentGame.switchState(new PlayState());
    }

    public void stop() {}
    public void pause() {}
    public void makeMistake() {}
    public int getMistakes() { throw new RuntimeException("Not implemented"); }

    public Game getCurrentGame()
    {
        return currentGame;
    }
}
