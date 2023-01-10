package homework3;

public class ArrayUtil3 {
    public static void main(String[] args) {
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
