package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class printNumberTest {
    printNumber printNumber;

    @Before
    public void setup() {
        System.out.println("Before");
        printNumber = new printNumber();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        printNumber = null;
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
    public void givenShouldPrintRepeat() {
        String result = printNumber.printRepeated(4);
        assertEquals("1 2 2 3 3 3 4 4 4 4", result);
    }
    @Test
    public void givenNegativeIntShouldReturnNull() {
        String result = printNumber.printRepeated(-2);
        assertNull("Number Should not be negative",result);
    }


}