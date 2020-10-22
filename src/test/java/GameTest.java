import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest
{
    @Test
    public void FR01Test()
    {
        Controller gameController = new Controller();
        gameController.start();
        assertEquals("playState", gameController.getCurrentGame().getState());
    }

    @Test
    public void FR02Test()
    {
        Controller gameController = new Controller();
        gameController.start();
        gameController.pause();
        assertEquals("pauseState", gameController.getCurrentGame().getState());
    }

    @Test
    public void FR04Test()
    {
        Controller gameController = new Controller();
        gameController.start();
        gameController.stop();
        assertEquals(null, gameController.getCurrentGame());
        assertEquals(0, gameController.getMistakes());

    }
}