package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class ConsonantOrVowelTest {
   ConsonantOrVowel consonantOrVowel;

        @Before
        public void setup() {
            System.out.println("Before");
            consonantOrVowel = new ConsonantOrVowel ();
        }

        @After
        public void tearDown() {
            System.out.println("After");
            consonantOrVowel = null;
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
            String result = consonantOrVowel.consonantorvowel("ap");
            assertEquals("vowelconsonant", result);
        }
        @Test
        public void givenCharacterShouldReturnConsonant() {
            String result = consonantOrVowel.consonantorvowel("bi");
            assertEquals("consonantvowel", result);
        }
        @Test
        public void givenCharacterShouldReturnerror() {
            String result = consonantOrVowel.consonantorvowel("2");
            assertEquals("Error", result);
        }
}