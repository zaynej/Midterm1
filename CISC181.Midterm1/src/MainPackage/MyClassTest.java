package MainPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyClassTest {
 
	@Test
	public void testReturnTrue() {
		assertTrue("ReturnTrue returns true!", MyClass.ReturnTrue());
	}

	@Test
	public void testAddTwoNumbers() {
		assertEquals(10,MyClass.AddTwoNumbers(5,5));
	}

}
