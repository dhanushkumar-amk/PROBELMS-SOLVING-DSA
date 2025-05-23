package STACK_AND_QUEUE;

public class CustomStack {

    protected int[] data;
    private static  final int DEFAULT_SIZE = 10;


    // pointer
    int pointer = -1;   // initially pointer denotes -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }



    // push
    public boolean push(int item){

        if (isFull()){
            System.out.println("Stack is full");
            return false;
        }

        pointer++;
        data[pointer] = item;
        return true;
    }


    // is full
    public boolean isFull(){
        return pointer == data.length - 1;  // pointer in the last index``
    }

    // is empty
    public boolean isEmpty(){
        return pointer == -1;
    }


    //pop element

    public int pop() throws CustomStackException {
        if (isEmpty()){
            throw new CustomStackException("Can't pop from an empty stack");
        }

        int removedItem = data[pointer];
        pointer--;
        return removedItem;
    }


    // peek
    public int peek() throws CustomStackException {
        if (isEmpty()){
            throw new CustomStackException("Can't peek from an empty stack");
        }
        return data[pointer];
    }

}
