package com.trangntq.prime;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrimeTest {

    @Test
    public void test0IsNotPrime() {
        Prime prime = new Prime();
        boolean result = prime.isPrime(0);
        assertEquals(false, result);
    }

    @Test
    public void test1IsNotPrime() {
        Prime prime = new Prime();
        boolean result = prime.isPrime(1);
        assertEquals(false, result);
    }

    @Test
    public void test2IsPrime() {
        Prime prime = new Prime();
        boolean result = prime.isPrime(2);
        assertEquals(true, result);
    }

    @Test
    public void test3IsNotPrime() {
        Prime prime = new Prime();
        boolean result = prime.isPrime(3);
        assertEquals(true, result);
    }

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

}