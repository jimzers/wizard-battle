
/**
 * Write a description of class game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */ 
import javax.swing.JOptionPane;
public class game
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        System.out.println("wassup gang gang skeet skeet");
        String wizard_name = JOptionPane.showInputDialog("wass ur name foo");
        JOptionPane.showMessageDialog(null, "wassup " + wizard_name);
        boolean cont = true;
        while(cont) {
            String response = JOptionPane.showInputDialog("Press 'a' to add a player, " +
            "or press any key to quit."
            if(response.equals("a")){
                //lmao add a  player
            } else {
                cont = false;
            }
            
        }
        
    
    private int x;

    /**
     * Constructor for objects of class game
     */
    public game()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
