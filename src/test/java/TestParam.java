import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@RunWith(Parameterized.class)
public class TestParam {

    @Parameterized.Parameters
    public  static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
            {1,2},
            {3,3},
            {4,5},
            {6,6}
        });
    }

    @Parameterized.Parameter
    public int actual;

    @Parameterized.Parameter(1)
    public int exception;


    @Test
    public void testDemo(){
//        int actual =10;
//        int exception =9;9
        assertThat("demo",actual,equalTo(exception));
    }

}
