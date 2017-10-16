package is.ru.hugb;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void emptyNumber() {
		Calculator calc = new Calculator();
		assertEquals(0, calc.add(""));
	}
}