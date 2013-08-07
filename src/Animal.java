
/**
 * Write a description of class Animal here.
 * 
 * @author Asim Shahzad & Will Melbourne
 * @version (1.00)
 */
public class Animal
{
    // instance variables - replace the example below with your own
    private double weightInKg;
    private String breed;

    /**
     * Constructor for objects of class Animal
     */
    public Animal(double weightInKg, String breed)
    {
        // initialise instance variables
        this.weightInKg = weightInKg;
        this.breed = breed;
    }

    /**
     *  returns a string with the parameters
     */
    public String toString()
    {
        return "This is a " + this.breed + " this.weighing " + this.weightInKg + " kg.";
    }
}
