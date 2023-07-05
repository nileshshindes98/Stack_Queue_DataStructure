package stack;

import java.util.Stack;
public class StackQueueDataStructure {
    public static void main(String[] args) {
        stack();

    }
    public static void stack() {
        System.out.println("************ Stack *************");
        System.out.println();
        Stack<Integer> stack = new Stack<>();

        //UC1=Ability to create a Stack of 56->30->70
        stack.push(56);
        stack.push(30);
        stack.push(70);

        System.out.println("Stack = " +stack);

        //UC2-Ability to peak and pop from the Stack till it is empty
        //peak stack 1st elemnt
        int peak1 = stack.peek();
        System.out.println("Peek element = " +peak1);

        //pop the stack 1st elemnt
        int pop1 = stack.pop();
        System.out.println("Poped element = " +pop1);

        //peak stack 2nd element
        int peak2 = stack.peek();
        System.out.println("Peek element = " +peak2);

        //pop the stack 2nd element
        int pop2 = stack.pop();
        System.out.println("Poped element = " +pop2);


        //peak stack 3rd element
        int peak3 = stack.peek();
        System.out.println("Peek element = " +peak3);

        //pop the stack 3rd element
        int pop3 = stack.pop();
        System.out.println("Poped element = " +pop3);


        System.out.println();
        //sout stack list after pop
        System.out.println("Stack After POP = " +stack);


        System.out.println();
        System.out.println("************ Stack *************");
    }
}