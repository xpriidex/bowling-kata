/**
 * Created by Felipe on 4/26/2017.
 */
public class Game {
    private int total=0;
    public void roll(int i) {
        total=total+i;


    }

    public int score() {
        return total;
    }
}
