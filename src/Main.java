import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int currentBalance = 100;
        System.out.print("Пожалуйста, введите сумму пополнения: ");
        int replenishmentAmount = in.nextInt();
        int account_amount;
        boolean b = 1000 < replenishmentAmount;
        if (b) {
            int bonusAmount;
            bonusAmount = replenishmentAmount/100;
            account_amount = bonusAmount + replenishmentAmount + currentBalance;
            System.out.println("Ваш текущий баланс: " + account_amount + " рублей, " + "бонус за пополнение: " + bonusAmount + " рублей.");
        } else {
            account_amount = currentBalance + replenishmentAmount;
            System.out.println("Ваш текущий баланс: " + account_amount + " рублей.");
        }
    }
}