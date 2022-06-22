package nullObject;

/**
 *
 * @author jose casal
 */
public class BankAccount {

    private Log log;
    private int balance;

    public BankAccount(Log log) {
        this.log = log;
    }

    public void deposit(int amount) {
        balance += amount;

        // check for null everywhere?
        if (log != null) {
            log.info("Deposited " + amount
                    + ", balance is now " + balance);
        }
    }

    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            if (log != null) {
                System.out.println("Withdrew " + amount
                        + ", we have " + balance + " left");
            }
        } else {
            if (log != null) {
                System.out.println("Could not withdraw "
                        + amount + " because balance is only " + balance);
            }
        }
    }

}
