import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Starter
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Starter
     */
    public static void main(String[] args)
    {
        // initialise instance variables
        double days;
        days = 10;
        Wizard playerone;
        Wizard playertwo;
        ArrayList<Spell> spells = new ArrayList<Spell>();
        ArrayList<Integer> track1 = new ArrayList<Integer>();
        ArrayList<Integer> track2 = new ArrayList<Integer>();
        spells.add(new Spell("Water Gun", 100, 20, 5, 0, 0));
        spells.add(new Spell("Thunderbolt", 100, 20, 5, 0, 0));
        spells.add(new Spell("Solar Beam", 100, 20, 5, 0, 0));
        spells.add(new Spell("Tackle", 50, 90, 5, 0, 0));
        for (int i = 0; i < spells.size(); i++) {
            System.out.println(Integer.toString(i+1) + ". " + (spells.get(i)).getName() + " - " + Double.toString((spells.get(i)).getTraining()
            ) + " days");
        }
        JOptionPane.showMessageDialog(null, "Look at Terminal Screen for spells and how many days it takes to learn each spell.");
        String firstwizard = JOptionPane.showInputDialog("Please enter the name for your first wizard.");
        playerone = new Wizard(firstwizard);
        JOptionPane.showMessageDialog(null, "Welcome " + firstwizard + "!");
        while (days != 0.0) {
            int number = Integer.parseInt(JOptionPane.showInputDialog("You have " + Double.toString(days) + " days. Select what spell you want to learn by number.")) - 1;
            days = days - (spells.get(number)).getTraining();
            track1.add(number);
        }
        for (int i = 0; i < track1.size(); i++) {
            System.out.println((spells.get(track1.get(i))).getName());
            playerone.addSpell(spells.get(track1.get(i)));
        }
        days = 10;
        String secondwizard = JOptionPane.showInputDialog("Please enter the name for your second wizard.");
        playertwo = new Wizard(secondwizard);
        JOptionPane.showMessageDialog(null, "Welcome " + secondwizard + "!");
        while (days != 0.0) {
            int number = Integer.parseInt(JOptionPane.showInputDialog("You have " + Double.toString(days) + " days. Select what spell you want to learn by number.")) - 1;
            days = days - (spells.get(number)).getTraining();
            track2.add(number);
        }
        for (int i = 0; i < track2.size(); i++) {
            System.out.println((spells.get(track2.get(i))).getName());
            playertwo.addSpell(spells.get(track2.get(i)));
        }
        GameBrain gB = new GameBrain(playerone, playertwo);
        while (gB.duel(playerone, playertwo) == true) {
            System.out.print('\u000C');
            JOptionPane.showMessageDialog(null, firstwizard + " it is your turn.");
            System.out.println("Health: " + Double.toString(playerone.getHealth()));
            playerone.printSpells();
            int spell1 = Integer.parseInt(JOptionPane.showInputDialog("Look at terminal for your available spells and damage. Select spell by number for your turn.")) - 1;
            playertwo.damage((playerone.getSpellbook()).get(spell1));
            System.out.print('\u000C');
            if (gB.duel(playerone, playertwo) == true) {
                JOptionPane.showMessageDialog(null, secondwizard + " it is your turn.");
                System.out.println("Health: " + Double.toString(playertwo.getHealth()));
                playertwo.printSpells();
                int spell2 = Integer.parseInt(JOptionPane.showInputDialog("Look at terminal for your available spells and damage. Select spell by number for your turn.")) - 1;
                playerone.damage((playertwo.getSpellbook()).get(spell2));
            }
        }
        System.out.println("Game Over!!!! " + gB.getWinner() + " won!!!"); 
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */

}
