package homework2;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {12, 21, 85, 6, 10, 33, 50, 8, 99, 103};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] );
            if (i!= array.length-1){
                System.out.print(", ");
            }
        }

    }

}
