package com.trangntq.prime;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrimeTest {
    @Test
    public void test5IsPrime() {
        Prime prime = new Prime();
        boolean result = prime.isPrime(5);
        assertEquals(true, result);
    }

    @Test
    public void test9NotPrime() {
        Prime prime = new Prime();
        boolean result = prime.isPrime(9);
        assertEquals(false, result);
    }

    @Test
    public void testSmaller2NotPrime() {
        Prime prime = new Prime();
        boolean result = prime.isPrime(1);
        assertEquals(false, result);
    }

}