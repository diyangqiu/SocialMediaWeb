package appTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ DisplayUserListTest.class, LoginTest.class, RegisterTest.class })
public class AllTests {

}
