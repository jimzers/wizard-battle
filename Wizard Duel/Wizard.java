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
        if (someSpell.getSpell_Running()) {
            Random r = new Random();
            double attack = someSpell.getAttackRating();
            if (attack >= ((r.nextInt(10) + 1) * 10)) {
                JOptionPane.showMessageDialog(null, "Your attack " + someSpell.getName() + " was a success!!!");
                double randDmg = (someSpell.getDamageDifference() / 10) * (Math.random() * 10);
                double damp_mod = Math.pow(someSpell.getDamping_factor(), (someSpell.getDuration() - someSpell.getTurns()));
                double dmgcalc = randDmg * damp_mod;
                health = health - dmgcalc;
            } else {
                JOptionPane.showMessageDialog(null, "Your attack " + someSpell.getName()+ " missed!!!");
            }
            someSpell.setTurns(someSpell.getTurns()-1.0);
            if (someSpell.getTurns() == 0){
                someSpell.setRunningFalse();
            }
        }
    }
}