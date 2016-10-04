import static org.junit.Assert.*;

import org.junit.Test;

public class RectangleTester {

	@Test
	public void testPerimeter() {
		Rectangle r = new Rectangle(2,3);
		assertTrue(r.perimeter() == 10); 
	}
	
	@Test
	public void testArea(){
		Rectangle r = new Rectangle(2,3);
		assertTrue(r.area() ==6);
	}
	
	@Test
	public void testSquare(){
		Rectangle r = new Rectangle(3,3);
		assertTrue(r.square());
	}
	
	@Test
	public void testCompare(){
		Rectangle r = new Rectangle (2,3);
		Rectangle h = new Rectangle (5,4);
		assertTrue(r.area() != h.area());
		Rectangle p = new Rectangle(4,5);
		Rectangle n = new Rectangle(10,2);
		assertTrue(p.area() == n.area());
	}

}
