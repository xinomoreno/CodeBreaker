package test.java;

import main.java.CodeValidator;
import main.java.ValidationResult;

import org.junit.Assert;
import org.junit.Test;

public class CodeValidatorTest {
	private CodeValidator validator = new CodeValidator("RAMV");
	
	@Test
	public final void testValidateTotalSuccess() {
		ValidationResult result = validator.validate("RAMV");
		Assert.assertTrue(result.getRightColors()==0 && result.getRightColorsAtRightPlace()==4);
	}
	
	@Test
	public final void testValidateTotalFail() {
		ValidationResult result = validator.validate("NINI");
		Assert.assertTrue(result.getRightColors()==0 && result.getRightColorsAtRightPlace()==0);
	}
	
	@Test
	public final void testValidateOneExactOnly() {
		ValidationResult result = validator.validate("RINI");
		Assert.assertTrue(result.getRightColors()==0 && result.getRightColorsAtRightPlace()==1);
	}
	
	@Test
	public final void testValidateOneRightColor() {
		ValidationResult result = validator.validate("IRNI");
		Assert.assertTrue(result.getRightColors()==1 && result.getRightColorsAtRightPlace()==0);
	}
	
	@Test
	public final void testValidateOneRightColorAndOneExact() {
		ValidationResult result = validator.validate("RMNI");
		Assert.assertTrue(result.getRightColors()==1 && result.getRightColorsAtRightPlace()==1);
	}
	
}
