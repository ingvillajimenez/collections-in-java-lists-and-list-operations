package com.skillsoft.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        ArrayList<String> cityList = new ArrayList<>();
        List<String> cityList = new ArrayList<>();
//        Collection<String> cityList = new ArrayList<>(); // size, add, remove, contains, containsAll,
                                                        // removeAll, addAll are part of the Collection interface

        System.out.println("************Adding elements");

        cityList.add("Bengaluru");
        cityList.add("New York");
        cityList.add("Mumbai");

        System.out.println("cityList contents: " + cityList);
        System.out.println("cityList size: " + cityList.size());
        System.out.println("cityList isEmpty(): " + cityList.isEmpty());

        System.out.println();

        System.out.println("************Removing elements");

        cityList.remove("Seattle");
        cityList.remove("Palo Alto");

        System.out.println("cityList contents: " + cityList);
        System.out.println("cityList size: " + cityList.size());
        System.out.println("cityList isEmpty(): " + cityList.isEmpty());

        System.out.println();

        System.out.println("**************Checking for elements");

        System.out.println("cityList contains New York: " + cityList.contains("New York"));
        System.out.println("cityList contains Paris: " + cityList.contains("Paris"));
        System.out.println("cityList contains Mumbai: " + cityList.contains("Mumbai"));

        System.out.println("cityList size: " + cityList.size());

        System.out.println();

        System.out.println("*************Adding multiple elements");

        List<String> anotherCityList = new ArrayList<>();
        anotherCityList.add("Paris");
        anotherCityList.add("London");

        System.out.println("cityList original contents: " + cityList);
        System.out.println("Adding elements: " + anotherCityList);

        cityList.addAll(anotherCityList);

        System.out.println("cityList contents: " + cityList);
        System.out.println("cityList size: " + cityList.size());

        System.out.println();

        System.out.println("*************Checking for multiple elements");

        System.out.println("cityList contains Paris, London: " + cityList.containsAll(anotherCityList));

        anotherCityList.add("Tokyo");
        System.out.println("cityList contains Paris, London, Tokyo: " + cityList.containsAll(anotherCityList));

        System.out.println("************Removing multiple elements");

        System.out.println("cityList original contents: " + cityList);
        System.out.println("Removing elements: " + anotherCityList);

        cityList.removeAll(anotherCityList);

        System.out.println("cityList contents: " + cityList);

//        ArrayList<int> intList = new ArrayList<int>(); // Type argument cannot be of primitive type
//        ArrayList<Integer> intList = new ArrayList<Integer>();
//
//        intList.add(100);
//        intList.add(200);
//        intList.add(300);
//        intList.add(400);
//
//        System.out.println("Integer list: " + intList);
//
//        intList.add(null);
//
//        System.out.println("Integer list (after adding null): " + intList);
    }
}