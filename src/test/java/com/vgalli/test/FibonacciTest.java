package com.vgalli.test;

import com.vgalli.Fibonacci;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class FibonacciTest {

    private int input;

    private BigInteger expected;

    @Parameterized.Parameters(name = "{index}: fibonacci({0})={1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 0, BigInteger.ZERO }, { 1, BigInteger.ONE }, { 2, BigInteger.ONE }, { 3, BigInteger.valueOf(2) },
                { 4, BigInteger.valueOf(3) }, { 5, BigInteger.valueOf(5) }, { 6, BigInteger.valueOf(8)  },
                { 100, new BigInteger("354224848179261915075")}
        });
    }

    public FibonacciTest(int input, BigInteger expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void test() {
        assertEquals(expected, Fibonacci.fibonacci(input));
    }
}
