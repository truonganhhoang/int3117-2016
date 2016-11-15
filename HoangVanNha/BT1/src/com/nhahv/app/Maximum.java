package com.nhahv.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Nhahv on 9/5/2016.
 * <></>
 */
public class Maximum {
    public static void main(String[] args) {
        List<Integer> listInteger = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int value = new Random().nextInt(100);
            listInteger.add(value);
        }
        listInteger.forEach(System.out::println);
        int max = new Maximum().maximumOfListInteger(listInteger);
        System.out.printf("Maximum: " + max);
    }

    int maximumOfListInteger(List<Integer> listInteger) {
        int max = Integer.MIN_VALUE;
        for (int item : listInteger) {
            if (item > max) {
                max = item;
            }
        }
        return max;
    }
}


