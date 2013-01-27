package main.java;

import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

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
		int result=0;
		char [] array1= attempt.toCharArray();
		char [] array2= validCode.toCharArray();
		
		discardExactMatches(array1, array2);		
		return countColorMatches(result, array1, array2);
	}

	private int countColorMatches(int result, char[] array1, char[] array2) {
		Arrays.sort(array1);
		Arrays.sort(array2);
		for (int i = 0; i < array1.length; i++) {
			int position =Arrays.binarySearch(array2, array1[i]);
			if (position>=0) {
				ArrayUtils.remove(array2, position);
				result++;
			}
		}
		return result;
	}

	private void discardExactMatches(char[] array1, char[] array2) {
		int i=0;
		while (i < array1.length) {
			if (array1[i]==array2[i]) {
				ArrayUtils.remove(array1, i);
				ArrayUtils.remove(array2, i);
			}
			i++;
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
