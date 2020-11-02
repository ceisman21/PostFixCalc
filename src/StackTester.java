/*
Cooper Jonathan Eisman
Date Created: 10/27/2020
Date Modified: 10/27/2020
Tester for the Stack class
*/

import java.util.Scanner;

public class StackTester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\n\n");

        //Test initialization
        Stack s = new Stack();
        System.out.println("This file will test the StackNode.java class\n");

        //Test methods when empty
        System.out.println("First, we will test what our file does when the stack is empty...");
        System.out.println("Test the isEmpty method. Should return true: " + s.isEmpty());
        System.out.println("Test the size method. Should return 0: " + s.size());
        System.out.println("Test the pop method. Should return null: " + s.pop());
        System.out.println("Test the peek method. Should return null: " + s.peek() + "\n");

        //Test the push method when the stadck is empty
        System.out.println("Second, we will test the push method when the stack is empty...");
        System.out.print("Test the push method. Please give a text input :");
        s.push(scan.next());
        System.out.println("\nTest the isEmpty method. Should return false: " + s.isEmpty());
        System.out.println("Test the size method. Should return 1: " + s.size());
        System.out.println("Test the peek method. Should return your input: " + s.peek() + "\n");

        //Test the push method when the stack has items
        System.out.println("Third, we will test the push method when the stack is NOT empty...");
        System.out.print("Test the push method. Please give annother text input :");
        s.push(scan.next());
        System.out.println("\nTest the isEmpty method. Should return false: " + s.isEmpty());
        System.out.println("Test the size method. Should return 2: " + s.size());
        System.out.println("Test the pop method. Should return your most recent input: " + s.pop() + "\n");
        System.out.println("Test the isEmpty method after pop. Should return false: " + s.isEmpty());
        System.out.println("Test the size method after pop. Should return 1: " + s.size());
        System.out.println("Test the peek method. Should return your first input: " + s.peek() + "\n");


        //Test the push method when the stack has 1 item
        System.out.println("Finally, we will test the push method when the stack has 1 item empty...");
        System.out.println("Test the isEmpty method. Should return false: " + s.isEmpty());
        System.out.println("Test the size method. Should return 1: " + s.size());
        System.out.println("Test the pop method. Should return your first input: " + s.pop() + "\n");
        System.out.println("Test the isEmpty method after pop. Should return true: " + s.isEmpty());
        System.out.println("Test the size method after pop. Should return 0: " + s.size());
        System.out.println("Test the peek method after pop. Should return your first null: " + s.peek() + "\n");
    }
}
