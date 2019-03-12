public class WalkupTicket extends Ticket {

	private double ticketPrice;
	
	public WalkupTicket(int number) {
		// call Ticket constructor
		super(number);     
		ticketPrice = 50.0;
	}

	// override Ticket super class to calculate price
	@Override
	public double getPrice() {
		return getNumber() * ticketPrice;
	}

}