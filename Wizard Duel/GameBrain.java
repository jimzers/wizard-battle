import java.util.ArrayList;

public class GameBrain
{
    // instance variables - replace the example below with your own
    String winner;
    Wizard one;
    Wizard two;
    /**
     * Constructor for objects of class GameBrain
     */
    public GameBrain(Wizard one, Wizard two)
    {
        // initialise instance variables
        one = one;
        two = two;
    }
    
    public boolean duel(Wizard one, Wizard two) {
        if (two.getHealth() <= 0.0 || one.getHealth() <= 0.0) {
            if (two.getHealth() == 0.0) {
                winner = one.getName();
            } else {
                winner = two.getName();
            }
            return false; 
        } 
        return true; 
    }
    
    public String getWinner() {
        return winner; 
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */

}
