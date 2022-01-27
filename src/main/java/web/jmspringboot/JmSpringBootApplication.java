package web.jmspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//(exclude = {SpringSecurityInitializer.class })
public class JmSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(JmSpringBootApplication.class, args);
    }
}
