package com.test.param;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class PrimeNumberCheckerTest {
    private Integer inputNumber;
    private Boolean expectedResult;
    private PrimeNumberChecker primeNumberChecker;


    @Before
    public void initialize(){
        primeNumberChecker =new PrimeNumberChecker();
    }

    public PrimeNumberCheckerTest(Integer inputNumber,Boolean expectedResult){
        this.inputNumber=inputNumber;
        this.expectedResult=expectedResult;
    }

    @Parameterized.Parameters
    public static Collection primeNumbers(){
        return Arrays.asList(new Object [][] {
                {99, true },
                {6, false },
                { 19, true },
                { 22, false },
                { 23, true }
        });
    }
    @Test
    public void testPrimeNumberChecker(){
        System.out.println("parameterized number is :"+inputNumber);
        assertEquals(expectedResult, primeNumberChecker.validate(inputNumber));
    }



}
