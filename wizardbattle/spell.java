
/**
 * Write a description of class spell here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class spell {
    // instance variables - replace the example below with your own
    public double low_damage = 0;
    public double high_damage = 0;
    public double success_rate = 1;
    double training_time = 1;
    double duration = 0;
    double damping_factor = 1;
    String type;
    String countertype;
    String description;

    // name, likelihood of success, damage, counter spell (opt), training time
    // duration, damping factor between 1 and 0

    /**
     * Constructor for objects of class spell
     */
    public spell(double low_dmg, double high_dmg, double suc, double train_time,
                 double durat, double damp) {
        // initialise instance variables
        low_damage = low_dmg;
        high_damage = high_dmg;
        success_rate = suc;
        training_time = train_time;
        duration = durat;
        damping_factor = damp;
        description = "this is a default spell"

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

    public double setLow_Damage(double dmg) {
        damage = dmg;
    }

    public double setSucc(double suc) {
        success_rate = suc;
    }

    public double setTrain(double train) {
        training_time = train;
    }

    public double setDuration(double dura) {
        duration = dura;
    }

    public double setDamp(double damp) {
        damping_factor = damp;
    }
    public class batter extends spell(7, 8, 99.9, 1,){

    }

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
