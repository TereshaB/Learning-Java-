
import java.util.*;

class LowBalanceException extends Exception {
  public LowBalanceException(String message) { super(message); }
}

public class LowBalanceDemo {
  static void withdraw(int balance, int amount) throws LowBalanceException {
    int remaining = balance - amount;
    if (remaining < 10) {
      throw new LowBalanceException("LowBalance: balance would become " + remaining + " (< 10)");
    }
    System.out.println("Withdraw success. Remaining balance: " + remaining);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter balance: ");
    int bal = sc.nextInt();
    System.out.print("Enter withdraw amount: ");
    int amt = sc.nextInt();

    try {
      withdraw(bal, amt);
    } catch (LowBalanceException e) {
      System.out.println(e.getMessage());
    }
  }
}