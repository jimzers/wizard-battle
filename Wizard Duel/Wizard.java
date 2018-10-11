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
            System.out.println(Integer.toString(i+1) + ". " + (Spellbook.get(i)).getName() + " - " + Double.toString((Spellbook.get(i)).getDamage()));
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
        Random r = new Random();
        double attack = someSpell.getAttackRating();
        if (attack >= ((r.nextInt(10)+1) * 10)) {
            JOptionPane.showMessageDialog(null, "Your attack was a success!!!");
            health = health - someSpell.getDamage();
        } else {
            JOptionPane.showMessageDialog(null, "Your attack missed!!!");
        }
    }
}
