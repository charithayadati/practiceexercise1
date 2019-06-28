package com.company.junit;

import org.junit.*;

import static org.junit.Assert.*;

public class RepeatLastTest {
    RepeatLast repeat;
    @Before
    public void setup() {
        System.out.println("Before");
        repeat = new RepeatLast ();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        repeat = null;
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
        String result = repeat.repeatLast("stackroute" , 2);
        assertEquals("stackroutetete", result);
    }
    @Test
    public void givenNumberShouldReturnRepeat3() {
        String  result = repeat.repeatLast("stack",3);
        assertEquals("stackackackack", result);
    }



}