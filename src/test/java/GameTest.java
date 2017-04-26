import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Felipe on 4/26/2017.
 */
public class GameTest {
    Game game;
    int result;
    @Before
    public void setUp() throws Exception {
        //Arrange
        game = new Game();

    }

    @Test
    public void roll3AndRoll5Return8(){

        //Act
        game.roll(3);
        game.roll(5);
        result=game.score();
        //Assert
        assertEquals(8,result);
    }
    @Test()
    public void roll7AndRoll2Return17(){
        //Act
        game.roll(3);
        game.roll(5);
        game.roll(7);
        game.roll(2);
        result=game.score();
        //Assert
        assertEquals(17,result);

    }
    @Test()
    public void roll0AndRoll0Return17(){
        //Act
        game.roll(3);
        game.roll(5);
        game.roll(7);
        game.roll(2);
        game.roll(0);
        game.roll(0);

        result=game.score();
        //Assert
        assertEquals(17,result);

    }
    @Test()
    public void roll3AndRoll4Return24(){
        //Act
        game.roll(3);
        game.roll(5);
        game.roll(7);
        game.roll(2);
        game.roll(0);
        game.roll(0);
        game.roll(3);
        game.roll(4);

        result=game.score();
        //Assert
        assertEquals(24,result);

    }


}