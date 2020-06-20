package com.jbt.core;

import java.util.Arrays;
import java.util.List;

public class for_loop {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            System.out.println("Value of i: " + i);
        }

        int j;  // declare variable outside for loop if needed beyond loop
        for (j = 4; j < 8; j++) {
            System.out.println("Value of j: " + j);
        }

        int k = 8;
        for (; k < 12; k++) {
            System.out.println("Value of k: " + k);
        }

        /*
         * Below two for statements are infinite loop hence commented.
         */
//        for (; ; k++) {
//            System.out.println("Value of k: " + k);
//        }
//
//        for (; ; ) {
//            System.out.println("Infinite loop");
//        }

        //enhanced for loop
        String[] array = {"Hello ", "Hi ", "How ", "are ", "you?"};
        List<String> list = Arrays.asList(array);
        int index = 0;

        for (String str : array) {
            System.out.print(str);
            //Variable can be used to get index of the current item
            System.out.println("Current Index :" + index++);
        }
        System.out.println("\n");

        for (String str : list) {
            System.out.print(str);
            //Collection method indexOf can be used to get index of current item
            System.out.println("Current Index: " + list.indexOf(str));
        }
    }
}
