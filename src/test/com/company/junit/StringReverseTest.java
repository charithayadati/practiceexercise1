package com.company.junit;

import org.junit.*;

import static org.junit.Assert.*;

public class StringReverseTest {
        StringReverse reverse;
    @Before
    public void setup() {
        System.out.println("Before");
        reverse = new StringReverse ();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        reverse = null;
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
    public void givenNumberShouldReturnReverse1() {
        String result = reverse.reverseString("stackroute");
        assertEquals("etuorkcats", result);
    }
    @Test
    public void givenNumberShouldReturnReverse2() {
        String  result = reverse.reverseString("stack");
        assertEquals("kcats", result);
    }



}