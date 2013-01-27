package main.java;

import java.util.Arrays;
import java.util.Scanner;

public class ConsoleInterface {

	public String askForCode() {
		System.out.println("Introduce el código:");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}

	public void printResult(ValidationResult result) {
		char [] substringRightColors = new char[result.getRightColors()];
		char [] substringRightColorsAtRightPlace = new char[result.getRightColorsAtRightPlace()];
		Arrays.fill(substringRightColorsAtRightPlace,'X');
		Arrays.fill(substringRightColors,'*');
		System.out.println(new String(substringRightColorsAtRightPlace) + new String(substringRightColors));
	}

}
