package calculator;
import static org.junit.Assert.*;

import org.junit.Test;

import pkgcalculator.calculator;

public class testcalculator {

	public static calculator objCalculator;


	public void setUp() throws Exception {
		objCalculator=new calculator();
	}

	public void tearDown() throws Exception {
		System.out.println("closing");
	}

	@Test
		public void additionTest() {
			assertEquals(22, objCalculator.addition(12,10));
		}
		public void substractionTest() {
			assertEquals(1,objCalculator.substraction(12, 11));
		}
		public void divisionTest() {
			assertEquals(0,objCalculator.division(12, 13));
		}
		public void multiplyTest() {
			assertEquals(156,objCalculator.multiplication(12, 13));
	}

}
