package calendari;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SecondsCalculatorTest
{
	SecondsCalculator calc;
	
	@BeforeEach
	void setUp() throws Exception
	{
		// Creació de l'objecte calc per poder cridar-lo des dels mètodes de prova
		calc = new SecondsCalculator();
	}

	@Test
	void testDiesDelMes()
	{
		// Cas més fàcil: anys no multiples de 4. 
		assertEquals(calc.getDiesDelMes(1,2001), 31);
		assertEquals(calc.getDiesDelMes(2,2001), 28);
		assertEquals(calc.getDiesDelMes(3,2001), 31);
		assertEquals(calc.getDiesDelMes(4,2001), 30);
		assertEquals(calc.getDiesDelMes(5,2001), 31);
		assertEquals(calc.getDiesDelMes(6,2001), 30);
		assertEquals(calc.getDiesDelMes(7,2001), 31);
		assertEquals(calc.getDiesDelMes(8,2001), 31);
		assertEquals(calc.getDiesDelMes(9,2001), 30);
		assertEquals(calc.getDiesDelMes(10,2001), 31);
		assertEquals(calc.getDiesDelMes(11,2001), 30);
		assertEquals(calc.getDiesDelMes(12,2001), 31);
	}

}
