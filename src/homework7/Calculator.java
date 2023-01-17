package homework7;

public class Calculator {
    public double plus(double numOne, double numTwo) {
        return numOne + numTwo;

    }

    public int minus(int numOne, int numTwo) {
        return numOne - numTwo;
    }

    public int multiply(int numOne, int numTwo) {
        return numOne * numTwo;
    }

    public double divide(double numOne, double numTwo) {
        if (numTwo != 0) {
            return numOne / numTwo;
        }
        return -1;
    }
}


