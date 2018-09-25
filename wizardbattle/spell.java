
/**
 * Write a description of class spell here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class spell
{
    // instance variables - replace the example below with your own
    public double damage = 0;
    public double success_rate = 1;                                                                                            
    double training_time = 1;
    double duration = 0;
    double damping_factor = 1;
    String type;
    String countertype;
    
    // name, likelihood of success, damage, counter spell (opt), training time
    // duration, damping factor between 1 and 0

    /**
     * Constructor for objects of class spell
     */
    public spell(double dmg, double suc, double train_time,  
    double durat, double damp)
    {
        // initialise instance variables
        damage = dmg;
        success_rate = suc;
        training_time = train_time;
        duration = durat;
        damping_factor = damp;
    }

    public double getDamage() {
        return damage;
    }
    public double getSucc(){
        return success_rate;
    }
    public double getTrain()
    {
        return train_time;
    }

    public double getDuration() {
        return duration;
    }
    public double getDamp(){
        return damping_factor;
    }
    public double setDamage(double dmg){
        damage = dmg;
    }
    public double setSucc(double suc){
        success_rate = suc;
    }
    public double setTrain(double train){
        training_time = train;
    }
    public double setDuration(double dura){
        duration = dura;
    }
    public double setDamp(double damp){
        damping_factor = damp;
    }


    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
