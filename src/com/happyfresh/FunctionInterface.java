package com.happyfresh;

import java.util.Calendar;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionInterface {
    public static class Employee {
        public static int getWorkingYears(int startYear) {
            return Calendar.getInstance().get(Calendar.YEAR) - startYear;
        }
    }

    public static void main(String[] args) {
        Function<Integer, Integer> getWorkingYears = Employee::getWorkingYears;

        System.out.println(getWorkingYears.apply(2010));
    }
}