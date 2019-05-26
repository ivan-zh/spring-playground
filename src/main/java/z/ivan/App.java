package z.ivan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App  {

    public static void main(String[] args) {
        bootApp(args);
    }

    public static void bootApp(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
