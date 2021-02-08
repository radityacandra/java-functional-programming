package com.happyfresh;

import java.util.Calendar;
import java.util.function.BiFunction;

public class BiFunctionInterface {
    public static class Employee {
        public static int sum(int a, int b) {
            return a + b;
        }
    }

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> sum = Employee::sum;

        System.out.println(sum.apply(2, 3));
    }
}
