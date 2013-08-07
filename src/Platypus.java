
/**
 * Write a description of class Platypus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Platypus extends Mammal implements EggLayer
{
    // instance variables - replace the example below with your own
    private String  eggColor;

  public Platypus(double weightInKg, String breed, String  eggColor)
    {
        // initialise instance variables
        super(weightInKg, breed);
        this.eggColor = eggColor;
    }
    
    public String getEggColour(){
        return this.eggColor;
    }
    
    /**
     *  returns a string with the parameters
     */
   public String toString()
    {
        String animalString = super.toString();
        String fullString = "i have eggs of color " + getEggColour() + "\n\r" + animalString;
        return fullString;
    }
}
