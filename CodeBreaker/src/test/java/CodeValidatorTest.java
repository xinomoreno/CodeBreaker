package test.java;

import main.java.CodeValidator;
import main.java.ValidationResult;

import org.junit.Test;

public class CodeValidatorTest {
	private CodeValidator validator = new CodeValidator("RAMV");
	
	@Test
	public final void testValidateTotalSuccess() {
		ValidationResult result = validator.validate("RAMV");
		assert(result.getRightColors()==4 && result.getRightColorsAtRightPlace()==4);
	}
	
	@Test
	public void testValidateTotalFail() {
		ValidationResult result = validator.validate("NINI");
		assert(result.getRightColors()==0 && result.getRightColorsAtRightPlace()==0);
	}
	
	@Test
	public void testValidateOneExactOnly() {
		ValidationResult result = validator.validate("RINI");
		assert(result.getRightColors()==0 && result.getRightColorsAtRightPlace()==1);
	}
	
	@Test
	public void testValidateOneRightColor() {
		ValidationResult result = validator.validate("IRNI");
		assert(result.getRightColors()==1 && result.getRightColorsAtRightPlace()==0);
	}
	
	@Test
	public void testValidateOneRightColorAndOneExact() {
		ValidationResult result = validator.validate("RRNI");
		assert(result.getRightColors()==1 && result.getRightColorsAtRightPlace()==1);
	}
	
}
