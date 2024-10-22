package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParameterizedTest {
    private final String sex;
    private final boolean expectedDoesHaveMane;

    public LionParameterizedTest(String sex, boolean expectedDoesHaveMane) {
        this.sex = sex;
        this.expectedDoesHaveMane = expectedDoesHaveMane;
    }
    @Parameterized.Parameters
    public static Object[][] getParameters() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }
    @Test
    public void testDoesHaveMane() throws Exception {
        Lion lion = new Lion(sex, new Feline());
        assertEquals(expectedDoesHaveMane, lion.doesHaveMane());
    }
}
