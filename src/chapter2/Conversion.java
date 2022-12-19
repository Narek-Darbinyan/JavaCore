package chapter2;

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;
        System.out.println("pereobrazavanie tipa int b tip byte.");
        b = (byte) i;
        System.out.println("I i b " + i + " " + b);
        System.out.println("pereobrazavanie tip double v tip int.");
        i = (int) d;
        System.out.println("d i I " + d+" " + i);
        System.out.println("pereobrazavanie tip double v tip byte.");
        b = (byte) d;
        System.out.println("d i b " + d + " " + d);
    }
}
