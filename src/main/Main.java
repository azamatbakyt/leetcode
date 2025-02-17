package main;

import solutions.FinalValueOfVariableAfterOperations;

public class Main {
    public static void main(String[] args) {
        FinalValueOfVariableAfterOperations finalValueOfVariableAfterOperations = new FinalValueOfVariableAfterOperations();
        System.out.println(
                finalValueOfVariableAfterOperations.finalValueAfterOperations(
                        new String[]{"--X","X++","X++"}
                )
        );
    }
}