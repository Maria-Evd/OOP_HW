package HW1;

class CreditAccount extends Account {
    public CreditAccount(double balance) {
        super(balance);
    }
    public void take(double amount) {
        if (amount > 0 && amount <= getAmount()) {
            double commission = amount * 0.01;
            super.take(amount + commission);
            System.out.println("Комиссия за снятие составила " + commission + " у.е.");
        } else {
            throw new IllegalArgumentException("Некорректная сумма для списания");
        }
    }
}
