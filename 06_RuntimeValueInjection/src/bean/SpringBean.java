package bean;

import org.springframework.stereotype.Component;

@Component
public class SpringBean {

    public SpringBean() {
        System.out.println("Spring bean Default Constructor");
    }

    public SpringBean(String id){
        System.out.println("Spring Bean Instantiated");
    }
}
