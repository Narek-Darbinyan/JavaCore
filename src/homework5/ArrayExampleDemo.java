package homework5;

public class ArrayExampleDemo {
    public static void main(String[] args) {
        ArrayExample ae = new ArrayExample();
        char[] chars = {' ', ' ', 'j', 'a', ' ', 'v', 'a', ' ', ' ', ' '};
        ae.trim(chars);
        System.out.println();

        int[] numbers = {7, 2, 5, 8, 3, 6, 1, 0,};
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        ae.sort(numbers);
        System.out.println();
        for (int number : numbers) {
            System.out.print(number+" ");
        }

    }
}
