package bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeanTwo  implements InitializingBean {
    @Value("${my.name}")
    private String myName;
    @Value("${my.age}")
    private String Age;


    public SpringBeanTwo() {
        System.out.println("Spring Bean Two Instantiated");
        System.out.println("_________________________________________");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(myName);
        System.out.println(Age);
    }
}
