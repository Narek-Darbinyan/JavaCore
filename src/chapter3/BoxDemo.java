package chapter3;

public class BoxDemo {
    public static void main(String[] args) {
        Box myBox=new Box();
        System.out.println(myBox.width);
        System.out.println(myBox.height);
        System.out.println(myBox.depth);


        myBox.width=9.9;
        System.out.println(myBox.width);
    }
}
