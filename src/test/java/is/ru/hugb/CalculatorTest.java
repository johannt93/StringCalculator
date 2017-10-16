package is.ru.hugb;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void emptyNumber() {
		Calculator calc = new Calculator();
		assertEquals(0, calc.add(""));
	}
	
	@Test
	public void oneNumber() {
		Calculator calc = new Calculator();
		assertEquals(10, calc.add("10"));
	}
	
	@Test
	public void twoNumbers() {
		Calculator calc = new Calculator();
		assertEquals(40, calc.add("10,30"));
	}
}