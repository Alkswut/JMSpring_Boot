package web.jmspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan( basePackages = {"web.entity"} )
public class JmSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(JmSpringBootApplication.class, args);
    }
}
