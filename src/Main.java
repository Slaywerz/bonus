import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int current_balance = 100;
        System.out.print("Пожалуйста, введите сумму пополнения: ");
        int replenishment_amount = in.nextInt();
        int account_amount;
        boolean b = 1001 > replenishment_amount;
        if (b) {
            account_amount = current_balance + replenishment_amount;
            System.out.println("Ваш текущий баланс: " + account_amount + " рублей.");
        } else {
            int bonus_amount;
            bonus_amount = replenishment_amount/100;
            account_amount = bonus_amount + replenishment_amount + current_balance;
            System.out.println("Ваш текущий баланс: " + account_amount + " рублей, " + "бонус за пополнение: " + bonus_amount + " рублей.");
        }
    }
}