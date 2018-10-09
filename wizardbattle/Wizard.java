import java.util.*;
public class Wizard
{
    // instance variables - replace the example below with your own
    String name;
    double health;
    ArrayList<Spell> spells;

    /**
     * Constructor for objects of class Wizard
     */
    public Wizard(String n)
    {
        // initialise instance variables
        name = n;
        health = 100.; 
        spells = new ArrayList<Spell>();
    }
    public void addSpell(Spell someSpell)
    {
        spells.add(someSpell);
    }
    
    public void printSpells()
    {
        //print the roster summary for the team
        System.out.println("Spells");
    }
}
