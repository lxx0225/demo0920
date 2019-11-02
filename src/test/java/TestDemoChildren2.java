import org.junit.*;
import xunit.TestDemo;

import static org.junit.Assert.assertTrue;



public class TestDemoChildren2 extends TestDemo {
    @BeforeClass
    public static void  beforeAllTestCaseChildren2(){
        System.out.println("TestDemoChildren2 beforeAllTstCase");
    }
    @AfterClass
    public  static  void afterAllTestCaseChildren2(){
        System.out.println("TestDemoChildren2 afterAllTestCase");
    }
    @Before
    public  void beforeTestCaseChildren2(){
        System.out.println("TestDemoChildren2 i am @before");
    }
    @After
    public void afterTestCaseChildren2(){
        System.out.println("TestDemoChildren2 i am @after");
    }


    @Test
    public void testDemo3Children2(){
        System.out.println("TestDemoChildren2 testDemo3");
        assertTrue(false);
    }
    @Test
    public void testDemo1Children2(){
        System.out.println("TestDemoChildren2 testDemo1");
        assertTrue(true);

    }
    @Test
    public void testDemo2Children2(){
        System.out.println("TestDemoChildren2 testDemo2");
        assertTrue(false);
    }
}
