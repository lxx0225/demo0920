import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                TestDemoChildren2.class,
                TestDemo.class,
                TestDemoChildren.class
        }
)
public class TestSuit {

}
