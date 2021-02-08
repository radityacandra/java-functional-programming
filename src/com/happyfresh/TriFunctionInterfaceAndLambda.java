package com.happyfresh;

import java.util.Calendar;
import java.util.function.Function;

public class TriFunctionInterfaceAndLambda {
    public static class Employee {
        public static int getPerformance(int numCommit, int numPR, int numCodeChanges) {
            return (2*numCommit + 3*numPR + 12*numCodeChanges) / 2;
        }
    }

    public static void main(String[] args) {
        TriFunction<Integer, Integer, Integer, Integer> getPerformance = Employee::getPerformance;

        TriFunction<Integer, Integer, Integer, Integer> getPerformanceLambda = (a, b, c) -> (2*a + 3*b + 12*c) / 2;

        System.out.println(getPerformance.apply(2, 3, 4));
        System.out.println(getPerformanceLambda.apply(2, 3, 4));

        TriFunction<Integer, Integer, Integer, Function<Integer, Integer>> getPerformanceLambdaV2 =
                (a, b, c) -> {
                    int score = (2*a + 3*b + 12*c) / 2;

                    return (workingYears) -> score + workingYears*2;
                };

        System.out.println(getPerformanceLambdaV2.apply(2,3,4).apply(4));
    }
}
