package com.nhungtth.sohoanhao;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SoHoanHaoTest {
    @Test
    public void test6() {
        SoHoanHao shh = new SoHoanHao();
        boolean result = shh.kiemTraSoHoanHao(6);
        assertEquals(true, result);
    }

    @Test
    public void test15() {
        SoHoanHao shh = new SoHoanHao();
        boolean result = shh.kiemTraSoHoanHao(15);
        assertEquals(false, result);
    }

    @Test
    public void testNegative6() {
        SoHoanHao shh = new SoHoanHao();
        boolean result = shh.kiemTraSoHoanHao(-6);
        assertEquals(false, result);
    }

    @Test
    public void testZero() {
        SoHoanHao shh = new SoHoanHao();
        boolean result = shh.kiemTraSoHoanHao(0);
        assertEquals(false, result);
    }
    @Test
    public void test1() {
        SoHoanHao shh = new SoHoanHao();
        boolean result = shh.kiemTraSoHoanHao(0);
        assertEquals(false, result);
    }
    @Test
    public void testNegative1() {
        SoHoanHao shh = new SoHoanHao();
        boolean result = shh.kiemTraSoHoanHao(0);
        assertEquals(false, result);
    }

}
