
class BankAccount {
    private int balance = 1000;

    public synchronized void withdraw(int amount, String user) {
        if (balance >= amount) {
            System.out.println(user + " is trying to withdraw $" + amount);
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            balance -= amount;
            System.out.println(user + " completed the withdrawal. Remaining balance: $" + balance);
        } else {
            System.out.println(user + " tried to withdraw $" + amount + " but insufficient balance.");
        }
    }
}

class WithdrawTask implements Runnable {
    private BankAccount account;
    private String user;
    private int amount;

    public WithdrawTask(BankAccount account, String user, int amount) {
        this.account = account;
        this.user = user;
        this.amount = amount;
    }

    public void run() {
        account.withdraw(amount, user);
    }
}


public class Main {
    public static void main(String[] args) {
        BankAccount sharedAccount = new BankAccount();

        Thread t1 = new Thread(new WithdrawTask(sharedAccount, "Alice", 700));
        Thread t2 = new Thread(new WithdrawTask(sharedAccount, "Bob", 500));

        t1.start();
        t2.start();
    }
}
