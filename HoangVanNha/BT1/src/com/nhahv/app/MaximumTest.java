package com.nhahv.app;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Nhahv on 9/5/2016.
 * <></>
 */
public class MaximumTest {

    private Maximum maximum = new Maximum();

    @org.junit.Test
    public void main() throws Exception {

    }

    @Test
    public void MaximumTest1() {
        List<Integer> listTest = new ArrayList<>();
        listTest.add(10);
        listTest.add(12);
        listTest.add(10);
        listTest.add(30);
        listTest.add(2);
        listTest.add(1);

        assertEquals(30, maximum.maxOfList(listTest));
    }

    @Test
    public void MaximumTest2() {
        List<Integer> listTest = new ArrayList<>();
        listTest.add(10);
        listTest.add(-12);
        listTest.add(10);
        listTest.add(-30);
        listTest.add(2);
        listTest.add(1);

        assertEquals(10, maximum.maxOfList(listTest));
    }

    @Test
    public void MaximumTest3() {
        List<Integer> listTest = new ArrayList<>();
        listTest.add(0);
        listTest.add(2);
        listTest.add(-12);
        listTest.add(1);
        listTest.add(-30);
        listTest.add(2);
        listTest.add(1);

        assertEquals(2, maximum.maxOfList(listTest));
    }
}