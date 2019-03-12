public class TicketMain {

	public static void main(String[] args) {

		// create array of tickets
		Ticket[] tickets = new Ticket[2];
		tickets[0] = new WalkupTicket(6);
		tickets[1] = new WalkupTicket(2);

		
		// print ticket info
		for (int i = 0; i < tickets.length; i++) {
			System.out.println(tickets[i].toString());
			System.out.println();
		}
		
	}

}