package com.lab8.task1;

public class FirstTask {

    /**
     * Method for solving simple task.
     */
    public static void StringBuilderResult() {
        String inputString = "The most popular phase for programmers is:" +
                "Hello World! Traditionally this is the first program!";

        String firstPart = inputString.substring(0, inputString.length() / 2);
        String secondPart = inputString.substring(inputString.length() / 2);

        StringBuilder outputString = new StringBuilder();
        outputString.append(firstPart.replaceAll(":", "."));
        outputString.append(secondPart.replaceAll("!", "."));

        System.out.println(outputString);
    }
}
