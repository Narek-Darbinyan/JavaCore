import model.Car;
import model.Human;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.firstName = "Narek";
        human1.lastName = "Darbinyan";
        human1.gender = 'M';
        human1.isArmenia = true;
        human1.year = 1992;


        Human human2 = new Human();
        human2.firstName = "Hermine";
        human2.lastName = "Arshakyan";
        human2.gender = 'f';
        human2.isArmenia = true;
        human2.year = 1993;

        System.out.println(human1.firstName + " " + human1.lastName);
        System.out.println(human1.year < human2.year ? human1.firstName : human1.firstName);


        Car Car = new Car();
        // Car.model = "Ford";
        Car.setYear(2009);
        //  Car.Engine()= 2.5;
        //Car.setEngine(-8.8);

        Human h = new Human();
        h.firstName = "Hermine";
        System.out.println(h.firstName);

        h.sayHello();
        human2.sayHello();

        // System.out.println(human1.firstName+" "+human1.lastName);
        //System.out.println(human2.firstName+" "+human2.lastName);

        human2.printFullName();
        human1.printFullName();
        h.sayHello();


        String s = human1.fullName();
        System.out.println("Full name of human1 is " + s);


        human1.sum(4, 6);


        human2.print1toN(5);
        human2.print1toN(15);
        human2.print1toN(100);

        System.out.println(Car.getEngine());

        Car.setModel("ford");
        Car.setEngine(2.5);
        Car.setYear(2009);
        System.out.println(Car.getModel() + "," + Car.getYear());
        Car Car2 = new Car();
        Car2.setModel("Mercedes");
        Car2.setEngine(3.5);

        String text = "Hello Java ";
        System.out.println(text.length());
        System.out.println(text.charAt(0));
        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }

        int countOfS = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'l') {
                countOfS++;
            }
            System.out.println(countOfS);
        }

            System.out.println(text.toUpperCase());


    }





}

