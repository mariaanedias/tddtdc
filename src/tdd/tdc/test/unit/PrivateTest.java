/**
 * Mock Private Method
 */
package tdd.tdc.test.unit;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import tdd.tdc.domain.GetTotal;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ GetTotal.class })
public class PrivateTest {

	private GetTotal gtCurrent;
	
	@Before
    public void setUp() {
		gtCurrent = PowerMockito.spy(new GetTotal());
    }
	 
	@Test
	public void testPrivate() throws Exception {
		int sum = 18;
		
        PowerMockito.doReturn(sum)
            .when(gtCurrent, "getTotal", anyInt(), anyInt());
 
        int x = gtCurrent.doSomething();
 
        assertEquals(x, 18);
	}
}
