import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.*;

public class TestGroups {
    @Category({SlowGroups.class,FastGruops.class})
    @Test
    public void testDemo1(){
        assertTrue(false);
    }

    @Category(SlowGroups.class)
    @Test
    public void testDemo2(){
        //assertEquals("diff two numbers",100,10);
        //assertEquals("100",10);
        assertThat("actual vallue close to 10",10,equalTo(10));

    }
    @Category(SlowGroups.class)
    @Test
    public void testDemo3(){
        //assertTrue(false);
        //assertThat("actual vallue close to 10",10.2,closeTo(10.0,0.1));

        assertThat("actual vallue close to 10",
                10.2,
                anyOf(closeTo(10.0,0.1),equalTo(10.2) ));
    }

    @Category(FastGruops.class)
    @Test
    public void testDemo4(){
        assertTrue(false);
    }
}
