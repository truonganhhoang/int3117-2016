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

    // kiểm thử biên
    // kiểm thử biên mạnh
    /*
    * kiểm thử các giá trị biên: nếu a <= y << b
    * thì sẽ test các trường hợp: a, a+1, a + b/2, b-1, b
    * kiểm thử biên mạnh chọn các giá trị: a-1, b+1
    *
    * */
    // Chương trình mới
    // Test với giá trị min
    @Test
    public void TestFuncWithValueMin() {
        List<Integer> listTest = new ArrayList<>();
        listTest.add(0);
        int x = Integer.MIN_VALUE;
        listTest.add(x);
        assertEquals(0, maximum.maxOfList(listTest));
    }

    // Test với giá trị min + 1
    @Test
    public void TestFuncWithValueMinAdd1() {
        List<Integer> listTest = new ArrayList<>();
        listTest.add(0);
        int x = Integer.MIN_VALUE + 1;
        listTest.add(x);
        assertEquals(0, maximum.maxOfList(listTest));
    }

    // Test với giá trị middle  a + b/2
    @Test
    public void TestFuncWithValueMiddle() {
        List<Integer> listTest = new ArrayList<>();
        listTest.add(0);
        int x = Integer.MIN_VALUE + Integer.MAX_VALUE / 2;
        listTest.add(x);
        assertEquals(x, maximum.maxOfList(listTest));
    }

    @Test
    public void TestFuncWithValueMax() {
        List<Integer> listTest = new ArrayList<>();
        listTest.add(0);
        int x = Integer.MAX_VALUE;
        listTest.add(x);
        assertEquals(x, maximum.maxOfList(listTest));
    }

    @Test
    public void TestFuncWithValueMaxSub1() {
        List<Integer> listTest = new ArrayList<>();
        listTest.add(0);
        int x = Integer.MAX_VALUE - 1;
        listTest.add(x);
        assertEquals(x, maximum.maxOfList(listTest));
    }

    /* Kiểm thử biên mạnh*/
    @Test
    public void TestFuncWithValueMaxAdd1() {
        List<Integer> listTest = new ArrayList<>();
        listTest.add(0);
        int x = Integer.MAX_VALUE + 1;
        listTest.add(x);
        assertEquals(x, maximum.maxOfList(listTest));
    }

     /* Kiểm thử biên mạnh*/
    @Test
    public void TestFuncWithValueMinSub1() {
        List<Integer> listTest = new ArrayList<>();
        listTest.add(0);
        int x = Integer.MIN_VALUE - 1;
        listTest.add(x);
        assertEquals(0, maximum.maxOfList(listTest));
    }

    // chương trình cũ
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