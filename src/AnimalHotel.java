import java.util.List;
import java.lang.String;


//import java.util.ArrayList;
import java.util.ArrayList;



/**
 * Write a description of class AnimalHotel here.
 * 
* @author Asim Shahzad & Will Melbourne
 * @version (1.00)
 */
public class AnimalHotel
{
    // instance variables - replace the example below with your own
    private ArrayList<Animal> guests; // a container for thing objects
    private String name;

    /**
     * Constructor for objects of class AnimalHotel
     */
    public AnimalHotel()
    {
        // initialise instance variables
        guests = new ArrayList<Animal>();
        
        
    }

    /** 
     * Add guest to the hotel. 
     */
    public void acceptNewGuest(Animal theAnimal)
    {
        guests.add(theAnimal);
    }
    
    /**
     *  Print out guest information
     */
    public void printGuestInformation()
    {
        for (Animal animal : guests) {
           System.out.println (animal);  
        }
    }
    
    public void printEggInformation() 
    {
        for (Animal animal : guests) {
            if (animal instanceof EggLayer){
                System.out.println ("an egg layer");
                System.out.println(animal);
            }
        }
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
