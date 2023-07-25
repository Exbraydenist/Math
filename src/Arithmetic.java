import java.util.Scanner;

public class Arithmetic {
    static Scanner scanner = new Scanner(System.in);
    static int a;
    static int b;
    public static void main(String[] args) {
        System.out.print("Введите число a: ");
        a = scanner.nextInt();
        System.out.print("\n");
        System.out.print("Введите число b: ");
        b = scanner.nextInt();
        Arithmetic function = new Arithmetic(a, b);
        function.summarize(a, b);
        function.multiply(a, b);
        function.findMinMax(a, b);
    }
    Arithmetic(int x, int y) {
        a = x;
        b = y;
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