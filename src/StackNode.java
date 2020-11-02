/*
Cooper Jonathan Eisman
Date Created: 10/27/2020
Date Modified: 10/27/2020
StackNode object -- essentially a specialized node class
*/


public class StackNode<T> {

    private T data;                                    //The data stored in the Node
    private StackNode child;                           //Child of the node
    private boolean hasChild;                          //Returns whether this is the last data in the stack

    public StackNode() {                               //Default Constructor
        //Initialize variables
        data = null;
        hasChild = false;
        child = null;
    }
    public StackNode(T data) {                         //Constructor with Data
        //Initialize variables
        this.data = data;
        hasChild = false;
        child = null;
    }
    public StackNode(T data, StackNode child) {        //Constructor with Data and Child
        //Initialize variables
        this.data = data;
        hasChild = false;
        this.child = child;
    }
    public StackNode(StackNode tempNode) {             //Constructor with annother node
        //Initialize variables
        data = (T)(tempNode.getData());
        hasChild = tempNode.hasChild();
        child = tempNode.getChild();
    }

    public T getData(){                                //Returns the Data of this node
        return data;
    }
    public boolean hasChild() {                        //Returns whether or not this node has a child
        return hasChild;
    }
    public StackNode getChild(){                       //Returns the child of this Node
        return child;
    }
}
