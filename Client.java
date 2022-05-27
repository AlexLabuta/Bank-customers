public abstract class Client {

    abstract double balance();

    abstract void deposit(double amountDeposit);

    abstract void withDraw(double amountWithDraw);

    abstract void info(int numberAccount);// Условие пополнения, снятия денег, № расчетного счета
}
