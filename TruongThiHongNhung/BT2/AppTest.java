package com.nhungtth.app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {
    @Test
    public void test1() {
        App app = new App();
        assertEquals(6102, app.getNumber(2016));
    }

    @Test
    public void test2() {
        App app = new App();
        assertEquals(-1, app.getNumber(-5));
    }

    @Test
    public void test3() {
        App app = new App();
        assertEquals(0, app.getNumber(2015));
    }

}