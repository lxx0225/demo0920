import org.junit.*;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertTrue;



public class TestDemoChildren extends TestDemo {
    @BeforeClass
    public static void  beforeAllTestCaseChildren(){
        System.out.println("TestDemoChildren beforeAllTstCase");
    }
    @AfterClass
    public  static  void afterAllTestCaseChildren(){
        System.out.println("TestDemoChildren afterAllTestCase");
    }
    @Before
    public  void beforeTestCaseChildren(){
        System.out.println("TestDemoChildren i am @before");
    }
    @After
    public void afterTestCaseChildren(){
        System.out.println("TestDemoChildren i am @after");
    }


    @Test
    public void testDemo3Children(){
        System.out.println("TestDemoChildren testDemo3");
        assertTrue(false);
    }
    @Test
    public void testDemo1Children(){
        System.out.println("TestDemoChildren testDemo1");
        assertTrue(true);

    }
    @Test
    public void testDemo2Children(){
        System.out.println("TestDemoChildren testDemo2");
        assertTrue(false);
    }
}
