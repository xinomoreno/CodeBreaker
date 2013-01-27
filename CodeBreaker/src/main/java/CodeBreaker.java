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
			ui.printResult(validator.validate(ui.askForCode()));
		}
	}

}
