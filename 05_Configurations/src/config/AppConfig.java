package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//A Source for Spring Bean Definitions
@Configuration
@ComponentScan(basePackages = "bean")
@Import({AppConfig1.class,AppConfig2.class}) // we can import configurations into a single class
public class AppConfig {

}
