package z.ivan.dao;

import org.springframework.stereotype.Repository;
import z.ivan.entity.Account;
import java.util.ArrayList;
import java.util.List;

@Repository
public class AccountDao {

    private List<Account> accounts;

    public AccountDao() {
        this.accounts = new ArrayList<>();
    }

    public List<Account> fetch() {
        return accounts;
    }

    public void store(Account account) {
        accounts.add(account);
    }

    public void cleanUp() {
        accounts.clear();
    }
}
