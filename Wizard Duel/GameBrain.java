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
    
    // constructor for class needing two wizard external parameters 
    public GameBrain(Wizard one, Wizard two)
    {
        // initialise instance variables
        one = one;
        two = two;
    }
    
    // this method uses if then conditions to determine whether the game is over and assigns a String value to winner 
    public boolean duel(Wizard one, Wizard two) {
        if (two.getHealth() <= 0.0 || one.getHealth() <= 0.0) {
            if (two.getHealth() <= 0.0) {
                winner = one.getName();
            } else {
                winner = two.getName();
            }
            return false; 
        } 
        return true; 
    }
    
    // this method returns the winner of the game 
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
