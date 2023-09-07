package bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SpringBeanOne {
    public SpringBeanOne() {
        System.out.println("Spring Bean One ");
    }
}
