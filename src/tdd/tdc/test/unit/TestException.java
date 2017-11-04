/**
 * Test Expect Exception
 */
package tdd.tdc.test.unit;

import org.junit.Test;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;

import tdd.tdc.domain.GetTotal;
import tdd.tdc.domain.MyException;

public class TestException {

	@SuppressWarnings("unchecked")
	@Test(expected = MyException.class)
	public void testMyException() throws Exception {
		GetTotal gtMock = PowerMockito.mock(GetTotal.class);
		Mockito.when(gtMock.doSomething()).thenThrow(MyException.class);
		gtMock.doSomething();
	}
	
}
