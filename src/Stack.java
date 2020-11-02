/*
Cooper Jonathan Eisman
Date Created: 10/27/2020
Date Modified: 10/27/2020
Creates a Stack of StackNode type object
*/


public class Stack<T>{

    private int length;                                     //height of the stack
    private StackNode topNode;                              //the Node at the top of the stack
    private StackNode bottomNode;                           //The Node at the bottom of the stack\

    public Stack() {                                        //Empty Constructor.
        length = 0;
        topNode = null;
        bottomNode = null;
    }
    public Stack(StackNode bottomNode) {                    //Constructor with an initial node
        StackNode tempNode = new StackNode(bottomNode);
        length = 1;
        topNode = tempNode;
        this.bottomNode = tempNode;
    }
    void push(T element) {                                  //add an element
        if(length == 0) {                                   //If the stack has no items
            StackNode tempNode = new StackNode(element);
            bottomNode = tempNode;
            topNode = tempNode;
        } else {                                            //If the Stack already exists
            StackNode copyNode = new StackNode(topNode);
            StackNode tempNode = new StackNode(element, copyNode);
            topNode = tempNode;
        }
        length++;
    }
    public T pop(){                                         //remove and return the top element
        T tempData = peek();
        if (length == 1 || length == 0) {
            length = 0;
        } else {
            tempData = (T)(topNode.getData());
            topNode = topNode.getChild();
            length--;
        }
        return tempData;
    }
    public boolean isEmpty() {                              //Returns whether or not the sack is empty
        if (length == 0) {
            return true;
        } else {
            return false;
        }
    }
    public int size() {                                     //Returns the height of the stack
        return length;
    }
    public T peek(){                                        //look at the top element without removing
        if (length == 0) {
            return null;
        } else {
            T tempData = (T)(topNode.getData());
            return tempData;
        }
    }
}
