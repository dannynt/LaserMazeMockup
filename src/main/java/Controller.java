import jdk.jshell.spi.ExecutionControl;

public class Controller
{
    private Game currentGame;

    public void start()
    {
        if (currentGame == null) currentGame = new Game();
        currentGame.switchState(new PlayState());
    }

    public void stop()
    {
        if (currentGame == null) throw new RuntimeException("Game not initialized");
        if (!currentGame.getState().equals("playState")) throw new RuntimeException("Game not in play state");

        currentGame.switchState(new StoppedState(currentGame));
    }

    public void pause()
    {
        if (currentGame == null) throw new RuntimeException("Game not initialized");
        if (!currentGame.getState().equals("playState")) throw new RuntimeException("Game not in play state");

        currentGame.switchState(new PauseState());
    }

    public void makeMistake() {
        currentGame.addMistake();
    }

    public int getMistakes()
    {
        return currentGame.getMistakes();
    }

    public Game getCurrentGame()
    {
        return currentGame;
    }
}
