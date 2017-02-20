package test.data.analytics;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ArrayCompareTest.class, MyClassTest.class, MyTests.class, StringHelperTest.class,
		StringParameterizedTest.class })
public class AllTests {

}
