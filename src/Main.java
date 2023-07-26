import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите число a: ");
        int a = scanner.nextInt();
        System.out.print("\n");
        System.out.print("Введите число b: ");
        int b = scanner.nextInt();
        Arithmetic function = new Arithmetic(a, b);
        function.summarize(a, b);
        function.multiply(a, b);
        function.findMinMax(a, b);
    }
}
