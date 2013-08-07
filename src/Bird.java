
/**
 * Write a description of class Bird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bird extends Animal implements EggLayer
{
    // instance variables - replace the example below with your own
      // instance variables - replace the example below with your own
    private String  eggColor;

  public Bird(double weightInKg, String breed, String  eggColor)
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
