package z.ivan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import z.ivan.dao.AccountDao;
import z.ivan.entity.Account;
import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountDao repository;

    public AccountService() {
    }

    public AccountService(AccountDao accountDao) {
        this.repository = accountDao;
    }

    public List<Account> fetch() {
        return repository.fetch();
    }

    public void store(Account account) {
        repository.store(account);
    }

    public void cleanUp() {
        repository.cleanUp();
    }
}
