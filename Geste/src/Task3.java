import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] expenses = new int[7];
        Random random = new Random();
        int totalExpenses = 0;

        for (int i = 0; i < expenses.length; i++) {
            expenses[i] = random.nextInt(3001) + 1000; // Случайное число от 1000 до 4000
            totalExpenses += expenses[i];
            System.out.println("День " + (i + 1) + ": " + expenses[i] + " Рублей");
        }

        System.out.println("Сумма трат за неделю: " + totalExpenses + " Рублей");
    }
}
