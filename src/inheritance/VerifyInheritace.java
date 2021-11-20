package inheritance;

public class VerifyInheritace {

	public static void main(String[] args) {

		Analyst analyst = new Analyst("John Rambo", 55000, 35);
		System.out.println(analyst.getAnnualBonus());
		analyst.raiseSalary();
		System.out.println(analyst.getAnnualBonus());
		
				
		Salesperson salesperson =new Salesperson("Albert Cena", 48000, 31, 0.15);
		salesperson.raiseComission();
		salesperson.raiseSalary();
		System.out.println(salesperson.getComissionPercentage());
		
	}

}
