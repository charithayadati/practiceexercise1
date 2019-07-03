package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class GuessnumberTest {
    Guessnumber guessnumber;

    @Before
    public void setup() {
        System.out.println("Before");
        guessnumber = new Guessnumber();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        guessnumber = null;
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
    public void givenIntegerShouldReturnLessThanOriginalNumber() {
        String result = guessnumber.check(20);
        assertEquals("Number Guessed is less than original Number",result);
    }
    @Test
    public void givenIntegerShouldReturnMatchedWithOriginalNum() {
        String result = guessnumber.check(39);
        assertEquals("Number Guessed matches the original number", result);
    }
    @Test
    public void givenIntegerShouldReturnGreaterThanOriginalNum() {
        String result = guessnumber.check(45);
        assertEquals("Number Guessed is more than original Number", result);
    }

}