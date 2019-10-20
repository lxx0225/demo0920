package com.testcase;

import org.junit.*;

public class JunitTest {
    @BeforeClass
    public static void beforeClass() {
        System.out.println("in before class");
    }

    @Before
    public void before() {
        System.out.println("in before");
    }

    @Test
    public void testCase() {
        System.out.println("in test case");
    }

    @After
    public void after() {

        System.out.println("in after");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("in after class");
    }
}