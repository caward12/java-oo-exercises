import static org.junit.Assert.*;

import org.junit.Test;

public class fractionTest {

	@Test
	public void addTest() {
		Fraction f = new Fraction (1, 5);
		Fraction h = new Fraction(2,4);
		Fraction m = f.add(h);
		assertTrue(m.getNum() == 14);
		assertTrue(m.getDen() == 20);
	}
	
	@Test
	public void multiplyTest(){
		Fraction a = new Fraction (2, 3);
		Fraction b = new Fraction (4, 5);
		Fraction c = a.multiply(b);
		assertTrue(c.getNum() == 8);
		assertTrue(c.getDen() == 15);
	}

}
