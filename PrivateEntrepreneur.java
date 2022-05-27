public class PrivateEntrepreneur extends Client {

    private final int numberAccount;
    private double balance;

    PrivateEntrepreneur() {
        numberAccount = (int) (Math.random() * 100);
        balance = Math.round(Math.random() * 1000000 * 100.0) / 100.0;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    @Override
    double balance() {
        return balance;
    }

    @Override
    void deposit(double amountDeposit) {
        if (amountDeposit < 1000) {
            amountDeposit = amountDeposit - amountDeposit / 100;
            balance = balance + amountDeposit;
            System.out.println("Вы положили на счет № " + numberAccount + " " + amountDeposit + "рублей");
            System.out.println("На счету " + balance);
        } else {
            amountDeposit = amountDeposit - amountDeposit / 100 * 0.5;
            System.out.println("Вы положили на счет № " + numberAccount + " " + amountDeposit + "рублей");
            System.out.println("На счету " + balance);
        }
    }

    @Override
    void withDraw(double amountWithDraw) {
        if (amountWithDraw <= balance) {
            balance = balance - amountWithDraw;
            System.out.println("Вы сняли со чета № " + numberAccount + "     " + amountWithDraw + " рублей");
            System.out.println("На счету " + balance);
        } else {
            System.out.println("Недостадочно средств на счете");
        }

    }

    @Override
    void info(int numberAccount) {
        System.out.println("Счет номер: " + numberAccount + " принадлежит индивидуальному предпринимателю " + "\nПополнение счета на сумму меньше 1000 рублей - комммисия 1%, от 1000 рублей коммисия 0,5%" +
                "\nСнятие со счета бесплатно");
        System.out.println("На счету сейчас: " + balance);

    }
}
