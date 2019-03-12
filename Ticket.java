import java.text.NumberFormat;

public abstract class Ticket {
	
	private int number;
	
	public Ticket(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}

	public abstract double getPrice();
	
	
	public String formatPrice() {
        String formattedPrice = NumberFormat.getCurrencyInstance().format(this.getPrice());
        return formattedPrice;
	}
	
	 // override Object class
	@Override    
	public String toString() {
		return ("Number of Tickets: " + number + ". Total Price: " + formatPrice());
	}

}