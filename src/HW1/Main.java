package HW1;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(100);
        account.put(50);
        account.take(20);
        System.out.println("Текущий баланс: " + account.getAmount());

        CreditAccount creditAccount = new CreditAccount(100);
        creditAccount.take(30);
        System.out.println("Текущий баланс: " + creditAccount.getAmount());

        DepositAccount depositAccount = new DepositAccount(100);
        depositAccount.take(20);
        depositAccount.take(30);
        System.out.println("Текущий баланс: " + depositAccount.getAmount());
    }
}
