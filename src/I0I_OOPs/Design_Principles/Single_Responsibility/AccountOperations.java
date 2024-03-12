package I0I_OOPs.Design_Principles.Single_Responsibility;

import java.util.HashMap;
import java.util.Map;

public class AccountOperations {
    private Map<Integer, Account> map = new HashMap<>();

    public void addAccount(Account account) {

        System.out.println("account successfully Added for: " + account.getFirstName());
    }

    public Account getAccount(int accountNumber){

        return map.get(accountNumber);
    }
}
