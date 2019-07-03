package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome palindrome;
    @Before
    public void setup() {
        System.out.println("Before");
        palindrome = new Palindrome ();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        palindrome = null;
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
    public void givenNumberShouldReturnPalindrome() {
        String result = palindrome.isPalindrome(12321);
        assertEquals("Is a Palindrome and sum of even numbers is less than 25", result);
    }
    @Test
    public void givenNumberShouldReturnNotaPalindrome() {
        String result = palindrome.isPalindrome(12868);
        assertEquals("Is not a Palindrome", result);
    }


}