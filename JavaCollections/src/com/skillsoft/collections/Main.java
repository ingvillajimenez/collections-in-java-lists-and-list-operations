package com.skillsoft.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<Car> carList = new ArrayList<>();

        carList.add(new Car("Honda", "Civic", 21000.0));
        carList.add(new Car("Toyota", "Camry", 29000.0));
        carList.add(new Car("BMW", "5 Series", 65000.0));

        System.out.println("Car list: " + carList);

        carList.add("Mercedes"); // java: incompatible types: java.lang.String cannot be converted to com.skillsoft.collections.Car
        carList.add(5); // java: incompatible types: int cannot be converted to com.skillsoft.collections.Car
        carList.add(true); // java: incompatible types: boolean cannot be converted to com.skillsoft.collections.Car
        carList.add(10.25f); // java: incompatible types: float cannot be converted to com.skillsoft.collections.Car

//        ArrayList<String> currencyList = new ArrayList<>();
//
//        currencyList.add("EUR");
//        currencyList.add("USD");
//        currencyList.add("INR");
//
//        System.out.println("Currency list: " + currencyList);
//
//        currencyList.add(5); // java: incompatible types: int cannot be converted to java.lang.String
//        currencyList.add(true); // java: incompatible types: boolean cannot be converted to java.lang.String
//        currencyList.add(10.25f); // java: incompatible types: float cannot be converted to java.lang.String

//        ArrayList<String> stringArrayList = new ArrayList<String>();
//        ArrayList<String> stringArrayList = new ArrayList<>();
//
//        System.out.println("ArrayList class: " + stringArrayList.getClass());
//
//        System.out.println();
//
//        System.out.println("ArrayList instanceof List: "
//                + (stringArrayList instanceof List<?>));
//        System.out.println("ArrayList instanceof Collection: "
//                + (stringArrayList instanceof Collection<?>));
//        System.out.println("ArrayList instanceof Iterable: "
//                + (stringArrayList instanceof Iterable<?>));

//        System.out.println("ArrayList instanceof List: "
//                + (stringArrayList instanceof List));
//        System.out.println("ArrayList instanceof Collection: "
//                + (stringArrayList instanceof Collection));
//        System.out.println("ArrayList instanceof Iterable: "
//                + (stringArrayList instanceof Iterable));
    }
}