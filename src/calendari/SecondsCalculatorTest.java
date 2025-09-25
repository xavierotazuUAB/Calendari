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

	@Test
	void testIsAnyTraspas()
	{
		// Casos més simples, basats simplement en si el mes és múltiple de 4 o no
		assertTrue(calc.getIsAnyTraspas(1980));
		assertFalse(calc.getIsAnyTraspas(1981));
		assertFalse(calc.getIsAnyTraspas(1982));
		assertFalse(calc.getIsAnyTraspas(1983));
		assertTrue(calc.getIsAnyTraspas(1984));

		// Multiples de 100, però no de 400
		assertFalse(calc.getIsAnyTraspas(1900));
		assertFalse(calc.getIsAnyTraspas(2100));
		assertFalse(calc.getIsAnyTraspas(2200));

		// Multiples de 400
		assertTrue(calc.getIsAnyTraspas(1600));
		assertTrue(calc.getIsAnyTraspas(2000));
		assertTrue(calc.getIsAnyTraspas(2400));
	}
}
