package homework3;

public class ArrayUtil2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 6, 7, 9, 44, 52, 74, 88, 91, 43,};
        int evenCount = 0;
        for (int a : array) {
            if (a % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("count of even elements " + evenCount);

    }
}
