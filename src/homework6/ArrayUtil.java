package homework6;

public class ArrayUtil {
    void ArrayUtilPrint() {
        int[] array = {12, 21, 85, 6, 10, 33, 50, 8, 99, 103};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
    }

    void maxOfArray() {
        int[] array = {12, 78, 25, 36, 55, 62, 99, 77, 33};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("max:" + max);


    }
    void minOfArray(){
        int[] array = {41, 12, 78, 25, 36, 55, 62, 99, 77, 33};
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }
        System.out.println("min:" + min);
    }
    void evenCountArray(){
        int[] array = {1, 2, 5, 6, 7, 9, 44, 52, 74, 88, 91, 43,};
        int evenCount = 0;
        for (int a : array) {
            if (a % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("count of even elements " + evenCount);

    }
    void oddCountArray(){
        int[] array = {1, 2, 5, 6, 7, 9, 44, 55, 74, 88, 91, 43,};
        int oddCount = 0;
        for (int a : array) {
            if (a % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println("count of odd elements " + oddCount);

    }
    }




