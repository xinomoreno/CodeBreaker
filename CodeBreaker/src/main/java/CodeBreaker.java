/**
 * 
 */
package main.java;

/**
 * @author Miquel
 *
 */
public class CodeBreaker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CodeGenerator generator = new CodeGenerator();
		CodeValidator validator = new CodeValidator(generator.generateTodaysCode());
		boolean result = false;
		ConsoleInterface ui = new ConsoleInterface();
		while (!result) {
			ValidationResult vr =validator.validate(ui.askForCode());
			result=vr.getRightColorsAtRightPlace()==4;
			ui.printResult(vr);
		}
	}

}
