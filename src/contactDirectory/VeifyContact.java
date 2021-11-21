package contactDirectory;

public class VeifyContact {

	public static void main(String[] args) {
		
		Contact contactOne = new Contact("Robert", new PhoneNumber("3256478521"));
		Contact contactTwo = new Contact("Albert", new PhoneNumber(91, "4588210214"));
		Contact contactThree = new Contact("Roger Homes", new PhoneNumber("984574102354"));
		Contact contactFour = new Contact("Daizy Jones", "daizy_jones@test.lcl");
		Contact contactFive = new Contact("Sarah Hamp", new PhoneNumber("3256478521"), "sarah_h@test.lcl");
		
		System.out.println(contactOne);
		System.out.println(contactTwo);
		System.out.println(contactThree);
		System.out.println(contactFour);
		System.out.println(contactFive);
	}
}
