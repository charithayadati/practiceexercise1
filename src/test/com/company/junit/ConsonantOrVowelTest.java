package com.company.junit;

import org.junit.*;

import static org.junit.Assert.*;

public class ConsonantOrVowelTest {
   ConsonantOrVowel check;

        @Before
        public void setup() {
            System.out.println("Before");
            check = new ConsonantOrVowel ();
        }

        @After
        public void tearDown() {
            System.out.println("After");
            check = null;
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
        public void givenCharacterShouldReturnvowel() {
            String result = check.consonantorvowel("ap");
            assertEquals("vowelconsonant", result);
        }
        @Test
        public void givenCharacterShouldReturnConsonant() {
            String result = check.consonantorvowel("bi");
            assertEquals("consonantvowel", result);
        }
        @Test
        public void givenCharacterShouldReturnerror() {
            String result = check.consonantorvowel("2");
            assertEquals("Error", result);
        }
}