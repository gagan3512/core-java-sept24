package Oct1;

public class MainBank {
    public static void main(String[] args) {
        Bank bank = new Bank();

        System.out.println("deposite " +bank.deposite());
        System.out.println("withdraw "+bank.withDraw());
        bank.getBalance();

    }
}
