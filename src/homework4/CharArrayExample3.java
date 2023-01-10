package homework4;

public class CharArrayExample3 {
    public static void main(String[] args) {
        char[] chars = {' ', 'a', ' ', 'v', 'a', ' ', 'o', 'v', ' ', 'e'};
        for (char aChar : chars) {
           if (aChar!=' '){
               System.out.print(aChar);
           }
        }

    }
}
