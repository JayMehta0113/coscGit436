import java.util.*;

public class BankDemo {
    public static void main(String[] args) {
        
        Facade bankAccount = new Facade(987654321, 0113);

        bankAccount.makeDeposit(10);

        bankAccount.makeWithdrawl(1000);

    }
}
