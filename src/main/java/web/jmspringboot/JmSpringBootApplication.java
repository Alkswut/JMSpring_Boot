package web.jmspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import web.config.SecurityConfig;

@SpringBootApplication//(exclude = {SecurityAutoConfiguration.class })
public class JmSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(JmSpringBootApplication.class, args);
    }
}
