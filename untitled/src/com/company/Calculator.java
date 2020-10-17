package com.company;

import java.util.ArrayList;

public class Calculator {

    int sum(ArrayList<Integer> arrayList) {
        int answer = arrayList.stream().reduce((x, y) -> x + y).get();
        System.out.println(answer);
        return answer;
    }

    long overZero(ArrayList<Integer> arrayList) {
        long answer = arrayList.stream().filter((x) -> x > 0).count();
        System.out.println(answer);
        return answer;
    }

    long lessZero(ArrayList<Integer> arrayList) {
        long answer = arrayList.stream().filter((x) -> x < 0).count();
        System.out.println(answer);
        return answer;
    }

    long zero(ArrayList<Integer> arrayList) {
        long answer = arrayList.stream().filter((x) -> x == 0).count();
        System.out.println(answer);
        return answer;
    }

    int min(ArrayList<Integer> arrayList) {
        int answer = arrayList.stream().reduce((a, b) -> Math.min(a, b)).get();
        System.out.println(answer);
        return answer;
    }

    int max(ArrayList<Integer> arrayList) {
        int answer = arrayList.stream().reduce((a, b) -> Math.max(a, b)).get();
        System.out.println(answer);
        return answer;
    }

    int average(ArrayList<Integer> arrayList) {
        int a = arrayList.stream().reduce((x, y) -> x + y).get();
        int answer = a/arrayList.size();
        System.out.println(answer);
        return answer;
    }

}

