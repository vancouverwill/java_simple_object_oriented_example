
/**
 * Write a description of class Dog here.
 * 
 * @author Asim Shahzad & Will Melbourne
 * @version (1.00)
 */
public class Dog extends Mammal
{
    // instance variables - replace the example below with your own
    private boolean likesToWalk;

    /**
     * Constructor for objects of class Dog
     */
    public Dog(double weightInKg, String breed, boolean likesToWalk)
    {
        // initialise instance variables
        super(weightInKg, breed);
        this.likesToWalk = likesToWalk;
    }

    /**
     *  returns a string with the parameters
     */
    public String toString()
    {
        String animalString = super.toString();
        String walker;
        if (likesToWalk){
            walker = "This dog likes to walk.";
        }
        else {
            walker = "This is a lazy dog!";
        }
        String fullString = animalString + "\n\r" + walker;
        return fullString;
    }
}
