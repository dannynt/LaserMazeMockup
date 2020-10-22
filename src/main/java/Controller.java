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

    public void pause()
    {
        if (currentGame == null) throw new RuntimeException("Game not initialized");
        if (!currentGame.getState().equals("playState")) throw new RuntimeException("Game not in play state");

        currentGame.switchState(new PauseState());
    }

    public void makeMistake() {}
    public int getMistakes() { throw new RuntimeException("Not implemented"); }

    public Game getCurrentGame()
    {
        return currentGame;
    }
}
