package com.furkan.zengin.corejava.functionalprogramming.functionalapi;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

//It takes one input and it turn nothing, it consumes the input
public class _Consumer {

    public static void main(String[] args) {
        Customer customer1 = new Customer("Furkan", "8916243123");
        greetCustomer(customer1);
        Consumer<Customer> greetCustomerConsumer = customer -> System.out.println("Hello " + customer.customerName +
                " , thanks for registering phone number " +
                customer.customerPhoneNumber);
        greetCustomerConsumer.accept(customer1);

        System.out.println("-------------------------------");
        //Biconsumer takes 2 inputs and consume the inputs

        BiConsumer<Customer, Boolean> greetCustomerPhoneHiding = (customer, showPhoneNumber) ->
        {
            System.out.println("Hello " + customer.customerName +
                    " , thanks for registering phone number " +
                    (showPhoneNumber ? customer.customerPhoneNumber : "*******")
            );
        };
        greetCustomerPhoneHiding.accept(customer1, false);
    }



    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName +
                " , thanks for registering phone number " +
                customer.customerPhoneNumber);
    }
    static class Customer {
        private final String  customerName;
        private final String customerPhoneNumber;
        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
