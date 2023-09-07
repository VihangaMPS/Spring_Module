package config;

import bean.MyConnection;
import bean.SpringBeanOne;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


//Spring Bean definitions walata source ekak
//How to scan POJO  and enter to the Application context
@Configuration
@ComponentScan(basePackageClasses = SpringBeanOne.class)
// @ComponentScan(basePackages = "bean")
public class AppConfig {

    public AppConfig() {
        System.out.println("AppConfig");
    }

    //when we are not allowed to put the @Component annotation we can use this method to
    //introduce a spring bean to the Application Context
    @Bean("connection")
    public MyConnection getConnection(){
        return new MyConnection();
    }


    //uguiuhuih
}
