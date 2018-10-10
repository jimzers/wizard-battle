/**
 * Write a description of class spell here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Spell {
    // instance variables - replace the example below with your own

    String name;
    double attack_rating;
    double damage_rating;
    double training_time;
    double duration;
    double damping_factor;
    // name, likelihood of success, damage, counter spell (opt), training time
    // duration, damping factor between 1 and 0

    /**
     * Constructor for objects of class spell
     */
    public Spell(String n, double a, double d, double t, double du, double da) {
        name = n;
        attack_rating = a;
        damage_rating = d;
        training_time = t;
        duration = du;
        damping_factor = da; 
    }
    
    public double getAttackRating() { 
        return attack_rating; 
    }
    
    public String getName() {
        return name;
    }
    
    public double getTraining() {
        return training_time;
    }
    
    public double getDamage() {
        return damage_rating; 
    }

   
}