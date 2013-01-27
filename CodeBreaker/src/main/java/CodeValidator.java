package main.java;


public class CodeValidator {
	String validCode;

	public CodeValidator(String todaysCode) {
		this.validCode = todaysCode;
	}

	public ValidationResult validate(String attempt) {
		
		return new ValidationResult(validateRightColors(attempt),
				validateRightColorsAtRightPlace(attempt));
			
	}

	private int validateRightColors(String attempt) {
		StringBuilder sbAttempt= new StringBuilder(attempt);
		StringBuilder sbValidCode = new StringBuilder(validCode);
		
		discardExactMatches(sbAttempt, sbValidCode);		
		return countColorMatches(sbAttempt, sbValidCode);
	}

	private int countColorMatches( StringBuilder sbAttempt, StringBuilder sbValidCode) {
		int result =0;

		for (int i = 0; i < sbAttempt.length(); i++) {
			int position =sbValidCode.indexOf(sbAttempt.substring(i,i+1));
			if (position>=0) {
				sbValidCode.deleteCharAt(position);
				result++;
			}
		}
		return result;
	}

	private void discardExactMatches(StringBuilder attempt, StringBuilder validCode) {
		int i=0;
		while (i < attempt.length()) {
			if (attempt.charAt(i)==validCode.charAt(i)) {
				attempt.deleteCharAt(i);
				validCode.deleteCharAt(i);
			} else {
				i++;
			}
		}
	}

	private int validateRightColorsAtRightPlace(String attempt) {
		int rightColorsAtRightPlace=0;
		for (int i=0; i < validCode.length(); i++) {
			if (attempt.charAt(i)==validCode.charAt(i)) {
				rightColorsAtRightPlace++;
			}	
		}
		return rightColorsAtRightPlace;
	}

}
