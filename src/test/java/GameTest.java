import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Felipe on 4/26/2017.
 */
public class GameTest {
    @Test
    public void roll3AndRoll5Return8(){
        //Arrange
        Game game = new Game();
        int result;
        //Act
        game.roll(3);
        game.roll(5);
        result=game.score();
        //Assert
        assertEquals(8,result);
    }

}