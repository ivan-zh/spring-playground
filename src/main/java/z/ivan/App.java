package z.ivan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import z.ivan.entity.User;
import z.ivan.service.UserService;

import java.time.OffsetDateTime;

@Configuration
@ComponentScan(basePackageClasses = {z.ivan.dao.UserDao.class, z.ivan.service.UserService.class})
public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(App.class);
        ctx.refresh();
        UserService userService = ctx.getBean(UserService.class);

        for (long i = 0; i < 10L; i++) {
            String login = "user" + i;
            User user = new User(i, login, OffsetDateTime.now());
            userService.store(user);
        }

        userService.fetch().forEach(System.out::println);
    }

}
