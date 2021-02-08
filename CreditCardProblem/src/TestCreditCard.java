import java.util.ArrayList;

public class TestCreditCard {
	
	ArrayList<String> badCards = new ArrayList<String>();
	ArrayList<String> goodCards = new ArrayList<String>();

	public static void main(String[] args) {
		String[] creditCardTestData = {
				"5100123412341234,07/22,John Doe",
				"601112341234123,09/23,Jane Doe",
				"378282246310005,09/23,AmericanExpress Guy",
				"5555555555554444,09/23,MasterCard Guy",
				"4111111111111111,09/23,Visa Guy"
		};
		
		for(int i = 0; i < creditCardTestData.length; i++) {
			
			String[] line = creditCardTestData[i].split(",");
			
			for(String string : line) {
				System.out.println(string);
			}
			
			if(CreditCardFactory.makeCreditCard(null, null, null) == null) {
				
			}
			
//			creditCardFactory.makeCreditCard(null, null, null);
//			System.out.println(creditCardTestData[i]);
		}
	}
	
	
	
	
}
