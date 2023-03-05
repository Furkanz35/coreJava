package com.furkan.zengin.corejava.functionalprogramming.functionalapi;

import java.util.function.Supplier;

//Represent a supplier of result (like factory), it does not take an input
//It returns any value of type
public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());
        Supplier<String> getDBConnectionUrlSupplier = () -> "jdbc://localhost:5432/users";
        System.out.println(getDBConnectionUrlSupplier.get());
    }

    static String getDBConnectionUrl(){
        return "jdbc://localhost:5432/users";
    }
}
