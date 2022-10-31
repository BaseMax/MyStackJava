/*
 * @Name: My Stack Implementation In Java
 * @Author: Max Base
 * @Date: 2022-10-31
 * @Class: Data Structure, Dr. Mahsa Soheil Shamaee
 */

 // Stack
class MyStack {
    private int size;
    private int top;
    private int[] stack;

    // Constructor
    public MyStack(int size) {
        this.size = size;
        this.top = -1;
        this.stack = new int[size];
    }

    // O(1)
    // Push an element to the top of the stack and return true
    // If the stack is full, throw an error and return false
    public boolean push(int value) {
        if (top == size - 1) {
            System.out.println("Stack is full");
            return false;
        } else {
            top++;
            stack[top] = value;
            return true;
        }
    }

    // O(1)
    // return -1 if stack is empty
    // return top value if stack is not empty
    // remove top value
    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int value = stack[top];
            top--;
            return value;
        }
    }

    // O(1)
    // return -1 if stack is empty
    // return top value if stack is not empty
    // return top value without removing it
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stack[top];
        }
    }

    // O(1)
    public boolean isEmpty() {
        return top == -1;
    }

    // O(1)
    public boolean isFull() {
        return top == size - 1;
    }

    // O(1)
    public int size() {
        return top + 1;
    }

    public boolean resize(int newSize) {
        if (newSize < size) {
            System.out.println("New size is smaller than current size");
            return false;
        } else {
            int[] newStack = new int[newSize];
            for (int i = 0; i < size; i++) {
                newStack[i] = stack[i];
            }
            stack = newStack;
            size = newSize;
            return true;
        }
    }

    // O(n)
    public void printStack() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack items:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }
}

// Example
public class HelloWorld {
    public static void main(String []args){
        System.out.println("Hello, World!");

        MyStack stack = new MyStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.printStack();

        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Peek: " + stack.peek());

        stack.printStack();
    }
}
