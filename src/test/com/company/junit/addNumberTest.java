package com.company.junit;

import org.junit.*;

import static org.junit.Assert.*;

public class addNumberTest {

    addNumber add;

    @Before
    public void setup() {
        System.out.println("Before");
        add = new addNumber();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        add = null;
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
    public void givenIntArrrayShouldReturnSumOfAllIntegers() {
        int result =add.sum(new int[]{3,6,8,9,10});
        assertEquals(36,result);
    }
    @Test
    public void givenEmptyIntArrrayShouldReturnZero() {
        int result =add.sum(new int[]{});
        assertEquals(0, result);
    }



}
