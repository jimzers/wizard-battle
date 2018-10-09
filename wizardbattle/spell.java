
/**
 * Write a description of class spell here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Spell {
    // instance variables - replace the example below with your own

    double low_damage = 0;
    double high_damage = 0;
    double success_rate = 1;
    double training_time = 1;
    double duration = 0;
    double damping_factor = 1;
    double length = 1;
    String name;
    String type;
    String countertype;
    String description;

    // name, likelihood of success, damage, counter spell (opt), training time
    // duration, damping factor between 1 and 0

    /**
     * Constructor for objects of class spell
     */
    public Spell(double low_dmg, double high_dmg, double suc, double train_time,
                 double durat, double damp, double length, String name, String type, String countertype, String description) {
        // initialise instance variables
        low_damage = low_dmg;
        high_damage = high_dmg;
        success_rate = suc;
        training_time = train_time;
        duration = durat;
        damping_factor = damp;
        name = "default";
        description = "this is a default spell";
        type = "Normal";
        countertype = "Christianity";

    }

    public double getLow_damage() {
        return low_damage;
    }
    public double getHigh_damage() {
        return high_damage;
    }

    public double getSuccess_rate() {
        return success_rate;
    }

    public double getTraining_time() {
        return training_time;
    }

    public double getDuration() {
        return duration;
    }

    public double getDamping_factor() {
        return damping_factor;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public String getType() {
        return type;
    }

    public String getCountertype(){
        return countertype;
    }

    public void setLow_Damage(double low_dmg) {
        low_damage = low_dmg;
    }

    public void setHigh_Damage(double high_dmg) {
        high_damage = high_dmg;
    }

    public void setSuccess_rate(double suc) {
        success_rate = suc;
    }

    public void setTraining_time(double train) {
        training_time = train;
    }

    public void setDuration(double dura) {
        duration = dura;
    }

    public void setDamping_factor(double damp) {
        damping_factor = damp;
    }

    public void setName(String nme){
        name = nme;
    }

    public void setDescription(String descr){
        description = descr;
    }

    public void setType(String tpe){
        type = tpe;
    }

    public void setCountertype(String countertpe){
        countertype = countertpe;
    }



/*
    public class batter extends spell(7, 8, 99, 1, 1, 1.){

    }
*/
    /**
     * An example of a method - replace this comment with your own
     *
     * @param y a sample parameter for a method
     * @return the sum of x and y
     */
    public int sampleMethod(int y) {
        // put your code here
        return x + y;
    }
}
