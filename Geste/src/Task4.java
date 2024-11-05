import java.util.Scanner;

public class Task4 {
    private static final int DAYS_IN_WEEK = 7;
    private static final double USD_RATE = 93.5;
    private static final double EUR_RATE = 101.2;
    private static double[] expenses = new double[DAYS_IN_WEEK];
    private static Scanner scanner = new Scanner(System.in);

    public static void inputExpense(int day) {
        System.out.printf("Введите расходы за %d день: ", day + 1);
        expenses[day] = scanner.nextDouble();
    }

    public static void showExpenses() {
        System.out.println("\nРасходы за неделю:");
        for (int i = 0; i < DAYS_IN_WEEK; i++) {
            System.out.printf("День %d: %.2f руб.\n", i + 1, expenses[i]);
        }
    }

    public static double getTotal() {
        double total = 0;
        for (double expense : expenses) {
            total += expense;
        }
        return total;
    }

    public static void convertCurrency() {
        double total = getTotal();
        System.out.println("\nКонвертация валют:");
        System.out.printf("Всего в рублях: %.2f RUB\n", total);
        System.out.printf("В долларах: %.2f USD\n", total / USD_RATE);
        System.out.printf("В евро: %.2f EUR\n", total / EUR_RATE);
    }

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.println("\nМеню:");
            System.out.println("1. Ввести расходы за день");
            System.out.println("2. Показать все расходы");
            System.out.println("3. Показать общую сумму");
            System.out.println("4. Конвертировать в валюты");
            System.out.println("5. Выход");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Введите номер дня (1-7): ");
                int day = scanner.nextInt() - 1;
                if (day >= 0 && day < DAYS_IN_WEEK) {
                    inputExpense(day);
                } else {
                    System.out.println("Неверный номер дня!");
                }
            } else if (choice == 2) {
                showExpenses();
            } else if (choice == 3) {
                System.out.printf("\nОбщая сумма расходов: %.2f руб.\n", getTotal());
            } else if (choice == 4) {
                convertCurrency();
            } else if (choice == 5) {
                System.out.println("Программа завершена.");
                scanner.close();
                running = false;
            } else {
                System.out.println("Неверный выбор!");
            }
        }
    }
}
