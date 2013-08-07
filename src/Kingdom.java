
public class Kingdom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalHotel hotel = new AnimalHotel();
		
		Dog charlie = new Dog(20, "alsatian", true);
		
		
		Cat adelaide = new Cat(10, "tabby cat", true);
		
		hotel.acceptNewGuest(charlie);
		hotel.acceptNewGuest(adelaide);
		
		hotel.printGuestInformation();
	}

}
