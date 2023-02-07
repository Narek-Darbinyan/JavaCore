package leson1;

import com.sun.prism.shader.Solid_LinearGradient_REFLECT_AlphaTest_Loader;

public class Test {
    public static void main(String[] args) {
        byte x = 4;
        int a = -129;
        x = (byte) a;
        System.out.println(x);


        x = (byte) (x + 1);
        System.out.println(x);

        x = 4;
        x = (byte) (x + 1);
        System.out.println(x);

        x++;
        System.out.println(x);

        x += 5;

        x = 1;
        System.out.println("Barev " + x + 5 + " Java");
        System.out.println("Barev " + (x + 5) + " Java");

        String s = "7";
        int z = Integer.parseInt(s);
        System.out.println(z + 1);


        String c = "5.8";
        double l = Double.parseDouble(c);
        System.out.println(l);


        Student s1 = new Student();
        s1.setAge(31);
        s1.setName("Narek");

        Student s2 = new Student();
        Student s3 = new Student();
        System.out.println(s2.getName());
        System.out.println(s3.getName());

        Student d1 = new Student("Narek");
        System.out.println(d1.getName());

        Student s5 = new Student("Narek", 31);
        System.out.println(s5.getName() + " " + s5.getAge());

        Car k = new Car("36QA106");
        Car k2 = new Car();
        System.out.println(s5.getName() + " " + s5.getAge());


        s1.sum(4, 5);
        s1.sum(1, 8, 9);


        Teacher t1 = new Teacher();
        t1.setName("Narek");
        t1.setYear(1992);
        t1.setSalary(1000);
        t1.setPhone("654654654");

        System.out.println("------------------");
        t1.printInfo();
        Administrator a1 = new Administrator();
        a1.setName("Hermine");
        a1.setDepartment("Music");
        a1.setYear(1992);
        a1.setPhone("65454615");
        System.out.println("--------------------");

        a1.printInfo();


    }
}
