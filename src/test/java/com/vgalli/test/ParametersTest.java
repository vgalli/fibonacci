package com.vgalli.test;

import com.vgalli.Fibonacci;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

public class ParametersTest {
    @Test
    public void testStringParameter() {

        try {
            String[] args = {"Hello"};
            Fibonacci.main(args);
            fail("Wrong parameters provided");

        } catch (Exception e) {
            assertEquals("Please provide a valid Integer.", e.getMessage());
        }

    }
    @Test
    public void testNoParameter() {

        try {

            Fibonacci.main(null);
            fail("No parameters provided");

        } catch (Exception e) {
            assertEquals("Please provide one integer parameter", e.getMessage());
        }

    }

}
