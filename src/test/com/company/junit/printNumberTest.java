package com.company.junit;

import org.junit.*;

import static org.junit.Assert.*;

public class printNumberTest {
    printNumber print;

    @Before
    public void setup() {
        System.out.println("Before");
        print = new printNumber();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        print = null;
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
    public void givenShouldReturnUppercase() {
        String result = print.printRepeated(4);
        assertEquals("1 2 2 3 3 3 4 4 4 4", result);
    }
    @Test
    public void givenNegativeIntShouldReturnNull() {
        String result = print.printRepeated(-2);
        assertNull("Number Should not be negative",result);
    }


}