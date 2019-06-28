package com.company.junit;

import org.junit.*;

import static org.junit.Assert.*;

public class sortAndSumEvenTest {
   sortAndSumEven sort;

    @Before
    public void setup() {
        System.out.println("Before");
        sort = new sortAndSumEven();
    }

    @After
    public void tearDown() {
        System.out.println("After");
       sort = null;
    }

    @BeforeClass
    public static void setUpBeforeClass() {

        System.out.println("BeforeClass");
    }

    @AfterClass
    public static void tearDownAfterClass() {

        System.out.println("AfterClass");
    }

    @Test
    public void givenIntegerShouldReturnFalseIfSumOfEvenNumbersGreaterThan20() {
        String result =sort.sum(234534);
        assertEquals("False",result);
    }
    @Test
    public void givenIntegerShouldReturnTrueIfSumOfEvenNumbersLessThan20() {
        String result =sort.sum(646821);
        assertEquals("True", result);
    }


}