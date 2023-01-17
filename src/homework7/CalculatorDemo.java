package homework7;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double resultPlus = calc.plus(36, 14);
        System.out.println(resultPlus);
        int resultMinus = calc.minus(12, 6);
        System.out.println(resultMinus);
        int resultMultiplay= calc.multiply(10,20);
        System.out.println(resultMultiplay);
        double resultDivide= calc.divide(33,6);
        System.out.println(resultDivide);
    }
}
