package com.stackroute.pe1;
import org.junit.*;

import static org.junit.Assert.*;

public class checkTheCharTest {
    checkTheChar checkTheChar;

@Before
public void setup() {
        System.out.println("Before");
        checkTheChar = new checkTheChar();
        }

@After
public void tearDown() {
        System.out.println("After");
        checkTheChar = null;
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
public void givenCharacterShouldReturnLowercase() {
        String result = checkTheChar.sample('a');
        assertEquals("Lowercase letter", result);
        }
@Test
public void givenCharacterShouldReturnUppercase() {
        String result = checkTheChar.sample('A');
        assertEquals("Uppercase letter", result);
        }
@Test
public void givenCharacterShouldReturnDigit() {
        String result = checkTheChar.sample('2');
        assertEquals("Is a Digit", result);
        }
@Test
public void givenCharacterShouldReturnSymbol() {
        String result = checkTheChar.sample('#');
        assertEquals("Is a Special symbol", result);
        }

        }

