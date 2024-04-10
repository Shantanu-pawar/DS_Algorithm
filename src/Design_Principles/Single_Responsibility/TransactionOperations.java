package OOPs_Concepts.Design_Principles.Single_Responsibility;

import java.math.BigDecimal;

public class TransactionOperations {
    // This is good as it does transactions and at right place.
    public void deposit(BigDecimal amount , int accountNumber){

        AccountOperations acc = new AccountOperations();
        Account account = acc.getAccount(accountNumber);
        account.setTotalAmount(account.getTotalAmount().add(amount));
    }

}
