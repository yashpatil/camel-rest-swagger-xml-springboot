package nz.section6;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * A sample Spring Boot application that starts the Camel routes.
 */
// load the spring xml file from classpath
@ImportResource("classpath:camel-context.xml")
@SpringBootApplication
public class Application {

    /**
     * Main method to start the application.
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
