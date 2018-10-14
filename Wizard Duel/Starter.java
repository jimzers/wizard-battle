import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.JOptionPane;

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
        double turn_no = 0;
        days = 10;
        Wizard playerone;
        Wizard playertwo;
        ArrayList<Spell> spells = new ArrayList<Spell>();
        ArrayList<Integer> track1 = new ArrayList<Integer>();
        ArrayList<Integer> track2 = new ArrayList<Integer>();
        spells.add(new Spell("Water Gun", 100, 20, 25, 5, 1, 1));
        spells.add(new Spell("Thunderbolt", 100, 20, 25, 5, 1, 1));
        spells.add(new Spell("Solar Beam", 100, 20, 25, 5, 1, 1));
        spells.add(new Spell("tiger mom", 25, 90, 100, 5, 1, 1));
        spells.add(new Spell("poison fart", 50, 15, 20, 2, 3, 0.5));
        for (int i = 0; i < spells.size(); i++) {
            System.out.println(Integer.toString(i+1) + ". " + (spells.get(i)).getName() + " - " + Double.toString((spells.get(i)).getTraining()
            ) + " days");
        }
        JOptionPane.showMessageDialog(null, "Look at Terminal Screen for spells and how many days it takes to learn each spell.");
        String firstwizard = JOptionPane.showInputDialog("Please enter the name for your first wizard.");
        playerone = new Wizard(firstwizard);
        JOptionPane.showMessageDialog(null, "Welcome " + firstwizard + "!");

        boolean selectphase = true;
        boolean spellexists = false;
        int number;
        while (selectphase) {
            // need to have while loop that checks to see if selected spell is under the allowed days
            while(true){
                number = Integer.parseInt(JOptionPane.showInputDialog("You have "
                        + Double.toString(days) + " days. Select what spell you want to learn by number.")) - 1;
                if(spells.get(number).getTraining() > days){
                    JOptionPane.showMessageDialog(null, "there's not enough time for spell "
                            + spells.get(number).getName() + "... too bad");
                } else {
                    break;
                }
            }

            days = days - (spells.get(number)).getTraining();
            // adds corresponding "main spellbook" index number to track1's integer array
            track1.add(number);
            spellexists = false;
            for (int k = 0; k < spells.size(); k++){
                if (spells.get(k).getTraining() <= days){
                    spellexists = true;
                    break;
                }
            }
            if (!spellexists){
                JOptionPane.showMessageDialog(null, "lmaO THERE ain't no spells left");
                break;
            }
            // iterate thru all the spells in spell list to see if they are under the today days left, if none match that condition it sets the phase to false
    }
        for (int i = 0; i < track1.size(); i++) {
            System.out.println((spells.get(track1.get(i))).getName());
            // here, we need to add some sort of cloning mechanism because it's gotta be a separate instance
            Spell clonedspell = (Spell) spells.get(track1.get(i)).clone();
            playerone.addSpell(clonedspell);
        }
        days = 10;
        String secondwizard = JOptionPane.showInputDialog("Please enter the name for your second wizard.");

        playertwo = new Wizard(secondwizard);
        JOptionPane.showMessageDialog(null, "Welcome " + secondwizard + "!");
        selectphase = true;
        spellexists = false;
        while (selectphase) {
            while(true){
                number = Integer.parseInt(JOptionPane.showInputDialog("You have "
                        + Double.toString(days) + " days. Select what spell you want to learn by number.")) - 1;
                if(spells.get(number).getTraining() > days){
                    JOptionPane.showMessageDialog(null, "there's not enough time for spell "
                            + spells.get(number).getName() + "... too bad");
                } else {
                    break;
                }
            }
            days = days - (spells.get(number)).getTraining();
            // adds corresponding "main spellbook" index number to track1's integer array
            track2.add(number);
            spellexists = false;
            for (int k = 0; k < spells.size(); k++){
                if (spells.get(k).getTraining() <= days){
                    spellexists = true;
                    break;
                }
            }
            if (!spellexists){
                JOptionPane.showMessageDialog(null, "lmaO THERE ain't no more time left");
                break;
            }
            // iterate thru all the spells in spell list to see if they are under the today days left, if none match that condition it sets the phase to false
        }
        for (int i = 0; i < track2.size(); i++) {
            System.out.println((spells.get(track2.get(i))).getName());
            // here, we need to add some sort of cloning mechanism because it's gotta be a separate instance
            Spell clonedspell = (Spell) spells.get(track2.get(i)).clone();
            playertwo.addSpell(clonedspell);
        }
        GameBrain gB = new GameBrain(playerone, playertwo);
        while (gB.duel(playerone, playertwo) == true) {
            // to damage enemy: pick a spell, that starts the spell running thing
            // do a for loop through all the players spells and run the spell damage function because it will
            // return nothing if spell_running = false
            // when you select a spell it just sets that spell_running to true
            System.out.print('\u000C');
            JOptionPane.showMessageDialog(null, firstwizard + " it is your turn.");
            System.out.println("Health: " + Double.toString(playerone.getHealth()));
            playerone.printSpells();


            int spell1 = Integer.parseInt(JOptionPane.showInputDialog("Look at terminal for your available spells and damage. Select spell by number for your turn.")) - 1;
            playerone.getSpellbook().get(spell1).setRunningTrue();
            for(int k = 0; k < playerone.getSpellbook().size(); k++){
                if(playerone.getSpellbook().get(k).getSpell_Running()){
                    playertwo.damage((playerone.getSpellbook()).get(k));
                }
            }

            System.out.print('\u000C');
            if (gB.duel(playerone, playertwo) == true) {
                JOptionPane.showMessageDialog(null, secondwizard + " it is your turn.");
                System.out.println("Health: " + Double.toString(playertwo.getHealth()));
                playertwo.printSpells();
                int spell2 = Integer.parseInt(JOptionPane.showInputDialog("Look at terminal for your available spells and damage. Select spell by number for your turn.")) - 1;
                playertwo.getSpellbook().get(spell2).setRunningTrue();
                for(int k = 0; k < playertwo.getSpellbook().size(); k++){
                    if(playertwo.getSpellbook().get(k).getSpell_Running()){
                        playerone.damage((playertwo.getSpellbook()).get(k));
                    }
                }
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
