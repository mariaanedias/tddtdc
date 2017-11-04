/**
 * INTEGRATION TEST
 * Mock Static
 */
package tdd.tdc.test.integration;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.powermock.api.mockito.PowerMockito.verifyStatic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import tdd.tdc.domain.GetTotal;
import tdd.tdc.domain.InfoFromAnotherSystem;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ InfoFromAnotherSystem.class })
public class TotalTest {

	@Test
	public void calculateTotal() {
		try {
			GetTotal gt = org.mockito.Mockito.mock(GetTotal.class);
			Mockito.when(gt.doGetTotals()).thenReturn(4);
			InfoFromAnotherSystem info = new InfoFromAnotherSystem(gt);
			int total = info.calculateTotal();

			Mockito.verify(gt, Mockito.times(1)).doGetTotals();
			assertEquals(total, 6);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	@Test
	public void calculateTotalStatic() {
		try {
			PowerMockito.mockStatic(InfoFromAnotherSystem.class);
			PowerMockito.when(InfoFromAnotherSystem.calculeSomethingStatic(10)).thenReturn(15);
			int total = InfoFromAnotherSystem.calculeSomethingStatic(10);
			assertEquals(total, 15);

			verifyStatic(times(1));
			InfoFromAnotherSystem.calculeSomethingStatic(10); // Tell to verifyStatic what to verify

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
