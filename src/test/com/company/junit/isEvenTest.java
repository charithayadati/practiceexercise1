package com.company.junit;

import org.junit.*;

import static org.junit.Assert.*;

public class isEvenTest {
    isEven even;
    @Before
    public void setup() {
        System.out.println("Before");
        even = new isEven ();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        even = null;
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
    public void givenNumberShouldReturnJerry() {
        String result = even.isEven(22);
        assertEquals("Jerry", result);
    }
    @Test
    public void givenNumberShouldReturnTom() {
        String result = even.isEven(23);
        assertEquals("Tom", result);
    }

}

