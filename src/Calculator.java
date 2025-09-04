import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("\nЗапуск калькулятора...");
        startCalculator();
    }

    private static void startCalculator() {
        Scanner scanner = new Scanner(System.in);
        int value = getValue(scanner);
        while (true) {

        }
    }

    private static int getValue(Scanner scanner) {
        System.out.print("Введите число: ");
        String value = null;
        try {
            value = scanner.nextLine();
            return Integer.parseInt(value);
        } catch (Exception ex) {
            System.err.println(String.format("Указанное значение '%s' не является числом", value));
            System.out.flush();
            return -1;
        }
    }
}
