
public class CreditCardFactory {
	//Singleton
	
	
	// make this static
	public static CreditCard makeCreditCard(String cardNumber, String expirationDate, String holderName) {
		CreditCard creditCard = null;

		if (isValidCardNumber(cardNumber)) {
			if (isMasterCard(cardNumber)) {
				return new MasterCard();
			}
			if (isVisaCard(cardNumber)) {
				return new VisaCard();
			}
			if (isAmericanExpress(cardNumber)) {
				return new AmericanExpress();
			}
			if (isDiscoverCard(cardNumber)) {
				return new DiscoverCard();
			}
		}

		return creditCard;
	}

	private static boolean isDiscoverCard(String cardNumber) {
		// TODO Auto-generated method stub
		String firstFourDigits = cardNumber.substring(0, 4);
		
		if( (firstFourDigits.equals("6011") && cardNumber.length() == 16)) {
			return true;
		}
		return false;
	}

	private static boolean isAmericanExpress(String cardNumber) {
		// TODO Auto-generated method stub
		char firstDigit = cardNumber.charAt(0);
		char secondDigit = cardNumber.charAt(1);
		
		int cardNumberLength = cardNumber.length();
		
		if(  (firstDigit == '3') && ( (secondDigit == '4' || secondDigit == '7')) && cardNumberLength == 15 ) {
			return true;
		}
		
		return false;
	}

	private static boolean isVisaCard(String cardNumber) {
		// TODO Auto-generated method stub
		char firstDigit = cardNumber.charAt(0);
		int cardNumberLength = cardNumber.length();
		
		if( (firstDigit == '4') && ((cardNumberLength == 13) || (cardNumberLength == 16)) ) {
			return true;
		}
		return false;
	}

	private static boolean isMasterCard(String cardNumber) {
		// TODO Auto-generated method stub
		char firstDigit = cardNumber.charAt(0);
		int integerSecondDigit = Integer.valueOf(cardNumber.substring(1));

		if ((firstDigit == ('5') || firstDigit == ('2')) && (integerSecondDigit >= 1 && integerSecondDigit <= 5)
				&& (cardNumber.length() == 16)) {
			return true;
		}

		return false;
	}

	static boolean isValidCardNumber(String cardNUmber) {
		boolean isValid = false;

		if (isValidLength(cardNUmber)) {
			isValid = true;
		}

		return isValid;
	}

	static boolean isValidLength(String cardNumber) {
		boolean isValid = false;
		int VALID_NUMBER_LENGTH = 19;

		if (cardNumber.length() <= VALID_NUMBER_LENGTH) {
			isValid = true;
		}

		return isValid;
	}

}
