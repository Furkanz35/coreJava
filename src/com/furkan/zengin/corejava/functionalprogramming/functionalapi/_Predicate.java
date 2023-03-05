package com.furkan.zengin.corejava.functionalprogramming.functionalapi;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("+0123791283"));
        System.out.println(isPhoneNumberValid("12073123"));

        Predicate<String> isPhonenumberValidPredicate = phoneNumber ->
                phoneNumber.startsWith("+") && phoneNumber.length() == 11;

        System.out.println(isPhonenumberValidPredicate.test("+0123791283"));
        System.out.println(isPhonenumberValidPredicate.test("12073123"));

        System.out.println("--------------------------");
        Predicate<String> containsNumber3 = phoneNumber -> phoneNumber.contains("3");
        System.out.println(isPhonenumberValidPredicate.and(containsNumber3).test("+3218124213"));
        System.out.println(isPhonenumberValidPredicate.negate().test("1235123123123124123123123"));
        System.out.println(isPhonenumberValidPredicate.or(containsNumber3).test("23124123123"));


        System.out.println("-----------BiPredicate--------");
        BiPredicate<Integer, Integer> isTheFirstOneBigger = (firstNumber, secondNumber) -> firstNumber >= secondNumber;
        System.out.println(isTheFirstOneBigger.test(23, 12));
        System.out.println(isTheFirstOneBigger.test(3, 12));
        System.out.println(isTheFirstOneBigger.negate().test(23, 12));


    }

    static  boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("+") && phoneNumber.length() == 11;
    }
}
