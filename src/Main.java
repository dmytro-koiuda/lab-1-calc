import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Виберіть операцію:");
            System.out.println("1. Додавання (+)");
            System.out.println("2. Віднімання (-)");
            System.out.println("3. Множення (*)");
            System.out.println("4. Ділення (/)");
            System.out.println("5. Розрахунок об'єму паралелепіпеда");
            System.out.println("6. Закрити програму");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addition();
                    break;
                case 2:
                    subtraction();
                    break;
                case 3:
                    multiplication();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    calculateVolume();
                    break;
                default:
                    System.out.println("Непрвавильно обрана операція");
                    break;
            }
            if (choice == 6) {
                break;
            }
        }
        scanner.close();
    }

    public static void addition() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть перше число:");
        double num1 = scanner.nextDouble();
        System.out.println("Введіть друге число:");
        double num2 = scanner.nextDouble();
        double result = num1 + num2;
        System.out.println("Результат: " + result);
    }

    public static void subtraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть перше число:");
        double num1 = scanner.nextDouble();
        System.out.println("Введіть друге число:");
        double num2 = scanner.nextDouble();
        double result = num1 - num2;
        System.out.println("Результат: " + result);
    }

    public static void multiplication() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть перше число:");
        double num1 = scanner.nextDouble();
        System.out.println("Введіть друге число:");
        double num2 = scanner.nextDouble();
        double result = num1 * num2;
        System.out.println("Результат: " + result);
    }

    public static void division() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть ділене:");
        double dividend = scanner.nextDouble();
        System.out.println("Введіть дільник:");
        double divisor = scanner.nextDouble();
        if (divisor == 0) {
            System.out.println("Помилка: дільник не може бути нулем.");
        } else {
            double result = dividend / divisor;
            System.out.println("Результат: " + result);
        }
    }

    public static void calculateVolume() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть довжину паралелепіпеда:");
        double length = scanner.nextDouble();
        System.out.println("Введіть ширину паралелепіпеда:");
        double width = scanner.nextDouble();
        System.out.println("Введіть висоту паралелепіпеда:");
        double height = scanner.nextDouble();
        double volume = length * width * height;
        System.out.println("Об'єм паралелепіпеда: " + volume);
    }
}
