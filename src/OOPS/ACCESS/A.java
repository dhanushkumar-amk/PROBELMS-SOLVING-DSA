package OOPS.ACCESS;

public class A {
   private int num;
    String name;
    int[] arr;


    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public A(String name, int num) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
