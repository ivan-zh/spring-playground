package z.ivan.service;

import org.springframework.beans.factory.annotation.Autowired;
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

    public User getById(int id) {
        return repository.getById(id);
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
