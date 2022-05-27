public class Test {
    public static void main(String[] args) {
        PhysicalPerson pp = new PhysicalPerson();
        System.out.println(pp.getNumberAccount() + " " + pp.balance());
        pp.balance();
        pp.deposit(1000);
        pp.withDraw(2000);
        pp.info(pp.getNumberAccount());

        LegalEntity le = new LegalEntity();
        System.out.println(le.getNumberAccount() + " " + le.balance());
        le.balance();
        le.deposit(1000);
        le.withDraw(2000);
        le.info(le.getNumberAccount());

        PrivateEntrepreneur pe = new PrivateEntrepreneur();
        System.out.println(pe.getNumberAccount() + " " + pe.balance());
        pe.balance();
        pe.deposit(1000);
        pe.withDraw(2000);
        pe.info(pe.getNumberAccount());

    }
}
