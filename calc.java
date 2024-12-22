import java.util.Scanner;

public class Main {

    // Метод для проверки, является ли год високосным
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите год: ");
            String input = scanner.nextLine();

            // Проверка на числовое значение
            int year = Integer.parseInt(input);

            // Проверка високосного года
            if (isLeapYear(year)) {
                System.out.println(year + " является високосным годом.");
            } else {
                System.out.println(year + " не является високосным годом.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введены некорректные данные. Пожалуйста, введите числовое значение года.");
        } finally {
            scanner.close();
        }
    }
}
