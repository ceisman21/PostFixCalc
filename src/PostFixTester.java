/*
Cooper Eisman and Addison Hoff
Date Created: 11/2/2020
Date Modified: 11/2/2020
Tests PostFixCalculator.java
*/

import java.util.Scanner;
public class PostFixTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an expression in postfix notation (separated by spaces): ");
        String postFixString = input.nextLine();
        PostFixCalculator PFC = new PostFixCalculator(postFixString);
        System.out.print("Great! Here it the result: " + PFC.getResult());
    }
}

