package com.company.junit;

import org.junit.*;

import static org.junit.Assert.*;

public class GuessnumberTest {
    Guessnumber guess;

    @Before
    public void setup() {
        System.out.println("Before");
        guess = new Guessnumber();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        guess = null;
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
        String result =guess.check(20);
        assertEquals("Number Guessed is less than original Number",result);
    }
    @Test
    public void givenIntegerShouldReturnMatchedWithOriginalNum() {
        String result =guess.check(39);
        assertEquals("Number Guessed matches the original number", result);
    }
    @Test
    public void givenIntegerShouldReturnGreaterThanOriginalNum() {
        String result =guess.check(45);
        assertEquals("Number Guessed is more than original Number", result);
    }

}