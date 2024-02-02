package Babysteps;

public class Account {
    private static int numAccounts = 0;
    public Account() {
        numAccounts++;
    }
    public static int getNumAccounts() {
        return numAccounts;
    }
    public static void main(String[] args) {
        Account account1 = new Account();
        Account account2 = new Account();
        Account account3 = new Account();

        System.out.println("Number of accounts: " + Account.getNumAccounts());
    }
}
