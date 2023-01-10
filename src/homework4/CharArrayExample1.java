package homework4;

public class CharArrayExample1 {
    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        boolean resalt= chars[chars.length-2]=='v' && chars[chars.length-1]=='e';
        System.out.println(resalt);

    }
}
