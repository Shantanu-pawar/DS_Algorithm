package I0I_OOPs.Design_Principles.Single_Responsibility;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.setAccountNumber(111);
        account.setFirstName("shantanu");
        account.setTotalAmount(BigDecimal.valueOf(2398503.147));
        AccountOperations accountOperations = new AccountOperations();
        accountOperations.addAccount(account);

        TransactionOperations transactionOperations = new TransactionOperations();
        transactionOperations.deposit(BigDecimal.valueOf(111),111);

        System.out.println("This account is belongs to : " + account.getFirstName() +
                "\n with account number: " + account.getAccountNumber());
        System.out.println("having account balance of " + account.getTotalAmount());
        System.out.println("__________");

    }
}
