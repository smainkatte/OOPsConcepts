package contactDirectory;

public class Contact {

	private String name;
	private PhoneNumber phoneNumber;
	private String emailAddress;
	
	public Contact(String name, PhoneNumber phoneNumber, String emailAddress) {
		this.name = name;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
	}
	
	public Contact(String name, PhoneNumber phoneNumber) {
		this.name = name;		
		this.phoneNumber = phoneNumber;
	}
	
	public Contact(String name, String emailAddress) {
		this.name = name;
		this.emailAddress = emailAddress;		
	}
	
	@Override
	public String toString() {
		return "Contact{" + 
				"name='" + name + '\'' + 
				", phoneNumber=" + phoneNumber + 
				", emailAddress='" + emailAddress + '\'' + 
				'}';
	}
}
