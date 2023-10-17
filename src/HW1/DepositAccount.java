package HW1;

import java.time.LocalDate;

class DepositAccount extends Account {
    private LocalDate lastWithdrawalDate;

    public DepositAccount(double balance) {
        super(balance);
        lastWithdrawalDate = LocalDate.now().minusMonths(1);
    }
    public void take(double amount) {
        if (amount > 0 && amount <= getAmount()) {
            LocalDate currentDate = LocalDate.now();
            if (currentDate.isAfter(lastWithdrawalDate.plusMonths(1))) {
                super.take(amount);
                lastWithdrawalDate = currentDate;
                System.out.println("Со счета списано " + amount + " у.е.");
            } else {
                throw new IllegalArgumentException("Нельзя снять средства");
            }
        } else {
            throw new IllegalArgumentException("Некорректная сумма для списания");
        }
    }
}
