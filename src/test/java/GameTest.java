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
}