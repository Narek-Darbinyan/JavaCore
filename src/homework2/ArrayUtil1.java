package homework2;

public class ArrayUtil1 {
    public static void main(String[] args) {
        int[] array = {12, 78, 25, 36, 55, 62, 99, 77, 33};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("max:"+max);

    }
}
