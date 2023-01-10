package homework2;

public class ArrayUtil2 {
    public static void main(String[] args) {
        int[] array = {41, 12, 78, 25, 36, 55, 62, 99, 77, 33};
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }
        System.out.println("min:" + min);
    }
}
