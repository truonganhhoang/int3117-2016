package com.trangntq.stringutil;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidationPasswordTest {
    @Test
    public void testPassEmpty() {
        ValidationPassword validation = new ValidationPassword("");
        assertEquals(false, validation.isStrongPassword());
    }

    @Test
    public void testInvalidPass() {
        ValidationPassword validation = new ValidationPassword("$)@#&*%$.,");
        assertEquals(false, validation.isStrongPassword());
    }

    @Test
    public void testLengthShorter8() {
        ValidationPassword validation = new ValidationPassword("Admin1");
        assertEquals(false, validation.isStrongPassword());
    }

    @Test
    public void testLengthEqual8() {
        ValidationPassword validation = new ValidationPassword("Admin123");
        assertEquals(true, validation.isStrongPassword());
    }

    @Test
    public void testLowercase() {
        ValidationPassword validation = new ValidationPassword("helloworld");
        assertEquals(false, validation.isStrongPassword());
    }

    @Test
    public void testUppercase() {
        ValidationPassword validation = new ValidationPassword("HELLOWORLD");
        assertEquals(false, validation.isStrongPassword());
    }

    @Test
    public void testUpperAndLowercase() {
        ValidationPassword validation = new ValidationPassword("HelloWorld");
        assertEquals(false, validation.isStrongPassword());
    }

    @Test
    public void testLowercaseAndNumber() {
        ValidationPassword validation = new ValidationPassword("helloworld123");
        assertEquals(false, validation.isStrongPassword());
    }

    @Test
    public void testUppercaseAndNumber() {
        ValidationPassword validation = new ValidationPassword("HELLOWORLD123");
        assertEquals(false, validation.isStrongPassword());
    }

    @Test
    public void testPassNumber() {
        ValidationPassword validation = new ValidationPassword("123456789");
        assertEquals(false, validation.isStrongPassword());
    }

    @Test
    public void testPassStrong() {
        ValidationPassword validation = new ValidationPassword("HelloWorld123");
        assertEquals(true, validation.isStrongPassword());
    }
}