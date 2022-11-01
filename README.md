# MyStackJava

**My Stack** Implementation In *Java**

Here we are going to design a full-featured class for Stack's Data structure.

## MyStackJava Functions

- `public MyStack(int size)`: Create a new stack with a given size
- `public boolean push(int value)`: Push an element to the top of the stack and return true.
- `public int pop()`: Pop an element from the top of the stack and return the value.
- `public int peek()`: Peek the top value of the stack and return the value.
- `public boolean isEmpty()`: Return true if the stack is empty.
- `public boolean isFull()`: Return true if the stack is full.
- `public int size()`: Return the size of the stack.
- `public boolean resize(int newSize)`: Resize the stack to a new size.
- `public void printStack()`: Print the stack.

## Using MyStackJava

```java
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
```
