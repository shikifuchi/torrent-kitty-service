package benedict.zhang.torrentkitty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("file:${config.home}/config.properties")
public class TorrentkittyServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TorrentkittyServiceApplication.class, args);
    }

}