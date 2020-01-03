package calculator;
import static org.junit.Assert.*;

import org.junit.Test;
public class TestCalculatoe {

	Calculatoe c;
	@Test
	public void CalculatoeTest1() {
		c = new Calculatoe();
		int actual = c.findMax(1, -2, 2);
		assertEquals(2, actual);
	}
	
	@Test
	public void CalculatoeTest2() {
		c = new Calculatoe();
		int actual = c.findMax(-5, 0, -10);
		assertEquals(0, actual);
	}
	
	@Test
	public void CalculatoeTest3() {
		c = new Calculatoe();
		int actual = c.findMax(15, 10, -20);
		assertEquals(10, actual);
	}
	
	@Test
	public void squareTest1() {
		c = new Calculatoe();
		int actual = c.square(2);
		assertEquals(4, actual);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void squareTest2() {
		c = new Calculatoe();
		c.square(-10);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void squareTest3() {
		c = new Calculatoe();
		c.square(10);
	}
	
	@Test
	public void cubeTest1() {
		c = new Calculatoe();
		int actual = c.mycube(3);
		assertEquals(27, actual);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void cubeTest2() {
		c = new Calculatoe();
		c.square(-10);
	}
	
	@Test
	public void cubeTest3() {
		c = new Calculatoe();
		int actual = c.mycube(4);
		assertEquals(64, actual);
	}

}
