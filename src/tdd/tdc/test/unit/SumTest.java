/**
 * Simple JUnit Test
 */

package tdd.tdc.test.unit;

import static org.junit.Assert.*;

import org.junit.Test;

import tdd.tdc.domain.Sum;

public class SumTest {
	
	@Test
	public void testMethod() {
		Sum s = new Sum();
		int z = s.sum(1, 2);
		assertEquals(2, z);
	}
}
