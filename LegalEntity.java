public class LegalEntity extends Client {

    private final int numberAccount;
    private double balance;

    LegalEntity() {
        numberAccount = (int) (Math.random() * 100);
        balance = Math.round(Math.random() * 1000000 * 100.0) / 100.0;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    @Override
    void info(int numberAccount) {
        System.out.println("Счет номер: " + numberAccount + " принадлежит юридическому лицу " + "\nПополнение счета бесплатно" + "\nСнятие со счета коммисия 1%");
        System.out.println("На счету сейчас: " + balance);

    }

    @Override
    double balance() {
        return balance;
    }

    @Override
    void deposit(double amountDeposit) {
        balance = balance + amountDeposit;
        System.out.println("Вы положили на счет № " + numberAccount + " " + amountDeposit + "рублей");
        System.out.println("На счету " + balance);
    }

    @Override
    void withDraw(double amountWithDraw) {
        amountWithDraw = amountWithDraw / 100 + amountWithDraw;
        if (amountWithDraw <= balance) {
            balance = balance - amountWithDraw;
            System.out.println("Вы сняли со чета № " + numberAccount + "     " + amountWithDraw + " рублей");
            System.out.println("На счету " + balance);
        } else {
            System.out.println("Недостадочно средств на счете");
        }
    }
}
