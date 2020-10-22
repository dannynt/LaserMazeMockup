public class StoppedState extends GameState
{
    public StoppedState(Game g)
    {
        g.setMistakes(0);
    }

    @Override
    public void runGame(Game g) {

    }

    @Override
    public String getState() {
        return "StoppedState";
    }
}
