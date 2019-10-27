package com.testcase;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.*;

public class TestCategory {

    @Test
    public void testdemo1(){
        assertTrue(true);
        assertEquals("diff two values",10,100);
    }

    @Category(FastInterface.class)
    @Test
    public void testdemo2(){
        //assertTrue(false);
        assertThat("diff close to 10",10.2,closeTo(10.0,0.1));
    }
    @Test
    @Category({SlowInteface.class,FastInterface.class})
    public void testdemo3(){
        assertTrue(false);
    }
}
