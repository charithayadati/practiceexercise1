package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class RepeatLastTest {
    RepeatLast repeatLast;
    @Before
    public void setup() {
        System.out.println("Before");
        repeatLast = new RepeatLast ();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        repeatLast = null;
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
    public void givenNumberShouldReturnRepeat2() {
        String result = repeatLast.repeatLast("stackroute" , 2);
        assertEquals("stackroutetete", result);
    }
    @Test
    public void givenNumberShouldReturnRepeat3() {
        String  result = repeatLast.repeatLast("stack",3);
        assertEquals("stackackackack", result);
    }



}