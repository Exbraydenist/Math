import java.util.Scanner;

public class Arithmetic {

    private int a;
    private int b;

    Arithmetic(int x, int y) {
        this.a = x;
        this.b = y;
    }
    public void summarize(int a, int b) {
        int operationValue = a + b;
        System.out.println("Сумма чисел a и b = " + operationValue);
    }
    public void multiply(int a, int b) {
        int operationValue = a * b;
        System.out.println("Произведение чисел a и b = " + operationValue);
    }
    public void findMinMax(int a, int b) {
        if (a > b) {
            System.out.println("Максимальное число " + a + "; Минимальное число " + b);
        } else if (a < b) {
            System.out.println("Максимальное число " + b + "; Минимальное число " + a);
        } else {
            System.out.println("Числа " + a + " и " + b + " равны");
        }
    }
}