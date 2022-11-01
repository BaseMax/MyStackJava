# MyStackJava

My Stack Implementation In Java

## MyStackJava Functions

- 
## Using MyStackJava

```
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
