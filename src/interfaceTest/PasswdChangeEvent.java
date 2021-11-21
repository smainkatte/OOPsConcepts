package interfaceTest;

public class PasswdChangeEvent extends AbstractEvent{
	
	public PasswdChangeEvent(String id) {
		super(id); 
	}
	
	@Override
	public void process() {
		System.out.println("Customer " + id + " changed their password. " + "Sending a confirmation email to the customer.");
	}
	
}
