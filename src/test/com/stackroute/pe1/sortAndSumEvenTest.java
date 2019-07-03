package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class sortAndSumEvenTest {
   sortAndSumEven sortAndSumEven;

    @Before
    public void setup() {
        System.out.println("Before");
        sortAndSumEven = new sortAndSumEven();
    }

    @After
    public void tearDown() {
        System.out.println("After");
       sortAndSumEven = null;
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
        String result = sortAndSumEven.sum(234534);
        assertEquals("False",result);
    }
    @Test
    public void givenIntegerShouldReturnTrueIfSumOfEvenNumbersLessThan20() {
        String result = sortAndSumEven.sum(646821);
        assertEquals("True", result);
    }


}