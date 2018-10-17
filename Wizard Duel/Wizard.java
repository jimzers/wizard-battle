import java.util.*;
import javax.swing.JOptionPane;
import java.lang.Math;
public class Wizard
{
    // instance variables - replace the example below with your own
    String name;
    double health;
    ArrayList<Spell> Spellbook;

    /**
     * Constructor for objects of class Wizard
     */
    public Wizard(String n)
    {
        // initialise instance variables
        name = n;
        health = 100.; 
        Spellbook = new ArrayList<Spell>();
    }
    // accessor and setter methods

    public String getName()
    {
        return name;
    }
    
    public void printSpells() {
        for (int i = 0; i < Spellbook.size(); i++) {
            System.out.println(Integer.toString(i+1) + ". " + (Spellbook.get(i)).getName() + " - " + Double.toString((Spellbook.get(i)).getLowDamage()) + "-" + Double.toString((Spellbook.get(i)).getHighDamage()));
        }
    }

    public ArrayList<Spell> getSpellbook() {
        return Spellbook;
    }
    
    public void addSpell(Spell someSpell)
    {
        Spellbook.add(someSpell);
    }

    public Double getHealth() 
    {
        return health;
    }
    
    public void damage(Spell someSpell)
    {
        // only run if the spell's running check returns true
        if (someSpell.getSpell_Running()) {
            Random r = new Random();
            double attack = someSpell.getAttackRating();
            // random chance calculation to see if attack hits
            if (attack >= ((r.nextInt(10) + 1) * 10)) {
                // checks if duration has exceeded past first turn, if not then it runs regular damage code
                if (someSpell.getDuration == someSpell.getTurns){
                    // calculating 1st turn damage
                    double randDmg = (someSpell.getDamageDifference() / 10) * (Math.random() * 10) + someSpell.getLowDamage();
                    double dmgcalc = randDmg;
                    JOptionPane.showMessageDialog(null, "Your attack " + someSpell.getName() + " was a success!!!" + "It did " + dmgcalc + " damage.");
                } else {
                    // calculating damping damage
                    double randDmg = (someSpell.getDamageDifference() / 10) * (Math.random() * 10) + someSpell.getLowDamage();
                    double damp_mod = Math.pow(someSpell.getDamping_factor(), (someSpell.getDuration() - someSpell.getTurns()));
                    double dmgcalc = randDmg * damp_mod;
                    health = health - dmgcalc;
                    JOptionPane.showMessageDialog(null, "Your attack " + someSpell.getName() + " had an aftereffect of " + dmgcalc + " damage.");
                }
            } else {
                // attack misses
                JOptionPane.showMessageDialog(null, "Your attack " + someSpell.getName()+ " missed!!!");
            }
            // decrement turn counter
            someSpell.setTurns(someSpell.getTurns()-1.0);
            // turn off spell if turn counter finishes decrementing
            if (someSpell.getTurns() == 0){
                someSpell.setRunningFalse();
            }
        }
    }
}
