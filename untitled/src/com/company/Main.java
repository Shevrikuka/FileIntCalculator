package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        FileCreator fileCreator = new FileCreator(10000, 10000);
        fileCreator.create();
        FileReaderToList fileReaderToList = new FileReaderToList(10000);
        ArrayList<Integer> arrayList = fileReaderToList.read();
        Calculator calculator = new Calculator();
        calculator.overZero(arrayList);
        calculator.lessZero(arrayList);
        calculator.zero(arrayList);
        calculator.min(arrayList);
        calculator.max(arrayList);
        calculator.average(arrayList);
    }
}
