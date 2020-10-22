public class Game
{
    private GameState state;
    private int mistakes;
    private double time;

    public Game() {}

    public GameState getState()
    {
        return state;
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
}
