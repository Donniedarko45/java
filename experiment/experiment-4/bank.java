class BankAccount {
  private double balance;

  public BankAccount(double initialBalance) {
    this.balance = initialBalance;
  }

  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
      System.out.println("Deposited: " + amount);
    } else {
      System.out.println("Deposit amount must be positive.");
    }
  }

  public void withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
      balance -= amount;
      System.out.println("Withdrawn: " + amount);
    } else {
      System.out.println("Invalid withdrawal amount.");
    }
  }

  double checkBalance() {
    return balance;
  }

}

public class bank {
  public static void main(String[] args) {
    BankAccount account = new BankAccount(1000);
    account.deposit(500);
    account.withdraw(200);
    System.out.println("Balance: " + account.checkBalance());
  }
}
