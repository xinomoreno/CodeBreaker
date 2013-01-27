package main.java;

import java.util.Scanner;

public class ConsoleInterface {

	public String askForCode() {
		System.out.println("Introduce el código:");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}

	public void printResult(ValidationResult result) {
		// TODO Auto-generated method stub
		
	}

}
