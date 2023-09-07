package bean;

import org.springframework.stereotype.Component;

@Component("BeanThree")
public class SpringBeanThree {
    public SpringBeanThree() {
        System.out.println("Spring Bean Three");
    }
}
