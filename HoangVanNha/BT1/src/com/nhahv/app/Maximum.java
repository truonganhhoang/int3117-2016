package com.nhahv.app;

import javafx.beans.binding.NumberExpression;
import org.omg.PortableInterceptor.INACTIVE;

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
        int max = new Maximum().maxOfList(listInteger);
        System.out.printf("Maximum: " + max);
    }

    int maxOfList(List<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (int item : list) {
            if (item > max) {
                max = item;
            }
        }
        return max;
    }

}


