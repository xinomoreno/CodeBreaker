package main.java;

import java.util.Random;


public class CodeGenerator {
	public String generateTodaysCode() {
		Random randomGenerator = new Random();
		StringBuilder stringBuilder = new StringBuilder();
		for (int i=0; i<4; i++) {
			int colorIndex = randomGenerator.nextInt(6);
			stringBuilder.append(Color.values()[colorIndex].getInicial());
		}
		return stringBuilder.toString();
	}
}
