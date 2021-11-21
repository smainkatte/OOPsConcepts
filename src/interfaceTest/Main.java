package interfaceTest;

public class Main {

	public static void main(String[] args) {

		PasswdChangeEvent passwdChangeEvent = new PasswdChangeEvent("324578");
		AccountTransferEvent accountTransferEvent = new AccountTransferEvent("984571");
		MissedPaymentEvent missedPaymentEvent = new MissedPaymentEvent("651240");
		
		Event [] events = {passwdChangeEvent, accountTransferEvent, missedPaymentEvent};		
		
		for (Event e : events) {
			System.out.println(e.getTimeStamp());
			e.process();
			System.out.println();
		}
	}

}
