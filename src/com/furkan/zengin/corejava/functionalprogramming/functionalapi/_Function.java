package com.furkan.zengin.corejava.functionalprogramming.functionalapi;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {

        int increment = increment(11);
        System.out.println(increment);

        //This function is belong on Java Functional Programming Interface
        Function<Integer, Integer> incrementByFunctionalInterface = (integer -> integer + 1);
        System.out.println(incrementByFunctionalInterface.apply(11));

        System.out.println("-----------------------------");

        Function<Integer, Integer> multiplyByTen = integer -> 10 * integer;

        int multiply = multiplyByTen.apply(incrementByFunctionalInterface.apply(3));
        System.out.println(multiply);

        int multiply2 = multiplyByTen.compose(incrementByFunctionalInterface).apply(3);
        int multiply3 = multiplyByTen.andThen(incrementByFunctionalInterface).apply(3);
        System.out.println(multiply2);
        System.out.println(multiply3);

        System.out.println("---------------------------------");

        BiFunction<Integer, Integer, Integer> incrementByOneAndMultiply =
                (numberToIncrementByOne, numberToMultiply)
                        -> { return numberToMultiply * (numberToIncrementByOne + 1);
        };

        System.out.println(incrementByOneAndMultiply.apply(9, 87));
        System.out.println(incrementByOneAndMultiply.andThen(multiplyByTen).apply(9, 83));

    }


    static int increment(int number) {
        return number + 1;
    }
}
