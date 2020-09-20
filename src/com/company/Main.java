package com.company;

public class Main {

    public static void main(String[] args) {
	DynamicDoubleArray<Double> doubleArray= new DynamicDoubleArray<Double>();

    doubleArray.add(6.5);
    doubleArray.add(9.0);
    doubleArray.add(8.05);
    doubleArray.add(0.02);
    System.out.println(doubleArray.toString());
    System.out.println(doubleArray.get(7));
    doubleArray.remove(7);
    System.out.println(doubleArray.toString());

    }
}
