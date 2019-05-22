package z.ivan.dao;

import org.springframework.stereotype.Repository;
import z.ivan.entity.User;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDao {

    private List<User> users;

    public UserDao() {
        this.users = new ArrayList<>();
    }

    public List<User> fetch() {
        return users;
    }

    public void store(User user) {
        users.add(user);
    }

    public void cleanUp() {
        users.clear();
    }
}
