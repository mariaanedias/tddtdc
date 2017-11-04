package tdd.tdc.test.all;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import tdd.tdc.test.unit.ListTest;
import tdd.tdc.test.unit.PrivateTest;
import tdd.tdc.test.unit.SumTest;
import tdd.tdc.test.unit.TestException;

@RunWith(Suite.class)
@SuiteClasses({ SumTest.class, ListTest.class, TestException.class, PrivateTest.class })
public class AllUnitTests {

}
