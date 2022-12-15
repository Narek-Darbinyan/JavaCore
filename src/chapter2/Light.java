package chapter2;

public class Light {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;
        lightspeed = 186000;
        days = 1000;
        seconds = days * 24 * 60 * 60;
        distance = lightspeed * seconds;
        System.out.print("za" + days);
        System.out.print("dney svet proydot okolo ");
        System.out.println(distance + "mil");


    }

}