package tdd.tdc.test.all;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import tdd.tdc.test.integration.DoAnswerTest;
import tdd.tdc.test.integration.MockxSpy;
import tdd.tdc.test.integration.TotalTest;

@RunWith(Suite.class)
@SuiteClasses({ TotalTest.class, MockxSpy.class, DoAnswerTest.class})
public class AllIntegrationTests {

}
