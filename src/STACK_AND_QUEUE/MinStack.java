package STACK_AND_QUEUE;

// leetcode : 155
// https://leetcode.com/problems/min-stack/


import java.util.Stack;

public class MinStack {


    Stack<Integer> orginalStack;
    Stack<Integer> minStack;

    public MinStack() {
        orginalStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        orginalStack.push(val);

        if (minStack.isEmpty() || val <= minStack.peek())
            minStack.push(val);
    }

    public void pop() {
        int poppedValue = orginalStack.pop();

        if (poppedValue == minStack.peek())
            minStack.pop();

    }

    public int top() {
        return orginalStack.peek();
    }

    public int getMin() {
    return minStack.peek();
    }

}
