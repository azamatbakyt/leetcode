package main;

import solutions.ConcatenationOfArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ConcatenationOfArray array = new ConcatenationOfArray();
        System.out.println(
                Arrays.toString(array.getConcatenation(new int[]{1, 2, 1}))
        );
    }
}