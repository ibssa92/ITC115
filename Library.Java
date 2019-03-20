public abstract class Library implements Printable {

	
	private int itemNumber;
	private String itemTitle;
	private String itemType;
	private boolean reserve;
	private boolean borrowStatus = false; // checkIn and checkOut
	
	
	//Constructor
	public Library(int itemNumber, String itemTitle) {
		this.itemNumber = itemNumber;
		this.itemTitle = itemTitle;
	}
	
	// implement toString
	public String toString() {
		return ("Item No: " + itemNumber + "\n Reserved: " + this.isReserve() + "\n Checked out: " + 
					this.isBorrowStatus() + "\n Item type: " + itemType + "\n Item Title: " + itemTitle);
	}
  
//check availability 
	public boolean isReserve() {
		return reserve;
	}

	public void setReserve(boolean reserve) {
		this.reserve = reserve;
	}

	//check in or check out
	public boolean isBorrowStatus() {
		return borrowStatus;
	}

	public void setBorrowStatus(boolean borrowStatus) {
		this.borrowStatus = borrowStatus;
	}
	
	//media type
	public void setMediaType(String mediaType) {
		this.type = mediaType;
	}
	
	
	
	
	
}
