/**
 * Mock x Spy
 * How to Stub 
 */

package tdd.tdc.test.integration;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MockxSpy {
	
	    @Mock
	    private List<String> listMockTest;
	 
	    @Spy
	    private List<String> listSpyTest = new ArrayList();
	 
	    @Test
	    public void testMock() {
	        //Mock - deault - do nothing
	    	listMockTest.add("test");
	        assertNull(listMockTest.get(0));
	    }
	 
	    @Test
	    public void testSpy() {
	        //Calls real method
	    	listSpyTest.add("test");
	        assertEquals("test", listSpyTest.get(0));
	    }
	 
	    @Test
	    public void testMockStub() {
	        String expected = "Mock element 73";
	        //type-checking of the value that you're returning, at compile time
	        // but doesn't allow stubbing void methods
	        when(listMockTest.get(73)).thenReturn(expected);
	        //doReturn(expected).when(listMockTest).get(73);
	        assertEquals(expected, listMockTest.get(73));
	    }
	 
	    @Test
	    public void testSpyStub() {
	        String expected = "Spy element 73";
	        //Notice the difference in parameter ()
	        //you can always use doReturn/when for stubbing
	        //when can't be used because it calls real method and 73 gives IndexOutOfBoundsException
	        //when(listMockTest.get(73)).thenReturn(expected);
	        doReturn(expected).when(listSpyTest).get(73);
	        assertEquals(expected, listSpyTest.get(73));
	    }
	}
