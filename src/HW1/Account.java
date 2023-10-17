package HW1;

public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void put(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Счет пополнен на " + amount + " у.е.");
        } else {
            throw new IllegalArgumentException("Некорректная сумма для пополнения");
        }
    }

    public void take(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Со счета списано " + amount + " у.е.");
        } else {
            throw new IllegalArgumentException("Некорректная сумма для списания");
        }
    }

    public double getAmount() {
        return balance;
    }
}


