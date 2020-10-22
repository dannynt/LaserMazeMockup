public class Game
{
    private GameState state;
    private int mistakes;
    private double time;

    public Game()
    {
    }

    public String getState()
    {
        return state.getState();
    }

    public void setState(GameState state)
    {
        this.state = state;
    }

    public int getMistakes()
    {
        return mistakes;
    }

    public void setMistakes(int mistakes)
    {
        this.mistakes = mistakes;
    }

    public double getTime()
    {
        return time;
    }

    public void setTime(double time)
    {
        this.time = time;
    }

    public void switchState(GameState newState)
    {
        this.state = newState;
    }
}
