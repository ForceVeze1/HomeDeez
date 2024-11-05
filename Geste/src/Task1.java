import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваш доход за месяц (в рублях): ");
        double income = scanner.nextDouble();

        double tax = calculateTax(income);
        double netIncome = income - tax;

        System.out.printf("Сумма налога: %.2f руб.\n", tax);
        System.out.printf("Доход после вычета налога: %.2f руб.\n", netIncome);

        scanner.close();
    }

    public static double calculateTax(double income) {
        double taxRate;

        if (income <= 100000) {
            taxRate = 0.13; // проц

        } else if (income <= 1000000) {
            taxRate = 0.18; // проц

        } else {
            taxRate = 0.25; // процент
        }

        return income * taxRate;
    }
}
