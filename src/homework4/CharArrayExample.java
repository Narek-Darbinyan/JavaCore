package homework4;

public class CharArrayExample {
    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';
        int count = 0;
        for (char a : chars) {
            if (a == c) {
                count++;
            }
        }
        System.out.println("count:" + count);



    }
}


