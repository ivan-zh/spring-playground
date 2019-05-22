package z.ivan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;
import z.ivan.dao.UserDao;
import z.ivan.entity.User;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao repository;

    public UserService() {
    }

    public UserService(UserDao userDao) {
        this.repository = userDao;
    }

    public List<User> fetch() {
        return repository.fetch();
    }

    public void store(User user) {
        repository.store(user);
    }

    public void cleanUp() {
        repository.cleanUp();
    }
}
