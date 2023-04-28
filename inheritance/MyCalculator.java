import java.io.*;

interface Add_Sub {
    void add(double x, double y);
    void sub(double x, double y);
}

interface Mul_Div {
    void multiply(double x, double y);
    void divide(double x, double y);
}

interface Calculate extends Add_Sub, Mul_Div {
    void printResult(double result);
}

class MyCalculator implements Calculate {
    public void add(double x, double y) {
        double res = x + y;
        printResult(res);
    }

    public void sub(double x, double y) {
        double res = x - y;
        printResult(res);
    }

    public void multiply(double x, double y) {
        double res = x * y;
        printResult(res);
    }

    public void divide(double x, double y) {
        double res = x / y;
        printResult(res);
    }

    public void printResult(double result) {
        System.out.println(result);
    }
}

class MainInterface {
    public static void main(String args[]) {
        MyCalculator c1 = new MyCalculator();

        c1.add(10, 20);
        c1.sub(20, 10);
        c1.multiply(10, 20);
        c1.divide(20, 10);
    }
}
