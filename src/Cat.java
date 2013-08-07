
/**
 * Write a description of class Cat here.
 * 
* @author Asim Shahzad & Will Melbourne
 * @version (1.00)
 */
public class Cat extends Mammal
{
    // instance variables - replace the example below with your own
    private boolean hunts;

    /**
     * Constructor for objects of class Cat
     */
    public Cat(double weightInKg, String breed, boolean hunts)
    {
        // initialise instance variables
        super(weightInKg, breed);
        this.hunts = hunts;
    }

    /**
     *  returns a string with the parameters
     */
   public String toString()
    {
        String animalString = super.toString();
        String hunter;
        if (hunts){
            hunter = "This is a hunter!";
        }
        else {
            hunter = "This is one lazy cat!";
        }
        String fullString = hunter + "\n\r" + animalString;
        return fullString;
    }
}
    