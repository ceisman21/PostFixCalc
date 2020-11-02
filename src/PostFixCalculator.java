/*
Cooper Eisman and Addison Hoff
Date Created: 11/2/2020
Date Modified: 11/2/2020
Creates a Stack of StackNode type object
*/

public class PostFixCalculator {
    String input;
    String[] inputArray;
    public PostFixCalculator(String input) {
        this.input = input;
        inputArray = input.split("\\s");
    }
    public int getResult() {
        Stack numStack = new Stack();
        for(int x = 0; inputArray.length > x; x++) {
            if (inputArray[x].equals("+")) {
                int a = (int)(numStack.pop());
                int b = (int)(numStack.pop());
                numStack.push(adder(a,b));
            }
            else if (inputArray[x].equals("-")) {
                int a = (int)(numStack.pop());
                int b = (int)(numStack.pop());
                numStack.push(subtractor(a,b));
            }
            else if (inputArray[x].equals("*")) {
                int a = (int)(numStack.pop());
                int b = (int)(numStack.pop());
                numStack.push(multiplier(a,b));
            }
            else if (inputArray[x].equals("/")) {
                int a = (int)(numStack.pop());
                int b = (int)(numStack.pop());
                numStack.push(divider(a,b));
            }
            else {
                numStack.push(inputArray[x]);
            }
        }
        return (int)(numStack.pop());
    }
    private int adder(int a, int b) {
        return b+a;
    }
    private int subtractor(int a, int b) {
        return b-a;
    }
    private int multiplier(int a, int b) {
        return b*a;
    }
    private int divider(int a, int b) {
        return b/a;
    }

}
