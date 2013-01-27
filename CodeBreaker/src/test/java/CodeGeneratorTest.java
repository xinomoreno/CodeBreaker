/**
 * 
 */
package test.java;

import static org.junit.Assert.*;

import main.java.CodeGenerator;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Miquel
 *
 */
public class CodeGeneratorTest {
	private String code =new CodeGenerator().generateTodaysCode();

	@Test
	public void testNotNull() {
		assertTrue("El codigo generado es nulo", code!=null);
	}
	
	@Test
	public void testOnlyRAMVNI() {
		char[] CodeAsArray = code.toCharArray();
		for (char c : CodeAsArray) {
			assertTrue("El codigo generado contiene caracteres no válidos", 
					c=='R' || c=='A' || c=='M' || c=='V' || c=='N' || c=='I');	
		}	
	}
	
	@Test
	public void testlength() {
		assertTrue("Longitud del código incorrecta, debería ser 4, pero es " + code.length(),code.length()==4);
	}

}
