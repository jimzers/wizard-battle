import java.util.*;
import java.lang.Math;
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
    public String getName()
    {
        return name;
    }
    
    public Double getHealth() 
    {
        return health;
    }
    
    public void damage(Spell someSpell)
    {
        //print the roster summary for the team
        Random r = new Random();
        health = health - ((r.nextInt(10)+1) * ((someSpell.getHigh_damage() - someSpell.getLow_damage())/10) + someSpell.getLow_damage());
    }
}
