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
    double low_damage_rating;
    double high_damage_rating;
    public final double training_time;
    public final double duration;
    double damping_factor;
    double turns;
    boolean spell_running;
    // name, likelihood of success, damage, counter spell (opt), training time
    // duration, damping factor between 1 and 0

    /**
     * Constructor for objects of class spell
     */
    public Spell(String n, double a, double ld, double hd, double t, double du, double da) {
        name = n;
        attack_rating = a;
        low_damage_rating = ld;
        high_damage_rating = hd;
        training_time = t;
        duration = du;
        damping_factor = da;
        // default turn setting is duration setting, and spell_running check is false
        turns = this.duration;
        spell_running = false;
    }
    // accessor and setter methods

    public double getTurns() {
        return turns;
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
    
    public double getLowDamage() {
        return low_damage_rating; 
    }
    
    public double getHighDamage(){
        return high_damage_rating;
    }
    public double getDamping_factor(){
        return damping_factor;
    }
    public double getDuration(){
        return duration;
    }
    public double getDamageDifference(){
        return high_damage_rating - low_damage_rating;
    }
    public boolean getSpell_Running(){
        return spell_running;
    }

    public void setTurns(double turns) {
        this.turns = turns;
    }
    public void setRunningTrue(){
        // when spell set to true it's turn counter resets
        this.spell_running = true;
        this.turns = this.duration;
    }
    public void setRunningFalse() {
        this.spell_running = false;
    }
    // deep copy implementation so that each spell object has it's own unique turn counter
    @Override
    public Object clone() {
        try {
            return (Spell) super.clone();
        } catch (CloneNotSupportedException e) {
            return new Spell(this.name, this.attack_rating, this.low_damage_rating, this.high_damage_rating,
                    this.training_time, this.duration, this.damping_factor);
        }
    }



}
    
    