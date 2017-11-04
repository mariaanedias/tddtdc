/**
 * Using doAnswer to mock set/get
 */

package tdd.tdc.test.integration;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import tdd.tdc.domain.Example;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ Example.class })
public class DoAnswerTest {

    private String theString;
	
	@Test
	public void doAnswerTest() {
		final Example ex = org.mockito.Mockito.mock(Example.class);
		
		
		doAnswer(new Answer<Object>() {
		    public Object answer(InvocationOnMock invocation) throws Throwable {
		    	theString = (String) invocation.getArguments()[0];
		        return null;
		    }
		}).when(ex).setString(anyString());

		 
		when(ex.getString()).thenAnswer(new Answer<String>() {
		    public String answer(InvocationOnMock invocation) throws Throwable {
		        return theString;
		    }
		});
		
		ex.setString("Test");
		assertEquals("Test", ex.getString());
		 
		ex.setString("Test1");
		assertEquals("Test1", ex.getString());
	}
}
