package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class StringReverseTest {
        StringReverse stringReverse;
    @Before
    public void setup() {
        System.out.println("Before");
        stringReverse = new StringReverse ();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        stringReverse = null;
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
    public void givenStringShouldReturnReverse1() {
        String result = stringReverse.reverseString("stackroute");
        assertEquals("etuorkcats", result);
    }
    @Test
    public void givenStringShouldReturnReverse2() {
        String  result = stringReverse.reverseString("stack");
        assertEquals("kcats", result);
    }

    @Test
    public void givenStringShouldReturnNull() {
        String  result = stringReverse.reverseString(null);
        assertNull("passed", result);
    }

}